package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class FloatDivisionInfTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAlwaysInvalidButNaiveImplementationsMayRaiseAnOverflowErrorFails() {
        // always invalid, but naive implementations may raise an overflow error
        val schema = FloatDivisionInf.FloatDivisionInf1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.0E308,
                    configuration
                )
            }
        )
    }
}
