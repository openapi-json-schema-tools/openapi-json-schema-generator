package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException
import java.math.BigDecimal
import java.math.BigInteger
import java.time.format.DateTimeParseException
import java.util.UUID
import kotlin.math.floor

class FormatValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val format: String = data.schema.format ?: return null
        if (data.arg is Number) {
            validateNumericFormat(
                data.arg,
                data.validationMetadata,
                format
            )
            return null
        } else if (data.arg is String) {
            validateStringFormat(
                data.arg,
                data.validationMetadata,
                format
            )
            return null
        }
        return null
    }

    companion object {
        private val int32InclusiveMinimum = BigInteger.valueOf(-2147483648L)
        private val int32InclusiveMaximum = BigInteger.valueOf(2147483647L)
        private val int64InclusiveMinimum = BigInteger.valueOf(Long.MIN_VALUE)
        private val int64InclusiveMaximum = BigInteger.valueOf(Long.MAX_VALUE)
        private val floatInclusiveMinimum = BigDecimal.valueOf(-3.4028234663852886e+38)
        private val floatInclusiveMaximum = BigDecimal.valueOf(3.4028234663852886e+38)
        private val doubleInclusiveMinimum = BigDecimal.valueOf(-1.7976931348623157E+308)
        private val doubleInclusiveMaximum = BigDecimal.valueOf(1.7976931348623157E+308)
        @Throws(ValidationException::class)
        private fun validateNumericFormat(arg: Number, validationMetadata: ValidationMetadata, format: String) {
            if (format.startsWith("int")) {
                // there is a json schema test where 1.0 validates as an integer
                val intArg: BigInteger
                when (arg) {
                    is Float, is Double -> {
                        val doubleArg: Double = (arg as? Float)?.toDouble() ?: arg as Double
                        if (floor(doubleArg) != doubleArg) {
                            throw ValidationException(
                                "Invalid non-integer value " + arg + " for format " + format + " at " + validationMetadata.pathToItem
                            )
                        }
                        intArg = if (arg is Float) {
                            val smallInt = Math.round(arg)
                            BigInteger.valueOf(smallInt.toLong())
                        } else {
                            BigInteger.valueOf(Math.round((arg as Double)))
                        }
                    }

                    is Int -> {
                        intArg = BigInteger.valueOf(arg.toLong())
                    }

                    is Long -> {
                        intArg = BigInteger.valueOf(arg)
                    }

                    else -> {
                        intArg = arg as BigInteger
                    }
                }
                if (format == "int32") {
                    if (intArg.compareTo(int32InclusiveMinimum) < 0 || intArg.compareTo(int32InclusiveMaximum) > 0) {
                        throw ValidationException(
                            "Invalid value " + arg + " for format int32 at " + validationMetadata.pathToItem
                        )
                    }
                } else if (format == "int64") {
                    if (intArg.compareTo(int64InclusiveMinimum) < 0 || intArg.compareTo(int64InclusiveMaximum) > 0) {
                        throw ValidationException(
                            "Invalid value " + arg + " for format int64 at " + validationMetadata.pathToItem
                        )
                    }
                }
            } else if (format == "float" || format == "double") {
                val decimalArg: BigDecimal = when (arg) {
                    is Float -> {
                        BigDecimal.valueOf(arg.toDouble())
                    }

                    is Double -> {
                        BigDecimal.valueOf(arg)
                    }

                    else -> {
                        arg as BigDecimal
                    }
                }
                if (format == "float") {
                    if (decimalArg.compareTo(floatInclusiveMinimum) < 0 || decimalArg.compareTo(floatInclusiveMaximum) > 0) {
                        throw ValidationException(
                            "Invalid value " + arg + " for format float at " + validationMetadata.pathToItem
                        )
                    }
                } else {
                    if (decimalArg.compareTo(doubleInclusiveMinimum) < 0 || decimalArg.compareTo(doubleInclusiveMaximum) > 0) {
                        throw ValidationException(
                            "Invalid value " + arg + " for format double at " + validationMetadata.pathToItem
                        )
                    }
                }
            }
        }

        @Throws(ValidationException::class)
        private fun validateStringFormat(arg: String, validationMetadata: ValidationMetadata, format: String) {
            when (format) {
                "uuid" -> {
                    try {
                        UUID.fromString(arg)
                    } catch (e: IllegalArgumentException) {
                        throw ValidationException(
                            "Value cannot be converted to a UUID. Invalid value " +
                                    arg + " for format uuid at " + validationMetadata.pathToItem
                        )
                    }
                }

                "number" -> {
                    try {
                        BigDecimal(arg)
                    } catch (e: NumberFormatException) {
                        throw ValidationException(
                            "Value cannot be converted to a decimal. Invalid value " +
                                    arg + " for format number at " + validationMetadata.pathToItem
                        )
                    }
                }

                "date" -> {
                    try {
                        CustomIsoparser.parseIsodate(arg)
                    } catch (e: DateTimeParseException) {
                        throw ValidationException(
                            "Value does not conform to the required ISO-8601 date format. " +
                                    "Invalid value " + arg + " for format date at " + validationMetadata.pathToItem
                        )
                    }
                }

                "date-time" -> {
                    try {
                        CustomIsoparser.parseIsodatetime(arg)
                    } catch (e: DateTimeParseException) {
                        throw ValidationException(
                            "Value does not conform to the required ISO-8601 datetime format. " +
                                    "Invalid value " + arg + " for format datetime at " + validationMetadata.pathToItem
                        )
                    }
                }
            }
        }
    }
}