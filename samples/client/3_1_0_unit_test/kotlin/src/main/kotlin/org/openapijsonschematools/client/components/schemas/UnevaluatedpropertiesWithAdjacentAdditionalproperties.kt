package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema
import org.openapijsonschematools.client.schemas.StringJsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class UnevaluatedpropertiesWithAdjacentAdditionalproperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    class AdditionalProperties : AnyTypeJsonSchema.AnyTypeJsonSchema1() {
        companion object {
            @Volatile
            private var instance: AdditionalProperties? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalProperties().also { instance = it }
                }
        }
    }
    
    
    class Foo : StringJsonSchema.StringJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foo? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foo().also { instance = it }
                }
        }
    }
    
    
    class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "foo"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap {
                return UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun foo(): String {
            val key = "foo"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value is String)) {
                throw RuntimeException("Invalid value stored for foo")
            }
            return value
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Any? {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            return getOrThrow(name)
        }
    }
    
    interface SetterForFoo <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): T
        
        fun foo(value: String): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
    }
    
    interface SetterForAdditionalProperties<T> {
        fun getKnownKeys(): Set<String>
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): T
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Nothing?): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = null
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Boolean): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: String): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Int): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Float): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Long): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Double): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: List<Any?>): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Map<String, Any?>): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
    }
    
    class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder: GenericBuilder<Map<String, Any?>>, SetterForFoo<UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder>, SetterForAdditionalProperties<UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "foo"
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
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMapBuilder  {
            return this
        }
    }
    
    
    class UnevaluatedProperties : NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1() {
        // NotAnyTypeSchema
        companion object {
            @Volatile
            private var instance: UnevaluatedProperties? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: UnevaluatedProperties().also { instance = it }
                }
        }
    }
    
    
    sealed interface UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed {
        fun getData(): Any?
    }
    
    data class UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap(val data: UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap) : UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class UnevaluatedpropertiesWithAdjacentAdditionalproperties1 private constructor(): JsonSchema<UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed>(
        type = setOf(Map::class.java),
        properties = mapOf(
            "foo" to Foo::class.java
        ),
        additionalProperties = AdditionalProperties::class.java,
        unevaluatedProperties = UnevaluatedProperties::class.java,
    ), MapSchemaValidator<UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap, UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: UnevaluatedpropertiesWithAdjacentAdditionalproperties1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: UnevaluatedpropertiesWithAdjacentAdditionalproperties1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap {
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
            return UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): UnevaluatedpropertiesWithAdjacentAdditionalpropertiesMap {
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap {
            return UnevaluatedpropertiesWithAdjacentAdditionalproperties1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): UnevaluatedpropertiesWithAdjacentAdditionalproperties1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
