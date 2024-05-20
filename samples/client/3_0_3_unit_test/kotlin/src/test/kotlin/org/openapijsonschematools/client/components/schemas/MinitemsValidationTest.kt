package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MinitemsValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testExactLengthIsValidPasses() {
        // exact length is valid
        val schema = MinitemsValidation.MinitemsValidation1.getInstance()
        schema.validate(
            listOf(
                1
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresNonArraysPasses() {
        // ignores non-arrays
        val schema = MinitemsValidation.MinitemsValidation1.getInstance()
        schema.validate(
            "",
            configuration
        )
    }

    @Test
    fun testLongerIsValidPasses() {
        // longer is valid
        val schema = MinitemsValidation.MinitemsValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                2
            ),
            configuration
        )
    }

    @Test
    fun testTooShortIsInvalidFails() {
        // too short is invalid
        val schema = MinitemsValidation.MinitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf<Any?>(
                    ),
                    configuration
                )
            }
        )
    }
}
