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

public class AdditionalItemsAreAllowedByDefaultTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testOnlyTheFirstItemIsValidatedPasses() throws ValidationException {
        // only the first item is validated
        final var schema = AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1.getInstance();
        schema.validate(
            new AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultListBuilder()
                .add(1)

                .add("foo")

                .add(false)

            .build(),
            configuration
        );
    }
}
