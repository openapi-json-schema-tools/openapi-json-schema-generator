package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import java.util.UUID

open class UuidJsonSchema {
    sealed interface UuidJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class UuidJsonSchema1BoxedString(val data: String) : UuidJsonSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }

    open class UuidJsonSchema1 protected constructor() : JsonSchema<UuidJsonSchema1Boxed>(
        JsonSchemaInfo(
            type = setOf(String::class.java),
            format = "uuid"
        )
    ), StringSchemaValidator<UuidJsonSchema1BoxedString> {
        @Throws(ValidationException::class)
        override fun validate(arg: String, configuration: SchemaConfiguration?): String {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: String = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }

        @Throws(ValidationException::class)
        fun validate(arg: UUID, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): String {
            if (arg is String) {
                return arg
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): String {
            if (arg is UUID) {
                return validate(arg, configuration)
            } else if (arg is String) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): UuidJsonSchema1BoxedString {
            return UuidJsonSchema1BoxedString(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): UuidJsonSchema1Boxed {
            if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: UuidJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: UuidJsonSchema1().also { instance = it }
                }
        }
    }
}