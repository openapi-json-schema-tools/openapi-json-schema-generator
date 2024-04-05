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

public class PrefixitemsWithNullInstanceElementsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAllowsNullElementsPasses() throws ValidationException {
        // allows null elements
        final var schema = PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1.getInstance();
        schema.validate(
            new PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsListBuilder()
                .add((Void) null)

            .build(),
            configuration
        );
    }
}
