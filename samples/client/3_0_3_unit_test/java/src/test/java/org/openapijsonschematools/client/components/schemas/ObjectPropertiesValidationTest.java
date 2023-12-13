package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class ObjectPropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ObjectPropertiesValidation.ObjectPropertiesValidation1 schema = JsonSchemaFactory.getInstance(
        ObjectPropertiesValidation.ObjectPropertiesValidation1.class
    );

    @Test
    public void testBothPropertiesPresentAndValidIsValidPasses() {
        // both properties present and valid is valid
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
        schema.validate(
            12,
            configuration
        );
    }

    @Test
    public void testBothPropertiesInvalidIsInvalidFails() {
        // both properties invalid is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
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
            ),
            configuration
        ));
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        schema.validate(
            Arrays.asList(
            ),
            configuration
        );
    }

    @Test
    public void testOnePropertyInvalidIsInvalidFails() {
        // one property invalid is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            MapMaker.makeMap(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    MapMaker.makeMap(
                    )
                )
            ),
            configuration
        ));
    }
}
