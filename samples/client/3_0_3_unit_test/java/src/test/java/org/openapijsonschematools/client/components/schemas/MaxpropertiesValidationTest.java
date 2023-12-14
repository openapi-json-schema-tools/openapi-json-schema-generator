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

public class MaxpropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaxpropertiesValidation.MaxpropertiesValidation1 schema = (
        MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        schema.validate(
            MapMaker.makeMap(
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
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "baz",
                    3
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        schema.validate(
            Arrays.asList(
                1,
                2,
                3
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        schema.validate(
            "foobar",
            configuration
        );
    }
}
