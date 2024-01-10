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

public class PropertynamesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testSomePropertyNamesInvalidFails() {
        // some property names invalid
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "foo",
                        MapUtils.makeMap(
                        )
                    ),
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "foobar",
                        MapUtils.makeMap(
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllPropertyNamesValidPasses() {
        // all property names valid
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                    "f",
                    MapUtils.makeMap(
                    )
                ),
                new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                    "foo",
                    MapUtils.makeMap(
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testObjectWithoutPropertiesIsValidPasses() {
        // object without properties is valid
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2,
                3,
                4
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresStringsPasses() {
        // ignores strings
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }
}
