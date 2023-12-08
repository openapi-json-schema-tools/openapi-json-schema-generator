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

public class ByNumberTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ByNumber.ByNumber1 schema = JsonSchemaFactory.getInstance(
        ByNumber.ByNumber1.class
    );

    @Test
    public void test35IsNotMultipleOf15Fails() {
        // 35 is not multiple of 1.5
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            35,
            configuration
        ));
    }

    @Test
    public void test45IsMultipleOf15Passes() {
        // 4.5 is multiple of 1.5
        schema.validate(
            4.5d,
            configuration
        );
    }

    @Test
    public void testZeroIsMultipleOfAnythingPasses() {
        // zero is multiple of anything
        schema.validate(
            0,
            configuration
        );
    }
}
