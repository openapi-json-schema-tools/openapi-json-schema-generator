package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ExclusiveminimumValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testBelowTheExclusiveminimumIsInvalidFails() {
        // below the exclusiveMinimum is invalid
        val schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance()
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
    fun testAboveTheExclusiveminimumIsValidPasses() {
        // above the exclusiveMinimum is valid
        val schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance()
        schema.validate(
            1.2,
            configuration
        )
    }

    @Test
    fun testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        val schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance()
        schema.validate(
            "x",
            configuration
        )
    }

    @Test
    fun testBoundaryPointIsInvalidFails() {
        // boundary point is invalid
        val schema = ExclusiveminimumValidation.ExclusiveminimumValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.1,
                    configuration
                )
            }
        )
    }
}
