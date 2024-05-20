package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

open class BooleanJsonSchema {
    sealed interface BooleanJsonSchema1Boxed {
        fun getData(): Any?
    }

    data class BooleanJsonSchema1BoxedBoolean(val data: Boolean) : BooleanJsonSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }

    open class BooleanJsonSchema1 protected constructor() : JsonSchema<BooleanJsonSchema1Boxed>(
        JsonSchemaInfo()
            .type(setOf(Boolean::class.java))
    ), BooleanSchemaValidator<BooleanJsonSchema1BoxedBoolean> {
        @Throws(ValidationException::class)
        override fun validate(arg: Boolean, configuration: SchemaConfiguration?): Boolean {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Boolean = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Boolean {
            if (arg is Boolean) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Boolean {
            if (arg is Boolean) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): BooleanJsonSchema1BoxedBoolean {
            return BooleanJsonSchema1BoxedBoolean(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): BooleanJsonSchema1Boxed {
            if (arg is Boolean) {
                val castArg: Boolean = arg
                return validateAndBox(castArg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: BooleanJsonSchema1? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: BooleanJsonSchema1().also { instance = it }
                }
        }
    }
}