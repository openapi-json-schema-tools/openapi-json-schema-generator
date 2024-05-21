package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter
import org.openapijsonschematools.client.schemas.validation.DefaultValueMethod
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonValue
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing {
    // nest classes so all schemas and input/output classes can be public
    
    
    sealed interface AlphaBoxed {
        fun getData(): Any?
    }
    
    data class AlphaBoxedNumber(val data: Number) : AlphaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Alpha private constructor(): JsonSchema<AlphaBoxed>(
        type = setOf(
            Int::class.java,
            Long::class.java,
            Float::class.java,
            Double::class.java
        ),
        maximum = 3,
        defaultValue = JsonValue.of(5.0),
    ), NumberSchemaValidator<AlphaBoxedNumber> {
    
        companion object {
            @Volatile
            private var instance: Alpha? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Alpha().also { instance = it }
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
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): AlphaBoxedNumber {
            return AlphaBoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): AlphaBoxed {
            if (arg is Number) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    
    class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "alpha"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap {
                return TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun alpha(): Number {
            val key = "alpha"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value is Number)) {
                throw RuntimeException("Invalid value stored for alpha")
            }
            return value
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Any? {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            throwIfKeyNotPresent(name)
            return get(name)
        }
    }
    
    interface SetterForAlpha <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterAlpha(instance: MutableMap<String, Any?>): T
        
        fun alpha(value: Int): T {
            val instance = getInstance()
            instance["alpha"] = value
            return getBuilderAfterAlpha(instance)
        }
        
        fun alpha(value: Float): T {
            val instance = getInstance()
            instance["alpha"] = value
            return getBuilderAfterAlpha(instance)
        }
        
        fun alpha(value: Long): T {
            val instance = getInstance()
            instance["alpha"] = value
            return getBuilderAfterAlpha(instance)
        }
        
        fun alpha(value: Double): T {
            val instance = getInstance()
            instance["alpha"] = value
            return getBuilderAfterAlpha(instance)
        }
    }
    
    class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder: UnsetAddPropsSetter<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForAlpha<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "alpha"
        )
        override fun getKnownKeys(): Set<String> {
            return knownKeys
        }
        private val instance: MutableMap<String, Any?>
        init {
            this.instance = LinkedHashMap()
        }
        override fun build(): Map<String, Any?> {
            return instance
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterAlpha(instance: MutableMap<String, Any?>): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMapBuilder  {
            return this
        }
    }
    
    
    sealed interface TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed {
        fun getData(): Any?
    }
    
    data class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap(val data: TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap) : TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1 private constructor(): JsonSchema<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed>(
        type = setOf(Map::class.java),
        properties = mapOf(
            "alpha" to Alpha::class.java
        ),
    ), MapSchemaValidator<TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap, TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap {
            val properties: LinkedHashMap<String, Any?> = LinkedHashMap()
            for((entryKey, value) in arg) {
                if (!(entryKey is String)) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: List<Any> = pathToItem + entryKey
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(propertyPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val propertySchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val propertyInstance: Any? = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas)
                properties[entryKey] = propertyInstance
            }
            val castProperties: FrozenMap<Any?> = FrozenMap(properties)
            return TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingMap {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap {
            return TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
