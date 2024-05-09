package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface ListSchemaValidator<OutType, BoxedType> {
    @Throws(ValidationException::class)
    fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): OutType

    @Throws(ValidationException::class)
    fun validate(arg: List<*>, configuration: SchemaConfiguration?): OutType

    @Throws(ValidationException::class)
    fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): BoxedType
}