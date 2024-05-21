package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EnumWithTrueDoesNotMatch1Test {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testFloatOneIsInvalidFails() {
        // float one is invalid
        val schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.0,
                    configuration
                )
            }
        )
    }

    @Test
    fun testIntegerOneIsInvalidFails() {
        // integer one is invalid
        val schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance()
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
    fun testTrueIsValidPasses() {
        // true is valid
        val schema = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.getInstance()
        schema.validate(
            true,
            configuration
        )
    }
}
