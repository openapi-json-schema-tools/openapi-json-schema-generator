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

public class AnyofWithBaseSchemaTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final AnyofWithBaseSchema.AnyofWithBaseSchema1 schema = (
        AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testMismatchBaseSchemaFails() {
        // mismatch base schema
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            3,
            validationMetadata
        ));
    }

    @Test
    public void testOneAnyofValidPasses() {
        // one anyOf valid
        schema.validate(
            "foobar",
            configuration
        );
    }

    @Test
    public void testBothAnyofInvalidFails() {
        // both anyOf invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }
}
