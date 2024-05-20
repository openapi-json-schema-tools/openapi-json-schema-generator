package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ArrayTypeMatchesArraysTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testABooleanIsNotAnArrayFails() {
        // a boolean is not an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
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
    fun testAFloatIsNotAnArrayFails() {
        // a float is not an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.1,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAnArrayIsAnArrayPasses() {
        // an array is an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
        schema.validate(
            ArrayTypeMatchesArrays.ArrayTypeMatchesArraysListBuilder()
            .build(),
            configuration
        )
    }

    @Test
    fun testNullIsNotAnArrayFails() {
        // null is not an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
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
    fun testAStringIsNotAnArrayFails() {
        // a string is not an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
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
    fun testAnIntegerIsNotAnArrayFails() {
        // an integer is not an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
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
    fun testAnObjectIsNotAnArrayFails() {
        // an object is not an array
        val schema = ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1.getInstance()
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
