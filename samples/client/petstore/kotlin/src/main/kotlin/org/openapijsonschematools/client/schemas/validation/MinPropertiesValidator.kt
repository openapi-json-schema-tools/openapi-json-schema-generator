package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MinPropertiesValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val minProperties: Int = data.schema.minProperties ?: return null
        if (data.arg !is Map<*, *>) {
            return null
        }
        if (data.arg.size < minProperties) {
            throw ValidationException("Value ${data.arg} is invalid because has < the minProperties of $minProperties")
        }
        return null
    }
}
