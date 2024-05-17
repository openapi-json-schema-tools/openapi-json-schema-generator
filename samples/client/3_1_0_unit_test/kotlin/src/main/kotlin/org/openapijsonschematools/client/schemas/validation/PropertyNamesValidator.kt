package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class PropertyNamesValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val propertyNames: Class<out JsonSchema<*>> = data.schema.propertyNames ?: return null
        if (data.arg !is Map<*, *>) {
            return null
        }
        val propertyNamesSchema = JsonSchemaFactory.getInstance(propertyNames)
        for (objKey in data.arg.keys) {
            if (objKey is String) {
                val propPathToItem: List<Any> = data.validationMetadata.pathToItem + objKey
                val keyValidationMetadata = ValidationMetadata(
                    propPathToItem,
                    data.validationMetadata.configuration,
                    data.validationMetadata.validatedPathToSchemas,
                    data.validationMetadata.seenClasses
                )
                JsonSchema.validate(propertyNamesSchema, objKey, keyValidationMetadata)
            }
        }
        return null
    }
}
