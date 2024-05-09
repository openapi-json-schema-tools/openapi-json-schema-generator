package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MinpropertiesValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testExactLengthIsValidPasses() {
        // exact length is valid
        val schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testLongerIsValidPasses() {
        // longer is valid
        val schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                ),
                Pair(
                    "bar",
                    2
                )
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testTooShortIsInvalidFails() {
        // too short is invalid
        val schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf<Any?, Any?>(
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = MinpropertiesValidation.MinpropertiesValidation1.getInstance()
        schema.validate(
            "",
            configuration
        )
    }
}
