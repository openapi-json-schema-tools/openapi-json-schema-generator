package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IgnoreIfWithoutThenOrElseTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testValidWhenInvalidAgainstLoneIfPasses() {
        // valid when invalid against lone if
        val schema = IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1.getInstance()
        schema.validate(
            "hello",
            configuration
        )
    }

    @Test
    fun testValidWhenValidAgainstLoneIfPasses() {
        // valid when valid against lone if
        val schema = IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1.getInstance()
        schema.validate(
            0,
            configuration
        )
    }
}
