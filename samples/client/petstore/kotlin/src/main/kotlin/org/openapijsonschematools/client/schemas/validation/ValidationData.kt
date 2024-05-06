package org.openapijsonschematools.client.schemas.validation

data class ValidationData(
    val schema: JsonSchema<*>,
    val arg: Any?,
    val validationMetadata: ValidationMetadata,
    val containsPathToSchemas: List<PathToSchemasMap>?,
    val patternPropertiesPathToSchemas: PathToSchemasMap?,
    val ifPathToSchemas: PathToSchemasMap?,
    val knownPathToSchemas: PathToSchemasMap?
)