package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class ItemsWithNullInstanceElementsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAllowsNullElementsPasses() {
        // allows null elements
        final var schema = ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1.getInstance();
        schema.validate(
            new ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder(
                Arrays.asList(
                    null
                )
            ).build(),
            configuration
        );
    }
}
