package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class ObjectPropertiesValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testBothPropertiesPresentAndValidIsValidPasses() {
        // both properties present and valid is valid
        ObjectPropertiesValidation.ObjectPropertiesValidation1.validate(
            Map.ofEntries(
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
        ObjectPropertiesValidation.ObjectPropertiesValidation1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "quux",
                    List.of(
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        ObjectPropertiesValidation.ObjectPropertiesValidation1.validate(
            12,
            configuration
        );
    }

    @Test
    public void testBothPropertiesInvalidIsInvalidFails() {
        // both properties invalid is invalid
        Assert.assertThrows(ValidationException.class, () -> ObjectPropertiesValidation.ObjectPropertiesValidation1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    List.of(
                    )
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    Map.ofEntries(
                    )
                )
            ),
            configuration
        ));
    }

    @Test
    public void testIgnoresArraysPasses() {
        // ignores arrays
        ObjectPropertiesValidation.ObjectPropertiesValidation1.validate(
            List.of(
            ),
            configuration
        );
    }

    @Test
    public void testOnePropertyInvalidIsInvalidFails() {
        // one property invalid is invalid
        Assert.assertThrows(ValidationException.class, () -> ObjectPropertiesValidation.ObjectPropertiesValidation1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    Map.ofEntries(
                    )
                )
            ),
            configuration
        ));
    }
}
