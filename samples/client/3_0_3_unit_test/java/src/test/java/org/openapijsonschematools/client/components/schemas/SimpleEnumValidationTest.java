package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class SimpleEnumValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final SimpleEnumValidation.SimpleEnumValidation1 schema = (
        SimpleEnumValidation.SimpleEnumValidation1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testSomethingElseIsInvalidFails() {
        // something else is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            4,
            validationMetadata
        ));
    }

    @Test
    public void testOneOfTheEnumIsValidPasses() {
        // one of the enum is valid
        schema.validate(
            1,
            configuration
        );
    }
}
