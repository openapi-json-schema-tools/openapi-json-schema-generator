package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import java.time.ZonedDateTime

open class DateTimeJsonSchema {
    sealed interface DateTimeJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class DateTimeJsonSchema1BoxedString(val data: String) : DateTimeJsonSchema1Boxed {
        override fun getData(): Any?  {
            return data
        }
    }

    open class DateTimeJsonSchema1 protected constructor() : JsonSchema<DateTimeJsonSchema1Boxed>(
        JsonSchemaInfo()
            .type(setOf(String::class.java))
            .format("date-time")
    ), StringSchemaValidator<DateTimeJsonSchema1BoxedString> {
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
        fun validate(arg: ZonedDateTime, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is String) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): String {
            if (arg is String) {
                return validate(arg, configuration)
            } else if (arg is ZonedDateTime) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): DateTimeJsonSchema1BoxedString {
            return DateTimeJsonSchema1BoxedString(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): DateTimeJsonSchema1Boxed {
            if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: DateTimeJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: DateTimeJsonSchema1().also { instance = it }
                }
        }
    }
}