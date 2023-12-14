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

public class EnumWithTrueDoesNotMatch1Test {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testFloatOneIsInvalidFails() {
        // float one is invalid
        final var schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.0d,
            validationMetadata
        ));
    }

    @Test
    public void testIntegerOneIsInvalidFails() {
        // integer one is invalid
        final var schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1,
            validationMetadata
        ));
    }

    @Test
    public void testTrueIsValidPasses() {
        // true is valid
        final var schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance();
        schema.validate(
            true,
            configuration
        );
    }
}
