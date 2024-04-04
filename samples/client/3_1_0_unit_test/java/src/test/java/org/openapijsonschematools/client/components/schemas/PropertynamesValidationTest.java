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

public class PropertynamesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

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
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() throws ValidationException {
        // ignores other non-objects
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testAllPropertyNamesValidPasses() throws ValidationException {
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
    public void testObjectWithoutPropertiesIsValidPasses() throws ValidationException {
        // object without properties is valid
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresArraysPasses() throws ValidationException {
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
    public void testIgnoresStringsPasses() throws ValidationException {
        // ignores strings
        final var schema = PropertynamesValidation.PropertynamesValidation1.getInstance();
        schema.validate(
            "foobar",
            configuration
        );
    }
}
