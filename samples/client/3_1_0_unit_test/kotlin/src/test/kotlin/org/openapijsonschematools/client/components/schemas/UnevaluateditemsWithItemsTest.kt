package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluateditemsWithItemsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testInvalidUnderItemsFails() {
        // invalid under items
        val schema = UnevaluateditemsWithItems.UnevaluateditemsWithItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        "foo",
                        "bar",
                        "baz"
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidUnderItemsPasses() {
        // valid under items
        val schema = UnevaluateditemsWithItems.UnevaluateditemsWithItems1.getInstance()
        schema.validate(
            UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder()
                .add(5)

                .add(6)

                .add(7)

                .add(8)

            .build(),
            configuration
        )
    }
}
