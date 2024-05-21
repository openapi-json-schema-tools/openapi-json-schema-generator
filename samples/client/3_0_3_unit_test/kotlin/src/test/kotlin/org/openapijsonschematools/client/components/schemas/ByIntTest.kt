package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ByIntTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testIntByIntFailFails() {
        // int by int fail
        val schema = ByInt.ByInt1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    7,
                    configuration
                )
            }
        )
    }

    @Test
    fun testIntByIntPasses() {
        // int by int
        val schema = ByInt.ByInt1.getInstance()
        schema.validate(
            10,
            configuration
        )
    }

    @Test
    fun testIgnoresNonNumbersPasses() {
        // ignores non-numbers
        val schema = ByInt.ByInt1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }
}
