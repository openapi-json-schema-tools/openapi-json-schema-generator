package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ItemsContainsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testMatchesItemsDoesNotMatchContainsFails() {
        // matches items, does not match contains
        val schema = ItemsContains.ItemsContains1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        2,
                        4,
                        8
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMatchesNeitherItemsNorContainsFails() {
        // matches neither items nor contains
        val schema = ItemsContains.ItemsContains1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        1,
                        5
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testDoesNotMatchItemsMatchesContainsFails() {
        // does not match items, matches contains
        val schema = ItemsContains.ItemsContains1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        3,
                        6,
                        9
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMatchesBothItemsAndContainsPasses() {
        // matches both items and contains
        val schema = ItemsContains.ItemsContains1.getInstance()
        schema.validate(
            ItemsContains.ItemsContainsListBuilder()
                .add(6)

                .add(12)

            .build(),
            configuration
        )
    }
}
