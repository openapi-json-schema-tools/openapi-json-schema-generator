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

public class AllofWithTheLastEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testStringIsInvalidFails() {
        // string is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
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
