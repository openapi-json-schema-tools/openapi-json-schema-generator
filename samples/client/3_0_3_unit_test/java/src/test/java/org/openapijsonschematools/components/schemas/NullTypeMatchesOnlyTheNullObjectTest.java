package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class NullTypeMatchesOnlyTheNullObjectTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testZeroIsNotNullFails() {
        // zero is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            0,
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotNullFails() {
        // an array is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testAnObjectIsNotNullFails() {
        // an object is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            MapBuilder.of(Arrays.asList(
            )),
            configuration
        ));
    }

    @Test
    public void testTrueIsNotNullFails() {
        // true is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testFalseIsNotNullFails() {
        // false is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            false,
            configuration
        ));
    }

    @Test
    public void testNullIsNullPasses() {
        // null is null
        NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAStringIsNotNullFails() {
        // a string is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotNullFails() {
        // an integer is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testAnEmptyStringIsNotNullFails() {
        // an empty string is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            "",
            configuration
        ));
    }

    @Test
    public void testAFloatIsNotNullFails() {
        // a float is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.class,
            1.1,
            configuration
        ));
    }
}
