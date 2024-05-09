package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

import java.util.regex.Pattern

class PatternValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val pattern: Pattern = data.schema.pattern ?: return null
        if (data.arg !is String) {
            return null
        }
        if (!pattern.matcher(data.arg).find()) {
            throw ValidationException("Invalid value ${data.arg} did not find a match for pattern $pattern")
        }
        return null
    }
}