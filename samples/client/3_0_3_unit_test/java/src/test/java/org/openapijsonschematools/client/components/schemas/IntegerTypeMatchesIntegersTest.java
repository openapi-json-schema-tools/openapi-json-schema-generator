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

public class IntegerTypeMatchesIntegersTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAnObjectIsNotAnIntegerFails() {
        // an object is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            new FrozenMap<>(MapMaker.makeMap(
            )),
            validationMetadata
        ));
    }

    @Test
    public void testAnArrayIsNotAnIntegerFails() {
        // an array is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            new FrozenList<>(Arrays.asList(
            )),
            validationMetadata
        ));
    }

    @Test
    public void testNullIsNotAnIntegerFails() {
        // null is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            (Void) null,
            validationMetadata
        ));
    }

    @Test
    public void testAFloatWithZeroFractionalPartIsAnIntegerPasses() {
        // a float with zero fractional part is an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        schema.validate(
            1.0d,
            configuration
        );
    }

    @Test
    public void testABooleanIsNotAnIntegerFails() {
        // a boolean is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsStillNotAnIntegerEvenIfItLooksLikeOneFails() {
        // a string is still not an integer, even if it looks like one
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "1",
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsNotAnIntegerFails() {
        // a string is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testAnIntegerIsAnIntegerPasses() {
        // an integer is an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAnIntegerFails() {
        // a float is not an integer
        final var schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.1d,
            validationMetadata
        ));
    }
}
