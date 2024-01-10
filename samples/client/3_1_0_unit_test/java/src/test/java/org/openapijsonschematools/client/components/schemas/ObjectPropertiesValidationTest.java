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

public class ObjectPropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testBothPropertiesPresentAndValidIsValidPasses() {
        // both properties present and valid is valid
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "bar",
                    "baz"
                )
            ),
            configuration
        );
    }

    @Test
    public void testDoesnTInvalidateOtherPropertiesPasses() {
        // doesn&#x27;t invalidate other properties
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, List<?>>(
                    "quux",
                    Arrays.asList(
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testBothPropertiesInvalidIsInvalidFails() {
        // both properties invalid is invalid
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        Arrays.asList(
                        )
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "bar",
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
    public void testIgnoresArraysPasses() {
        // ignores arrays
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testOnePropertyInvalidIsInvalidFails() {
        // one property invalid is invalid
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Object>(
                        "foo",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Object>(
                        "bar",
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
}
