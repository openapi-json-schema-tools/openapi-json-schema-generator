package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID

open class StringJsonSchema {
    interface StringJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class StringJsonSchema1BoxedString(val data: String) : StringJsonSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }

    open class StringJsonSchema1 protected constructor() : JsonSchema<StringJsonSchema1Boxed?>(
        type = setOf(String::class.java)
    ), StringSchemaValidator<StringJsonSchema1BoxedString?> {
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
        fun validate(arg: LocalDate, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }

        @Throws(ValidationException::class)
        fun validate(arg: ZonedDateTime, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }

        @Throws(ValidationException::class)
        fun validate(arg: UUID, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is String) {
                return arg
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): String {
            when (arg) {
                is UUID -> {
                    return validate(arg, configuration)
                }

                is LocalDate -> {
                    return validate(arg, configuration)
                }

                is ZonedDateTime -> {
                    return validate(arg, configuration)
                }

                is String -> {
                    return validate(arg, configuration)
                }

                else -> throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
            }
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): StringJsonSchema1BoxedString {
            return StringJsonSchema1BoxedString(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): StringJsonSchema1Boxed {
            if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: StringJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: StringJsonSchema1().also { instance = it }
                }
        }
    }
}