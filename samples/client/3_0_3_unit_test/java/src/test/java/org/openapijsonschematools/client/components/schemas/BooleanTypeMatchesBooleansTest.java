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

public class BooleanTypeMatchesBooleansTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAFloatIsNotABooleanFails() {
        // a float is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.1d,
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsNotABooleanFails() {
        // a string is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testFalseIsABooleanPasses() {
        // false is a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        schema.validate(
            false,
            configuration
        );
    }

    @Test
    public void testTrueIsABooleanPasses() {
        // true is a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        schema.validate(
            true,
            configuration
        );
    }

    @Test
    public void testAnObjectIsNotABooleanFails() {
        // an object is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testAnArrayIsNotABooleanFails() {
        // an array is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testNullIsNotABooleanFails() {
        // null is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            (Void) null,
            validationMetadata
        ));
    }

    @Test
    public void testAnIntegerIsNotABooleanFails() {
        // an integer is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1,
            validationMetadata
        ));
    }

    @Test
    public void testZeroIsNotABooleanFails() {
        // zero is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            0,
            validationMetadata
        ));
    }

    @Test
    public void testAnEmptyStringIsNotABooleanFails() {
        // an empty string is not a boolean
        final var schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "",
            validationMetadata
        ));
    }
}
