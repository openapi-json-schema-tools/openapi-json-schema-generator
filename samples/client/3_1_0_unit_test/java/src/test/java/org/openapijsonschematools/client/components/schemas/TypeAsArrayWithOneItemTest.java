package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class TypeAsArrayWithOneItemTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testNumberIsInvalidFails() {
        // number is invalid
        final var schema = TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1.getInstance();
        try {
            schema.validate(
                123,
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testStringIsValidPasses() throws ValidationException {
        // string is valid
        final var schema = TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1.getInstance();
        schema.validate(
            "foo",
            configuration
        );
    }
}
