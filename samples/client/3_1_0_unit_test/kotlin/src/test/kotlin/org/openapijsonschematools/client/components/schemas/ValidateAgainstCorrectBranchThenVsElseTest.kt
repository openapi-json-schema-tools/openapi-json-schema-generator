package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ValidateAgainstCorrectBranchThenVsElseTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testValidThroughThenPasses() {
        // valid through then
        val schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance()
        schema.validate(
            -1,
            configuration
        )
    }

    @Test
    fun testInvalidThroughThenFails() {
        // invalid through then
        val schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance()
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
    fun testValidThroughElsePasses() {
        // valid through else
        val schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance()
        schema.validate(
            4,
            configuration
        )
    }

    @Test
    fun testInvalidThroughElseFails() {
        // invalid through else
        val schema = ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    3,
                    configuration
                )
            }
        )
    }
}
