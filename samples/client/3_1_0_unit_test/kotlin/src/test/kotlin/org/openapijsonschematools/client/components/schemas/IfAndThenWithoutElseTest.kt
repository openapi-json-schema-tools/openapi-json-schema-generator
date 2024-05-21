package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IfAndThenWithoutElseTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testValidThroughThenPasses() {
        // valid through then
        val schema = IfAndThenWithoutElse.IfAndThenWithoutElse1.getInstance()
        schema.validate(
            -1,
            configuration
        )
    }

    @Test
    fun testInvalidThroughThenFails() {
        // invalid through then
        val schema = IfAndThenWithoutElse.IfAndThenWithoutElse1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    -100,
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidWhenIfTestFailsPasses() {
        // valid when if test fails
        val schema = IfAndThenWithoutElse.IfAndThenWithoutElse1.getInstance()
        schema.validate(
            3,
            configuration
        )
    }
}
