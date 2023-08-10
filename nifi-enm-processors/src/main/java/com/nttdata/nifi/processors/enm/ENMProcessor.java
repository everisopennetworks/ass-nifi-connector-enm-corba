/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nttdata.nifi.processors.enm;

import org.apache.nifi.annotation.behavior.ReadsAttribute;
import org.apache.nifi.annotation.behavior.ReadsAttributes;
import org.apache.nifi.annotation.behavior.WritesAttribute;
import org.apache.nifi.annotation.behavior.WritesAttributes;
import org.apache.nifi.annotation.documentation.CapabilityDescription;
import org.apache.nifi.annotation.documentation.SeeAlso;
import org.apache.nifi.annotation.documentation.Tags;
import org.apache.nifi.annotation.lifecycle.OnScheduled;
import org.apache.nifi.annotation.lifecycle.OnStopped;
import org.apache.nifi.annotation.lifecycle.OnUnscheduled;
import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.processor.*;
import org.apache.nifi.processor.exception.ProcessException;
import org.apache.nifi.processor.util.StandardValidators;

import org.apache.nifi.processor.ProcessContext;
import org.apache.nifi.processor.ProcessorInitializationContext;
import org.apache.nifi.processor.Relationship;


import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Tags({"Corba", "Connector"})
@CapabilityDescription("Corba Connector")
@SeeAlso({})
@ReadsAttributes({@ReadsAttribute(attribute = "", description = "")})
@WritesAttributes({@WritesAttribute(attribute = "", description = "")})

public class ENMProcessor extends AbstractSessionFactoryProcessor {

    private final Logger logger = LoggerFactory.getLogger(ENMProcessor.class);
    public static final PropertyDescriptor PLAIN_PORT = new PropertyDescriptor
            .Builder().name("PLAIN_PORT")
            .displayName("Plain Port")
            .description("Plain Port")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor SECURE_PORT = new PropertyDescriptor
            .Builder().name("SECURE_PORT")
            .displayName("Secure Port")
            .description("Secure Port")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor VENDOR = new PropertyDescriptor
            .Builder().name("VENDOR")
            .displayName("Vendor")
            .description("Vendor")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor NETWORK = new PropertyDescriptor
            .Builder().name("NETWORK")
            .displayName("Network")
            .description("Network")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor EXTERNAL_IOR = new PropertyDescriptor
            .Builder().name("EXTERNAL_IOR")
            .displayName("External IOR")
            .description("External IOR")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final Relationship SUCCESS = new Relationship.Builder()
            .name("SUCCESS")
            .description("Success relation")
            .build();

    public static final Relationship FAILURE = new Relationship.Builder()
            .name("FAILURE")
            .description("Failure relation")
            .build();

    private List<PropertyDescriptor> descriptors;

    private Set<Relationship> relationships;

    private AtomicBoolean initialized = new AtomicBoolean(false);

    private NameServiceClient serviceClient = null;

    private NMS localServer = null;

    @Override
    protected void init(final ProcessorInitializationContext context) {
        final List<PropertyDescriptor> descriptors = new ArrayList<PropertyDescriptor>();
        descriptors.add(PLAIN_PORT);
        descriptors.add(SECURE_PORT);
        descriptors.add(VENDOR);
        descriptors.add(NETWORK);
        descriptors.add(EXTERNAL_IOR);
        this.descriptors = Collections.unmodifiableList(descriptors);

        final Set<Relationship> relationships = new HashSet<Relationship>();
        relationships.add(SUCCESS);
        relationships.add(FAILURE);
        this.relationships = Collections.unmodifiableSet(relationships);
    }

    @Override
    public Set<Relationship> getRelationships() {
        return this.relationships;
    }

    @Override
    public final List<PropertyDescriptor> getSupportedPropertyDescriptors() {
        return descriptors;
    }

    @OnScheduled
    public void onScheduled(final ProcessContext context) {
        logger.info("CorbaENM Scheduled");
    }

    @OnUnscheduled
    public void shutdownExecutor() {

        logger.info("CorbaENM onUnscheduled");
        localServer.shutdown();
        initialized.set(false);
        serviceClient.stop();
        logger.info("onUnscheduled end");
    }

    @OnStopped
    public void alternateshutdown() {
        logger.info("CorbaENM OnStopped");
        shutdownExecutor();
    }


    @Override
    public void onTrigger(final ProcessContext context, final ProcessSessionFactory sessionFactory) throws ProcessException {
        if (!initialized.get()) {
        logger.info("CorbaENM OnTrigger");
        FlowWriter.initWriter(context, sessionFactory, SUCCESS);

        final int plainPort = context.getProperty(PLAIN_PORT).asInteger();
        final int securePort = context.getProperty(SECURE_PORT).asInteger();
        final String vendor = context.getProperty(VENDOR).getValue();
        final String network = context.getProperty(NETWORK).getValue();
        final String externalIOR = context.getProperty(EXTERNAL_IOR).getValue();

            logger.info("-------------------------------------------------------");
            logger.info("Local port: " + plainPort);
            logger.info("Vendor: " + vendor);
            logger.info("-------------------------------------------------------");

        try {
            final NMS localServer = new NMS(plainPort, securePort, vendor, network);
            localServer.start();

            final String localIOR = localServer.getIor();

            logger.info("-------------------------------------------------------");
            logger.info("External IOR: " + externalIOR);
            logger.info("Local IOR: " + localIOR);
            logger.info("-------------------------------------------------------");

            serviceClient = new NameServiceClient(localIOR, externalIOR);
            serviceClient.start();
            initialized.set(true);

            logger.info("-------------------------------------------------------");
            logger.info("Finished processor trigger");
            logger.info("-------------------------------------------------------");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
    }
}
