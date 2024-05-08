package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MinimumValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val minimum: Number = data.schema.minimum ?: return null
        if (data.arg !is Number) {
            return null
        }
        val msg = "Value " + data.arg + " is invalid because it is < the minimum of " + minimum
        when (data.arg) {
            is Int -> {
                if (data.arg.compareTo(minimum.toInt()) < 0) {
                    throw ValidationException(msg)
                }
            }

            is Long -> {
                if (data.arg.compareTo(minimum.toLong()) < 0) {
                    throw ValidationException(msg)
                }
            }

            is Float -> {
                if (data.arg.compareTo(minimum.toFloat()) < 0) {
                    throw ValidationException(msg)
                }
            }

            is Double -> {
                if (data.arg.compareTo(minimum.toDouble()) < 0) {
                    throw ValidationException(msg)
                }
            }
        }
        return null
    }
}
