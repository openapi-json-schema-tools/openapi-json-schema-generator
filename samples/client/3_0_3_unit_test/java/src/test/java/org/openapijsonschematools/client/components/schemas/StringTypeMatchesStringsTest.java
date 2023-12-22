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

public class StringTypeMatchesStringsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAStringIsStillAStringEvenIfItLooksLikeANumberPasses() {
        // a string is still a string, even if it looks like a number
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        schema.validate(
            "1",
            configuration
        );
    }

    @Test
    public void test1IsNotAStringFails() {
        // 1 is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1,
            validationMetadata
        ));
    }

    @Test
    public void testABooleanIsNotAStringFails() {
        // a boolean is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testAnEmptyStringIsStillAStringPasses() {
        // an empty string is still a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        schema.validate(
            "",
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAStringFails() {
        // an array is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testAnObjectIsNotAStringFails() {
        // an object is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testNullIsNotAStringFails() {
        // null is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            (Void) null,
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsAStringPasses() {
        // a string is a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }

    @Test
    public void testAFloatIsNotAStringFails() {
        // a float is not a string
        final var schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.1d,
            validationMetadata
        ));
    }
}
