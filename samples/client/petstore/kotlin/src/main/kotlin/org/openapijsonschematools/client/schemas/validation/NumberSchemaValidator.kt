package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface NumberSchemaValidator<T> {
    @Throws(ValidationException::class)
    fun validate(arg: Number, configuration: SchemaConfiguration?): Number

    @Throws(ValidationException::class)
    fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): T
}