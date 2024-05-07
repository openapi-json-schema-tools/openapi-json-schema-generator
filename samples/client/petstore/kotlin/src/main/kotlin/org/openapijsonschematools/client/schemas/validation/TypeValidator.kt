package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.exceptions.ValidationException

class TypeValidator : KeywordValidator {
    @Throws(ValidationException::class)
    override fun validate(
        data: ValidationData
    ): PathToSchemasMap? {
        if (data.schema.type == null) {
            return null
        }
        val argClass = when (data.arg) {
            null -> {
                Void::class.java
            }
            is List<*> -> {
                MutableList::class.java
            }

            is Map<*, *> -> {
                MutableMap::class.java
            }

            else -> {
                data.arg.javaClass
            }
        }
        if (!data.schema.type.contains(argClass)) {
            throw ValidationException("invalid type")
        }
        return null
    }
}
