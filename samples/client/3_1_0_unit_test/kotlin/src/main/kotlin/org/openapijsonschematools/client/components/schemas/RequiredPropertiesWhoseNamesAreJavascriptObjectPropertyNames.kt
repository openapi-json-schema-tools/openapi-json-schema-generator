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

class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames {
    // nest classes so all schemas and input/output classes can be public
    
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf(
                "__proto__",
                "constructor",
                "toString"
            )
            val optionalKeys: Set<String> = setOf()
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap {
                return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance().validate(arg, configuration)
            }
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
        
        fun lowLineProto(value: Nothing?): T {
            val instance = getInstance()
            instance["__proto__"] = null
            return getBuilderAfterProto(instance)
        }
        
        fun lowLineProto(value: Boolean): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
        
        fun lowLineProto(value: String): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
        
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
        
        fun lowLineProto(value: List<Any?>): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
        
        fun lowLineProto(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["__proto__"] = value
            return getBuilderAfterProto(instance)
        }
    }
    
    interface SetterForConstructorSchema <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): T
        
        fun setConstructor(value: Nothing?): T {
            val instance = getInstance()
            instance["constructor"] = null
            return getBuilderAfterConstructorSchema(instance)
        }
        
        fun setConstructor(value: Boolean): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
        
        fun setConstructor(value: String): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
        
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
        
        fun setConstructor(value: List<Any?>): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
        
        fun setConstructor(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["constructor"] = value
            return getBuilderAfterConstructorSchema(instance)
        }
    }
    
    interface SetterForToStringSchema <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterToStringSchema(instance: MutableMap<String, Any?>): T
        
        fun toString(value: Nothing?): T {
            val instance = getInstance()
            instance["toString"] = null
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: Boolean): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: String): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: Int): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: Float): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: Long): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: Double): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: List<Any?>): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
        
        fun toString(value: Map<String, Any?>): T {
            val instance = getInstance()
            instance["toString"] = value
            return getBuilderAfterToStringSchema(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(private val instance: MutableMap<String, Any?>): UnsetAddPropsSetter<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder>, GenericBuilder<Map<String, Any?>> {
        private val knownKeys: Set<String> = setOf(
            "__proto__",
            "constructor",
            "toString"
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
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder  {
            return this
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(private val instance: MutableMap<String, Any?>): SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterToStringSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(private val instance: MutableMap<String, Any?>): SetterForConstructorSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder(private val instance: MutableMap<String, Any?>): SetterForConstructorSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder>, SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(instance)
        }
        override fun getBuilderAfterToStringSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(private val instance: MutableMap<String, Any?>): SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterProto(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder(private val instance: MutableMap<String, Any?>): SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder>, SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterProto(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(instance)
        }
        override fun getBuilderAfterToStringSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder(private val instance: MutableMap<String, Any?>): SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder>, SetterForConstructorSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder> {
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterProto(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(instance)
        }
        override fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(instance)
        }
    }
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder: SetterForProto<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder>, SetterForConstructorSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder>, SetterForToStringSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder> {
        private val instance: MutableMap<String, Any?>
        init {
            this.instance = LinkedHashMap()
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterProto(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder(instance)
        }
        override fun getBuilderAfterConstructorSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder(instance)
        }
        override fun getBuilderAfterToStringSchema(instance: MutableMap<String, Any?>): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder(instance)
        }
    }
    
    
    sealed interface RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        fun getData(): Any?
    }
    
    data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(val data: Nothing?) : RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(val data: Boolean): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(val data: Number) : RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(val data: String) : RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(val data: FrozenList<Any?>) : RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(val data: RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap) : RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1 private constructor(): JsonSchema<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed>(
        JsonSchemaInfo()
            .required(setOf(
                "__proto__",
                "constructor",
                "toString"
            ))
    ), NullSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid>, BooleanSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean>, NumberSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber>, StringSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString>, ListSchemaValidator<FrozenList<Any?>, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList>, MapSchemaValidator<RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap, RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap {
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
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap {
            return RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed {
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
