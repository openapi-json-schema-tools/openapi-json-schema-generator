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

public class AnyofWithOneEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        // payload type = integer
        // dataType =
        AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.validate(
            123,
            configuration
        );
    }

    @Test
    public void testStringIsValidPasses() {
        // string is valid
        // payload type = string
        // dataType =
        AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.validate(
            "foo",
            configuration
        );
    }
}
