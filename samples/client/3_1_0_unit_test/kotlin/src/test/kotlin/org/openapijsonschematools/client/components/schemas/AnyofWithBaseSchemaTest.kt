package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AnyofWithBaseSchemaTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testMismatchBaseSchemaFails() {
        // mismatch base schema
        val schema = AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    3,
                    configuration
                )
            }
        )
    }

    @Test
    fun testOneAnyofValidPasses() {
        // one anyOf valid
        val schema = AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance()
        schema.validate(
            "foobar",
            configuration
        )
    }

    @Test
    fun testBothAnyofInvalidFails() {
        // both anyOf invalid
        val schema = AnyofWithBaseSchema.AnyofWithBaseSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "foo",
                    configuration
                )
            }
        )
    }
}
