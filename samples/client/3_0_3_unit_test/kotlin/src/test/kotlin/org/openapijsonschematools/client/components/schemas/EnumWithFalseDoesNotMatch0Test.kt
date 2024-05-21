package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EnumWithFalseDoesNotMatch0Test {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testFloatZeroIsInvalidFails() {
        // float zero is invalid
        val schema = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    0.0,
                    configuration
                )
            }
        )
    }

    @Test
    fun testFalseIsValidPasses() {
        // false is valid
        val schema = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance()
        schema.validate(
            false,
            configuration
        )
    }

    @Test
    fun testIntegerZeroIsInvalidFails() {
        // integer zero is invalid
        val schema = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    0,
                    configuration
                )
            }
        )
    }
}
