package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface StringSchemaValidator<T> {
    @Throws(ValidationException::class)
    fun validate(arg: String, configuration: SchemaConfiguration?): String

    @Throws(ValidationException::class)
    fun validateAndBox(arg: String, configuration: SchemaConfiguration?): T
}