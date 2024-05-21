package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MaxitemsValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testShorterIsValidPasses() {
        // shorter is valid
        val schema = MaxitemsValidation.MaxitemsValidation1.getInstance()
        schema.validate(
            listOf(
                1
            ),
            configuration
        )
    }

    @Test
    fun testExactLengthIsValidPasses() {
        // exact length is valid
        val schema = MaxitemsValidation.MaxitemsValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                2
            ),
            configuration
        )
    }

    @Test
    fun testTooLongIsInvalidFails() {
        // too long is invalid
        val schema = MaxitemsValidation.MaxitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        1,
                        2,
                        3
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresNonArraysPasses() {
        // ignores non-arrays
        val schema = MaxitemsValidation.MaxitemsValidation1.getInstance()
        schema.validate(
            "foobar",
            configuration
        )
    }
}
