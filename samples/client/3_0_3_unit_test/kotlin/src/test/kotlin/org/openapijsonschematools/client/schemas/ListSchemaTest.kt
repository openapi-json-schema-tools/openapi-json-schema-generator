package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ListSchemaTest {
    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    listJsonSchema,
                    null,
                    validationMetadata
                )
            }
        )
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateList() {
        val inList: MutableList<Any?> = ArrayList()
        inList.add("today")
        val validatedValue = listJsonSchema.validate(inList, configuration)
        val outList: List<Any?> = listOf("today")
        assertEquals(validatedValue, outList)
    }

    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
        val listJsonSchema = ListJsonSchema.ListJsonSchema1.getInstance()
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}