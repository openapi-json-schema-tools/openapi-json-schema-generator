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

public class NullTypeMatchesOnlyTheNullObjectTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1 schema = (
        NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
    );
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testZeroIsNotNullFails() {
        // zero is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            0,
            validationMetadata
        ));
    }

    @Test
    public void testAnArrayIsNotNullFails() {
        // an array is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testAnObjectIsNotNullFails() {
        // an object is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            MapMaker.makeMap(
            ),
            validationMetadata
        ));
    }

    @Test
    public void testTrueIsNotNullFails() {
        // true is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            true,
            validationMetadata
        ));
    }

    @Test
    public void testFalseIsNotNullFails() {
        // false is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            false,
            validationMetadata
        ));
    }

    @Test
    public void testNullIsNullPasses() {
        // null is null
        schema.validate(
            (Void) null,
            configuration
        );
    }

    @Test
    public void testAStringIsNotNullFails() {
        // a string is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "foo",
            validationMetadata
        ));
    }

    @Test
    public void testAnIntegerIsNotNullFails() {
        // an integer is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1,
            validationMetadata
        ));
    }

    @Test
    public void testAnEmptyStringIsNotNullFails() {
        // an empty string is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            "",
            validationMetadata
        ));
    }

    @Test
    public void testAFloatIsNotNullFails() {
        // a float is not null
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            1.1d,
            validationMetadata
        ));
    }
}
