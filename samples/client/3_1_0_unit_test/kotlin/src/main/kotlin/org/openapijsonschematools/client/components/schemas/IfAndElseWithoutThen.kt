package org.openapijsonschematools.client.components.schemas
import java.math.BigDecimal
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
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

class IfAndElseWithoutThen {
    // nest classes so all schemas and input/output classes can be public
    
    
    sealed interface ElseSchemaBoxed {
        fun getData(): Any?
    }
    
    data class ElseSchemaBoxedVoid(val data: Nothing?) : ElseSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ElseSchemaBoxedBoolean(val data: Boolean): ElseSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ElseSchemaBoxedNumber(val data: Number) : ElseSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ElseSchemaBoxedString(val data: String) : ElseSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ElseSchemaBoxedList(val data: FrozenList<Any?>) : ElseSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class ElseSchemaBoxedMap(val data: FrozenMap<Any?>) : ElseSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class ElseSchema private constructor(): JsonSchema<ElseSchemaBoxed>(
        JsonSchemaInfo(
            multipleOf = BigDecimal("2"),
        )
    ), NullSchemaValidator<ElseSchemaBoxedVoid>, BooleanSchemaValidator<ElseSchemaBoxedBoolean>, NumberSchemaValidator<ElseSchemaBoxedNumber>, StringSchemaValidator<ElseSchemaBoxedString>, ListSchemaValidator<FrozenList<Any?>, ElseSchemaBoxedList>, MapSchemaValidator<FrozenMap<Any?>, ElseSchemaBoxedMap> {
    
        companion object {
            @Volatile
            private var instance: ElseSchema? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ElseSchema().also { instance = it }
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): ElseSchemaBoxedVoid {
            return ElseSchemaBoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): ElseSchemaBoxedBoolean {
            return ElseSchemaBoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): ElseSchemaBoxedNumber {
            return ElseSchemaBoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): ElseSchemaBoxedString {
            return ElseSchemaBoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): ElseSchemaBoxedList {
            return ElseSchemaBoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): ElseSchemaBoxedMap {
            return ElseSchemaBoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ElseSchemaBoxed {
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
    
    sealed interface IfSchemaBoxed {
        fun getData(): Any?
    }
    
    data class IfSchemaBoxedVoid(val data: Nothing?) : IfSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfSchemaBoxedBoolean(val data: Boolean): IfSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfSchemaBoxedNumber(val data: Number) : IfSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfSchemaBoxedString(val data: String) : IfSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfSchemaBoxedList(val data: FrozenList<Any?>) : IfSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfSchemaBoxedMap(val data: FrozenMap<Any?>) : IfSchemaBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class IfSchema private constructor(): JsonSchema<IfSchemaBoxed>(
        JsonSchemaInfo(
            exclusiveMaximum = 0,
        )
    ), NullSchemaValidator<IfSchemaBoxedVoid>, BooleanSchemaValidator<IfSchemaBoxedBoolean>, NumberSchemaValidator<IfSchemaBoxedNumber>, StringSchemaValidator<IfSchemaBoxedString>, ListSchemaValidator<FrozenList<Any?>, IfSchemaBoxedList>, MapSchemaValidator<FrozenMap<Any?>, IfSchemaBoxedMap> {
    
        companion object {
            @Volatile
            private var instance: IfSchema? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: IfSchema().also { instance = it }
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): IfSchemaBoxedVoid {
            return IfSchemaBoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): IfSchemaBoxedBoolean {
            return IfSchemaBoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): IfSchemaBoxedNumber {
            return IfSchemaBoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): IfSchemaBoxedString {
            return IfSchemaBoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): IfSchemaBoxedList {
            return IfSchemaBoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): IfSchemaBoxedMap {
            return IfSchemaBoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): IfSchemaBoxed {
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
    
    sealed interface IfAndElseWithoutThen1Boxed {
        fun getData(): Any?
    }
    
    data class IfAndElseWithoutThen1BoxedVoid(val data: Nothing?) : IfAndElseWithoutThen1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfAndElseWithoutThen1BoxedBoolean(val data: Boolean): IfAndElseWithoutThen1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfAndElseWithoutThen1BoxedNumber(val data: Number) : IfAndElseWithoutThen1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfAndElseWithoutThen1BoxedString(val data: String) : IfAndElseWithoutThen1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfAndElseWithoutThen1BoxedList(val data: FrozenList<Any?>) : IfAndElseWithoutThen1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class IfAndElseWithoutThen1BoxedMap(val data: FrozenMap<Any?>) : IfAndElseWithoutThen1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class IfAndElseWithoutThen1 private constructor(): JsonSchema<IfAndElseWithoutThen1Boxed>(
        JsonSchemaInfo(
            ifSchema = IfSchema::class.java,
            elseSchema = ElseSchema::class.java,
        )
    ), NullSchemaValidator<IfAndElseWithoutThen1BoxedVoid>, BooleanSchemaValidator<IfAndElseWithoutThen1BoxedBoolean>, NumberSchemaValidator<IfAndElseWithoutThen1BoxedNumber>, StringSchemaValidator<IfAndElseWithoutThen1BoxedString>, ListSchemaValidator<FrozenList<Any?>, IfAndElseWithoutThen1BoxedList>, MapSchemaValidator<FrozenMap<Any?>, IfAndElseWithoutThen1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: IfAndElseWithoutThen1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: IfAndElseWithoutThen1().also { instance = it }
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): IfAndElseWithoutThen1BoxedVoid {
            return IfAndElseWithoutThen1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): IfAndElseWithoutThen1BoxedBoolean {
            return IfAndElseWithoutThen1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): IfAndElseWithoutThen1BoxedNumber {
            return IfAndElseWithoutThen1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): IfAndElseWithoutThen1BoxedString {
            return IfAndElseWithoutThen1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): IfAndElseWithoutThen1BoxedList {
            return IfAndElseWithoutThen1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): IfAndElseWithoutThen1BoxedMap {
            return IfAndElseWithoutThen1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): IfAndElseWithoutThen1Boxed {
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
