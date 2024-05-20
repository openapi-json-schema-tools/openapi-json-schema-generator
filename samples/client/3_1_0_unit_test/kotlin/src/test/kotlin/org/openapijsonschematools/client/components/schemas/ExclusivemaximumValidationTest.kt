package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ExclusivemaximumValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testBelowTheExclusivemaximumIsValidPasses() {
        // below the exclusiveMaximum is valid
        val schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance()
        schema.validate(
            2.2,
            configuration
        )
    }

    @Test
    fun testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        val schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance()
        schema.validate(
            "x",
            configuration
        )
    }

    @Test
    fun testAboveTheExclusivemaximumIsInvalidFails() {
        // above the exclusiveMaximum is invalid
        val schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance()
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
    fun testBoundaryPointIsInvalidFails() {
        // boundary point is invalid
        val schema = ExclusivemaximumValidation.ExclusivemaximumValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    3.0,
                    configuration
                )
            }
        )
    }
}
