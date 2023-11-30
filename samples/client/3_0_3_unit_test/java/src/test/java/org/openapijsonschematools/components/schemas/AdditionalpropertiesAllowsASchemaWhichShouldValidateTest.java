package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap;

public class AdditionalpropertiesAllowsASchemaWhichShouldValidateTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNoAdditionalPropertiesIsValidPasses() {
        // no additional properties is valid
        AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnAdditionalValidPropertyIsValidPasses() {
        // an additional valid property is valid
        AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.validate(
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "quux",
                    true
                )
            ),
            configuration
        );
    }

    @Test
    public void testAnAdditionalInvalidPropertyIsInvalidFails() {
        // an additional invalid property is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AdditionalpropertiesAllowsASchemaWhichShouldValidate.AdditionalpropertiesAllowsASchemaWhichShouldValidate1.class,
            Map.ofEntries(
                new AbstractMap.SimpleEntry<>(
                    "foo",
                    1
                ),
                new AbstractMap.SimpleEntry<>(
                    "bar",
                    2
                ),
                new AbstractMap.SimpleEntry<>(
                    "quux",
                    12
                )
            ),
            configuration
        ));
    }
}
