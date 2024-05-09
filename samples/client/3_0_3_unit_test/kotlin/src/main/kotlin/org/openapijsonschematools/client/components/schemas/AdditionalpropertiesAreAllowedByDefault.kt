package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.AnyTypeJsonSchema
import org.openapijsonschematools.client.schemas.GenericBuilder
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

class AdditionalpropertiesAreAllowedByDefault {
    // nest classes so all schemas and input/output classes can be public
    
    
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
    
    
    class AdditionalpropertiesAreAllowedByDefaultMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "foo",
                "bar"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): AdditionalpropertiesAreAllowedByDefaultMap {
                return AdditionalpropertiesAreAllowedByDefault1.getInstance().validate(arg, configuration)
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
    
    class AdditionalpropertiesAreAllowedByDefaultMapBuilder: UnsetAddPropsSetter<AdditionalpropertiesAreAllowedByDefaultMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForFoo<AdditionalpropertiesAreAllowedByDefaultMapBuilder>, SetterForBar<AdditionalpropertiesAreAllowedByDefaultMapBuilder> {
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
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): AdditionalpropertiesAreAllowedByDefaultMapBuilder {
            return this
        }
        override fun getBuilderAfterBar(instance: MutableMap<String, Any?>): AdditionalpropertiesAreAllowedByDefaultMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): AdditionalpropertiesAreAllowedByDefaultMapBuilder  {
            return this
        }
    }
    
    
    sealed interface AdditionalpropertiesAreAllowedByDefault1Boxed {
        fun getData(): Any?
    }
    
    data class AdditionalpropertiesAreAllowedByDefault1BoxedVoid(val data: Nothing?) : AdditionalpropertiesAreAllowedByDefault1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class AdditionalpropertiesAreAllowedByDefault1BoxedBoolean(val data: Boolean): AdditionalpropertiesAreAllowedByDefault1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class AdditionalpropertiesAreAllowedByDefault1BoxedNumber(val data: Number) : AdditionalpropertiesAreAllowedByDefault1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class AdditionalpropertiesAreAllowedByDefault1BoxedString(val data: String) : AdditionalpropertiesAreAllowedByDefault1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class AdditionalpropertiesAreAllowedByDefault1BoxedList(val data: FrozenList<Any?>) : AdditionalpropertiesAreAllowedByDefault1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class AdditionalpropertiesAreAllowedByDefault1BoxedMap(val data: AdditionalpropertiesAreAllowedByDefaultMap) : AdditionalpropertiesAreAllowedByDefault1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class AdditionalpropertiesAreAllowedByDefault1 private constructor(): JsonSchema<AdditionalpropertiesAreAllowedByDefault1Boxed>(
        JsonSchemaInfo()
            .properties(mapOf(
                "foo" to Foo::class.java,
                "bar" to Bar::class.java
            ))
    ), NullSchemaValidator<AdditionalpropertiesAreAllowedByDefault1BoxedVoid>, BooleanSchemaValidator<AdditionalpropertiesAreAllowedByDefault1BoxedBoolean>, NumberSchemaValidator<AdditionalpropertiesAreAllowedByDefault1BoxedNumber>, StringSchemaValidator<AdditionalpropertiesAreAllowedByDefault1BoxedString>, ListSchemaValidator<FrozenList<Any?>, AdditionalpropertiesAreAllowedByDefault1BoxedList>, MapSchemaValidator<AdditionalpropertiesAreAllowedByDefaultMap, AdditionalpropertiesAreAllowedByDefault1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: AdditionalpropertiesAreAllowedByDefault1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalpropertiesAreAllowedByDefault1().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): AdditionalpropertiesAreAllowedByDefaultMap {
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
            return AdditionalpropertiesAreAllowedByDefaultMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefaultMap {
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
                return getNewInstance( null, pathToItem, pathToSchemas)
            } else if (arg is Boolean) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            } else if (arg is Number) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            } else if (arg is String) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            } else if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            } else if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1BoxedVoid {
            return AdditionalpropertiesAreAllowedByDefault1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1BoxedBoolean {
            return AdditionalpropertiesAreAllowedByDefault1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1BoxedNumber {
            return AdditionalpropertiesAreAllowedByDefault1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1BoxedString {
            return AdditionalpropertiesAreAllowedByDefault1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1BoxedList {
            return AdditionalpropertiesAreAllowedByDefault1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1BoxedMap {
            return AdditionalpropertiesAreAllowedByDefault1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): AdditionalpropertiesAreAllowedByDefault1Boxed {
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
