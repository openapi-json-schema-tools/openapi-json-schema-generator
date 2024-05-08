package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MinItemsValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val minItems: Int = data.schema.minItems ?: return null
        if (data.arg !is List<*>) {
            return null
        }
        if (data.arg.size < minItems) {
            throw ValidationException("Value ${data.arg} is invalid because has < the minItems of $minItems")
        }
        return null
    }
}
