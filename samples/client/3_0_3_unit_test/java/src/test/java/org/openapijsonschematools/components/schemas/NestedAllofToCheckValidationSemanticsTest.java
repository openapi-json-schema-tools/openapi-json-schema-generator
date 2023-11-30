package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class NestedAllofToCheckValidationSemanticsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNullIsValidPasses() {
        // null is valid
        NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1.validate(
            null,
            configuration
        );
    }

    @Test
    public void testAnythingNonNullIsInvalidFails() {
        // anything non-null is invalid
        Assert.assertThrows(ValidationException.class, () -> NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1.validate(
            123,
            configuration
        ));
    }
}
