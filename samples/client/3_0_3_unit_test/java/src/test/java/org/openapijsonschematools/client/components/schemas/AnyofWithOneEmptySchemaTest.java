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

public class AnyofWithOneEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1 schema = JsonSchemaFactory.getInstance(
        AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.class
    );

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        schema.validate(
            123,
            configuration
        );
    }

    @Test
    public void testStringIsValidPasses() {
        // string is valid
        schema.validate(
            "foo",
            configuration
        );
    }
}
