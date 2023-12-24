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

public class ObjectTypeMatchesObjectsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAnObjectIsAnObjectPasses() {
        // an object is an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAnObjectFails() {
        // an array is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testAnIntegerIsNotAnObjectFails() {
        // an integer is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1L,
            validationMetadata
        ));
    }

    @Test
    public void testABooleanIsNotAnObjectFails() {
        // a boolean is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testAStringIsNotAnObjectFails() {
        // a string is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testAFloatIsNotAnObjectFails() {
        // a float is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.1d,
            validationMetadata
        ));
    }

    @Test
    public void testNullIsNotAnObjectFails() {
        // null is not an object
        final var schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            (Void) null,
            validationMetadata
        ));
    }
}
