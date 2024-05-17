package org.openapijsonschematools.client.components.schemas
import java.util.AbstractMap
import java.util.regex.Pattern
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class NonAsciiPatternWithAdditionalproperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    class AdditionalProperties : NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1() {
        // NotAnyTypeSchema
        companion object {
            @Volatile
            private var instance: AdditionalProperties? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalProperties().also { instance = it }
                }
        }
    }
    
    
    class CircumflexAccentLatinSmallLetterAWithAcute : AnyTypeJsonSchema.AnyTypeJsonSchema1() {
        companion object {
            @Volatile
            private var instance: CircumflexAccentLatinSmallLetterAWithAcute? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: CircumflexAccentLatinSmallLetterAWithAcute().also { instance = it }
                }
        }
    }
    
    
    class NonAsciiPatternWithAdditionalpropertiesMap(m: FrozenMap<Any?>): FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf()
            // map with no key value pairs
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): NonAsciiPatternWithAdditionalpropertiesMap {
                return NonAsciiPatternWithAdditionalproperties1.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class NonAsciiPatternWithAdditionalpropertiesMapBuilder: GenericBuilder<Map<String, Any?>> {
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
    }
    
    
    sealed interface NonAsciiPatternWithAdditionalproperties1Boxed {
        fun getData(): Any?
    }
    
    data class NonAsciiPatternWithAdditionalproperties1BoxedMap(val data: NonAsciiPatternWithAdditionalpropertiesMap) : NonAsciiPatternWithAdditionalproperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class NonAsciiPatternWithAdditionalproperties1 private constructor(): JsonSchema<NonAsciiPatternWithAdditionalproperties1Boxed>(
        JsonSchemaInfo()
            .type(setOf(Map::class.java))
            .additionalProperties(AdditionalProperties::class.java)
            .patternProperties(mapOf(
                Pattern.compile("^á") to CircumflexAccentLatinSmallLetterAWithAcute::class.java
            ))
    ), MapSchemaValidator<NonAsciiPatternWithAdditionalpropertiesMap, NonAsciiPatternWithAdditionalproperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: NonAsciiPatternWithAdditionalproperties1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: NonAsciiPatternWithAdditionalproperties1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): NonAsciiPatternWithAdditionalpropertiesMap {
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
            return NonAsciiPatternWithAdditionalpropertiesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): NonAsciiPatternWithAdditionalpropertiesMap {
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): NonAsciiPatternWithAdditionalproperties1BoxedMap {
            return NonAsciiPatternWithAdditionalproperties1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): NonAsciiPatternWithAdditionalproperties1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
