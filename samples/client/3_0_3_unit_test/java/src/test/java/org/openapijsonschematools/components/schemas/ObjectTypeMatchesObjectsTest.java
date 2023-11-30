package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class ObjectTypeMatchesObjectsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnObjectIsAnObjectPasses() {
        // an object is an object
        ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.validate(
            Map.ofEntries(
            ),
            configuration
        );
    }

    @Test
    public void testAnArrayIsNotAnObjectFails() {
        // an array is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            List.of(
            ),
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotAnObjectFails() {
        // an integer is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testABooleanIsNotAnObjectFails() {
        // a boolean is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotAnObjectFails() {
        // a string is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAFloatIsNotAnObjectFails() {
        // a float is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            1.1,
            configuration
        ));
    }

    @Test
    public void testNullIsNotAnObjectFails() {
        // null is not an object
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.class,
            (Void) null,
            configuration
        ));
    }
}
