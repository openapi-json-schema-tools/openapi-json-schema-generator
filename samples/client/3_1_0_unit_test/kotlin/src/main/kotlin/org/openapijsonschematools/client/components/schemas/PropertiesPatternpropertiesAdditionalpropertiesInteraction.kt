package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.AbstractMap
import java.util.UUID
import java.util.regex.Pattern
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.IntJsonSchema
import org.openapijsonschematools.client.schemas.ListJsonSchema
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class PropertiesPatternpropertiesAdditionalpropertiesInteraction {
    // nest classes so all schemas and input/output classes can be public
    
    
    class AdditionalProperties : IntJsonSchema.IntJsonSchema1() {
        companion object {
            @Volatile
            private var instance: AdditionalProperties? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: AdditionalProperties().also { instance = it }
                }
        }
    }
    
    
    sealed interface FoBoxed {
        fun getData(): Any?
    }
    
    data class FoBoxedVoid(val data: Nothing?) : FoBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class FoBoxedBoolean(val data: Boolean): FoBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class FoBoxedNumber(val data: Number) : FoBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class FoBoxedString(val data: String) : FoBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class FoBoxedList(val data: FrozenList<Any?>) : FoBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class FoBoxedMap(val data: FrozenMap<Any?>) : FoBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class Fo private constructor(): JsonSchema<FoBoxed>(
        minItems = 2,
    ), NullSchemaValidator<FoBoxedVoid>, BooleanSchemaValidator<FoBoxedBoolean>, NumberSchemaValidator<FoBoxedNumber>, StringSchemaValidator<FoBoxedString>, ListSchemaValidator<FrozenList<Any?>, FoBoxedList>, MapSchemaValidator<FrozenMap<Any?>, FoBoxedMap> {
    
        companion object {
            @Volatile
            private var instance: Fo? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Fo().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Nothing?, configuration: SchemaConfiguration?): Nothing? {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
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
            val usedConfiguration = configuration ?: SchemaConfiguration()
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
            val usedConfiguration = configuration ?: SchemaConfiguration()
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
            val usedConfiguration = configuration ?: SchemaConfiguration()
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
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): FrozenMap<Any?> {
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
            return castProperties
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): FrozenMap<Any?> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): FoBoxedVoid {
            return FoBoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): FoBoxedBoolean {
            return FoBoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): FoBoxedNumber {
            return FoBoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): FoBoxedString {
            return FoBoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): FoBoxedList {
            return FoBoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): FoBoxedMap {
            return FoBoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): FoBoxed {
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
    
    sealed interface FooBoxed {
        fun getData(): Any?
    }
    
    data class FooBoxedList(val data: FrozenList<Any?>) : FooBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Foo private constructor(): JsonSchema<FooBoxed>(
        type = setOf(List::class.java),
        maxItems = 3,
    ), ListSchemaValidator<FrozenList<Any?>, FooBoxedList> {
    
        companion object {
            @Volatile
            private var instance: Foo? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foo().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): FrozenList<Any?> {
            val items: MutableList<Any?> = ArrayList()
            var i: Int = 0
            for (item: Any? in arg) {
                val itemPathToItem: List<Any> = pathToItem + i
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
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): FooBoxedList {
            return FooBoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): FooBoxed {
            if (arg is List<*>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    
    class Bar : ListJsonSchema.ListJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Bar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Bar().also { instance = it }
                }
        }
    }
    
    
    class PropertiesPatternpropertiesAdditionalpropertiesInteractionMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "foo",
                "bar"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): PropertiesPatternpropertiesAdditionalpropertiesInteractionMap {
                return PropertiesPatternpropertiesAdditionalpropertiesInteraction1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun foo(): FrozenList<*> {
            val key = "foo"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value is FrozenList<*>)) {
                throw RuntimeException("Invalid value stored for foo")
            }
            return value
        }
        
        @Throws(UnsetPropertyException::class)
        fun bar(): FrozenList<*> {
            val key = "bar"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value is FrozenList<*>)) {
                throw RuntimeException("Invalid value stored for bar")
            }
            return value
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Number {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            val value = getOrThrow(name)
            if (!(value is Number)) {
                throw RuntimeException("Invalid value stored for " + name)
            }
            return value
        }
    }
    
    interface SetterForFoo <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): T
        
        fun foo(value: List<Any?>): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
    }
    
    interface SetterForBar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterBar(instance: MutableMap<String, Any?>): T
        
        fun bar(value: List<Any?>): T {
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
    }
    
    class PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder: GenericBuilder<Map<String, Any?>>, SetterForFoo<PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder>, SetterForBar<PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder>, SetterForAdditionalProperties<PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder> {
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
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder {
            return this
        }
        override fun getBuilderAfterBar(instance: MutableMap<String, Any?>): PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder  {
            return this
        }
    }
    
    
    sealed interface PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed {
        fun getData(): Any?
    }
    
    data class PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap(val data: PropertiesPatternpropertiesAdditionalpropertiesInteractionMap) : PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class PropertiesPatternpropertiesAdditionalpropertiesInteraction1 private constructor(): JsonSchema<PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed>(
        type = setOf(Map::class.java),
        properties = mapOf(
            "foo" to Foo::class.java,
            "bar" to Bar::class.java
        ),
        additionalProperties = AdditionalProperties::class.java,
        patternProperties = mapOf(
            Pattern.compile("f.o") to Fo::class.java
        ),
    ), MapSchemaValidator<PropertiesPatternpropertiesAdditionalpropertiesInteractionMap, PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: PropertiesPatternpropertiesAdditionalpropertiesInteraction1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: PropertiesPatternpropertiesAdditionalpropertiesInteraction1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): PropertiesPatternpropertiesAdditionalpropertiesInteractionMap {
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
            return PropertiesPatternpropertiesAdditionalpropertiesInteractionMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesPatternpropertiesAdditionalpropertiesInteractionMap {
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap {
            return PropertiesPatternpropertiesAdditionalpropertiesInteraction1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): PropertiesPatternpropertiesAdditionalpropertiesInteraction1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
