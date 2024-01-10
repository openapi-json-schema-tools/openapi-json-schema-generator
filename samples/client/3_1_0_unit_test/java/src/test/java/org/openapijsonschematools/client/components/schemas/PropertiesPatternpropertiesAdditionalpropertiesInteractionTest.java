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

public class PropertiesPatternpropertiesAdditionalpropertiesInteractionTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertyValidatesPropertyPasses() {
        // property validates property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    Arrays.asList(
                        1,
                        2
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testAdditionalpropertyIgnoresPropertyPasses() {
        // additionalProperty ignores property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    Arrays.asList(
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testPatternpropertyInvalidatesPropertyFails() {
        // patternProperty invalidates property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        Arrays.asList(
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
    public void testPatternpropertyValidatesNonpropertyPasses() {
        // patternProperty validates nonproperty
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "fxo",
                    Arrays.asList(
                        1,
                        2
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testPatternpropertyInvalidatesNonpropertyFails() {
        // patternProperty invalidates nonproperty
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "fxo",
                        Arrays.asList(
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
    public void testPropertyInvalidatesPropertyFails() {
        // property invalidates property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        Arrays.asList(
                            1,
                            2,
                            3,
                            4
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
    public void testAdditionalpropertyInvalidatesOthersFails() {
        // additionalProperty invalidates others
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "quux",
                        "foo"
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
    public void testAdditionalpropertyValidatesOthersPasses() {
        // additionalProperty validates others
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "quux",
                    3
                )
            ),
            configuration
        );
    }
}
