package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class EnumWith1DoesNotMatchTrueTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testTrueIsInvalidFails() {
        // true is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
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
