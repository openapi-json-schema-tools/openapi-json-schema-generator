package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IgnoreThenWithoutIfTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testValidWhenValidAgainstLoneThenPasses() {
        // valid when valid against lone then
        val schema = IgnoreThenWithoutIf.IgnoreThenWithoutIf1.getInstance()
        schema.validate(
            0,
            configuration
        )
    }

    @Test
    fun testValidWhenInvalidAgainstLoneThenPasses() {
        // valid when invalid against lone then
        val schema = IgnoreThenWithoutIf.IgnoreThenWithoutIf1.getInstance()
        schema.validate(
            "hello",
            configuration
        )
    }
}
