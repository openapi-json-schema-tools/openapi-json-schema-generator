package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MinlengthValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testExactLengthIsValidPasses() {
        // exact length is valid
        val schema = MinlengthValidation.MinlengthValidation1.getInstance()
        schema.validate(
            "fo",
            configuration
        )
    }

    @Test
    fun testLongerIsValidPasses() {
        // longer is valid
        val schema = MinlengthValidation.MinlengthValidation1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }

    @Test
    fun testIgnoresNonStringsPasses() {
        // ignores non-strings
        val schema = MinlengthValidation.MinlengthValidation1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }

    @Test
    fun testTooShortIsInvalidFails() {
        // too short is invalid
        val schema = MinlengthValidation.MinlengthValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "f",
                    configuration
                )
            }
        )
    }

    @Test
    fun testOneSupplementaryUnicodeCodePointIsNotLongEnoughFails() {
        // one supplementary Unicode code point is not long enough
        val schema = MinlengthValidation.MinlengthValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "💩",
                    configuration
                )
            }
        )
    }
}
