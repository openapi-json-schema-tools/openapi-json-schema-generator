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

public class ByNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void test35IsNotMultipleOf15Fails() {
        // 35 is not multiple of 1.5
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            ByNumber.ByNumber1.class,
            35,
            configuration
        ));
    }

    @Test
    public void test45IsMultipleOf15Passes() {
        // 4.5 is multiple of 1.5
        ByNumber.ByNumber1.validate(
            4.5,
            configuration
        );
    }

    @Test
    public void testZeroIsMultipleOfAnythingPasses() {
        // zero is multiple of anything
        ByNumber.ByNumber1.validate(
            0,
            configuration
        );
    }
}
