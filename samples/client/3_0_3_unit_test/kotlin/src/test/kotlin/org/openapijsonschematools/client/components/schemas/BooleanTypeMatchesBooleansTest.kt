package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class BooleanTypeMatchesBooleansTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAFloatIsNotABooleanFails() {
        // a float is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
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
    fun testAStringIsNotABooleanFails() {
        // a string is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
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
    fun testFalseIsABooleanPasses() {
        // false is a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
        schema.validate(
            false,
            configuration
        )
    }

    @Test
    fun testTrueIsABooleanPasses() {
        // true is a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
        schema.validate(
            true,
            configuration
        )
    }

    @Test
    fun testAnObjectIsNotABooleanFails() {
        // an object is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
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
    fun testAnArrayIsNotABooleanFails() {
        // an array is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
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
    fun testNullIsNotABooleanFails() {
        // null is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
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
    fun testAnIntegerIsNotABooleanFails() {
        // an integer is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
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
    fun testZeroIsNotABooleanFails() {
        // zero is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    0,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAnEmptyStringIsNotABooleanFails() {
        // an empty string is not a boolean
        val schema = BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "",
                    configuration
                )
            }
        )
    }
}
