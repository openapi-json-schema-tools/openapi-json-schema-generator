package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class OneofComplexTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testSecondOneofValidComplexPasses() {
        // second oneOf valid (complex)
        // payload type = object
        // dataType =
        OneofComplexTypes.OneofComplexTypes1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                )
            )),
            configuration
        );
    }

    @Test
    public void testBothOneofValidComplexFails() {
        // both oneOf valid (complex)
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            OneofComplexTypes.OneofComplexTypes1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            )),
            configuration
        ));
    }

    @Test
    public void testFirstOneofValidComplexPasses() {
        // first oneOf valid (complex)
        // payload type = object
        // dataType =
        OneofComplexTypes.OneofComplexTypes1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            )),
            configuration
        );
    }

    @Test
    public void testNeitherOneofValidComplexFails() {
        // neither oneOf valid (complex)
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            OneofComplexTypes.OneofComplexTypes1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "quux"
                )
            )),
            configuration
        ));
    }
}
