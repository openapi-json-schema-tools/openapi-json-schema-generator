package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

import java.math.BigDecimal

class EnumValidator : BigDecimalValidator(), KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val enumValues: Set<Any> = data.schema.enumValues ?: return null
        if (enumValues.isEmpty()) {
            throw ValidationException("No value can match enum because enum is empty")
        }
        if (data.arg is Number) {
            val castArg = getBigDecimal(data.arg)
            if (enumContainsArg(enumValues, castArg)) {
                return null
            }
            for (enumValue in enumValues) {
                if (enumValue is BigDecimal && enumValue.compareTo(castArg) == 0) {
                    return null
                }
            }
        } else {
            if (enumContainsArg(enumValues, data.arg)) {
                return null
            }
        }
        throw ValidationException("Invalid value " + data.arg + " was not one of the allowed enum " + enumValues)
    }

    companion object {
        private fun enumContainsArg(enumValues: Set<Any?>, arg: Any?): Boolean {
            return enumValues.contains(arg)
        }
    }
}