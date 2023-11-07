package org.openapijsonschematools.schemas.validators;

import org.openapijsonschematools.schemas.CustomIsoparser;
import org.openapijsonschematools.schemas.PathToSchemasMap;
import org.openapijsonschematools.schemas.SchemaValidator;
import org.openapijsonschematools.schemas.ValidationMetadata;

import java.math.BigDecimal;
import java.time.format.DateTimeParseException;

public class FormatValidator implements KeywordValidator {
    private static BigDecimal int32InclusiveMinimum = BigDecimal.valueOf(-2147483648);
    private static BigDecimal int32InclusiveMaximum = BigDecimal.valueOf(2147483647);
    private static BigDecimal int64InclusiveMinimum = BigDecimal.valueOf(-9223372036854775808L);
    private static BigDecimal int64InclusiveMaximum = BigDecimal.valueOf(9223372036854775807L);
    private static BigDecimal floatInclusiveMinimum = BigDecimal.valueOf(-3.4028234663852886e+38);
    private static BigDecimal floatInclusiveMaximum = BigDecimal.valueOf(3.4028234663852886e+38);
    private static BigDecimal doubleInclusiveMinimum = BigDecimal.valueOf(-1.7976931348623157E+308d);
    private static BigDecimal doubleInclusiveMaximum = BigDecimal.valueOf(1.7976931348623157E+308d);

    private Void validateNumericFormat(BigDecimal arg, String format, ValidationMetadata validationMetadata) {
        if (format.startsWith("int")) {
            // there is a json schema test where 1.0 validates as an integer
            if (arg.longValue() != Long.valueOf(arg.toString())) {
                throw new RuntimeException(
                        "Invalid non-integer value " + arg + " for format " + format + " at " + validationMetadata.pathToItem()
                );
            }
            if (format.equals("int32")) {
                if (arg.compareTo(int32InclusiveMinimum) < 0  || arg.compareTo(int32InclusiveMaximum) > 1 ){
                    throw new RuntimeException(
                        "Invalid value "+arg+" for format int32 at "+validationMetadata.pathToItem()
                    );
                }
                return null;
            } else if (format.equals("int64")) {
                if (arg.compareTo(int64InclusiveMinimum) < 0  || arg.compareTo(int64InclusiveMaximum) > 1 ){
                    throw new RuntimeException(
                        "Invalid value "+arg+" for format int64 at "+validationMetadata.pathToItem()
                    );
                }
                return null;
            }
            return null;
        } else if (format.equals("float")) {
            if (arg.compareTo(floatInclusiveMinimum) < 0  || arg.compareTo(floatInclusiveMaximum) > 1 ){
                throw new RuntimeException(
                    "Invalid value "+arg+" for format float at "+validationMetadata.pathToItem()
                );
            }
            return null;
        } else if (format.equals("double")) {
            if (arg.compareTo(doubleInclusiveMinimum) < 0  || arg.compareTo(doubleInclusiveMaximum) > 1 ){
                throw new RuntimeException(
                    "Invalid value "+arg+" for format double at "+validationMetadata.pathToItem()
                );
            }
            return null;
        }
        return null;
    }

    private Void validateStringFormat(String arg, String format, ValidationMetadata validationMetadata) {
        if (format.equals("uuid")) {
            // todo
            return null;
        } else if (format.equals("number")) {
            try {
                new BigDecimal(arg);
            } catch (NumberFormatException e) {
                throw new RuntimeException(
                    "Value cannot be converted to a decimal. Invalid value "+
                            arg+" for format number at "+validationMetadata.pathToItem()
                );
            }
            return null;
        } else if (format.equals("date")) {
            try {
                new CustomIsoparser().parseIsodate(arg);
            } catch (DateTimeParseException e) {
                throw new RuntimeException(
                        "Value does not conform to the required ISO-8601 date format. "+
                        "Invalid value "+arg+" for format date at "+validationMetadata.pathToItem()
                );
            }
            return null;
        } else if (format.equals("date-time")) {
            try {
                new CustomIsoparser().parseIsodatetime(arg);
            } catch (DateTimeParseException e) {
                throw new RuntimeException(
                        "Value does not conform to the required ISO-8601 datetime format. "+
                                "Invalid value "+arg+" for format datetime at "+validationMetadata.pathToItem()
                );
            }
            return null;
        }
        return null;
    }

    @Override
    public PathToSchemasMap validate(Object arg, Object value, Object extra, Class<SchemaValidator> cls, ValidationMetadata validationMetadata) {
        String format = (String) value;
        if (arg instanceof BigDecimal) {
            validateNumericFormat(
                (BigDecimal) arg,
                format,
                validationMetadata
            );
            return null;
        } else if (arg instanceof String) {
            validateStringFormat(
                (String) arg,
                format,
                validationMetadata
            );
            return null;
        }
        return null;
    }
}
