package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.BooleanJsonSchema
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class AdditionalpropertiesCanExistByItself {
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
    
    
    class AdditionalpropertiesCanExistByItselfMap(m: FrozenMap<Boolean>) : FrozenMap<Boolean>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf()
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Boolean>, configuration: SchemaConfiguration): AdditionalpropertiesCanExistByItselfMap {
                return AdditionalpropertiesCanExistByItself1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun getAdditionalProperty(name: String): Boolean {
            throwIfKeyNotPresent(name)
            val value: Boolean? = get(name)
            if (value == null) {
                throw RuntimeException("Value may not be null")
            }
            return value
        }
    }
    
    interface SetterForAdditionalProperties<T> {
        fun getKnownKeys(): Set<String>
        fun getInstance(): MutableMap<String, Boolean>
        fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Boolean>): T
        
        @Throws(InvalidAdditionalPropertyException::class)
        fun additionalProperty(key: String, value: Boolean): T {
            MapUtils.throwIfKeyKnown(key, getKnownKeys(), true)
            val instance = getInstance()
            instance[key] = value
            return getBuilderAfterAdditionalProperty(instance)
        }
    }
    
    class AdditionalpropertiesCanExistByItselfMapBuilder: GenericBuilder<Map<String, Boolean>>, SetterForAdditionalProperties<AdditionalpropertiesCanExistByItselfMapBuilder> {
        private val knownKeys: Set<String> = setOf()
        override fun getKnownKeys(): Set<String> {
            return knownKeys
        }
        private val instance: MutableMap<String, Boolean>
        init {
            this.instance = LinkedHashMap()
        }
        override fun build(): Map<String, Boolean> {
            return instance
        }
        override fun getInstance(): MutableMap<String, Boolean> {
            return instance
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Boolean>): AdditionalpropertiesCanExistByItselfMapBuilder  {
            return this
        }
    }
    
    
    sealed interface AdditionalpropertiesCanExistByItself1Boxed {
        fun getData(): Any?
    }
    
    data class AdditionalpropertiesCanExistByItself1BoxedMap(val data: AdditionalpropertiesCanExistByItselfMap) : AdditionalpropertiesCanExistByItself1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class AdditionalpropertiesCanExistByItself1 private constructor(): JsonSchema<AdditionalpropertiesCanExistByItself1Boxed>(
        type = setOf(Map::class.java),
        additionalProperties = AdditionalProperties::class.java,
    ), MapSchemaValidator<AdditionalpropertiesCanExistByItselfMap, AdditionalpropertiesCanExistByItself1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: AdditionalpropertiesCanExistByItself1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalpropertiesCanExistByItself1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): AdditionalpropertiesCanExistByItselfMap {
            val properties: LinkedHashMap<String, Boolean> = LinkedHashMap()
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
                if (!(propertyInstance is Boolean)) {
                    throw RuntimeException("Invalid instantiated value")
                }
                properties[entryKey] = propertyInstance
            }
            val castProperties: FrozenMap<Boolean> = FrozenMap(properties)
            return AdditionalpropertiesCanExistByItselfMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): AdditionalpropertiesCanExistByItselfMap {
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): AdditionalpropertiesCanExistByItself1BoxedMap {
            return AdditionalpropertiesCanExistByItself1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): AdditionalpropertiesCanExistByItself1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
