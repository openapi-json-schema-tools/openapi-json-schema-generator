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

public class RequiredValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPresentRequiredPropertyIsValidPasses() {
        // present required property is valid
        RequiredValidation.RequiredValidation1.validate(
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            )),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        RequiredValidation.RequiredValidation1.validate(
            12,
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        RequiredValidation.RequiredValidation1.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        RequiredValidation.RequiredValidation1.validate(
            "",
            configuration
        );
    }

    @Test
    public void testNonPresentRequiredPropertyIsInvalidFails() {
        // non-present required property is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            RequiredValidation.RequiredValidation1.class,
            MapBuilder.of(Arrays.asList(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    1
                )
            )),
            configuration
        ));
    }
}
