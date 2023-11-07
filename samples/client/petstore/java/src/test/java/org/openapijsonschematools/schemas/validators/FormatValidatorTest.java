package org.openapijsonschematools.schemas.validators;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FormatValidatorTest {
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            new ArrayList<>(),
            new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone()),
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testIntFormatSucceedsWithFloat() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal("1.0"),
                "int",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testIntFormatSucceedsWithInt() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal("1"),
                "int",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32InclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(-2147483648),
                "int32",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32InclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(2147483647),
                "int32",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt64InclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(-9223372036854775808L),
                "int64",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt64InclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(9223372036854775807L),
                "int64",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testFloatInclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(-3.4028234663852886e+38),
                "float",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testFloatInclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(3.4028234663852886e+38),
                "float",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testDoubleInclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                BigDecimal.valueOf(-1.7976931348623157E+308d),
                "double",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testDoubleInclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                BigDecimal.valueOf(1.7976931348623157E+308d),
                "double",
                null,
                SchemaValidator.class,
                validationMetadata
        );
        Assert.assertNull(pathToSchemasMap);
    }
}
