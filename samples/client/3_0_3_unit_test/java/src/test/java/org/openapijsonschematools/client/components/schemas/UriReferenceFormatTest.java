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

public class UriReferenceFormatTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testAllStringFormatsIgnoreIntegersPasses() throws ValidationException, InvalidTypeException {
        // all string formats ignore integers
        final var schema = UriReferenceFormat.UriReferenceFormat1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreNullsPasses() throws ValidationException, InvalidTypeException {
        // all string formats ignore nulls
        final var schema = UriReferenceFormat.UriReferenceFormat1.getInstance();
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreObjectsPasses() throws ValidationException, InvalidTypeException {
        // all string formats ignore objects
        final var schema = UriReferenceFormat.UriReferenceFormat1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreFloatsPasses() throws ValidationException, InvalidTypeException {
        // all string formats ignore floats
        final var schema = UriReferenceFormat.UriReferenceFormat1.getInstance();
        schema.validate(
            13.7d,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreArraysPasses() throws ValidationException, InvalidTypeException {
        // all string formats ignore arrays
        final var schema = UriReferenceFormat.UriReferenceFormat1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreBooleansPasses() throws ValidationException, InvalidTypeException {
        // all string formats ignore booleans
        final var schema = UriReferenceFormat.UriReferenceFormat1.getInstance();
        schema.validate(
            false,
            configuration
        );
    }
}
