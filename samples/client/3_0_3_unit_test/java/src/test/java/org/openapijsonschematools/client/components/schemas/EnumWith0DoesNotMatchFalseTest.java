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

public class EnumWith0DoesNotMatchFalseTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1 schema = (
        EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testFloatZeroIsValidPasses() {
        // float zero is valid
        schema.validate(
            0.0d,
            configuration
        );
    }

    @Test
    public void testFalseIsInvalidFails() {
        // false is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            false,
            validationMetadata
        ));
    }

    @Test
    public void testIntegerZeroIsValidPasses() {
        // integer zero is valid
        schema.validate(
            0,
            configuration
        );
    }
}
