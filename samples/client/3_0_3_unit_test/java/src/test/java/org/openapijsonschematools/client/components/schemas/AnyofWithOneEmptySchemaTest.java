package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class AnyofWithOneEmptySchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNumberIsValidPasses() {
        // number is valid
        final var schema = AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.getInstance();
        schema.validate(
            123,
            configuration
        );
    }

    @Test
    public void testStringIsValidPasses() {
        // string is valid
        final var schema = AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
