package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class SmallMultipleOfLargeIntegerTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAnyIntegerIsAMultipleOf1E8Passes() {
        // any integer is a multiple of 1e-8
        val schema = SmallMultipleOfLargeInteger.SmallMultipleOfLargeInteger1.getInstance()
        schema.validate(
            12391239123L,
            configuration
        )
    }
}
