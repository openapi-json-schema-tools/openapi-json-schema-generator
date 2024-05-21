package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BooleanSchemaTest {
    @Test
    @Throws(ValidationException::class)
    fun testValidateTrue() {
        val validatedValue = booleanJsonSchema.validate(true, configuration)
        assertTrue(validatedValue)
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateFalse() {
        val validatedValue = booleanJsonSchema.validate(false, configuration)
        assertFalse(validatedValue)
    }

    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    booleanJsonSchema,
                    null,
                    validationMetadata
                )
            }
        )
    }

    companion object {
        val configuration = SchemaConfiguration()
        val booleanJsonSchema = BooleanJsonSchema.BooleanJsonSchema1.getInstance()
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}