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

public class AnyofWithOneEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.validate(
            123,
            configuration
        );
    }

    @Test
    public void testStringIsValidPasses() {
        // string is valid
        AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.validate(
            "foo",
            configuration
        );
    }
}
