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

public class AllofWithTheLastEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testStringIsInvalidFails() {
        // string is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1.validate(
            1,
            configuration
        );
    }
}
