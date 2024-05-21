package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.NullJsonSchema
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class PropertiesWithNullValuedInstanceProperties {
    // nest classes so all schemas and input/output classes can be public
    
    
    class Foo : NullJsonSchema.NullJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foo? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foo().also { instance = it }
                }
        }
    }
    
    
    class PropertiesWithNullValuedInstancePropertiesMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "foo"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): PropertiesWithNullValuedInstancePropertiesMap {
                return PropertiesWithNullValuedInstanceProperties1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun foo(): Nothing? {
            val key = "foo"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value == null || value is Nothing?)) {
                throw RuntimeException("Invalid value stored for foo")
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
    
    interface SetterForFoo <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): T
        
        fun foo(value: Nothing?): T {
            val instance = getInstance()
            instance["foo"] = null
            return getBuilderAfterFoo(instance)
        }
    }
    
    class PropertiesWithNullValuedInstancePropertiesMapBuilder: UnsetAddPropsSetter<PropertiesWithNullValuedInstancePropertiesMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForFoo<PropertiesWithNullValuedInstancePropertiesMapBuilder> {
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
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): PropertiesWithNullValuedInstancePropertiesMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): PropertiesWithNullValuedInstancePropertiesMapBuilder  {
            return this
        }
    }
    
    
    sealed interface PropertiesWithNullValuedInstanceProperties1Boxed {
        fun getData(): Any?
    }
    
    data class PropertiesWithNullValuedInstanceProperties1BoxedVoid(val data: Nothing?) : PropertiesWithNullValuedInstanceProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithNullValuedInstanceProperties1BoxedBoolean(val data: Boolean): PropertiesWithNullValuedInstanceProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithNullValuedInstanceProperties1BoxedNumber(val data: Number) : PropertiesWithNullValuedInstanceProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithNullValuedInstanceProperties1BoxedString(val data: String) : PropertiesWithNullValuedInstanceProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithNullValuedInstanceProperties1BoxedList(val data: FrozenList<Any?>) : PropertiesWithNullValuedInstanceProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithNullValuedInstanceProperties1BoxedMap(val data: PropertiesWithNullValuedInstancePropertiesMap) : PropertiesWithNullValuedInstanceProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class PropertiesWithNullValuedInstanceProperties1 private constructor(): JsonSchema<PropertiesWithNullValuedInstanceProperties1Boxed>(
        JsonSchemaInfo(
            properties = mapOf(
                "foo" to Foo::class.java
            ),
        )
    ), NullSchemaValidator<PropertiesWithNullValuedInstanceProperties1BoxedVoid>, BooleanSchemaValidator<PropertiesWithNullValuedInstanceProperties1BoxedBoolean>, NumberSchemaValidator<PropertiesWithNullValuedInstanceProperties1BoxedNumber>, StringSchemaValidator<PropertiesWithNullValuedInstanceProperties1BoxedString>, ListSchemaValidator<FrozenList<Any?>, PropertiesWithNullValuedInstanceProperties1BoxedList>, MapSchemaValidator<PropertiesWithNullValuedInstancePropertiesMap, PropertiesWithNullValuedInstanceProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: PropertiesWithNullValuedInstanceProperties1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: PropertiesWithNullValuedInstanceProperties1().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Nothing?, configuration: SchemaConfiguration?): Nothing? {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Boolean, configuration: SchemaConfiguration?): Boolean {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Number, configuration: SchemaConfiguration?): Number {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
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
        override fun validate(arg: String, configuration: SchemaConfiguration?): String {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: LocalDate, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: ZonedDateTime, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }
        
        @Throws(ValidationException::class)
        fun validate(arg: UUID, configuration: SchemaConfiguration?): String {
            return validate(arg.toString(), configuration)
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): FrozenList<Any?> {
            val items: MutableList<Any?> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem = pathToItem + i
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(itemPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val itemSchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val itemInstance: Any? = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas)
                items.add(itemInstance)
                i += 1
            }
            val newInstanceItems: FrozenList<Any?> = FrozenList(items)
            return newInstanceItems
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): FrozenList<Any?> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): PropertiesWithNullValuedInstancePropertiesMap {
            val properties: LinkedHashMap<String, Any?> = LinkedHashMap()
            for((propertyName, value) in arg) {
                if (!(propertyName is String)) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: List<Any> = pathToItem + propertyName
                val schemas: LinkedHashMap<JsonSchema<*>, Nothing?>? = pathToSchemas.get(propertyPathToItem)
                if (schemas == null) {
                    throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                }
                val propertySchema: JsonSchema<*> = schemas.entries.iterator().next().key
                val propertyInstance: Any? = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas)
                properties[propertyName] = propertyInstance
            }
            val castProperties: FrozenMap<Any?> = FrozenMap(properties)
            return PropertiesWithNullValuedInstancePropertiesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstancePropertiesMap {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validatedPathToSchemas = PathToSchemasMap()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, validatedPathToSchemas, LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg == null) {
                return validate(null, configuration)
            } else if (arg is Boolean) {
                return validate(arg, configuration)
            } else if (arg is Number) {
                return validate(arg, configuration)
            } else if (arg is String) {
                return validate(arg, configuration)
            } else if (arg is List<*>) {
                return validate(arg, configuration)
            } else if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg == null) {
                return arg
            } else if (arg is Boolean) {
                return arg
            } else if (arg is Number) {
                return arg
            } else if (arg is String) {
                return arg
            } else if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            } else if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1BoxedVoid {
            return PropertiesWithNullValuedInstanceProperties1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1BoxedBoolean {
            return PropertiesWithNullValuedInstanceProperties1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1BoxedNumber {
            return PropertiesWithNullValuedInstanceProperties1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1BoxedString {
            return PropertiesWithNullValuedInstanceProperties1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1BoxedList {
            return PropertiesWithNullValuedInstanceProperties1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1BoxedMap {
            return PropertiesWithNullValuedInstanceProperties1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): PropertiesWithNullValuedInstanceProperties1Boxed {
            if (arg == null) {
                return validateAndBox(null, configuration)
            } else if (arg is Boolean) {
                return validateAndBox(arg, configuration)
            } else if (arg is String) {
                return validateAndBox(arg, configuration)
            } else if (arg is Number) {
                return validateAndBox(arg, configuration)
            } else if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            } else if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }
}
