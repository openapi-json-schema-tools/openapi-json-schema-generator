package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class Ipv6FormatTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final Ipv6Format.Ipv6Format1 schema = (
        Ipv6Format.Ipv6Format1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testAllStringFormatsIgnoreIntegersPasses() {
        // all string formats ignore integers
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreNullsPasses() {
        // all string formats ignore nulls
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreObjectsPasses() {
        // all string formats ignore objects
        schema.validate(
            MapMaker.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreFloatsPasses() {
        // all string formats ignore floats
        schema.validate(
            13.7d,
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreArraysPasses() {
        // all string formats ignore arrays
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testAllStringFormatsIgnoreBooleansPasses() {
        // all string formats ignore booleans
        schema.validate(
            false,
            configuration
        );
    }
}
