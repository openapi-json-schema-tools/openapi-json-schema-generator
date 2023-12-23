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

public class OneofWithRequiredTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testFirstValidValidPasses() {
        // first valid - valid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothValidInvalidFails() {
        // both valid - invalid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "baz",
                    3L
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testSecondValidValidPasses() {
        // second valid - valid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "foo",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, Long>(
                    "baz",
                    3L
                )
            ),
            configuration
        );
    }

    @Test
    public void testBothInvalidInvalidFails() {
        // both invalid - invalid
        final var schema = OneofWithRequired.OneofWithRequired1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<String, Long>(
                    "bar",
                    2L
                )
            ),
            validationMetadata
        ));
    }
}
