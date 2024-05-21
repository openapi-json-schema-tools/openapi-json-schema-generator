package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MaxpropertiesValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testShorterIsValidPasses() {
        // shorter is valid
        val schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
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
    fun testExactLengthIsValidPasses() {
        // exact length is valid
        val schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
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
    fun testTooLongIsInvalidFails() {
        // too long is invalid
        val schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            1
                        ),
                        Pair(
                            "bar",
                            2
                        ),
                        Pair(
                            "baz",
                            3
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                2,
                3
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = MaxpropertiesValidation.MaxpropertiesValidation1.getInstance()
        schema.validate(
            "foobar",
            configuration
        )
    }
}
