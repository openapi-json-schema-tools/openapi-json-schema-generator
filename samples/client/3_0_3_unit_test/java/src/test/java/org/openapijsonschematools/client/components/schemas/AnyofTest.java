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

public class AnyofTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final Anyof.Anyof1 schema = JsonSchemaFactory.getInstance(
        Anyof.Anyof1.class
    );

    @Test
    public void testBothAnyofValidPasses() {
        // both anyOf valid
        schema.validate(
            3,
            configuration
        );
    }

    @Test
    public void testNeitherAnyofValidFails() {
        // neither anyOf valid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            1.5d,
            configuration
        ));
    }

    @Test
    public void testFirstAnyofValidPasses() {
        // first anyOf valid
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testSecondAnyofValidPasses() {
        // second anyOf valid
        schema.validate(
            2.5d,
            configuration
        );
    }
}
