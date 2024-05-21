package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NestedAnyofToCheckValidationSemanticsTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testNullIsValidPasses() {
        // null is valid
        val schema = NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }

    @Test
    fun testAnythingNonNullIsInvalidFails() {
        // anything non-null is invalid
        val schema = NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    123,
                    configuration
                )
            }
        )
    }
}
