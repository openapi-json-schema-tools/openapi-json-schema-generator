package org.openapijsonschematools.client.schemas.validation

data class ValidationData(
    val schema: JsonSchema<*>,
    val arg: Any?,
    val validationMetadata: ValidationMetadata,
    val containsPathToSchemas: List<PathToSchemasMap>? = null,
    val patternPropertiesPathToSchemas: PathToSchemasMap? = null,
    val ifPathToSchemas: PathToSchemasMap? = null,
    val knownPathToSchemas: PathToSchemasMap? = null
)