package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class MaxContainsValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val maxContains: Int = data.schema.maxContains ?: return null
        if (data.arg !is List<*>) {
            return null
        }
        val containsPathToSchemas: List<PathToSchemasMap> = data.containsPathToSchemas ?: return null
        if (containsPathToSchemas.size > maxContains) {
            throw ValidationException("""
                |Validation failed for maxContains keyword in class=${data.schema.javaClass}
                | at pathToItem=${data.validationMetadata.pathToItem}. Too many items"
                | validated to the contains schema.
                """.trimMargin()
            )
        }
        return null
    }
}