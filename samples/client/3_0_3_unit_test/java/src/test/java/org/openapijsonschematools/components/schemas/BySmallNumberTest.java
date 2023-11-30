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

public class BySmallNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void test000751IsNotMultipleOf00001Fails() {
        // 0.00751 is not multiple of 0.0001
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            BySmallNumber.BySmallNumber1.class,
            0.00751,
            configuration
        ));
    }

    @Test
    public void test00075IsMultipleOf00001Passes() {
        // 0.0075 is multiple of 0.0001
        BySmallNumber.BySmallNumber1.validate(
            0.0075,
            configuration
        );
    }
}
