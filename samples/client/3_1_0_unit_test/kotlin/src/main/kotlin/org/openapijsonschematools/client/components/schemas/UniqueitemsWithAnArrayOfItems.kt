package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.BooleanJsonSchema
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

class UniqueitemsWithAnArrayOfItems {
    // nest classes so all schemas and input/output classes can be public
    
    
    class UniqueitemsWithAnArrayOfItemsList(m: FrozenList<Any?>) : FrozenList<Any?>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<Any?>, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItemsList {
                return UniqueitemsWithAnArrayOfItems1.getInstance().validate(arg, configuration)
            }
        }
    }
    
    class UniqueitemsWithAnArrayOfItemsListBuilder {
        // class to build List<Any?>
        private val list: MutableList<Any?>
    
        init {
            this.list = ArrayList()
        }
    
        
        fun add(item: Nothing?): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(null)
            return this
        }
        
        fun add(item: Boolean): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: String): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Int): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Float): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Long): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Double): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: List<*>): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
        
        fun add(item: Map<String, Any?>): UniqueitemsWithAnArrayOfItemsListBuilder {
            list.add(item)
            return this
        }
    
        fun build(): List<Any?> {
            return list
        }
    }
    
    
    class Schema0 : BooleanJsonSchema.BooleanJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Schema0? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Schema0().also { instance = it }
                }
        }
    }
    
    
    class Schema1 : BooleanJsonSchema.BooleanJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Schema1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Schema1().also { instance = it }
                }
        }
    }
    
    
    sealed interface UniqueitemsWithAnArrayOfItems1Boxed {
        fun getData(): Any?
    }
    
    data class UniqueitemsWithAnArrayOfItems1BoxedVoid(val data: Nothing?) : UniqueitemsWithAnArrayOfItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class UniqueitemsWithAnArrayOfItems1BoxedBoolean(val data: Boolean): UniqueitemsWithAnArrayOfItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class UniqueitemsWithAnArrayOfItems1BoxedNumber(val data: Number) : UniqueitemsWithAnArrayOfItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class UniqueitemsWithAnArrayOfItems1BoxedString(val data: String) : UniqueitemsWithAnArrayOfItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class UniqueitemsWithAnArrayOfItems1BoxedList(val data: UniqueitemsWithAnArrayOfItemsList) : UniqueitemsWithAnArrayOfItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class UniqueitemsWithAnArrayOfItems1BoxedMap(val data: FrozenMap<Any?>) : UniqueitemsWithAnArrayOfItems1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class UniqueitemsWithAnArrayOfItems1 private constructor(): JsonSchema<UniqueitemsWithAnArrayOfItems1Boxed>(
        uniqueItems = true,
        prefixItems = listOf(
            Schema0::class.java,
            Schema1::class.java
        ),
    ), NullSchemaValidator<UniqueitemsWithAnArrayOfItems1BoxedVoid>, BooleanSchemaValidator<UniqueitemsWithAnArrayOfItems1BoxedBoolean>, NumberSchemaValidator<UniqueitemsWithAnArrayOfItems1BoxedNumber>, StringSchemaValidator<UniqueitemsWithAnArrayOfItems1BoxedString>, ListSchemaValidator<UniqueitemsWithAnArrayOfItemsList, UniqueitemsWithAnArrayOfItems1BoxedList>, MapSchemaValidator<FrozenMap<Any?>, UniqueitemsWithAnArrayOfItems1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: UniqueitemsWithAnArrayOfItems1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: UniqueitemsWithAnArrayOfItems1().also { instance = it }
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
        
        override fun getNewInstance(arg: List<*>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): UniqueitemsWithAnArrayOfItemsList {
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
            return UniqueitemsWithAnArrayOfItemsList(newInstanceItems)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItemsList {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1BoxedVoid {
            return UniqueitemsWithAnArrayOfItems1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1BoxedBoolean {
            return UniqueitemsWithAnArrayOfItems1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1BoxedNumber {
            return UniqueitemsWithAnArrayOfItems1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1BoxedString {
            return UniqueitemsWithAnArrayOfItems1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1BoxedList {
            return UniqueitemsWithAnArrayOfItems1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1BoxedMap {
            return UniqueitemsWithAnArrayOfItems1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): UniqueitemsWithAnArrayOfItems1Boxed {
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
