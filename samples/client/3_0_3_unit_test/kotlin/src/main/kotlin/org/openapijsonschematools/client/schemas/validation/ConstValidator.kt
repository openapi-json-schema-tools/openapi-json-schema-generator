package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

import java.math.BigDecimal

class ConstValidator : BigDecimalValidator(), KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        if (data.schema.constValue == null) {
            return null
        }
        val constValue: Any? = data.schema.constValue.getData()
        if (data.arg is Number) {
            val castArg = getBigDecimal(data.arg)
            if (castArg == constValue) {
                return null
            }
            if (constValue is BigDecimal && constValue.compareTo(castArg) == 0) {
                return null
            }
        } else {
            if (data.arg == constValue) {
                return null
            }
        }
        throw ValidationException("Invalid value " + data.arg + " was not equal to const " + constValue)
    }
}