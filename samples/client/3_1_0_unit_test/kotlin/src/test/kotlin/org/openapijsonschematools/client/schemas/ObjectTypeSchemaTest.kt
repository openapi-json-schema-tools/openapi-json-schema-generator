package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.MapSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ObjectTypeSchemaTest {
    interface ObjectWithPropsSchemaBoxed

    data class ObjectWithPropsSchemaBoxedMap(val data: FrozenMap<Any?>) : ObjectWithPropsSchemaBoxed
    class ObjectWithPropsSchema private constructor() : JsonSchema<ObjectWithPropsSchemaBoxed>(
        JsonSchemaInfo(
            type = setOf(Map::class.java),
            properties = mapOf(
                "someString" to StringJsonSchema.StringJsonSchema1::class.java
            )
        )
    ), MapSchemaValidator<FrozenMap<Any?>, ObjectWithPropsSchemaBoxedMap> {
        override fun getNewInstance(
            arg: Map<*, *>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): FrozenMap<Any?> {
            val properties = LinkedHashMap<String, Any?>()
            for ((entryKey, value1) in arg) {
                if (entryKey !is String) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: MutableList<Any> = ArrayList(pathToItem)
                propertyPathToItem.add(entryKey)
                val value = value1!!
                val schemas = pathToSchemas[propertyPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val propertySchema = schemas.entries.iterator().next().key
                val castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas)
                properties[entryKey] = castValue
            }
            return FrozenMap(properties)
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): FrozenMap<Any?> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Map<*, *> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(
            arg: Map<*, *>,
            configuration: SchemaConfiguration?
        ): ObjectWithPropsSchemaBoxedMap {
            return ObjectWithPropsSchemaBoxedMap(validate(arg, configuration))
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ObjectWithPropsSchemaBoxed {
            if (arg is Map<*, *>) {
                return ObjectWithPropsSchemaBoxedMap(
                    validate(arg, configuration)
                )
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        companion object {
            @Volatile
            private var instance: ObjectWithPropsSchema? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ObjectWithPropsSchema().also { instance = it }
                }
        }
    }

    interface ObjectWithAddpropsSchemaBoxed

    data class ObjectWithAddpropsSchemaBoxedMap(val data: FrozenMap<String>) : ObjectWithAddpropsSchemaBoxed {}

    class ObjectWithAddpropsSchema private constructor() : JsonSchema<ObjectWithAddpropsSchemaBoxed>(
        JsonSchemaInfo(
            type = setOf(Map::class.java),
            additionalProperties = StringJsonSchema.StringJsonSchema1::class.java
        )
    ), MapSchemaValidator<FrozenMap<String>, ObjectWithAddpropsSchemaBoxedMap> {
        override fun getNewInstance(
            arg: Map<*, *>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): FrozenMap<String> {
            val properties = LinkedHashMap<String, String>()
            for ((entryKey, value1) in arg) {
                if (entryKey !is String) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: MutableList<Any> = ArrayList(pathToItem)
                propertyPathToItem.add(entryKey)
                val value = value1!!
                val schemas = pathToSchemas[propertyPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val propertySchema = schemas.entries.iterator().next().key
                val castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas) as? String
                    ?: throw RuntimeException("Invalid type for property value")
                properties[entryKey] = castValue
            }
            return FrozenMap(properties)
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): FrozenMap<String> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Map<*, *> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(
            arg: Map<*, *>,
            configuration: SchemaConfiguration?
        ): ObjectWithAddpropsSchemaBoxedMap {
            return ObjectWithAddpropsSchemaBoxedMap(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ObjectWithAddpropsSchemaBoxed {
            if (arg is Map<*, *>) {
                return ObjectWithAddpropsSchemaBoxedMap(validate(arg, configuration))
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        companion object {
            @Volatile
            private var instance: ObjectWithAddpropsSchema? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ObjectWithAddpropsSchema().also { instance = it }
                }
        }
    }

    interface ObjectWithPropsAndAddpropsSchemaBoxed

    data class ObjectWithPropsAndAddpropsSchemaBoxedMap(val data: FrozenMap<Any?>) :
        ObjectWithPropsAndAddpropsSchemaBoxed {
    }

    class ObjectWithPropsAndAddpropsSchema private constructor() : JsonSchema<ObjectWithPropsAndAddpropsSchemaBoxed>(
        JsonSchemaInfo(
            type = setOf(Map::class.java),
            properties = mapOf(
                "someString" to StringJsonSchema.StringJsonSchema1::class.java
            ),
            additionalProperties = BooleanJsonSchema.BooleanJsonSchema1::class.java
        )
    ), MapSchemaValidator<FrozenMap<Any?>, ObjectWithPropsAndAddpropsSchemaBoxedMap> {
        override fun getNewInstance(
            arg: Map<*, *>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): FrozenMap<Any?> {
            val properties = LinkedHashMap<String, Any?>()
            for ((entryKey, value1) in arg) {
                if (entryKey !is String) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: MutableList<Any> = ArrayList(pathToItem)
                propertyPathToItem.add(entryKey)
                val value = value1!!
                val schemas = pathToSchemas[propertyPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val propertySchema = schemas.entries.iterator().next().key
                val castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas)
                properties[entryKey] = castValue
            }
            return FrozenMap(properties)
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): FrozenMap<Any?> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Map<*, *> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(
            arg: Map<*, *>,
            configuration: SchemaConfiguration?
        ): ObjectWithPropsAndAddpropsSchemaBoxedMap {
            return ObjectWithPropsAndAddpropsSchemaBoxedMap(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(
            arg: Any?,
            configuration: SchemaConfiguration?
        ): ObjectWithPropsAndAddpropsSchemaBoxed {
            if (arg is Map<*, *>) {
                return ObjectWithPropsAndAddpropsSchemaBoxedMap(validate(arg, configuration))
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is Map<*, *>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        companion object {
            @Volatile
            private var instance: ObjectWithPropsAndAddpropsSchema? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ObjectWithPropsAndAddpropsSchema().also { instance = it }
                }
        }
    }

    class ObjectWithOutputTypeSchemaMap(m: FrozenMap<Any?>) : FrozenMap<Any?>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: Map<String, Any?>, configuration: SchemaConfiguration?): ObjectWithOutputTypeSchemaMap {
                return ObjectWithOutputTypeSchema.getInstance().validate(arg, configuration)
            }
        }
    }

    interface ObjectWithOutputTypeSchemaBoxed

    data class ObjectWithOutputTypeSchemaBoxedMap(val data: ObjectWithOutputTypeSchemaMap) :
        ObjectWithOutputTypeSchemaBoxed {
    }

    class ObjectWithOutputTypeSchema : JsonSchema<ObjectWithOutputTypeSchemaBoxed?>(
        JsonSchemaInfo(
            type = setOf(Map::class.java),
            properties = mapOf(
                "someString" to StringJsonSchema.StringJsonSchema1::class.java
            )
        )
    ), MapSchemaValidator<ObjectWithOutputTypeSchemaMap?, ObjectWithOutputTypeSchemaBoxedMap?> {
        override fun getNewInstance(
            arg: Map<*, *>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): ObjectWithOutputTypeSchemaMap {
            val properties = LinkedHashMap<String, Any?>()
            for ((entryKey, value1) in arg) {
                if (entryKey !is String) {
                    throw RuntimeException("Invalid non-string key value")
                }
                val propertyPathToItem: MutableList<Any> = ArrayList(pathToItem)
                propertyPathToItem.add(entryKey)
                val value = value1!!
                val schemas = pathToSchemas[propertyPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val propertySchema = schemas.entries.iterator().next().key
                val castValue = propertySchema.getNewInstance(value, propertyPathToItem, pathToSchemas)
                properties[entryKey] = castValue
            }
            return ObjectWithOutputTypeSchemaMap(FrozenMap(properties))
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Map<*, *>, configuration: SchemaConfiguration?): ObjectWithOutputTypeSchemaMap {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: Map<*, *> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(
            arg: Map<*, *>,
            configuration: SchemaConfiguration?
        ): ObjectWithOutputTypeSchemaBoxedMap {
            return ObjectWithOutputTypeSchemaBoxedMap(validate(arg, configuration))
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is Map<*, *>) {
                return validate(arg, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ObjectWithOutputTypeSchemaBoxed {
            if (arg is Map<*, *>) {
                return ObjectWithOutputTypeSchemaBoxedMap(validate(arg, configuration))
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is FrozenMap<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        companion object {
            @Volatile
            private var instance: ObjectWithOutputTypeSchema? = null

            fun getInstance() =
                instance ?: synchronized(this) {
                    instance ?: ObjectWithOutputTypeSchema().also { instance = it }
                }
        }
    }

    @Test
    fun testExceptionThrownForInvalidType() {
        val schema = ObjectWithPropsSchema.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    schema,
                    null,
                    validationMetadata
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateObjectWithPropsSchema() {
        val schema = ObjectWithPropsSchema.getInstance()

        // map with only property works
        var inMap: Map<String, Any?> = mapOf("someString" to "abc")
        var validatedValue = schema.validate(inMap, configuration)
        var outMap: Map<String, Any?> = mapOf("someString" to "abc")
        assertEquals(validatedValue, outMap)

        // map with additional unvalidated property works
        inMap = mapOf(
            "someString" to "abc",
            "someOtherString" to "def"
        )
        validatedValue = schema.validate(inMap, configuration)
        val outMap1: Map<String, Any?> = mapOf(
            "someString" to "abc",
            "someOtherString" to "def"
        )
        assertEquals(validatedValue, outMap1)

        // invalid prop type fails
        val invalidMap = mapOf("someString" to 1)
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    invalidMap, configuration
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateObjectWithAddpropsSchema() {
        val schema = ObjectWithAddpropsSchema.getInstance()

        // map with only property works
        var inMap: MutableMap<String?, String?> = LinkedHashMap()
        inMap["someString"] = "abc"
        var validatedValue = schema.validate(inMap, configuration)
        var outMap: Map<String, String> = mapOf("someString" to "abc")
        assertEquals(validatedValue, outMap)

        // map with additional properties works
        inMap = LinkedHashMap()
        inMap["someString"] = "abc"
        inMap["someOtherString"] = "def"
        validatedValue = schema.validate(inMap, configuration)
        outMap = mapOf(
            "someString" to "abc",
            "someOtherString" to "def"
        )
        assertEquals(validatedValue, outMap)

        // invalid addProp type fails
        val invalidInput = java.util.Map.of("someString", 1)
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    schema,
                    invalidInput,
                    validationMetadata
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateObjectWithPropsAndAddpropsSchema() {
        val schema = ObjectWithPropsAndAddpropsSchema.getInstance()

        // map with only property works
        var inMap: Map<String, Any?> = mapOf("someString" to "abc")
        var validatedValue: Map<String, Any?> = schema.validate(inMap, configuration)
        var outMap: Map<String, Any?> = mapOf("someString" to "abc")
        assertEquals(validatedValue, outMap)

        // map with additional properties works
        inMap = mapOf(
            "someString" to "abc",
            "someAddProp" to true
        )
        validatedValue = schema.validate(inMap, configuration)
        val outMap1: Map<String, Any?> = mapOf(
            "someString" to "abc",
            "someAddProp" to true
        )
        assertEquals(validatedValue, outMap1)

        // invalid prop type fails
        inMap = mapOf("someString" to 1)
        val invalidPropMap: Map<String, Any?> = inMap
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    invalidPropMap, configuration
                )
            }
        )

        // invalid addProp type fails
        inMap = LinkedHashMap()
        inMap["someAddProp"] = 1
        val invalidAddpropMap: Map<String, Any?> = inMap
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    invalidAddpropMap, configuration
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateObjectWithOutputTypeSchema() {
        val schema = ObjectWithOutputTypeSchema.getInstance()

        // map with only property works
        var inMap: Map<String, Any?> = mapOf("someString" to "abc")
        var validatedValue = schema.validate(inMap, configuration)
        var outMap: Map<String, Any?> = mapOf("someString" to "abc")
        assertEquals(validatedValue, outMap)

        // map with additional unvalidated property works
        inMap = mapOf(
            "someString" to "abc",
            "someOtherString" to "def",
        )
        validatedValue = schema.validate(inMap, configuration)
        val outMap1: Map<String, Any?> = mapOf(
            "someString" to "abc",
            "someOtherString" to "def",
        )
        assertEquals(validatedValue, outMap1)

        // invalid prop type fails
        val invalidInMap = mapOf("someString" to 1)
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    invalidInMap, configuration
                )
            }
        )

        // using output class directly works
        inMap = mapOf("someString" to "abc")
        validatedValue = ObjectWithOutputTypeSchemaMap.of(inMap, configuration)
        val outMap2: Map<String, Any?>  = mapOf("someString" to "abc")
        assertEquals(validatedValue, outMap2)
    }

    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}