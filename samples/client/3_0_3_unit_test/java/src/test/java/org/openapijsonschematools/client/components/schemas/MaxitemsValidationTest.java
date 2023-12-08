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

public class MaxitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final MaxitemsValidation.MaxitemsValidation1 schema = JsonSchemaFactory.getInstance(
        MaxitemsValidation.MaxitemsValidation1.class
    );

    @Test
    public void testShorterIsValidPasses() {
        // shorter is valid
        schema.validate(
            Arrays.asList(
                1
            ),
            configuration
        );
    }

    @Test
    public void testExactLengthIsValidPasses() {
        // exact length is valid
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testTooLongIsInvalidFails() {
        // too long is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            Arrays.asList(
                1,
                2,
                3
            ),
            configuration
        ));
    }

    @Test
    public void testIgnoresNonArraysPasses() {
        // ignores non-arrays
        schema.validate(
            "foobar",
            configuration
        );
    }
}
