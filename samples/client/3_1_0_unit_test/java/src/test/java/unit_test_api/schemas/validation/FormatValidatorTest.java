package unit_test_api.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Assert;
import org.junit.Test;
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.IntJsonSchema;
import unit_test_api.schemas.Int32JsonSchema;
import unit_test_api.schemas.Int64JsonSchema;
import unit_test_api.schemas.FloatJsonSchema;
import unit_test_api.schemas.DoubleJsonSchema;
import unit_test_api.schemas.DecimalJsonSchema;
import unit_test_api.schemas.DateJsonSchema;
import unit_test_api.schemas.DateTimeJsonSchema;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FormatValidatorTest {
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            new ArrayList<>(),
            new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build()),
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @SuppressWarnings("nullness")
    private void assertNull(@Nullable Object object) {
        Assert.assertNull(object);
    }

    @Test
    public void testIntFormatSucceedsWithFloat() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    IntJsonSchema.IntJsonSchema1.getInstance(),
                    1.0f,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testIntFormatFailsWithFloat() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    IntJsonSchema.IntJsonSchema1.getInstance(),
                    3.14f,
                    validationMetadata
                )
        ));
    }

    @Test
    public void testIntFormatSucceedsWithInt() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    IntJsonSchema.IntJsonSchema1.getInstance(),
                    1,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32UnderMinFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    Int32JsonSchema.Int32JsonSchema1.getInstance(),
                    -2147483649L,
                    validationMetadata
                )
        ));
    }

    @Test
    public void testInt32InclusiveMinSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    Int32JsonSchema.Int32JsonSchema1.getInstance(),
                    -2147483648,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32InclusiveMaxSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    Int32JsonSchema.Int32JsonSchema1.getInstance(),
                    2147483647,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt32OverMaxFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    Int32JsonSchema.Int32JsonSchema1.getInstance(),
                    2147483648L,
                    validationMetadata
                )
        ));
    }

    @Test
    public void testInt64UnderMinFails() {
        final FormatValidator validator = new FormatValidator();

        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    Int64JsonSchema.Int64JsonSchema1.getInstance(),
                    new BigInteger("-9223372036854775809"),
                    validationMetadata
                )
        ));
    }

    @Test
    public void testInt64InclusiveMinSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    Int64JsonSchema.Int64JsonSchema1.getInstance(),
                    -9223372036854775808L,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt64InclusiveMaxSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    Int64JsonSchema.Int64JsonSchema1.getInstance(),
                    9223372036854775807L,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInt64OverMaxFails() {
        final FormatValidator validator = new FormatValidator();

        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    Int64JsonSchema.Int64JsonSchema1.getInstance(),
                    new BigInteger("9223372036854775808"),
                    validationMetadata
                )
        ));
    }

    @Test
    public void testFloatUnderMinFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    FloatJsonSchema.FloatJsonSchema1.getInstance(),
                    -3.402823466385289e+38d,
                    validationMetadata
                )
        ));
    }

    @Test
    public void testFloatInclusiveMinSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    FloatJsonSchema.FloatJsonSchema1.getInstance(),
                    -3.4028234663852886e+38f,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testFloatInclusiveMaxSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    FloatJsonSchema.FloatJsonSchema1.getInstance(),
                    3.4028234663852886e+38f,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testFloatOverMaxFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    FloatJsonSchema.FloatJsonSchema1.getInstance(),
                    3.402823466385289e+38d,
                    validationMetadata
                )
        ));
    }

    @Test
    public void testDoubleUnderMinFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    DoubleJsonSchema.DoubleJsonSchema1.getInstance(),
                    new BigDecimal("-1.7976931348623157082e+308"),
                    validationMetadata
                )
        ));
    }

    @Test
    public void testDoubleInclusiveMinSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    DoubleJsonSchema.DoubleJsonSchema1.getInstance(),
                    -1.7976931348623157E+308d,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testDoubleInclusiveMaxSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    DoubleJsonSchema.DoubleJsonSchema1.getInstance(),
                    1.7976931348623157E+308d,
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testDoubleOverMaxFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    DoubleJsonSchema.DoubleJsonSchema1.getInstance(),
                    new BigDecimal("1.7976931348623157082e+308"),
                    validationMetadata
                )
        ));
    }

    @Test
    public void testInvalidNumberStringFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    DecimalJsonSchema.DecimalJsonSchema1.getInstance(),
                    "abc",
                    validationMetadata
                )
        ));
    }

    @Test
    public void testValidFloatNumberStringSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    DecimalJsonSchema.DecimalJsonSchema1.getInstance(),
                    "3.14",
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testValidIntNumberStringSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    DecimalJsonSchema.DecimalJsonSchema1.getInstance(),
                    "1",
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInvalidDateStringFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    DateJsonSchema.DateJsonSchema1.getInstance(),
                    "abc",
                    validationMetadata
                )
        ));
    }

    @Test
    public void testValidDateStringSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    DateJsonSchema.DateJsonSchema1.getInstance(),
                    "2017-01-20",
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }

    @Test
    public void testInvalidDateTimeStringFails() {
        final FormatValidator validator = new FormatValidator();
        Assert.assertThrows(ValidationException.class, () -> validator.validate(
                new ValidationData(
                    DateTimeJsonSchema.DateTimeJsonSchema1.getInstance(),
                    "abc",
                    validationMetadata
                )
        ));
    }

    @Test
    public void testValidDateTimeStringSucceeds() throws ValidationException {
        final FormatValidator validator = new FormatValidator();
        PathToSchemasMap pathToSchemasMap = validator.validate(
                new ValidationData(
                    DateTimeJsonSchema.DateTimeJsonSchema1.getInstance(),
                    "2017-07-21T17:32:28Z",
                    validationMetadata
                )
        );
        assertNull(pathToSchemasMap);
    }
}