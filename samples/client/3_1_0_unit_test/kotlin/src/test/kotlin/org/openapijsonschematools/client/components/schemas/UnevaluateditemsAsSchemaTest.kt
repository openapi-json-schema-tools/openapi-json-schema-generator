package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluateditemsAsSchemaTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testWithValidUnevaluatedItemsPasses() {
        // with valid unevaluated items
        val schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance()
        schema.validate(
            listOf(
                "foo"
            ),
            configuration
        )
    }

    @Test
    fun testWithInvalidUnevaluatedItemsFails() {
        // with invalid unevaluated items
        val schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        42
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testWithNoUnevaluatedItemsPasses() {
        // with no unevaluated items
        val schema = UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }
}
