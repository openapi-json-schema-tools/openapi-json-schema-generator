package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

interface DefaultValueMethod<T> {
    @Throws(ValidationException::class)
    fun defaultValue(): T
}