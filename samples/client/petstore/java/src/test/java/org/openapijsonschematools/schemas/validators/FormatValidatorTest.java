package org.openapijsonschematools.schemas.validators;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.math.BigDecimal;
import java.math.BigInteger;
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
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testIntFormatFailsWithFloat() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                new BigDecimal("3.14"),
                "int",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testIntFormatSucceedsWithInt() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal("1"),
                "int",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32UnderMinFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                new BigDecimal(-2147483649L),
                "int32",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testInt32InclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(-2147483648),
                "int32",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32InclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(2147483647),
                "int32",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32OverMaxFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                BigDecimal.valueOf(2147483648L),
                "int32",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testInt64UnderMinFails() {
        final FormatValidator validator = new FormatValidator();

        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                new BigDecimal(new BigInteger("-9223372036854775809")),
                "int64",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testInt64InclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(-9223372036854775808L),
                "int64",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt64InclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal(9223372036854775807L),
                "int64",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt64OverMaxFails() {
        final FormatValidator validator = new FormatValidator();

        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                new BigDecimal(new BigInteger("9223372036854775808")),
                "int64",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testFloatUnderMinFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                BigDecimal.valueOf(-3.402823466385289e+38),
                "float",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testFloatInclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                BigDecimal.valueOf(-3.4028234663852886e+38),
                "float",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testFloatInclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new BigDecimal("3.4028234663852886e+38"),
                "float",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testFloatOverMaxFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                BigDecimal.valueOf(3.402823466385289e+38),
                "float",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testDoubleUnderMinFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                new BigDecimal("-1.7976931348623157082e+308"),
                "double",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testDoubleInclusiveMinSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                BigDecimal.valueOf(-1.7976931348623157E+308d),
                "double",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testDoubleInclusiveMaxSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                BigDecimal.valueOf(1.7976931348623157E+308d),
                "double",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testDoubleOverMaxFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                new BigDecimal("1.7976931348623157082e+308"),
                "double",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testInvalidNumberStringFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                "abc",
                "number",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testValidFloatNumberStringSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                "3.14",
                "number",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testValidIntNumberStringSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                "1",
                "number",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInvalidDateStringFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                "abc",
                "date",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testValidDateStringSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                "2017-01-20",
                "date",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }

    @Test
    public void testInvalidDateTimeStringFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(RuntimeException.class, () -> validator.validate(
                "abc",
                "date-time",
                SchemaValidator.class,
                validationMetadata,
                null
        ));
    }

    @Test
    public void testValidDateTimeStringSucceeds() {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                "2017-07-21T17:32:28Z",
                "date-time",
                SchemaValidator.class,
                validationMetadata,
                null
        );
        Assert.assertNull(pathToSchemasMap);
    }
}
