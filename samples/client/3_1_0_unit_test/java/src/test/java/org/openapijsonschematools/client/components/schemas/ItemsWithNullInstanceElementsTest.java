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

public class ItemsWithNullInstanceElementsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testAllowsNullElementsPasses() throws ValidationException {
        // allows null elements
        final var schema = ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1.getInstance();
        schema.validate(
            new ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder()
                .add((Void) null)

            .build(),
            configuration
        );
    }
}
