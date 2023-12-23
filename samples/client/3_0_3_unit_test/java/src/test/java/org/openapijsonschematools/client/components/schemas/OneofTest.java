package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class OneofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testBothOneofValidFails() {
        // both oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            3L,
            validationMetadata
        ));
    }

    @Test
    public void testNeitherOneofValidFails() {
        // neither oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.5d,
            validationMetadata
        ));
    }

    @Test
    public void testSecondOneofValidPasses() {
        // second oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        schema.validate(
            2.5d,
            configuration
        );
    }

    @Test
    public void testFirstOneofValidPasses() {
        // first oneOf valid
        final var schema = Oneof.Oneof1.getInstance();
        schema.validate(
            1L,
            configuration
        );
    }
}
