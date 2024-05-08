package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MaxPropertiesValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val maxProperties: Int = data.schema.maxProperties ?: return null
        if (data.arg !is Map<*, *>) {
            return null
        }
        if (data.arg.size > maxProperties) {
            throw ValidationException("Value ${data.arg} is invalid because has > the maxProperties of $maxProperties")
        }
        return null
    }
}
