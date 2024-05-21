package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

open class NumberJsonSchema {
    sealed interface NumberJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class NumberJsonSchema1BoxedNumber(val data: Number) : NumberJsonSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }

    open class NumberJsonSchema1 protected constructor() : JsonSchema<NumberJsonSchema1Boxed>(
        JsonSchemaInfo(
            type = setOf(
                Int::class.java,
                Long::class.java,
                Float::class.java,
                Double::class.java
            )
        )
    ), NumberSchemaValidator<NumberJsonSchema1BoxedNumber> {
        @Throws(ValidationException::class)
        override fun validate(arg: Number, configuration: SchemaConfiguration?): Number {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Number = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }

        @Throws(ValidationException::class)
        fun validate(arg: Int, configuration: SchemaConfiguration?): Int {
            return validate(arg as Number, configuration) as Int
        }

        @Throws(ValidationException::class)
        fun validate(arg: Long, configuration: SchemaConfiguration?): Long {
            return validate(arg as Number, configuration) as Long
        }

        @Throws(ValidationException::class)
        fun validate(arg: Float, configuration: SchemaConfiguration?): Float {
            return validate(arg as Number, configuration) as Float
        }

        @Throws(ValidationException::class)
        fun validate(arg: Double, configuration: SchemaConfiguration?): Double {
            return validate(arg as Number, configuration) as Double
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Number) {
                return arg
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Number {
            if (arg is Number) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): NumberJsonSchema1BoxedNumber {
            return NumberJsonSchema1BoxedNumber(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): NumberJsonSchema1Boxed {
            if (arg is Number) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: NumberJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: NumberJsonSchema1().also { instance = it }
                }
        }
    }
}