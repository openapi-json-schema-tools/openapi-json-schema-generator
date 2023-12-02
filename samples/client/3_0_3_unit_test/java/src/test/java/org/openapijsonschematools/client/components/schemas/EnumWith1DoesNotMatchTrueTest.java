package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumWith1DoesNotMatchTrueTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testTrueIsInvalidFails() {
        // true is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.class,
            true,
            configuration
        ));
    }

    @Test
    public void testFloatOneIsValidPasses() {
        // float one is valid
        EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.validate(
            1.0,
            configuration
        );
    }

    @Test
    public void testIntegerOneIsValidPasses() {
        // integer one is valid
        EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.validate(
            1,
            configuration
        );
    }
}
