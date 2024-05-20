package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RefBooleanSchemaTest {
    class RefBooleanSchema {
        class RefBooleanSchema1 : BooleanJsonSchema.BooleanJsonSchema1() {
            companion object {
                @Volatile
                private var instance: RefBooleanSchema1? = null

                fun getInstance() =
                    instance ?: synchronized(this) {
                        instance ?: RefBooleanSchema1().also { instance = it }
                    }
            }
        }
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateTrue() {
        val validatedValue = refBooleanJsonSchema.validate(true, configuration)
        assertEquals(validatedValue, true)
    }

    @Test
    @Throws(ValidationException::class)
    fun testValidateFalse() {
        val validatedValue = refBooleanJsonSchema.validate(false, configuration)
        assertEquals(validatedValue, false)
    }

    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    refBooleanJsonSchema,
                    null,
                    validationMetadata
                )
            }
        )
    }

    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())
        val refBooleanJsonSchema = JsonSchemaFactory.getInstance(RefBooleanSchema.RefBooleanSchema1::class.java)
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}