package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class DependentSchemasValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        if (data.arg !is Map<*, *>) {
            return null
        }
        val dependentSchemas: Map<String, Class<out JsonSchema<*>>> = data.schema.dependentSchemas ?: return null
        val pathToSchemas = PathToSchemasMap()
        val presentProperties: MutableSet<String> = LinkedHashSet()
        for (key in data.arg.keys) {
            if (key is String) {
                presentProperties.add(key)
            }
        }
        for ((propName, dependentSchemaClass) in dependentSchemas.entries) {
            if (!presentProperties.contains(propName)) {
                continue
            }
            val dependentSchema = JsonSchemaFactory.getInstance(dependentSchemaClass)
            val otherPathToSchemas = JsonSchema.validate(dependentSchema, data.arg, data.validationMetadata)
            pathToSchemas.update(otherPathToSchemas)
        }
        return pathToSchemas
    }
}
