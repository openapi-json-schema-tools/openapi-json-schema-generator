package org.openapijsonschematools.client.schemas.validation

class PatternPropertiesValidator : KeywordValidator {
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap?
    {
        if (data.schema.patternProperties == null) {
            return null
        }
        return if (data.arg !is Map<*, *>) {
            null
        } else data.patternPropertiesPathToSchemas
    }
}
