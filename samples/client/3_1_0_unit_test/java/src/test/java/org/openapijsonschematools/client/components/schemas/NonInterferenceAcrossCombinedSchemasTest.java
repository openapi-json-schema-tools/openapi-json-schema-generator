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

public class NonInterferenceAcrossCombinedSchemasTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testValidButWouldHaveBeenInvalidThroughElsePasses() throws ValidationException {
        // valid, but would have been invalid through else
        final var schema = NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1.getInstance();
        schema.validate(
            3,
            configuration
        );
    }

    @Test
    public void testValidButWouldHaveBeenInvalidThroughThenPasses() throws ValidationException {
        // valid, but would have been invalid through then
        final var schema = NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1.getInstance();
        schema.validate(
            -100,
            configuration
        );
    }
}
