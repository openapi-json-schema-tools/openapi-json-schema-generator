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

public class NumberTypeMatchesNumbersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAFloatIsANumberPasses() {
        // a float is a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        schema.validate(
            1.1d,
            configuration
        );
    }

    @Test
    public void testAnIntegerIsANumberPasses() {
        // an integer is a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAStringIsStillNotANumberEvenIfItLooksLikeOneFails() {
        // a string is still not a number, even if it looks like one
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "1",
            validationMetadata
        ));
    }

    @Test
    public void testABooleanIsNotANumberFails() {
        // a boolean is not a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsANumberAndAnIntegerPasses() {
        // a float with zero fractional part is a number (and an integer)
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testNullIsNotANumberFails() {
        // null is not a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            (Void) null,
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsNotANumberFails() {
        // a string is not a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testAnArrayIsNotANumberFails() {
        // an array is not a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testAnObjectIsNotANumberFails() {
        // an object is not a number
        final var schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }
}
