package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class BooleanTypeMatchesBooleansTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAFloatIsNotABooleanFails() {
        // a float is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            1.1,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotABooleanFails() {
        // a string is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testFalseIsABooleanPasses() {
        // false is a boolean
        BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            false,
            configuration
        );
    }

    @Test
    public void testTrueIsABooleanPasses() {
        // true is a boolean
        BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            true,
            configuration
        );
    }

    @Test
    public void testAnObjectIsNotABooleanFails() {
        // an object is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            Map.ofEntries(
            ),
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotABooleanFails() {
        // an array is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            List.of(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotABooleanFails() {
        // null is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            null,
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotABooleanFails() {
        // an integer is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            1,
            configuration
        ));
    }

    @Test
    public void testZeroIsNotABooleanFails() {
        // zero is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            0,
            configuration
        ));
    }

    @Test
    public void testAnEmptyStringIsNotABooleanFails() {
        // an empty string is not a boolean
        Assert.assertThrows(ValidationException.class, () -> BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
            "",
            configuration
        ));
    }
}
