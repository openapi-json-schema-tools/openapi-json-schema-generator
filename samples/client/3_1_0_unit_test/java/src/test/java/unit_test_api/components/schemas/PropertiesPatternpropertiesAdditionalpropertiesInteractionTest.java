package unit_test_api.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class PropertiesPatternpropertiesAdditionalpropertiesInteractionTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testPropertyValidatesPropertyPasses() throws ValidationException {
        // property validates property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, List<?>>(
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
    public void testAdditionalpropertyIgnoresPropertyPasses() throws ValidationException {
        // additionalProperty ignores property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, List<?>>(
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
                    new AbstractMap.SimpleEntry<String, List<?>>(
                        "foo",
                        Arrays.asList(
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
    public void testPatternpropertyValidatesNonpropertyPasses() throws ValidationException {
        // patternProperty validates nonproperty
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, List<?>>(
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
                    new AbstractMap.SimpleEntry<String, List<?>>(
                        "fxo",
                        Arrays.asList(
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
    public void testPropertyInvalidatesPropertyFails() {
        // property invalidates property
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        try {
            schema.validate(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, List<?>>(
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
        } catch (ValidationException ignored) {
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
                    new AbstractMap.SimpleEntry<String, String>(
                        "quux",
                        "foo"
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
    public void testAdditionalpropertyValidatesOthersPasses() throws ValidationException {
        // additionalProperty validates others
        final var schema = PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance();
        schema.validate(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Number>(
                    "quux",
                    3
                )
            ),
            configuration
        );
    }
}
