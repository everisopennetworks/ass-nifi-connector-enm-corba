package com.nttdata.nifi.processors.enm;

import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.flowfile.FlowFile;
import org.apache.nifi.processor.ProcessContext;
import org.apache.nifi.processor.ProcessSession;
import org.apache.nifi.processor.ProcessSessionFactory;
import org.apache.nifi.processor.Relationship;
import org.apache.nifi.processor.io.OutputStreamCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlowWriter {

    private static final Logger logger = LoggerFactory.getLogger(FlowWriter.class);

    static ProcessSessionFactory sessionFactory;
    static Relationship SUCCESS;
    static ProcessContext context;


    public static void initWriter(ProcessContext currentContext, ProcessSessionFactory currentSessionFactory, Relationship currentSUCCESS) {
        sessionFactory = currentSessionFactory;
        SUCCESS = currentSUCCESS;
        context = currentContext;
    }

    public static void writeFlowFile(String msg) {

        Map<PropertyDescriptor, String> processorProperties = context.getProperties();
        Map<String, String> generatedAttributes = new HashMap<String, String>();
        for (final Map.Entry<PropertyDescriptor, String> entry : processorProperties.entrySet()) {
            PropertyDescriptor property = entry.getKey();
            if (property.isDynamic() && property.isExpressionLanguageSupported()) {
                String dynamicValue = context.getProperty(property).evaluateAttributeExpressions().getValue();
                generatedAttributes.put(property.getName(), dynamicValue);
            }
        }

        final ProcessSession session = sessionFactory.createSession();

        try {
            FlowFile flowFile = session.create();

            flowFile = session.write(flowFile, new OutputStreamCallback() {
                @Override
                public void process(final OutputStream out) throws IOException {
                    final byte[] data = msg.getBytes();
                    final byte[] local = Arrays.copyOf(data, data.length);
                    out.write(local);
                }
            });

            flowFile = session.putAllAttributes(flowFile, generatedAttributes);

            session.getProvenanceReporter().create(flowFile);
            session.transfer(flowFile, SUCCESS);
            session.commit();
        } catch (final Throwable t) {
            logger.error(t.getMessage());
            session.rollback(true);
            throw t;
        }
    }
}
