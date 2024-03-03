package org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters;

import org.openapijsonschematools.client.header.ParameterStyle;
import org.openapijsonschematools.client.parameter.ParameterInType;
import org.openapijsonschematools.client.parameter.QueryParameter;
import org.openapijsonschematools.client.parameter.ContentParameter;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.parameters.parameter0.content.applicationjson.Schema0;

import java.util.AbstractMap;
import java.util.Map;

public class Model0 {

    public record ApplicationjsonMediaType(Schema0.Schema01 schema) implements MediaType<Schema0.Schema01, Void> {
        public ApplicationjsonMediaType() {
            this(Schema0.Schema01.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class Model01 extends ContentParameter implements QueryParameter {
        public Model01() {
            super(
                "someParam",
                ParameterInType.query,
                true,
                null,
                null,
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/json", new ApplicationjsonMediaType())
                )
            );
        }
    }
}
