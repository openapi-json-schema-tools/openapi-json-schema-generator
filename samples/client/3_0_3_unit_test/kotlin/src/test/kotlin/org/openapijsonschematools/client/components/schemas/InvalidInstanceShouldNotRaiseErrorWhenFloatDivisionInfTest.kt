package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInfTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAlwaysInvalidButNaiveImplementationsMayRaiseAnOverflowErrorFails() {
        // always invalid, but naive implementations may raise an overflow error
        val schema = InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.0E308,
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidIntegerWithMultipleofFloatPasses() {
        // valid integer with multipleOf float
        val schema = InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.getInstance()
        schema.validate(
            123456789,
            configuration
        )
    }
}
