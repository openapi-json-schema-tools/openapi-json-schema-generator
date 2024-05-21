package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NumberTypeMatchesNumbersTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAFloatIsANumberPasses() {
        // a float is a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        schema.validate(
            1.1,
            configuration
        )
    }

    @Test
    fun testAnIntegerIsANumberPasses() {
        // an integer is a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }

    @Test
    fun testAStringIsStillNotANumberEvenIfItLooksLikeOneFails() {
        // a string is still not a number, even if it looks like one
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "1",
                    configuration
                )
            }
        )
    }

    @Test
    fun testABooleanIsNotANumberFails() {
        // a boolean is not a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    true,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAFloatWithZeroFractionalPartIsANumberAndAnIntegerPasses() {
        // a float with zero fractional part is a number (and an integer)
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        schema.validate(
            1.0,
            configuration
        )
    }

    @Test
    fun testNullIsNotANumberFails() {
        // null is not a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    null,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAStringIsNotANumberFails() {
        // a string is not a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
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
    fun testAnArrayIsNotANumberFails() {
        // an array is not a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf<Any?>(
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testAnObjectIsNotANumberFails() {
        // an object is not a number
        val schema = NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.getInstance()
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
}
