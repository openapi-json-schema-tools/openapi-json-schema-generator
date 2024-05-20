package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

fun interface KeywordValidator {
    @Throws(ValidationException::class)
    fun validate(
        data: ValidationData
    ): PathToSchemasMap?
}