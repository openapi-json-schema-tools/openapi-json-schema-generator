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

public class AdditionalpropertiesShouldNotLookInApplicatorsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testPropertiesDefinedInAllofAreNotExaminedFails() {
        // properties defined in allOf are not examined
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    true
                )
            ),
            configuration
        ));
    }

    @Test
    public void testValidTestCasePasses() {
        // valid test case
        AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    false
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    true
                )
            ),
            configuration
        );
    }
}
