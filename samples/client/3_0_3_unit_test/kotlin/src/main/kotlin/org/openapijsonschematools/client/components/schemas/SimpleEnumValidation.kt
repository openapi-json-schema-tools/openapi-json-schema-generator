package org.openapijsonschematools.client.components.schemas
import java.math.BigDecimal
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.DoubleEnumValidator
import org.openapijsonschematools.client.schemas.validation.DoubleValueMethod
import org.openapijsonschematools.client.schemas.validation.FloatEnumValidator
import org.openapijsonschematools.client.schemas.validation.FloatValueMethod
import org.openapijsonschematools.client.schemas.validation.IntegerEnumValidator
import org.openapijsonschematools.client.schemas.validation.IntegerValueMethod
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.LongEnumValidator
import org.openapijsonschematools.client.schemas.validation.LongValueMethod
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class SimpleEnumValidation {
    // nest classes so all schemas and input/output classes can be public
    
    enum class IntegerSimpleEnumValidationEnums(private val value: Int): IntegerValueMethod {
        POSITIVE_1(1),
        POSITIVE_2(2),
        POSITIVE_3(3);
    
        override fun value(): Int {
            return this.value
        }
    }
    
    enum class LongSimpleEnumValidationEnums(private val value: Long): LongValueMethod {
        POSITIVE_1(1L),
        POSITIVE_2(2L),
        POSITIVE_3(3L);
    
        override fun value(): Long {
            return this.value
        }
    }
    
    enum class FloatSimpleEnumValidationEnums(private val value: Float): FloatValueMethod {
        POSITIVE_1(1.0f),
        POSITIVE_2(2.0f),
        POSITIVE_3(3.0f);
    
        override fun value(): Float {
            return this.value
        }
    }
    
    enum class DoubleSimpleEnumValidationEnums(private val value: Double): DoubleValueMethod {
        POSITIVE_1(1.0),
        POSITIVE_2(2.0),
        POSITIVE_3(3.0);
    
        override fun value(): Double {
            return this.value
        }
    }
    
    
    sealed interface SimpleEnumValidation1Boxed {
        fun getData(): Any?
    }
    
    data class SimpleEnumValidation1BoxedNumber(val data: Number) : SimpleEnumValidation1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class SimpleEnumValidation1 private constructor(): JsonSchema<SimpleEnumValidation1Boxed>(
        type = setOf(
            Int::class.java,
            Long::class.java,
            Float::class.java,
            Double::class.java
        ),
        enumValues = setOf(
            BigDecimal("1"),
            BigDecimal("2"),
            BigDecimal("3")
        ),
    ), IntegerEnumValidator<IntegerSimpleEnumValidationEnums>, LongEnumValidator<LongSimpleEnumValidationEnums>, FloatEnumValidator<FloatSimpleEnumValidationEnums>, DoubleEnumValidator<DoubleSimpleEnumValidationEnums>, NumberSchemaValidator<SimpleEnumValidation1BoxedNumber> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: SimpleEnumValidation1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: SimpleEnumValidation1().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Number, configuration: SchemaConfiguration?): Number {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
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
        
        @Throws(ValidationException::class)
        override fun validate(arg: IntegerSimpleEnumValidationEnums, configuration: SchemaConfiguration?): Int {
            return validate(arg.value() as Number, configuration) as Int
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: LongSimpleEnumValidationEnums, configuration: SchemaConfiguration?): Long {
            return validate(arg.value() as Number, configuration) as Long
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: FloatSimpleEnumValidationEnums, configuration: SchemaConfiguration?): Float {
            return validate(arg.value() as Number, configuration) as Float
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: DoubleSimpleEnumValidationEnums, configuration: SchemaConfiguration?): Double {
            return validate(arg.value() as Number, configuration) as Double
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Number) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Number) {
                return arg
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): SimpleEnumValidation1BoxedNumber {
            return SimpleEnumValidation1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): SimpleEnumValidation1Boxed {
            if (arg is Number) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }
}
