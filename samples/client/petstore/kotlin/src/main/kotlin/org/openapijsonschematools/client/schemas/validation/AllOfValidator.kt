package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class AllOfValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        val allOf: List<Class<out JsonSchema<*>>> = data.schema.allOf ?: return null
        val pathToSchemas = PathToSchemasMap()
        for (allOfClass in allOf) {
            val allOfSchema = JsonSchemaFactory.getInstance(allOfClass)
            val otherPathToSchemas = JsonSchema.validate(allOfSchema, data.arg, data.validationMetadata)
            pathToSchemas.update(otherPathToSchemas)
        }
        return pathToSchemas
    }
}
