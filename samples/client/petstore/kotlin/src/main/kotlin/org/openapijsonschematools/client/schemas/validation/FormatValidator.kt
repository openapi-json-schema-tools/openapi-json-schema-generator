package org.openapijsonschematools.client.schemas.validation;

import org.openapijsonschematools.client.exceptions.ValidationException;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.format.DateTimeParseException;
import java.util.UUID;

public class FormatValidator implements KeywordValidator {
    private final static BigInteger int32InclusiveMinimum = BigInteger.valueOf(-2147483648L);
    private final static BigInteger int32InclusiveMaximum = BigInteger.valueOf(2147483647L);
    private final static BigInteger int64InclusiveMinimum = BigInteger.valueOf(-9223372036854775808L);
    private final static BigInteger int64InclusiveMaximum = BigInteger.valueOf(9223372036854775807L);
    private final static BigDecimal floatInclusiveMinimum = BigDecimal.valueOf(-3.4028234663852886e+38);
    private final static BigDecimal floatInclusiveMaximum = BigDecimal.valueOf(3.4028234663852886e+38);
    private final static BigDecimal doubleInclusiveMinimum = BigDecimal.valueOf(-1.7976931348623157E+308d);
    private final static BigDecimal doubleInclusiveMaximum = BigDecimal.valueOf(1.7976931348623157E+308d);

    private static void validateNumericFormat(Number arg, ValidationMetadata validationMetadata, String format) throws ValidationException {
        if (format.startsWith("int")) {
            // there is a json schema test where 1.0 validates as an integer
            BigInteger intArg;
            if (arg instanceof Float || arg instanceof Double) {
                double doubleArg;
                if (arg instanceof Float) {
                    doubleArg = arg.doubleValue();
                } else {
                    doubleArg = (Double) arg;
                }
                if (Math.floor(doubleArg) != doubleArg) {
                    throw new ValidationException(
                            "Invalid non-integer value " + arg + " for format " + format + " at " + validationMetadata.pathToItem()
                    );
                }
                if (arg instanceof Float) {
                    Integer smallInt = Math.round((Float) arg);
                    intArg = BigInteger.valueOf(smallInt.longValue());
                } else {
                    intArg = BigInteger.valueOf(Math.round((Double) arg));
                }
            } else if (arg instanceof Integer) {
                intArg = BigInteger.valueOf(arg.longValue());
            } else if (arg instanceof Long) {
                intArg = BigInteger.valueOf((Long) arg);
            } else {
                intArg = (BigInteger) arg;
            }
            if (format.equals("int32")) {
                if (intArg.compareTo(int32InclusiveMinimum) < 0 || intArg.compareTo(int32InclusiveMaximum) > 0) {
                    throw new ValidationException(
                            "Invalid value " + arg + " for format int32 at " + validationMetadata.pathToItem()
                    );
                }
            } else if (format.equals("int64")) {
                if (intArg.compareTo(int64InclusiveMinimum) < 0 || intArg.compareTo(int64InclusiveMaximum) > 0) {
                    throw new ValidationException(
                            "Invalid value " + arg + " for format int64 at " + validationMetadata.pathToItem()
                    );
                }
            }
        } else if (format.equals("float") || format.equals("double")) {
            BigDecimal decimalArg;
            if (arg instanceof Float) {
                decimalArg = BigDecimal.valueOf(arg.doubleValue());
            } else if (arg instanceof Double) {
                decimalArg = BigDecimal.valueOf((Double) arg);
            } else {
                decimalArg = (BigDecimal) arg;
            }
            if (format.equals("float")) {
                if (decimalArg.compareTo(floatInclusiveMinimum) < 0  || decimalArg.compareTo(floatInclusiveMaximum) > 0 ){
                    throw new ValidationException(
                        "Invalid value "+arg+" for format float at "+validationMetadata.pathToItem()
                    );
                }
            } else {
                if (decimalArg.compareTo(doubleInclusiveMinimum) < 0  || decimalArg.compareTo(doubleInclusiveMaximum) > 0 ){
                    throw new ValidationException(
                        "Invalid value "+arg+" for format double at "+validationMetadata.pathToItem()
                    );
                }
            }
        }
    }

    private static void validateStringFormat(String arg, ValidationMetadata validationMetadata, String format) throws ValidationException {
        switch (format) {
            case "uuid" -> {
                try {
                    UUID.fromString(arg);
                } catch (IllegalArgumentException e) {
                    throw new ValidationException(
                            "Value cannot be converted to a UUID. Invalid value " +
                                    arg + " for format uuid at " + validationMetadata.pathToItem()
                    );
                }
            }
            case "number" -> {
                try {
                    new BigDecimal(arg);
                } catch (NumberFormatException e) {
                    throw new ValidationException(
                            "Value cannot be converted to a decimal. Invalid value " +
                                    arg + " for format number at " + validationMetadata.pathToItem()
                    );
                }
            }
            case "date" -> {
                try {
                    new CustomIsoparser().parseIsodate(arg);
                } catch (DateTimeParseException e) {
                    throw new ValidationException(
                            "Value does not conform to the required ISO-8601 date format. " +
                                    "Invalid value " + arg + " for format date at " + validationMetadata.pathToItem()
                    );
                }
            }
            case "date-time" -> {
                try {
                    new CustomIsoparser().parseIsodatetime(arg);
                } catch (DateTimeParseException e) {
                    throw new ValidationException(
                            "Value does not conform to the required ISO-8601 datetime format. " +
                                    "Invalid value " + arg + " for format datetime at " + validationMetadata.pathToItem()
                    );
                }
            }
        }
    }

    @Override
    public @Nullable PathToSchemasMap validate(
        ValidationData data
    ) throws ValidationException {
        var format = data.schema().format;
        if (format == null) {
            return null;
        }
        if (data.arg() instanceof Number numberArg) {
            validateNumericFormat(
                numberArg,
                data.validationMetadata(),
                format
            );
            return null;
        } else if (data.arg() instanceof String stringArg) {
            validateStringFormat(
                stringArg,
                data.validationMetadata(),
                format
            );
            return null;
        }
        return null;
    }
}
