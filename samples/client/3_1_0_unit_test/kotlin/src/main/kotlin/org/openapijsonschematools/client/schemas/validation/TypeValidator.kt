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
                List::class.java
            }

            is Map<*, *> -> {
                Map::class.java
            }

            is Boolean -> {
                Boolean::class.java
            }

            is Int -> {
                Int::class.java
            }
            is Long -> {
                Long::class.java
            }
            is Double -> {
                Double::class.java
            }
            is Float -> {
                Float::class.java
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