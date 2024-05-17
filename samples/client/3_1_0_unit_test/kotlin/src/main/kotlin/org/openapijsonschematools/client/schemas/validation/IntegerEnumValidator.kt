package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

interface IntegerEnumValidator<EnumType : IntegerValueMethod> {
    @Throws(ValidationException::class)
    fun validate(arg: EnumType, configuration: SchemaConfiguration?): Int
}