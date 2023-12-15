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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class EnumWith1DoesNotMatchTrueTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testTrueIsInvalidFails() {
        // true is invalid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testFloatOneIsValidPasses() {
        // float one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testIntegerOneIsValidPasses() {
        // integer one is valid
        final var schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
