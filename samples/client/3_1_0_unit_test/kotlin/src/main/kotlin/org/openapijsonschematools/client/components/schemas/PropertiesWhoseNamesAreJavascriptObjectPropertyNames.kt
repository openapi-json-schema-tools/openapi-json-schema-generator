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
import org.openapijsonschematools.client.schemas.NumberJsonSchema
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

class PropertiesWhoseNamesAreJavascriptObjectPropertyNames {
    // nest classes so all schemas and input/output classes can be public
    
    
    class Proto : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Proto? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Proto().also { instance = it }
                }
        }
    }
    
    
    class Length : StringJsonSchema.StringJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Length? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Length().also { instance = it }
                }
        }
    }
    
    
    class ToStringMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "length"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): ToStringMap {
                return ToString.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun length(): String {
            val key = "length"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value is String)) {
                throw RuntimeException("Invalid value stored for length")
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
    
    interface SetterForLength <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterLength(instance: MutableMap<String, Any?>): T
        
        fun length(value: String): T {
            val instance = getInstance()
            instance["length"] = value
            return getBuilderAfterLength(instance)
        }
    }
    
    class ToStringMapBuilder: UnsetAddPropsSetter<ToStringMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForLength<ToStringMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "length"
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
        override fun getBuilderAfterLength(instance: MutableMap<String, Any?>): ToStringMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): ToStringMapBuilder  {
            return this
        }
    }
    
    
    sealed interface ToStringBoxed {
        fun getData(): Any?
    }
    
    data class ToStringBoxedVoid(val data: Nothing?) : ToStringBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ToStringBoxedBoolean(val data: Boolean): ToStringBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ToStringBoxedNumber(val data: Number) : ToStringBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ToStringBoxedString(val data: String) : ToStringBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ToStringBoxedList(val data: FrozenList<Any?>) : ToStringBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ToStringBoxedMap(val data: ToStringMap) : ToStringBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class ToString private constructor(): JsonSchema<ToStringBoxed>(
        JsonSchemaInfo()
            .properties(mapOf(
                "length" to Length::class.java
            ))
    ), NullSchemaValidator<ToStringBoxedVoid>, BooleanSchemaValidator<ToStringBoxedBoolean>, NumberSchemaValidator<ToStringBoxedNumber>, StringSchemaValidator<ToStringBoxedString>, ListSchemaValidator<FrozenList<Any?>, ToStringBoxedList>, MapSchemaValidator<ToStringMap, ToStringBoxedMap> {
    
        companion object {
            @Volatile
            private var instance: ToString? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ToString().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): ToStringMap {
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
            return ToStringMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): ToStringMap {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): ToStringBoxedVoid {
            return ToStringBoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): ToStringBoxedBoolean {
            return ToStringBoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): ToStringBoxedNumber {
            return ToStringBoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): ToStringBoxedString {
            return ToStringBoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): ToStringBoxedList {
            return ToStringBoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): ToStringBoxedMap {
            return ToStringBoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ToStringBoxed {
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
    
    class ConstructorSchema : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: ConstructorSchema? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ConstructorSchema().also { instance = it }
                }
        }
    }
    
    
    class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "__proto__",
                "toString",
                "constructor"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap {
                return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class)
        fun toString(): Any? {
            val key = "toString"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
            if (!(value is Any)) {
                throw RuntimeException("Invalid value stored for toString")
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
    
    interface SetterForProto <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterProto(instance: MutableMap<String, Any?>): T
        
        fun lowLineProto(value: Int): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
        
        fun lowLineProto(value: Float): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
        
        fun lowLineProto(value: Long): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
        
        fun lowLineProto(value: Double): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
    }
    
    interface SetterForToString <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterToString(instance: MutableMap<String, Any?>): T
        
        fun toString(value: Nothing?): T {
            val instance = getInstance()
            instance["toString"] = null
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: Boolean): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: String): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: Int): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: Float): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: Long): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: Double): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: List<Any?>): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
        
        fun toString(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToString(instance)
        }
    }
    
    interface SetterForConstructorSchema <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): T
        
        fun setConstructor(value: Int): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
        
        fun setConstructor(value: Float): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
        
        fun setConstructor(value: Long): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
        
        fun setConstructor(value: Double): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
    }
    
    class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder: UnsetAddPropsSetter<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForProto<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder>, SetterForToString<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder>, SetterForConstructorSchema<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "__proto__",
            "toString",
            "constructor"
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
        override fun getBuilderAfterProto(instance: MutableMap<String, Any?>): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder {
            return this
        }
        override fun getBuilderAfterToString(instance: MutableMap<String, Any?>): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder {
            return this
        }
        override fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder  {
            return this
        }
    }
    
    
    sealed interface PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        fun getData(): Any?
    }
    
    data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(val data: Nothing?) : PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(val data: Boolean): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(val data: Number) : PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(val data: String) : PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(val data: FrozenList<Any?>) : PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(val data: PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap) : PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1 private constructor(): JsonSchema<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed>(
        JsonSchemaInfo()
            .properties(mapOf(
                "__proto__" to Proto::class.java,
                "toString" to ToString::class.java,
                "constructor" to ConstructorSchema::class.java
            ))
    ), NullSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid>, BooleanSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean>, NumberSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber>, StringSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString>, ListSchemaValidator<FrozenList<Any?>, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList>, MapSchemaValidator<PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap, PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: PropertiesWhoseNamesAreJavascriptObjectPropertyNames1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: PropertiesWhoseNamesAreJavascriptObjectPropertyNames1().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap {
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
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap {
            return PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
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
