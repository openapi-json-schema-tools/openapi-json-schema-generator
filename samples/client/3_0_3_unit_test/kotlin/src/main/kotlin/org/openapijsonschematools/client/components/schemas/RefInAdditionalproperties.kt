package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class RefInAdditionalproperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    class RefInAdditionalpropertiesMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf()
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): RefInAdditionalpropertiesMap {
                return RefInAdditionalproperties1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun getAdditionalProperty(name: String): Any? {
            return getOrThrow(name)
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
    
    class RefInAdditionalpropertiesMapBuilder: GenericBuilder<Map<String, Any?>>, SetterForAdditionalProperties<RefInAdditionalpropertiesMapBuilder> {
        private val knownKeys: Set<String> = setOf()
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
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): RefInAdditionalpropertiesMapBuilder  {
            return this
        }
    }
    
    
    sealed interface RefInAdditionalproperties1Boxed {
        fun getData(): Any?
    }
    
    data class RefInAdditionalproperties1BoxedMap(val data: RefInAdditionalpropertiesMap) : RefInAdditionalproperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class RefInAdditionalproperties1 private constructor(): JsonSchema<RefInAdditionalproperties1Boxed>(
        JsonSchemaInfo()
            .type(setOf(Map::class.java))
            .additionalProperties(PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java)
    ), MapSchemaValidator<RefInAdditionalpropertiesMap, RefInAdditionalproperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: RefInAdditionalproperties1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: RefInAdditionalproperties1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): RefInAdditionalpropertiesMap {
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
                if (!(propertyInstance is Any?)) {
                    throw RuntimeException("Invalid instantiated value")
                }
                properties[entryKey] = propertyInstance
            }
            val castProperties: FrozenMap<Any?> = FrozenMap(properties)
            return RefInAdditionalpropertiesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): RefInAdditionalpropertiesMap {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): RefInAdditionalproperties1BoxedMap {
            return RefInAdditionalproperties1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): RefInAdditionalproperties1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
