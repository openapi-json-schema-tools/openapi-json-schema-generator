package org.openapijsonschematools.client.schemas.validation

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.StringJsonSchema

import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class TypeValidatorTest {
    @Test
    @Throws(ValidationException::class)
    fun testValidateSucceeds() {
        val validator = TypeValidator()
        val validationMetadata = ValidationMetadata(
            ArrayList(),
            SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build()),
            PathToSchemasMap(),
            LinkedHashSet()
        )
        val pathToSchemasMap = validator.validate(
            ValidationData(
                StringJsonSchema.StringJsonSchema1.getInstance(),
                "hi",
                validationMetadata
            )
        )
        assertNull(pathToSchemasMap)
    }

    @Test
    fun testValidateFailsIntIsNotString() {
        val validator = TypeValidator()
        val validationMetadata = ValidationMetadata(
            ArrayList(),
            SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build()),
            PathToSchemasMap(),
            LinkedHashSet()
        )
        assertFailsWith<ValidationException>(
            block = {
                validator.validate(
                    ValidationData(
                        StringJsonSchema.StringJsonSchema1.getInstance(),
                        1,
                        validationMetadata
                    )
                )
            }
        )
    }
}