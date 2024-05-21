package org.openapijsonschematools.client.components.schemas
import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.InvalidAdditionalPropertyException
import org.openapijsonschematools.client.exceptions.UnsetPropertyException
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.GenericBuilder
import org.openapijsonschematools.client.schemas.UnsetAddPropsSetter
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.StringEnumValidator
import org.openapijsonschematools.client.schemas.validation.StringSchemaValidator
import org.openapijsonschematools.client.schemas.validation.StringValueMethod
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

class EnumsInProperties {
    // nest classes so all schemas and input/output classes can be public
    
    enum class StringFooEnums(private val value: String): StringValueMethod {
        FOO("foo");
    
        override fun value(): String {
            return this.value
        }
    }
    
    
    sealed interface FooBoxed {
        fun getData(): Any?
    }
    
    data class FooBoxedString(val data: String) : FooBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Foo private constructor(): JsonSchema<FooBoxed>(
        type = setOf(
            String::class.java
        ),
        enumValues = setOf(
            "foo"
        ),
    ), StringSchemaValidator<FooBoxedString>, StringEnumValidator<StringFooEnums> {
    
        companion object {
            @Volatile
            private var instance: Foo? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Foo().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: String, configuration: SchemaConfiguration?): String {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: StringFooEnums, configuration: SchemaConfiguration?): String {
            return validate(arg.value(), configuration)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is String) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is String) {
                return arg
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): FooBoxedString {
            return FooBoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): FooBoxed {
            if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    enum class StringBarEnums(private val value: String): StringValueMethod {
        BAR("bar");
    
        override fun value(): String {
            return this.value
        }
    }
    
    
    sealed interface BarBoxed {
        fun getData(): Any?
    }
    
    data class BarBoxedString(val data: String) : BarBoxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    
    class Bar private constructor(): JsonSchema<BarBoxed>(
        type = setOf(
            String::class.java
        ),
        enumValues = setOf(
            "bar"
        ),
    ), StringSchemaValidator<BarBoxedString>, StringEnumValidator<StringBarEnums> {
    
        companion object {
            @Volatile
            private var instance: Bar? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: Bar().also { instance = it }
                }
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: String, configuration: SchemaConfiguration?): String {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration()
            val validationMetadata = ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return castArg
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: StringBarEnums, configuration: SchemaConfiguration?): String {
            return validate(arg.value(), configuration)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is String) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }        
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is String) {
                return arg
            }
            throw RuntimeException("Invalid input type="+getClass(arg)+". It can't be instantiated by this schema")
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: String, configuration: SchemaConfiguration?): BarBoxedString {
            return BarBoxedString(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): BarBoxed {
            if (arg is String) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }    
    
    class EnumsInPropertiesMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            val requiredKeys: Set<String> = setOf(
                "bar"
            )
            val optionalKeys: Set<String> = setOf(
                "foo"
            )
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration): EnumsInPropertiesMap {
                return EnumsInProperties1.getInstance().validate(arg, configuration)
            }
        }
        
        fun bar(): String {
            val value: Any? = get("bar")
            if (!(value is String)) {
                throw RuntimeException("Invalid value stored for bar")
            }
            return value
        }
        
        @Throws(UnsetPropertyException::class)
        fun foo(): String {
            val key = "foo"
            throwIfKeyNotPresent(key)
            val value: Any? = get(key)
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
    
    interface SetterForBar <T> {
        fun getInstance(): MutableMap<String, Any?>
        fun getBuilderAfterBar(instance: MutableMap<String, Any?>): T
        
        fun bar(value: String): T {
            val instance = getInstance()
            instance["bar"] = value
            return getBuilderAfterBar(instance)
        }
        
        fun bar(value: StringBarEnums): T {
            val instance = getInstance()
            instance["bar"] = value.value()
            return getBuilderAfterBar(instance)
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
        
        fun foo(value: StringFooEnums): T {
            val instance = getInstance()
            instance["foo"] = value.value()
            return getBuilderAfterFoo(instance)
        }
    }
    
    class EnumsInPropertiesMap0Builder(private val instance: MutableMap<String, Any?>): UnsetAddPropsSetter<EnumsInPropertiesMap0Builder>, GenericBuilder<Map<String, Any?>>, SetterForFoo<EnumsInPropertiesMap0Builder> {
        private val knownKeys: Set<String> = setOf(
            "bar",
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
        override fun getBuilderAfterFoo(instance: MutableMap<String, Any?>): EnumsInPropertiesMap0Builder {
            return this
        }
        override fun getBuilderAfterAdditionalProperty(instance: MutableMap<String, Any?>): EnumsInPropertiesMap0Builder  {
            return this
        }
    }
    
    class EnumsInPropertiesMapBuilder: SetterForBar<EnumsInPropertiesMap0Builder> {
        private val instance: MutableMap<String, Any?>
        init {
            this.instance = LinkedHashMap()
        }
        override fun getInstance(): MutableMap<String, Any?> {
            return instance
        }
        override fun getBuilderAfterBar(instance: MutableMap<String, Any?>): EnumsInPropertiesMap0Builder {
            return EnumsInPropertiesMap0Builder(instance)
        }
    }
    
    
    sealed interface EnumsInProperties1Boxed {
        fun getData(): Any?
    }
    
    data class EnumsInProperties1BoxedMap(val data: EnumsInPropertiesMap) : EnumsInProperties1Boxed {
        override fun getData(): Any? {
            return data
        }
    }
    
    
    class EnumsInProperties1 private constructor(): JsonSchema<EnumsInProperties1Boxed>(
        type = setOf(Map::class.java),
        properties = mapOf(
            "foo" to Foo::class.java,
            "bar" to Bar::class.java
        ),
        required =setOf(
            "bar"
        ),
    ), MapSchemaValidator<EnumsInPropertiesMap, EnumsInProperties1BoxedMap> {
        /*
        NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
        Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
    
        Do not edit the class manually.
        */
    
        companion object {
            @Volatile
            private var instance: EnumsInProperties1? = null
    
            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: EnumsInProperties1().also { instance = it }
                }
        }
        
        override fun getNewInstance(arg: Map<*, *>, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): EnumsInPropertiesMap {
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
            return EnumsInPropertiesMap(castProperties)
        }
        
        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): EnumsInPropertiesMap {
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
        override fun validateAndBox(arg: Map<*, *>, configuration: SchemaConfiguration?): EnumsInProperties1BoxedMap {
            return EnumsInProperties1BoxedMap(validate(arg, configuration))
        }
        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): EnumsInProperties1Boxed {
            if (arg is Map<*, *>) {
                return validateAndBox(arg, configuration)
            }
            throw ValidationException("Invalid input type="+getClass(arg)+". It can't be validated by this schema")
        }
    }

}
