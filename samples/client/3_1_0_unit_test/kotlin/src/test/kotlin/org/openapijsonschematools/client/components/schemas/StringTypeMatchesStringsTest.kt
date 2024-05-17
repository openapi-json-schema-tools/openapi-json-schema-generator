package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class StringTypeMatchesStringsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAStringIsStillAStringEvenIfItLooksLikeANumberPasses() {
        // a string is still a string, even if it looks like a number
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
        schema.validate(
            "1",
            configuration
        )
    }

    @Test
    fun test1IsNotAStringFails() {
        // 1 is not a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1,
                    configuration
                )
            }
        )
    }

    @Test
    fun testABooleanIsNotAStringFails() {
        // a boolean is not a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
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
    fun testAnEmptyStringIsStillAStringPasses() {
        // an empty string is still a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
        schema.validate(
            "",
            configuration
        )
    }

    @Test
    fun testAnArrayIsNotAStringFails() {
        // an array is not a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
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
    fun testAnObjectIsNotAStringFails() {
        // an object is not a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
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
    fun testNullIsNotAStringFails() {
        // null is not a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
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
    fun testAStringIsAStringPasses() {
        // a string is a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }

    @Test
    fun testAFloatIsNotAStringFails() {
        // a float is not a string
        val schema = StringTypeMatchesStrings.StringTypeMatchesStrings1.getInstance()
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
