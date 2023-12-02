package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class ObjectTypeMatchesObjectsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnObjectIsAnObjectPasses() {
        // an object is an object
        ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAnObjectFails() {
        // an array is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotAnObjectFails() {
        // an integer is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotAnObjectFails() {
        // a boolean is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnObjectFails() {
        // a string is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAFloatIsNotAnObjectFails() {
        // a float is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            1.1,
            configuration
        ));
    }

    @Test
    public void testNullIsNotAnObjectFails() {
        // null is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            (Void) null,
            configuration
        ));
    }
}
