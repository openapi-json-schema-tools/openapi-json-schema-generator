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

public class AllofWithTwoEmptySchemasTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1 schema = JsonSchemaFactory.getInstance(
        AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1.class
    );

    @Test
    public void testAnyDataIsValidPasses() {
        // any data is valid
        schema.validate(
            1,
            configuration
        );
    }
}
