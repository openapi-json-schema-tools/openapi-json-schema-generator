package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class ObjectPropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testBothPropertiesPresentAndValidIsValidPasses() {
        // both properties present and valid is valid
        final var schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance();
        schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
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
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            new FrozenMap<>(MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    Arrays.asList(
                    )
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    MapMaker.makeMap(
                    )
                )
            )),
            validationMetadata
        ));
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            new FrozenMap<>(MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    MapMaker.makeMap(
                    )
                )
            )),
            validationMetadata
        ));
    }
}
