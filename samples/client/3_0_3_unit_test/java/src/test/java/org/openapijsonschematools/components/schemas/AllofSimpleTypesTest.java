package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;
import org.openapijsonschematools.schemas.MapBuilder;

import java.util.Arrays;
import java.util.AbstractMap;

public class AllofSimpleTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMismatchOneFails() {
        // mismatch one
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            AllofSimpleTypes.AllofSimpleTypes1.class,
            35,
            configuration
        ));
    }

    @Test
    public void testValidPasses() {
        // valid
        // payload type = integer
        // dataType =
        AllofSimpleTypes.AllofSimpleTypes1.validate(
            25,
            configuration
        );
    }
}
