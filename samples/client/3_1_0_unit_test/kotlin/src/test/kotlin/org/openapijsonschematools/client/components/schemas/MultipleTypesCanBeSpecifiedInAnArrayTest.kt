package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MultipleTypesCanBeSpecifiedInAnArrayTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testNullIsInvalidFails() {
        // null is invalid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
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
    fun testAnIntegerIsValidPasses() {
        // an integer is valid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }

    @Test
    fun testAnArrayIsInvalidFails() {
        // an array is invalid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
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
    fun testABooleanIsInvalidFails() {
        // a boolean is invalid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
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
    fun testAFloatIsInvalidFails() {
        // a float is invalid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
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
    fun testAStringIsValidPasses() {
        // a string is valid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }

    @Test
    fun testAnObjectIsInvalidFails() {
        // an object is invalid
        val schema = MultipleTypesCanBeSpecifiedInAnArray.MultipleTypesCanBeSpecifiedInAnArray1.getInstance()
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
