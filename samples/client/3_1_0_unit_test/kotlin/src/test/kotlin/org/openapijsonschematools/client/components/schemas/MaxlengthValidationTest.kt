package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MaxlengthValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testShorterIsValidPasses() {
        // shorter is valid
        val schema = MaxlengthValidation.MaxlengthValidation1.getInstance()
        schema.validate(
            "f",
            configuration
        )
    }

    @Test
    fun testExactLengthIsValidPasses() {
        // exact length is valid
        val schema = MaxlengthValidation.MaxlengthValidation1.getInstance()
        schema.validate(
            "fo",
            configuration
        )
    }

    @Test
    fun testTooLongIsInvalidFails() {
        // too long is invalid
        val schema = MaxlengthValidation.MaxlengthValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "foo",
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresNonStringsPasses() {
        // ignores non-strings
        val schema = MaxlengthValidation.MaxlengthValidation1.getInstance()
        schema.validate(
            100,
            configuration
        )
    }

    @Test
    fun testTwoSupplementaryUnicodeCodePointsIsLongEnoughPasses() {
        // two supplementary Unicode code points is long enough
        val schema = MaxlengthValidation.MaxlengthValidation1.getInstance()
        schema.validate(
            "💩💩",
            configuration
        )
    }
}
