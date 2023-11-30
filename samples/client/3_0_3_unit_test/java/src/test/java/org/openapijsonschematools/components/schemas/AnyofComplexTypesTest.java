package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AnyofComplexTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testSecondAnyofValidComplexPasses() {
        // second anyOf valid (complex)
        AnyofComplexTypes.AnyofComplexTypes1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothAnyofValidComplexPasses() {
        // both anyOf valid (complex)
        AnyofComplexTypes.AnyofComplexTypes1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    "baz"
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testFirstAnyofValidComplexPasses() {
        // first anyOf valid (complex)
        AnyofComplexTypes.AnyofComplexTypes1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }

    @Test
    public void testNeitherAnyofValidComplexFails() {
        // neither anyOf valid (complex)
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AnyofComplexTypes.AnyofComplexTypes1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    "quux"
                )
            ),
            configuration
        ));
    }
}
