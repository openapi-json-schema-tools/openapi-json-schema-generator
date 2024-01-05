package org.openapijsonschematools.client.components.schemas;

import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public class AllofWithTwoEmptySchemasTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAnyDataIsValidPasses() {
        // any data is valid
        final var schema = AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }
}
