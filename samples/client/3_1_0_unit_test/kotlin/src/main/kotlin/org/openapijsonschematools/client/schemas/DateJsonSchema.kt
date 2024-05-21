package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import java.time.LocalDate

open class DateJsonSchema {
    sealed interface DateJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class DateJsonSchema1BoxedString(val data: String) : DateJsonSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }

    open class DateJsonSchema1 protected constructor() : JsonSchema<DateJsonSchema1Boxed>(
        JsonSchemaInfo(
            type = setOf(String::class.java),
            format = "date"
        )
    ), StringSchemaValidator<DateJsonSchema1BoxedString> {
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
            } else if (arg is LocalDate) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): DateJsonSchema1BoxedString {
            return DateJsonSchema1BoxedString(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): DateJsonSchema1Boxed {
            if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: DateJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: DateJsonSchema1().also { instance = it }
                }
        }
    }
}