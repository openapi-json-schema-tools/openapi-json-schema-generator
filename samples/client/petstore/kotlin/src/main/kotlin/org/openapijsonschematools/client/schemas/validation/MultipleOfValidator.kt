package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException
import java.math.BigDecimal

class MultipleOfValidator : BigDecimalValidator(), KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val multipleOf: BigDecimal = data.schema.multipleOf ?: return null
        if (data.arg !is Number) {
            return null
        }
        val castArg: BigDecimal = getBigDecimal(data.arg)
        val msg = "Value ${data.arg} is invalid because it is not a multiple of $multipleOf"
        if (castArg.remainder(multipleOf).compareTo(BigDecimal.ZERO) != 0) {
            throw ValidationException(msg)
        }
        return null
    }
}