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

public class ContainsWithNullInstanceElementsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAllowsNullItemsPasses() throws ValidationException {
        // allows null items
        final var schema = ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1.getInstance();
        schema.validate(
            Arrays.asList(
                (Void) null
            ),
            configuration
        );
    }
}
