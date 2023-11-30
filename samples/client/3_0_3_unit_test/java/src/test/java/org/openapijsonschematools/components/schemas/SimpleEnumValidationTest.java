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

public class SimpleEnumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testSomethingElseIsInvalidFails() {
        // something else is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            SimpleEnumValidation.SimpleEnumValidation1.class,
            4,
            configuration
        ));
    }

    @Test
    public void testOneOfTheEnumIsValidPasses() {
        // one of the enum is valid
        SimpleEnumValidation.SimpleEnumValidation1.validate(
            1,
            configuration
        );
    }
}
