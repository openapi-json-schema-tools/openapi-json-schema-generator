package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class MultipleTypesCanBeSpecifiedInAnArray {
    // nest classes so all schemas and input/output classes can be public
    
    
    sealed interface MultipleTypesCanBeSpecifiedInAnArray1Boxed {
        fun getData(): Any?
    }
    
    data class MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber(val data: Number) : MultipleTypesCanBeSpecifiedInAnArray1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class MultipleTypesCanBeSpecifiedInAnArray1BoxedString(val data: String) : MultipleTypesCanBeSpecifiedInAnArray1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class MultipleTypesCanBeSpecifiedInAnArray1 private constructor(): JsonSchema<MultipleTypesCanBeSpecifiedInAnArray1Boxed>(
        type = setOf(
            Int::class.java,
            Long::class.java,
            Float::class.java,
            Double::class.java,
            String::class.java
        ),
        format = "int",
    ), NumberSchemaValidator<MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber>, StringSchemaValidator<MultipleTypesCanBeSpecifiedInAnArray1BoxedString> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: MultipleTypesCanBeSpecifiedInAnArray1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: MultipleTypesCanBeSpecifiedInAnArray1().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Number, configuration: SchemaConfiguration?): Number {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Int, configuration: SchemaConfiguration?): Int {
            return validate(arg as Number, configuration) as Int
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Float, configuration: SchemaConfiguration?): Float {
            return validate(arg as Number, configuration) as Float
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Long, configuration: SchemaConfiguration?): Long {
            return validate(arg as Number, configuration) as Long
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: Double, configuration: SchemaConfiguration?): Double {
            return validate(arg as Number, configuration) as Double
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: String, configuration: SchemaConfiguration?): String {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Number) {
                return validate(arg, configuration)
            } else if (arg is String) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Number) {
                return arg
            } else if (arg is String) {
                return arg
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber {
            return MultipleTypesCanBeSpecifiedInAnArray1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): MultipleTypesCanBeSpecifiedInAnArray1BoxedString {
            return MultipleTypesCanBeSpecifiedInAnArray1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): MultipleTypesCanBeSpecifiedInAnArray1Boxed {
            if (arg is Number) {
                return validateAndBox(arg, configuration)
            } else if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }
}
