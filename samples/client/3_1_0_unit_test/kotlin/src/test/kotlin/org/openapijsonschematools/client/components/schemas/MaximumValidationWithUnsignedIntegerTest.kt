package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MaximumValidationWithUnsignedIntegerTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAboveTheMaximumIsInvalidFails() {
        // above the maximum is invalid
        val schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    300.5,
                    configuration
                )
            }
        )
    }

    @Test
    fun testBelowTheMaximumIsInvalidPasses() {
        // below the maximum is invalid
        val schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance()
        schema.validate(
            299.97,
            configuration
        )
    }

    @Test
    fun testBoundaryPointIntegerIsValidPasses() {
        // boundary point integer is valid
        val schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance()
        schema.validate(
            300,
            configuration
        )
    }

    @Test
    fun testBoundaryPointFloatIsValidPasses() {
        // boundary point float is valid
        val schema = MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1.getInstance()
        schema.validate(
            300.0,
            configuration
        )
    }
}
