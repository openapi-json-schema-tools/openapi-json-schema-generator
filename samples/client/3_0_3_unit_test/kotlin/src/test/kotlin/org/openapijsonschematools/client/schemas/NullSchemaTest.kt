package org.openapijsonschematools.client.schemas

import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.JsonSchema
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata

import kotlin.Throws
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class NullSchemaTest {
    @Test
    @Throws(ValidationException::class)
    fun testValidateNull() {
        val validatedValue: Nothing? = nullJsonSchema.validate(null, configuration)
        assertNull(validatedValue)
    }

    @Test
    fun testExceptionThrownForInvalidType() {
        assertFailsWith<ValidationException>(
            block = {
                JsonSchema.validate(
                    nullJsonSchema,
                    true,
                    validationMetadata
                )
            }
        )
    }

    companion object {
        val configuration = SchemaConfiguration()
        val nullJsonSchema = NullJsonSchema.NullJsonSchema1.getInstance()
        val validationMetadata = ValidationMetadata(
            listOf("args[0"),
            configuration,
            PathToSchemasMap(),
            LinkedHashSet()
        )
    }
}