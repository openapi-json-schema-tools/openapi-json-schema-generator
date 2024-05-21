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

class PropertyNamedRefThatIsNotAReference {
    // nest classes so all schemas and input/output classes can be public
    
    
    class Ref : StringJsonSchema.StringJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Ref? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Ref().also { instance = it }
                }
        }
    }
    
    
    class PropertyNamedRefThatIsNotAReferenceMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "\$ref"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): PropertyNamedRefThatIsNotAReferenceMap {
                return PropertyNamedRefThatIsNotAReference1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Any? {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            throwIfKeyNotPresent(name)
            return get(name)
        }
    }
    
    interface SetterForRef <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterRef(instance: MutableMap<String, Any?>): T
        
        fun reverseSolidusDollarSignRef(value: String): T {
            val instance = getInstance()
            instance["\$ref"] = value
            return getBuilderAfterRef(instance)
        }
    }
    
    class PropertyNamedRefThatIsNotAReferenceMapBuilder: UnsetAddPropsSetter<PropertyNamedRefThatIsNotAReferenceMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForRef<PropertyNamedRefThatIsNotAReferenceMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "\$ref"
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
        override fun getBuilderAfterRef(instance: MutableMap<String, Any?>): PropertyNamedRefThatIsNotAReferenceMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): PropertyNamedRefThatIsNotAReferenceMapBuilder  {
            return this
        }
    }
    
    
    sealed interface PropertyNamedRefThatIsNotAReference1Boxed {
        fun getData(): Any?
    }
    
    data class PropertyNamedRefThatIsNotAReference1BoxedVoid(val data: Nothing?) : PropertyNamedRefThatIsNotAReference1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertyNamedRefThatIsNotAReference1BoxedBoolean(val data: Boolean): PropertyNamedRefThatIsNotAReference1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertyNamedRefThatIsNotAReference1BoxedNumber(val data: Number) : PropertyNamedRefThatIsNotAReference1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertyNamedRefThatIsNotAReference1BoxedString(val data: String) : PropertyNamedRefThatIsNotAReference1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertyNamedRefThatIsNotAReference1BoxedList(val data: FrozenList<Any?>) : PropertyNamedRefThatIsNotAReference1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertyNamedRefThatIsNotAReference1BoxedMap(val data: PropertyNamedRefThatIsNotAReferenceMap) : PropertyNamedRefThatIsNotAReference1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class PropertyNamedRefThatIsNotAReference1 private constructor(): JsonSchema<PropertyNamedRefThatIsNotAReference1Boxed>(
        JsonSchemaInfo(
            properties = mapOf(
                "\$ref" to Ref::class.java
            ),
        )
    ), NullSchemaValidator<PropertyNamedRefThatIsNotAReference1BoxedVoid>, BooleanSchemaValidator<PropertyNamedRefThatIsNotAReference1BoxedBoolean>, NumberSchemaValidator<PropertyNamedRefThatIsNotAReference1BoxedNumber>, StringSchemaValidator<PropertyNamedRefThatIsNotAReference1BoxedString>, ListSchemaValidator<FrozenList<Any?>, PropertyNamedRefThatIsNotAReference1BoxedList>, MapSchemaValidator<PropertyNamedRefThatIsNotAReferenceMap, PropertyNamedRefThatIsNotAReference1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: PropertyNamedRefThatIsNotAReference1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: PropertyNamedRefThatIsNotAReference1().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): PropertyNamedRefThatIsNotAReferenceMap {
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
            return PropertyNamedRefThatIsNotAReferenceMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReferenceMap {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1BoxedVoid {
            return PropertyNamedRefThatIsNotAReference1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1BoxedBoolean {
            return PropertyNamedRefThatIsNotAReference1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1BoxedNumber {
            return PropertyNamedRefThatIsNotAReference1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1BoxedString {
            return PropertyNamedRefThatIsNotAReference1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1BoxedList {
            return PropertyNamedRefThatIsNotAReference1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1BoxedMap {
            return PropertyNamedRefThatIsNotAReference1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): PropertyNamedRefThatIsNotAReference1Boxed {
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
