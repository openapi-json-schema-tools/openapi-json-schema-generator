package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IntegerTypeMatchesIntegersTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAnObjectIsNotAnIntegerFails() {
        // an object is not an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
    fun testAnArrayIsNotAnIntegerFails() {
        // an array is not an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
    fun testNullIsNotAnIntegerFails() {
        // null is not an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
    fun testAFloatWithZeroFractionalPartIsAnIntegerPasses() {
        // a float with zero fractional part is an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
        schema.validate(
            1.0,
            configuration
        )
    }

    @Test
    fun testABooleanIsNotAnIntegerFails() {
        // a boolean is not an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
    fun testAStringIsStillNotAnIntegerEvenIfItLooksLikeOneFails() {
        // a string is still not an integer, even if it looks like one
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
    fun testAStringIsNotAnIntegerFails() {
        // a string is not an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
    fun testAnIntegerIsAnIntegerPasses() {
        // an integer is an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }

    @Test
    fun testAFloatIsNotAnIntegerFails() {
        // a float is not an integer
        val schema = IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1.getInstance()
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
