package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class NumberSchemaTest {
    @Test
    @Throws(ValidationException::class)
    fun testValidateInteger() {
        val validatedValue = numberJsonSchema.validate(1, configuration)
        assertEquals(validatedValue.toLong(), 1)
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateLong() {
        val validatedValue = numberJsonSchema.validate(1L, configuration)
        assertEquals(validatedValue, 1L)
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateFloat() {
        val validatedValue = numberJsonSchema.validate(3.14f, configuration)
        assertEquals(validatedValue.compareTo(3.14f).toLong(), 0)
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateDouble() {
        val validatedValue = numberJsonSchema.validate(3.14, configuration)
        assertEquals(validatedValue.compareTo(3.14).toLong(), 0)
    }

    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    numberJsonSchema,
                    null,
                    validationMetadata
                )
            }
        )
    }

    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
        val numberJsonSchema = NumberJsonSchema.NumberJsonSchema1.getInstance()
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}