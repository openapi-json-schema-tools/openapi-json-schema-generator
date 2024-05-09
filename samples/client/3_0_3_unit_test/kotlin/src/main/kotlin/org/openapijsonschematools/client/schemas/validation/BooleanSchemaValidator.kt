package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface BooleanSchemaValidator<T> {
    @Throws(ValidationException::class)
    fun validate(arg: Boolean, configuration: SchemaConfiguration?): Boolean

    @Throws(ValidationException::class)
    fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): T
}