package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IgnoreElseWithoutIfTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testValidWhenInvalidAgainstLoneElsePasses() {
        // valid when invalid against lone else
        val schema = IgnoreElseWithoutIf.IgnoreElseWithoutIf1.getInstance()
        schema.validate(
            "hello",
            configuration
        )
    }

    @Test
    fun testValidWhenValidAgainstLoneElsePasses() {
        // valid when valid against lone else
        val schema = IgnoreElseWithoutIf.IgnoreElseWithoutIf1.getInstance()
        schema.validate(
            0,
            configuration
        )
    }
}
