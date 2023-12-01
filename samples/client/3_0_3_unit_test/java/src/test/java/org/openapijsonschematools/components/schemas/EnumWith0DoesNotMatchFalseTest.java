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

public class EnumWith0DoesNotMatchFalseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testFloatZeroIsValidPasses() {
        // float zero is valid
        EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.validate(
            0.0,
            configuration
        );
    }

    @Test
    public void testFalseIsInvalidFails() {
        // false is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.class,
            false,
            configuration
        ));
    }

    @Test
    public void testIntegerZeroIsValidPasses() {
        // integer zero is valid
        EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.validate(
            0,
            configuration
        );
    }
}
