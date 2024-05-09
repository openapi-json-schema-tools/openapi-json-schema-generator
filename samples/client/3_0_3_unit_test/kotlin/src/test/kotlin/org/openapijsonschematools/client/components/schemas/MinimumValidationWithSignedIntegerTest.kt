package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MinimumValidationWithSignedIntegerTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testBoundaryPointWithFloatIsValidPasses() {
        // boundary point with float is valid
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        schema.validate(
            -2.0,
            configuration
        )
    }

    @Test
    fun testBoundaryPointIsValidPasses() {
        // boundary point is valid
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        schema.validate(
            -2,
            configuration
        )
    }

    @Test
    fun testIntBelowTheMinimumIsInvalidFails() {
        // int below the minimum is invalid
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    -3,
                    configuration
                )
            }
        )
    }

    @Test
    fun testPositiveAboveTheMinimumIsValidPasses() {
        // positive above the minimum is valid
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        schema.validate(
            0,
            configuration
        )
    }

    @Test
    fun testNegativeAboveTheMinimumIsValidPasses() {
        // negative above the minimum is valid
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        schema.validate(
            -1,
            configuration
        )
    }

    @Test
    fun testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        schema.validate(
            "x",
            configuration
        )
    }

    @Test
    fun testFloatBelowTheMinimumIsInvalidFails() {
        // float below the minimum is invalid
        val schema = MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    -2.0001,
                    configuration
                )
            }
        )
    }
}
