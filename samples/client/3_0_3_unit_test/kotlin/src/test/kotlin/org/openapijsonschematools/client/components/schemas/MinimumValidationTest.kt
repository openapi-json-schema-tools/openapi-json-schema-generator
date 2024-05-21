package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MinimumValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testBoundaryPointIsValidPasses() {
        // boundary point is valid
        val schema = MinimumValidation.MinimumValidation1.getInstance()
        schema.validate(
            1.1,
            configuration
        )
    }

    @Test
    fun testBelowTheMinimumIsInvalidFails() {
        // below the minimum is invalid
        val schema = MinimumValidation.MinimumValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    0.6,
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        val schema = MinimumValidation.MinimumValidation1.getInstance()
        schema.validate(
            "x",
            configuration
        )
    }

    @Test
    fun testAboveTheMinimumIsValidPasses() {
        // above the minimum is valid
        val schema = MinimumValidation.MinimumValidation1.getInstance()
        schema.validate(
            2.6,
            configuration
        )
    }
}
