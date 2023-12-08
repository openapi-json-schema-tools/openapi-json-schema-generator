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

public class NestedOneofToCheckValidationSemanticsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1 schema = JsonSchemaFactory.getInstance(
        NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1.class
    );

    @Test
    public void testNullIsValidPasses() {
        // null is valid
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAnythingNonNullIsInvalidFails() {
        // anything non-null is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            123,
            configuration
        ));
    }
}
