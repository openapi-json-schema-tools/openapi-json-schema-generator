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
import org.openapijsonschematools.client.schemas.IntJsonSchema
import org.openapijsonschematools.client.schemas.StringJsonSchema
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

class OneofComplexTypes {
    // nest classes so all schemas and input/output classes can be public
    
    
    class Bar : IntJsonSchema.IntJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Bar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Bar().also { instance = it }
                }
        }
    }
    
    
    class Schema0Map(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf(
                "bar"
            )
            val optionalKeys: Set<String> = setOf()
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): Schema0Map {
                return Schema0.getInstance().validate(arg, configuration)
            }
        }
        
        fun bar(): Number {
            val value: Any? = get("bar")
            if (!(value is Number)) {
                throw RuntimeException("Invalid value stored for bar")
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
    
    interface SetterForBar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterBar(instance: MutableMap<String, Any?>): T
        
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
    }
    
    class Schema0Map0Builder(private val instance: MutableMap<String, Any?>): UnsetAddPropsSetter<Schema0Map0Builder>, GenericBuilder<Map<String, Any?>> {
        private val knownKeys: Set<String> = setOf(
            "bar"
        )
        override fun getKnownKeys(): Set<String> {
            return knownKeys
        }
        override fun build(): Map<String, Any?> {
            return instance
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): Schema0Map0Builder  {
            return this
        }
    }
    
    class Schema0MapBuilder: SetterForBar<Schema0Map0Builder> {
        private val instance: MutableMap<String, Any?>
        init {
            this.instance = LinkedHashMap()
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterBar(instance: MutableMap<String, Any?>): Schema0Map0Builder {
            return Schema0Map0Builder(instance)
        }
    }
    
    
    sealed interface Schema0Boxed {
        fun getData(): Any?
    }
    
    data class Schema0BoxedVoid(val data: Nothing?) : Schema0Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema0BoxedBoolean(val data: Boolean): Schema0Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema0BoxedNumber(val data: Number) : Schema0Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema0BoxedString(val data: String) : Schema0Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema0BoxedList(val data: FrozenList<Any?>) : Schema0Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema0BoxedMap(val data: Schema0Map) : Schema0Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class Schema0 private constructor(): JsonSchema<Schema0Boxed>(
        JsonSchemaInfo(
            properties = mapOf(
                "bar" to Bar::class.java
            ),
            required =setOf(
                "bar"
            ),
        )
    ), NullSchemaValidator<Schema0BoxedVoid>, BooleanSchemaValidator<Schema0BoxedBoolean>, NumberSchemaValidator<Schema0BoxedNumber>, StringSchemaValidator<Schema0BoxedString>, ListSchemaValidator<FrozenList<Any?>, Schema0BoxedList>, MapSchemaValidator<Schema0Map, Schema0BoxedMap> {
    
        companion object {
            @Volatile
            private var instance: Schema0? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Schema0().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Schema0Map {
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
            return Schema0Map(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): Schema0Map {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): Schema0BoxedVoid {
            return Schema0BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): Schema0BoxedBoolean {
            return Schema0BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): Schema0BoxedNumber {
            return Schema0BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): Schema0BoxedString {
            return Schema0BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): Schema0BoxedList {
            return Schema0BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): Schema0BoxedMap {
            return Schema0BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): Schema0Boxed {
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
    
    
    class Schema1Map(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf(
                "foo"
            )
            val optionalKeys: Set<String> = setOf()
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): Schema1Map {
                return Schema1.getInstance().validate(arg, configuration)
            }
        }
        
        fun foo(): String {
            val value: Any? = get("foo")
            if (!(value is String)) {
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
        
        fun foo(value: String): T {
            val instance = getInstance()
            instance["foo"] = value
            return getBuilderAfterFoo(instance)
        }
    }
    
    class Schema1Map0Builder(private val instance: MutableMap<String, Any?>): UnsetAddPropsSetter<Schema1Map0Builder>, GenericBuilder<Map<String, Any?>> {
        private val knownKeys: Set<String> = setOf(
            "foo"
        )
        override fun getKnownKeys(): Set<String> {
            return knownKeys
        }
        override fun build(): Map<String, Any?> {
            return instance
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): Schema1Map0Builder  {
            return this
        }
    }
    
    class Schema1MapBuilder: SetterForFoo<Schema1Map0Builder> {
        private val instance: MutableMap<String, Any?>
        init {
            this.instance = LinkedHashMap()
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): Schema1Map0Builder {
            return Schema1Map0Builder(instance)
        }
    }
    
    
    sealed interface Schema1Boxed {
        fun getData(): Any?
    }
    
    data class Schema1BoxedVoid(val data: Nothing?) : Schema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema1BoxedBoolean(val data: Boolean): Schema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema1BoxedNumber(val data: Number) : Schema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema1BoxedString(val data: String) : Schema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema1BoxedList(val data: FrozenList<Any?>) : Schema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class Schema1BoxedMap(val data: Schema1Map) : Schema1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class Schema1 private constructor(): JsonSchema<Schema1Boxed>(
        JsonSchemaInfo(
            properties = mapOf(
                "foo" to Foo::class.java
            ),
            required =setOf(
                "foo"
            ),
        )
    ), NullSchemaValidator<Schema1BoxedVoid>, BooleanSchemaValidator<Schema1BoxedBoolean>, NumberSchemaValidator<Schema1BoxedNumber>, StringSchemaValidator<Schema1BoxedString>, ListSchemaValidator<FrozenList<Any?>, Schema1BoxedList>, MapSchemaValidator<Schema1Map, Schema1BoxedMap> {
    
        companion object {
            @Volatile
            private var instance: Schema1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Schema1().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Schema1Map {
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
            return Schema1Map(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): Schema1Map {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): Schema1BoxedVoid {
            return Schema1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): Schema1BoxedBoolean {
            return Schema1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): Schema1BoxedNumber {
            return Schema1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): Schema1BoxedString {
            return Schema1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): Schema1BoxedList {
            return Schema1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): Schema1BoxedMap {
            return Schema1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): Schema1Boxed {
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
    
    sealed interface OneofComplexTypes1Boxed {
        fun getData(): Any?
    }
    
    data class OneofComplexTypes1BoxedVoid(val data: Nothing?) : OneofComplexTypes1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class OneofComplexTypes1BoxedBoolean(val data: Boolean): OneofComplexTypes1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class OneofComplexTypes1BoxedNumber(val data: Number) : OneofComplexTypes1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class OneofComplexTypes1BoxedString(val data: String) : OneofComplexTypes1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class OneofComplexTypes1BoxedList(val data: FrozenList<Any?>) : OneofComplexTypes1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class OneofComplexTypes1BoxedMap(val data: FrozenMap<Any?>) : OneofComplexTypes1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class OneofComplexTypes1 private constructor(): JsonSchema<OneofComplexTypes1Boxed>(
        JsonSchemaInfo(
            oneOf = listOf(
                Schema0::class.java,
                Schema1::class.java
            ),
        )
    ), NullSchemaValidator<OneofComplexTypes1BoxedVoid>, BooleanSchemaValidator<OneofComplexTypes1BoxedBoolean>, NumberSchemaValidator<OneofComplexTypes1BoxedNumber>, StringSchemaValidator<OneofComplexTypes1BoxedString>, ListSchemaValidator<FrozenList<Any?>, OneofComplexTypes1BoxedList>, MapSchemaValidator<FrozenMap<Any?>, OneofComplexTypes1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: OneofComplexTypes1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: OneofComplexTypes1().also { instance = it }
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): OneofComplexTypes1BoxedVoid {
            return OneofComplexTypes1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): OneofComplexTypes1BoxedBoolean {
            return OneofComplexTypes1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): OneofComplexTypes1BoxedNumber {
            return OneofComplexTypes1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): OneofComplexTypes1BoxedString {
            return OneofComplexTypes1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): OneofComplexTypes1BoxedList {
            return OneofComplexTypes1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): OneofComplexTypes1BoxedMap {
            return OneofComplexTypes1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): OneofComplexTypes1Boxed {
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
