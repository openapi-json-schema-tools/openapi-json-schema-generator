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

public class AllofWithTheFirstEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testStringIsInvalidFails() {
        // string is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1.class,
            "foo",
            configuration
        ));
    }

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        // payload type = integer
        // dataType =
        AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1.validate(
            1,
            configuration
        );
    }
}
