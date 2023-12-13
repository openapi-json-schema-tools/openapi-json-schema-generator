package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class BooleanTypeMatchesBooleansTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1 schema = JsonSchemaFactory.getInstance(
        BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.class
    );

    @Test
    public void testAFloatIsNotABooleanFails() {
        // a float is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.1d,
            configuration
        ));
    }

    @Test
    public void testAStringIsNotABooleanFails() {
        // a string is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testFalseIsABooleanPasses() {
        // false is a boolean
        schema.validate(
            false,
            configuration
        );
    }

    @Test
    public void testTrueIsABooleanPasses() {
        // true is a boolean
        schema.validate(
            true,
            configuration
        );
    }

    @Test
    public void testAnObjectIsNotABooleanFails() {
        // an object is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        ));
    }

    @Test
    public void testAnArrayIsNotABooleanFails() {
        // an array is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            Arrays.asList(
            ),
            configuration
        ));
    }

    @Test
    public void testNullIsNotABooleanFails() {
        // null is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            (Void) null,
            configuration
        ));
    }

    @Test
    public void testAnIntegerIsNotABooleanFails() {
        // an integer is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1,
            configuration
        ));
    }

    @Test
    public void testZeroIsNotABooleanFails() {
        // zero is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            0,
            configuration
        ));
    }

    @Test
    public void testAnEmptyStringIsNotABooleanFails() {
        // an empty string is not a boolean
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "",
            configuration
        ));
    }
}
