package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema
import org.openapijsonschematools.client.schemas.BooleanJsonSchema
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class AdditionalpropertiesWithSchema {
    // nest classes so all schemas and input/output classes can be public
    
    
    class AdditionalProperties : BooleanJsonSchema.BooleanJsonSchema1() {
        companion object {
            @Volatile
            private var instance: AdditionalProperties? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalProperties().also { instance = it }
                }
        }
    }
    
    
    class Foo : AnyTypeJsonSchema.AnyTypeJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foo? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foo().also { instance = it }
                }
        }
    }
    
    
    class Bar : AnyTypeJsonSchema.AnyTypeJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Bar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Bar().also { instance = it }
                }
        }
    }
    
    
    class AdditionalpropertiesWithSchemaMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "foo",
                "bar"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): AdditionalpropertiesWithSchemaMap {
                return AdditionalpropertiesWithSchema1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun foo(): Any? {
            return getOrThrow("foo")
        }
        
        @Throws(UnsetPropertyException::class)
        fun bar(): Any? {
            return getOrThrow("bar")
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Boolean {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            val value = getOrThrow(name)
            if (!(value is Boolean)) {
                throw RuntimeException("Invalid value stored for " + name)
            }
            return value
        }
    }
    
    interface SetterForFoo <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): T
        
        fun foo(value: Nothing?): T {
            val instance = getInstance()
            instance["foo"] = null
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: Boolean): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: String): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: Int): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: Float): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: Long): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: Double): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
        
        fun foo(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
    }
    
    interface SetterForBar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterBar(instance: MutableMap<String, Any?>): T
        
        fun bar(value: Nothing?): T {
            val instance = getInstance()
            instance["bar"] = null
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: Boolean): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: String): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: Int): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: Float): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: Long): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: Double): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: List<Any?>): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
    }
    
    interface SetterForAdditionalProperties<T> {
        fun getKnownKeys(): Set<String>
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): T
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Boolean): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
    }
    
    class AdditionalpropertiesWithSchemaMapBuilder: GenericBuilder<Map<String, Any?>>, SetterForFoo<AdditionalpropertiesWithSchemaMapBuilder>, SetterForBar<AdditionalpropertiesWithSchemaMapBuilder>, SetterForAdditionalProperties<AdditionalpropertiesWithSchemaMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "foo",
            "bar"
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
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): AdditionalpropertiesWithSchemaMapBuilder {
            return this
        }
        override fun getBuilderAfterBar(instance: MutableMap<String, Any?>): AdditionalpropertiesWithSchemaMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): AdditionalpropertiesWithSchemaMapBuilder  {
            return this
        }
    }
    
    
    sealed interface AdditionalpropertiesWithSchema1Boxed {
        fun getData(): Any?
    }
    
    data class AdditionalpropertiesWithSchema1BoxedMap(val data: AdditionalpropertiesWithSchemaMap) : AdditionalpropertiesWithSchema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class AdditionalpropertiesWithSchema1 private constructor(): JsonSchema<AdditionalpropertiesWithSchema1Boxed>(
        type = setOf(Map::class.java),
        properties = mapOf(
            "foo" to Foo::class.java,
            "bar" to Bar::class.java
        ),
        additionalProperties = AdditionalProperties::class.java,
    ), MapSchemaValidator<AdditionalpropertiesWithSchemaMap, AdditionalpropertiesWithSchema1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: AdditionalpropertiesWithSchema1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalpropertiesWithSchema1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): AdditionalpropertiesWithSchemaMap {
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
            return AdditionalpropertiesWithSchemaMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): AdditionalpropertiesWithSchemaMap {
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): AdditionalpropertiesWithSchema1BoxedMap {
            return AdditionalpropertiesWithSchema1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): AdditionalpropertiesWithSchema1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
