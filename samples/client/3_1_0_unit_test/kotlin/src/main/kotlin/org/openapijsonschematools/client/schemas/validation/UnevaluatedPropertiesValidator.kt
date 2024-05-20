package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class UnevaluatedPropertiesValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val unevaluatedProperties: Class<out JsonSchema<*>> = data.schema.unevaluatedProperties ?: return null
        val knownPathToSchemas: PathToSchemasMap = data.knownPathToSchemas ?: return null
        if (data.arg !is Map<*, *>) {
            return null
        }
        val pathToSchemas = PathToSchemasMap()
        val unevaluatedPropertiesSchema = JsonSchemaFactory.getInstance(unevaluatedProperties)
        for ((key, value) in data.arg.entries) {
            if (key !is String) {
                throw ValidationException("Map keys must be strings")
            }
            val propPathToItem: List<Any> = data.validationMetadata.pathToItem + key
            if (knownPathToSchemas.containsKey(propPathToItem)) {
                continue
            }
            val propValidationMetadata = ValidationMetadata(
                propPathToItem,
                data.validationMetadata.configuration,
                data.validationMetadata.validatedPathToSchemas,
                data.validationMetadata.seenClasses
            )
            val otherPathToSchemas = JsonSchema.validate(unevaluatedPropertiesSchema, value, propValidationMetadata)
            pathToSchemas.update(otherPathToSchemas)
        }
        return pathToSchemas
    }
}