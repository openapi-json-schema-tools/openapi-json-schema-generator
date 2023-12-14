package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class EnumWithFalseDoesNotMatch0Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01 schema = (
        EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testFloatZeroIsInvalidFails() {
        // float zero is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            0.0d,
            validationMetadata
        ));
    }

    @Test
    public void testFalseIsValidPasses() {
        // false is valid
        schema.validate(
            false,
            configuration
        );
    }

    @Test
    public void testIntegerZeroIsInvalidFails() {
        // integer zero is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            0,
            validationMetadata
        ));
    }
}
