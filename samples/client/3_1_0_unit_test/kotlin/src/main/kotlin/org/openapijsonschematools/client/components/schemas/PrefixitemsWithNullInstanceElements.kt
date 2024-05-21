package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.NullJsonSchema
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter
import org.openapijsonschematools.client.schemas.validation.BooleanSchemaValidator
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NullSchemaValidator
import org.openapijsonschematools.client.schemas.validation.NumberSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class PrefixitemsWithNullInstanceElements {
    // nest classes so all schemas and input/output classes can be public
    
    
    class PrefixitemsWithNullInstanceElementsList(m: FrozenList<Any?>) : FrozenList<Any?>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<Any?>, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElementsList {
                return PrefixitemsWithNullInstanceElements1.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class PrefixitemsWithNullInstanceElementsListBuilder {
        // class to build List<Any?>
        private val list: MutableList<Any?>
    
        init {
            this.list = ArrayList()
        }
    
        
        fun add(item: Nothing?): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(null)
            return this
        }
        
        fun add(item: Boolean): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: String): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Int): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Float): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Long): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Double): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: List<*>): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Map<String, Any?>): PrefixitemsWithNullInstanceElementsListBuilder {
            list.add(item)
            return this
        }
    
        fun build(): List<Any?> {
            return list
        }
    }
    
    
    class Schema0 : NullJsonSchema.NullJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Schema0? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Schema0().also { instance = it }
                }
        }
    }
    
    
    sealed interface PrefixitemsWithNullInstanceElements1Boxed {
        fun getData(): Any?
    }
    
    data class PrefixitemsWithNullInstanceElements1BoxedVoid(val data: Nothing?) : PrefixitemsWithNullInstanceElements1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PrefixitemsWithNullInstanceElements1BoxedBoolean(val data: Boolean): PrefixitemsWithNullInstanceElements1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PrefixitemsWithNullInstanceElements1BoxedNumber(val data: Number) : PrefixitemsWithNullInstanceElements1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PrefixitemsWithNullInstanceElements1BoxedString(val data: String) : PrefixitemsWithNullInstanceElements1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PrefixitemsWithNullInstanceElements1BoxedList(val data: PrefixitemsWithNullInstanceElementsList) : PrefixitemsWithNullInstanceElements1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PrefixitemsWithNullInstanceElements1BoxedMap(val data: FrozenMap<Any?>) : PrefixitemsWithNullInstanceElements1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class PrefixitemsWithNullInstanceElements1 private constructor(): JsonSchema<PrefixitemsWithNullInstanceElements1Boxed>(
        prefixItems = listOf(
            Schema0::class.java
        ),
    ), NullSchemaValidator<PrefixitemsWithNullInstanceElements1BoxedVoid>, BooleanSchemaValidator<PrefixitemsWithNullInstanceElements1BoxedBoolean>, NumberSchemaValidator<PrefixitemsWithNullInstanceElements1BoxedNumber>, StringSchemaValidator<PrefixitemsWithNullInstanceElements1BoxedString>, ListSchemaValidator<PrefixitemsWithNullInstanceElementsList, PrefixitemsWithNullInstanceElements1BoxedList>, MapSchemaValidator<FrozenMap<Any?>, PrefixitemsWithNullInstanceElements1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: PrefixitemsWithNullInstanceElements1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: PrefixitemsWithNullInstanceElements1().also { instance = it }
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
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): PrefixitemsWithNullInstanceElementsList {
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
            return PrefixitemsWithNullInstanceElementsList(newInstanceItems)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElementsList {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1BoxedVoid {
            return PrefixitemsWithNullInstanceElements1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1BoxedBoolean {
            return PrefixitemsWithNullInstanceElements1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1BoxedNumber {
            return PrefixitemsWithNullInstanceElements1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1BoxedString {
            return PrefixitemsWithNullInstanceElements1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1BoxedList {
            return PrefixitemsWithNullInstanceElements1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1BoxedMap {
            return PrefixitemsWithNullInstanceElements1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): PrefixitemsWithNullInstanceElements1Boxed {
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
