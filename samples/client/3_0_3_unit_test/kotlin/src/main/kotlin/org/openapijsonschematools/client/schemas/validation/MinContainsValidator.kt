package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MinContainsValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val minContains: Int = data.schema.minContains ?: return null
        if (data.arg !is List<*>) {
            return null
        }
        if (data.containsPathToSchemas == null) {
            return null
        }
        if (data.containsPathToSchemas.size < minContains) {
            throw ValidationException("""
                |Validation failed for minContains keyword in class=${data.schema.javaClass} at
                | pathToItem=${data.validationMetadata.pathToItem}.
                | Too few items validated to the contains schema.
                """.trimMargin()
            )
        }
        return null
    }
}