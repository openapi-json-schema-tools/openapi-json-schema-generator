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

public class NestedAnyofToCheckValidationSemanticsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNullIsValidPasses() {
        // null is valid
        NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAnythingNonNullIsInvalidFails() {
        // anything non-null is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1.class,
            123,
            configuration
        ));
    }
}
