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

public class EmptyDependentsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testEmptyObjectPasses() throws ValidationException {
        // empty object
        final var schema = EmptyDependents.EmptyDependents1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testNonObjectIsValidPasses() throws ValidationException {
        // non-object is valid
        final var schema = EmptyDependents.EmptyDependents1.getInstance();
        schema.validate(
            1,
            configuration
        );
    }

    @Test
    public void testObjectWithOnePropertyPasses() throws ValidationException {
        // object with one property
        final var schema = EmptyDependents.EmptyDependents1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "bar",
                    2
                )
            ),
            configuration
        );
    }
}
