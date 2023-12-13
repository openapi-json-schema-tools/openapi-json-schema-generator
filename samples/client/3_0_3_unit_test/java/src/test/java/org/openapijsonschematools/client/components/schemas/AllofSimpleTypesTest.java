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

public class AllofSimpleTypesTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AllofSimpleTypes.AllofSimpleTypes1 schema = JsonSchemaFactory.getInstance(
        AllofSimpleTypes.AllofSimpleTypes1.class
    );

    @Test
    public void testMismatchOneFails() {
        // mismatch one
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            35,
            configuration
        ));
    }

    @Test
    public void testValidPasses() {
        // valid
        schema.validate(
            25,
            configuration
        );
    }
}
