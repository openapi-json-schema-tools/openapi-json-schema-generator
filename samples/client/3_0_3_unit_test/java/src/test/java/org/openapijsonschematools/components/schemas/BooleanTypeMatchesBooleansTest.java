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

public class BooleanTypeMatchesBooleansTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAFloatIsNotABooleanFails() {
        // a float is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            1.1,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotABooleanFails() {
        // a string is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testFalseIsABooleanPasses() {
        // false is a boolean
        // payload type = boolean
        // dataType =
        BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            false,
            configuration
        );
    }

    @Test
    public void testTrueIsABooleanPasses() {
        // true is a boolean
        // payload type = boolean
        // dataType =
        BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            true,
            configuration
        );
    }

    @Test
    public void testAnObjectIsNotABooleanFails() {
        // an object is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            MapBuilder.of(Arrays.asList(
            )),
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotABooleanFails() {
        // an array is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotABooleanFails() {
        // null is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotABooleanFails() {
        // an integer is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            1,
            configuration
        ));
    }

    @Test
    public void testZeroIsNotABooleanFails() {
        // zero is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            0,
            configuration
        ));
    }

    @Test
    public void testAnEmptyStringIsNotABooleanFails() {
        // an empty string is not a boolean
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class,
            "",
            configuration
        ));
    }
}
