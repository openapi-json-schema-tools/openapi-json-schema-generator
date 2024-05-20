package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MaximumValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        val schema = MaximumValidation.MaximumValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    3.5,
                    configuration
                )
            }
        )
    }

    @Test
    fun testBoundaryPointIsValidPasses() {
        // boundary point is valid
        val schema = MaximumValidation.MaximumValidation1.getInstance()
        schema.validate(
            3.0,
            configuration
        )
    }

    @Test
    fun testBelowTheMaximumIsValidPasses() {
        // below the maximum is valid
        val schema = MaximumValidation.MaximumValidation1.getInstance()
        schema.validate(
            2.6,
            configuration
        )
    }

    @Test
    fun testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        val schema = MaximumValidation.MaximumValidation1.getInstance()
        schema.validate(
            "x",
            configuration
        )
    }
}
