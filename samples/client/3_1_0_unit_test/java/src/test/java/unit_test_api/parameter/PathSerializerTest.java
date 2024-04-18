package unit_test_api.parameter;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.exceptions.NotImplementedException;
import unit_test_api.schemas.AnyTypeJsonSchema;

import java.util.AbstractMap;
import java.util.Map;

public class PathSerializerTest {
    public static class Parameter1 extends SchemaParameter {
        public Parameter1() {
            super("param1", ParameterInType.PATH, true, null, null, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class Parameter2 extends SchemaParameter {
        public Parameter2() {
            super("param2", ParameterInType.PATH, true, null, null, null, AnyTypeJsonSchema.AnyTypeJsonSchema1.getInstance());
        }
    }

    public static class PathParametersSerializer extends PathSerializer {
        protected PathParametersSerializer() {
            super(
                    Map.ofEntries(
                            new AbstractMap.SimpleEntry<>("param1", new Parameter1()),
                            new AbstractMap.SimpleEntry<>("param2", new Parameter2())
                    )
            );
        }
    }

    @Test
    public void testSerialization() throws NotImplementedException {
        Map<String, ?> inData = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("param1", "a"),
                new AbstractMap.SimpleEntry<>("param2", 3.14d)
        );
        String pathWithPlaceholders = "/{param1}/{param2}";
        String path = new PathParametersSerializer().serialize(inData, pathWithPlaceholders);
        String expectedPath = "/a/3.14";
        Assert.assertEquals(expectedPath, path);
    }
}