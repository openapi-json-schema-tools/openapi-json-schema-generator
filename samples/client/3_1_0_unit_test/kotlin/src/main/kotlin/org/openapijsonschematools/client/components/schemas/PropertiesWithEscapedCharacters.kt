package org.openapijsonschematools.client.components.schemas
import java.time.LocalDate
import java.time.ZonedDateTime
import java.util.UUID
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.NumberJsonSchema
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

class PropertiesWithEscapedCharacters {
    // nest classes so all schemas and input/output classes can be public
    
    
    class Foonbar : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foonbar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foonbar().also { instance = it }
                }
        }
    }
    
    
    class Foobar : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foobar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foobar().also { instance = it }
                }
        }
    }
    
    
    class Foobar1 : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foobar1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foobar1().also { instance = it }
                }
        }
    }
    
    
    class Foorbar : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foorbar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foorbar().also { instance = it }
                }
        }
    }
    
    
    class Footbar : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Footbar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Footbar().also { instance = it }
                }
        }
    }
    
    
    class Foou000Cbar : NumberJsonSchema.NumberJsonSchema1() {
        companion object {
            @Volatile
            private var instance: Foou000Cbar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foou000Cbar().also { instance = it }
                }
        }
    }
    
    
    class PropertiesWithEscapedCharactersMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf()
            val optionalKeys: Set<String> = setOf(
                "foo\nbar",
                "foo\"bar",
                "foo\\bar",
                "foo\rbar",
                "foo\tbar",
                "foo\u000Cbar"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): PropertiesWithEscapedCharactersMap {
                return PropertiesWithEscapedCharacters1.getInstance().validate(arg, configuration)
            }
        }
        
        @Throws(UnsetPropertyException::class, InvalidAdditionalPropertyException::class)
        fun getAdditionalProperty(name: String): Any? {
            throwIfKeyKnown(name, requiredKeys, optionalKeys)
            throwIfKeyNotPresent(name)
            return get(name)
        }
    }
    
    interface SetterForFoonbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusNbar(value: Int): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Float): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Long): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
        
        fun fooReverseSolidusNbar(value: Double): T {
            val instance = getInstance()
            instance["foo\nbar"] = value
            return getBuilderAfterFoonbar(instance)
        }
    }
    
    interface SetterForFoobar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusQuotationMarkBar(value: Int): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Float): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Long): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
        
        fun fooReverseSolidusQuotationMarkBar(value: Double): T {
            val instance = getInstance()
            instance["foo\"bar"] = value
            return getBuilderAfterFoobar(instance)
        }
    }
    
    interface SetterForFoobar1 <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusReverseSolidusBar(value: Int): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Float): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Long): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
        
        fun fooReverseSolidusReverseSolidusBar(value: Double): T {
            val instance = getInstance()
            instance["foo\\bar"] = value
            return getBuilderAfterFoobar1(instance)
        }
    }
    
    interface SetterForFoorbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusRbar(value: Int): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Float): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Long): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
        
        fun fooReverseSolidusRbar(value: Double): T {
            val instance = getInstance()
            instance["foo\rbar"] = value
            return getBuilderAfterFoorbar(instance)
        }
    }
    
    interface SetterForFootbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusTbar(value: Int): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Float): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Long): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
        
        fun fooReverseSolidusTbar(value: Double): T {
            val instance = getInstance()
            instance["foo\tbar"] = value
            return getBuilderAfterFootbar(instance)
        }
    }
    
    interface SetterForFoou000Cbar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): T
        
        fun fooReverseSolidusU000cbar(value: Int): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Float): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Long): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
        
        fun fooReverseSolidusU000cbar(value: Double): T {
            val instance = getInstance()
            instance["foo\u000Cbar"] = value
            return getBuilderAfterFoou000Cbar(instance)
        }
    }
    
    class PropertiesWithEscapedCharactersMapBuilder: UnsetAddPropsSetter<PropertiesWithEscapedCharactersMapBuilder>, GenericBuilder<Map<String, Any?>>, SetterForFoonbar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoobar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoobar1<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoorbar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFootbar<PropertiesWithEscapedCharactersMapBuilder>, SetterForFoou000Cbar<PropertiesWithEscapedCharactersMapBuilder> {
        private val knownKeys: Set<String> = setOf(
            "foo\nbar",
            "foo\"bar",
            "foo\\bar",
            "foo\rbar",
            "foo\tbar",
            "foo\u000Cbar"
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
        override fun getBuilderAfterFoonbar(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder {
            return this
        }
        override fun getBuilderAfterFoobar(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder {
            return this
        }
        override fun getBuilderAfterFoobar1(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder {
            return this
        }
        override fun getBuilderAfterFoorbar(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder {
            return this
        }
        override fun getBuilderAfterFootbar(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder {
            return this
        }
        override fun getBuilderAfterFoou000Cbar(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): PropertiesWithEscapedCharactersMapBuilder  {
            return this
        }
    }
    
    
    sealed interface PropertiesWithEscapedCharacters1Boxed {
        fun getData(): Any?
    }
    
    data class PropertiesWithEscapedCharacters1BoxedVoid(val data: Nothing?) : PropertiesWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithEscapedCharacters1BoxedBoolean(val data: Boolean): PropertiesWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithEscapedCharacters1BoxedNumber(val data: Number) : PropertiesWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithEscapedCharacters1BoxedString(val data: String) : PropertiesWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithEscapedCharacters1BoxedList(val data: FrozenList<Any?>) : PropertiesWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    data class PropertiesWithEscapedCharacters1BoxedMap(val data: PropertiesWithEscapedCharactersMap) : PropertiesWithEscapedCharacters1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class PropertiesWithEscapedCharacters1 private constructor(): JsonSchema<PropertiesWithEscapedCharacters1Boxed>(
        properties = mapOf(
            "foo\nbar" to Foonbar::class.java,
            "foo\"bar" to Foobar::class.java,
            "foo\\bar" to Foobar1::class.java,
            "foo\rbar" to Foorbar::class.java,
            "foo\tbar" to Footbar::class.java,
            "foo\u000Cbar" to Foou000Cbar::class.java
        ),
    ), NullSchemaValidator<PropertiesWithEscapedCharacters1BoxedVoid>, BooleanSchemaValidator<PropertiesWithEscapedCharacters1BoxedBoolean>, NumberSchemaValidator<PropertiesWithEscapedCharacters1BoxedNumber>, StringSchemaValidator<PropertiesWithEscapedCharacters1BoxedString>, ListSchemaValidator<FrozenList<Any?>, PropertiesWithEscapedCharacters1BoxedList>, MapSchemaValidator<PropertiesWithEscapedCharactersMap, PropertiesWithEscapedCharacters1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: PropertiesWithEscapedCharacters1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: PropertiesWithEscapedCharacters1().also { instance = it }
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
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): PropertiesWithEscapedCharactersMap {
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
            return PropertiesWithEscapedCharactersMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesWithEscapedCharactersMap {
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
        override fun validateAndBox(arg: Nothing?, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1BoxedVoid {
            return PropertiesWithEscapedCharacters1BoxedVoid(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Boolean, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1BoxedBoolean {
            return PropertiesWithEscapedCharacters1BoxedBoolean(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Number, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1BoxedNumber {
            return PropertiesWithEscapedCharacters1BoxedNumber(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1BoxedString {
            return PropertiesWithEscapedCharacters1BoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1BoxedList {
            return PropertiesWithEscapedCharacters1BoxedList(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1BoxedMap {
            return PropertiesWithEscapedCharacters1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): PropertiesWithEscapedCharacters1Boxed {
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
