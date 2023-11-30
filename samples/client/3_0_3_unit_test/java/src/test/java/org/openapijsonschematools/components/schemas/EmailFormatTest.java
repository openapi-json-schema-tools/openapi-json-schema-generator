package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class EmailFormatTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testAllStringFormatsIgnoreIntegersPasses() {
        // all string formats ignore integers
        EmailFormat.EmailFormat1.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreNullsPasses() {
        // all string formats ignore nulls
        EmailFormat.EmailFormat1.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreObjectsPasses() {
        // all string formats ignore objects
        EmailFormat.EmailFormat1.validate(
            Map.ofEntries(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreFloatsPasses() {
        // all string formats ignore floats
        EmailFormat.EmailFormat1.validate(
            13.7,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreArraysPasses() {
        // all string formats ignore arrays
        EmailFormat.EmailFormat1.validate(
            List.of(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreBooleansPasses() {
        // all string formats ignore booleans
        EmailFormat.EmailFormat1.validate(
            false,
            configuration
        );
    }
}
