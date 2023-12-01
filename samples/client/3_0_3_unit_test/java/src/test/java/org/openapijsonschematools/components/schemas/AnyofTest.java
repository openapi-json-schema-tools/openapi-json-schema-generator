package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class AnyofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBothAnyofValidPasses() {
        // both anyOf valid
        Anyof.Anyof1.validate(
            3,
            configuration
        );
    }

    @Test
    public void testNeitherAnyofValidFails() {
        // neither anyOf valid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            Anyof.Anyof1.class,
            1.5,
            configuration
        ));
    }

    @Test
    public void testFirstAnyofValidPasses() {
        // first anyOf valid
        Anyof.Anyof1.validate(
            1,
            configuration
        );
    }

    @Test
    public void testSecondAnyofValidPasses() {
        // second anyOf valid
        Anyof.Anyof1.validate(
            2.5,
            configuration
        );
    }
}
