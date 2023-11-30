package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class AllofSimpleTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testMismatchOneFails() {
        // mismatch one
        Assert.assertThrows(ValidationException.class, () -> AllofSimpleTypes.AllofSimpleTypes1.validate(
            35,
            configuration
        ));
    }

    @Test
    public void testValidPasses() {
        // valid
        AllofSimpleTypes.AllofSimpleTypes1.validate(
            25,
            configuration
        );
    }
}
