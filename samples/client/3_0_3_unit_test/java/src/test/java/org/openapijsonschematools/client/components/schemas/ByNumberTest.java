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

public class ByNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void test35IsNotMultipleOf15Fails() {
        // 35 is not multiple of 1.5
        final var schema = ByNumber.ByNumber1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            35L,
            validationMetadata
        ));
    }

    @Test
    public void test45IsMultipleOf15Passes() {
        // 4.5 is multiple of 1.5
        final var schema = ByNumber.ByNumber1.getInstance();
        schema.validate(
            4.5d,
            configuration
        );
    }

    @Test
    public void testZeroIsMultipleOfAnythingPasses() {
        // zero is multiple of anything
        final var schema = ByNumber.ByNumber1.getInstance();
        schema.validate(
            0L,
            configuration
        );
    }
}
