package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertEquals

class JsonSchemaTest {
    internal sealed interface SomeSchemaBoxed
    internal class SomeSchemaBoxedString : SomeSchemaBoxed
    internal class SomeSchema private constructor() : JsonSchema<SomeSchemaBoxed>(
        type = setOf(String::class.java)
    ) {
        override fun getNewInstance(arg: Any?, pathToItem: List<Any>, pathToSchemas: PathToSchemasMap): Any? {
            if (arg is String) {
                return arg
            }
            throw RuntimeException("Invalid input type=$javaClass. It can't be instantiated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validate(arg: Any?, configuration: SchemaConfiguration?): Any? {
            if (arg is String) {
                return arg
            }
            throw ValidationException("Invalid input type=$javaClass. It can't be validated by this schema")
        }

        @Throws(ValidationException::class)
        override fun validateAndBox(arg: Any?, configuration: SchemaConfiguration?): SomeSchemaBoxed {
            return SomeSchemaBoxedString()
        }

        companion object {
            var instance: SomeSchema? = null
                get() {
                    if (field == null) {
                        field = SomeSchema()
                    }
                    return field
                }
                private set
        }
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateSucceeds() {
        val pathToItem = listOf<Any>("args[0]")
        val validationMetadata = ValidationMetadata(
            pathToItem,
            SchemaConfiguration(),
            PathToSchemasMap(),
            LinkedHashSet()
        )
        val schema = JsonSchemaFactory.getInstance(SomeSchema::class.java)
        val pathToSchemas = JsonSchema.validate(
            schema,
            "hi",
            validationMetadata
        )
        val expectedPathToSchemas = PathToSchemasMap()
        val validatedClasses = LinkedHashMap<JsonSchema<*>, Nothing?>()
        validatedClasses[schema] = null
        expectedPathToSchemas[pathToItem] = validatedClasses
        assertEquals(pathToSchemas, expectedPathToSchemas)
    }
}