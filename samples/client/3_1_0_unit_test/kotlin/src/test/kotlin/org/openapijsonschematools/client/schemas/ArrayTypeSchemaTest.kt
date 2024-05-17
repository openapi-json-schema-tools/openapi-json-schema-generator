package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.JsonSchemaInfo
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ListSchemaValidator
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ArrayTypeSchemaTest {
    sealed interface ArrayWithItemsSchemaBoxed

    data class ArrayWithItemsSchemaBoxedList(val data: FrozenList<String>) : ArrayWithItemsSchemaBoxed
    class ArrayWithItemsSchema : JsonSchema<ArrayWithItemsSchemaBoxed>(
        JsonSchemaInfo()
            .type(setOf(List::class.java))
            .items(StringJsonSchema.StringJsonSchema1::class.java)
    ), ListSchemaValidator<FrozenList<String>, ArrayWithItemsSchemaBoxedList> {
        override fun getNewInstance(
            arg: List<*>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): FrozenList<String> {
            val items: MutableList<String> = ArrayList()
            var i = 0
            for (item in arg) {
                val itemPathToItem: MutableList<Any> = ArrayList(pathToItem)
                itemPathToItem.add(i)
                val schemas = pathToSchemas[itemPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val itemSchema = schemas.entries.iterator().next().key
                val castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas) as? String
                    ?: throw RuntimeException("Instantiated type of item is invalid")
                items.add(castItem)
                i += 1
            }
            return FrozenList(items)
        }

        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): FrozenList<String> {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: List<*> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: List<*>, configuration: SchemaConfiguration?): ArrayWithItemsSchemaBoxedList {
            return ArrayWithItemsSchemaBoxedList(validate(arg, configuration))
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg as List<*>?, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ArrayWithItemsSchemaBoxed {
            if (arg is List<*>) {
                return ArrayWithItemsSchemaBoxedList(validate(arg, configuration))
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }
    }

    class ArrayWithOutputClsSchemaList(m: FrozenList<String>) : FrozenList<String?>(m) {
        companion object {
            @Throws(ValidationException::class)
            fun of(arg: List<String>, configuration: SchemaConfiguration?): ArrayWithOutputClsSchemaList {
                return ArrayWithOutputClsSchema().validate(arg, configuration)
            }
        }
    }

    interface ArrayWithOutputClsSchemaBoxed

    data class ArrayWithOutputClsSchemaBoxedList(val data: ArrayWithOutputClsSchemaList) :
        ArrayWithOutputClsSchemaBoxed

    class ArrayWithOutputClsSchema : JsonSchema<ArrayWithOutputClsSchemaBoxed>(
        JsonSchemaInfo()
            .type(setOf(List::class.java))
            .items(StringJsonSchema.StringJsonSchema1::class.java)
    ), ListSchemaValidator<ArrayWithOutputClsSchemaList, ArrayWithOutputClsSchemaBoxedList> {
        override fun getNewInstance(
            arg: List<*>,
            pathToItem: List<Any>,
            pathToSchemas: PathToSchemasMap
        ): ArrayWithOutputClsSchemaList {
            val items: MutableList<String> = ArrayList()
            var i = 0
            for (item in arg) {
                val itemPathToItem: MutableList<Any> = ArrayList(pathToItem)
                itemPathToItem.add(i)
                val schemas = pathToSchemas[itemPathToItem]
                    ?: throw RuntimeException("Validation result is invalid, schemas must exist for a pathToItem")
                val itemSchema = schemas.entries.iterator().next().key
                val castItem = itemSchema.getNewInstance(item, itemPathToItem, pathToSchemas) as? String
                    ?: throw RuntimeException("Instantiated type of item is invalid")
                items.add(castItem)
                i += 1
            }
            val newInstanceItems = FrozenList(items)
            return ArrayWithOutputClsSchemaList(newInstanceItems)
        }

        @Throws(ValidationException::class)
        override fun validate(arg: List<*>, configuration: SchemaConfiguration?): ArrayWithOutputClsSchemaList {
            val pathSet: MutableSet<List<Any>> = HashSet()
            val pathToItem = listOf<Any>("args[0")
            val castArg: List<*> = castToAllowedTypes(arg, pathToItem, pathSet)
            val usedConfiguration = configuration ?: SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
            val validationMetadata =
                ValidationMetadata(pathToItem, usedConfiguration, PathToSchemasMap(), LinkedHashSet())
            val pathToSchemasMap = getPathToSchemas(this, castArg, validationMetadata, pathSet)
            return getNewInstance(castArg, validationMetadata.pathToItem, pathToSchemasMap)
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(
            arg: List<*>,
            configuration: SchemaConfiguration?
        ): ArrayWithOutputClsSchemaBoxedList {
            return ArrayWithOutputClsSchemaBoxedList(validate(arg, configuration))
        }

        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is List<*>) {
                return getNewInstance(arg, pathToItem, pathToSchemas)
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is List<*>) {
                return validate(arg as List<*>?, configuration)
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): ArrayWithOutputClsSchemaBoxed {
            if (arg is List<*>) {
                return ArrayWithOutputClsSchemaBoxedList(validate(arg, configuration))
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }
    }

    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    ArrayWithItemsSchema(),
                    null,
                    validationMetadata
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateArrayWithItemsSchema() {
        // list with only item works
        var inList: List<String> = listOf("abc")
        var validatedValue: FrozenList<String> = ArrayWithItemsSchema().validate(inList, configuration)
        var outList: List<Any?> = listOf("abc")
        assertEquals(validatedValue, outList)

        // list with no items works
        inList = listOf()
        validatedValue = ArrayWithItemsSchema().validate(inList, configuration)
        outList = listOf()
        assertEquals(validatedValue, outList)

        // invalid item type fails
        val intList = listOf(1)
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    ArrayWithItemsSchema(),
                    intList,
                    validationMetadata
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateArrayWithOutputClsSchema() {
        // list with only item works
        var inList: List<String> = listOf("abc")
        var validatedValue = ArrayWithOutputClsSchema().validate(inList, configuration)
        var outList: List<Any?> = listOf("abc")
        assertEquals(validatedValue, outList)

        // list with no items works
        inList = listOf()
        validatedValue = ArrayWithOutputClsSchema().validate(inList, configuration)
        outList = listOf()
        assertEquals(validatedValue, outList)

        // invalid item type fails
        val intList = listOf(1)
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    ArrayWithOutputClsSchema(),
                    intList,
                    validationMetadata
                )
            }
        )
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