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

public class MinpropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        MinpropertiesValidation.MinpropertiesValidation1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        MinpropertiesValidation.MinpropertiesValidation1.validate(
            12,
            configuration
        );
    }

    @Test
    public void testLongerIsValidPasses() {
        // longer is valid
        MinpropertiesValidation.MinpropertiesValidation1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
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
    public void testIgnoresArraysPasses() {
        // ignores arrays
        MinpropertiesValidation.MinpropertiesValidation1.validate(
            List.of(
            ),
            configuration
        );
    }

    @Test
    public void testTooShortIsInvalidFails() {
        // too short is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            MinpropertiesValidation.MinpropertiesValidation1.class,
            Map.ofEntries(
            ),
            configuration
        ));
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        MinpropertiesValidation.MinpropertiesValidation1.validate(
            "",
            configuration
        );
    }
}
