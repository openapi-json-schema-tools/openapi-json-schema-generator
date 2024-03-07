package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters;

import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.ContentParameter;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters.parameter0.content.applicationjson.Schema0;

import java.util.AbstractMap;
import java.util.Map;

public class Parameter0 {

    public record ApplicationjsonMediaType(Schema0.Schema01 schema) implements MediaType<Schema0.Schema01, Void> {
        public ApplicationjsonMediaType() {
            this(Schema0.Schema01.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class Parameter01 extends ContentParameter {
        public Parameter01() {
            super(
                "someParam",
                ParameterInType.QUERY,
                true,
                null,
                null,
                false,
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }
    }
}
