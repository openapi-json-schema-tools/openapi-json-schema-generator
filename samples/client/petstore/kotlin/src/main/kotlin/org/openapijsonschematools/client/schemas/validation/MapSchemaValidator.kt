package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface MapSchemaValidator<OutType, BoxedType> {
    @Throws(ValidationException::class)
    fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): OutType

    @Throws(ValidationException::class)
    fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): OutType

    @Throws(ValidationException::class)
    fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): BoxedType
}