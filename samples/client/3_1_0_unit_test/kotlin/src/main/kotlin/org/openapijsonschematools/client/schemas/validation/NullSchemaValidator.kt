package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface NullSchemaValidator<T> {
    @Throws(ValidationException::class)
    fun validate(arg: Nothing?, configuration: SchemaConfiguration?): Nothing?

    @Throws(ValidationException::class)
    fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): T
}