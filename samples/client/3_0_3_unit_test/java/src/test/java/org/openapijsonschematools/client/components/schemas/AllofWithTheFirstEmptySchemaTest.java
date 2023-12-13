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

public class AllofWithTheFirstEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1 schema = JsonSchemaFactory.getInstance(
        AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1.class
    );

    @Test
    public void testStringIsInvalidFails() {
        // string is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            "foo",
            configuration
        ));
    }

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        schema.validate(
            1,
            configuration
        );
    }
}
