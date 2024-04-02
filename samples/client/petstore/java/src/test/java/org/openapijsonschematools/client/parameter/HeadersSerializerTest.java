package org.openapijsonschematools.client.parameter;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.OpenapiDocumentException;
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema;

import java.util.AbstractMap;
import java.util.Map;
import java.util.List;

public class HeadersSerializerTest {
    public static class Param1HeaderParameter extends SchemaParameter {
        public Param1HeaderParameter() {
            super("param1", ParameterInType.HEADER, true, null, null, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class Param2HeaderParameter extends SchemaParameter {
        public Param2HeaderParameter() {
            super("param2", ParameterInType.HEADER, true, null, null, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class HeaderParametersSerializer extends HeadersSerializer {
        protected HeaderParametersSerializer() {
            super(
                    Map.ofEntries(
                            new AbstractMap.SimpleEntry<>("param1", new Param1HeaderParameter()),
                            new AbstractMap.SimpleEntry<>("param2", new Param2HeaderParameter())
                    )
            );
        }
    }

    @Test
    public void testSerialization() throws OpenapiDocumentException, NotImplementedException {
        Map<String, ?> inData = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("param1", "a"),
                new AbstractMap.SimpleEntry<>("param2", 3.14d)
        );
        Map<String, List<String>> expectedHeaders = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("param1", List.of("a")),
                new AbstractMap.SimpleEntry<>("param2", List.of("3.14"))
        );
        Map<String, List<String>> headers = new HeaderParametersSerializer().serialize(inData);
        Assert.assertEquals(expectedHeaders, headers);
    }
}