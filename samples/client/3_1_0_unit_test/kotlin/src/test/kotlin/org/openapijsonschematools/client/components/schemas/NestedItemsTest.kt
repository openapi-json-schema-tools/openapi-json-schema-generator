package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NestedItemsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testNestedArrayWithInvalidTypeFails() {
        // nested array with invalid type
        val schema = NestedItems.NestedItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        listOf(
                            listOf(
                                listOf(
                                    "1"
                                )
                            ),
                            listOf(
                                listOf(
                                    2
                                ),
                                listOf(
                                    3
                                )
                            )
                        ),
                        listOf(
                            listOf(
                                listOf(
                                    4
                                ),
                                listOf(
                                    5
                                ),
                                listOf(
                                    6
                                )
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNotDeepEnoughFails() {
        // not deep enough
        val schema = NestedItems.NestedItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        listOf(
                            listOf(
                                1
                            ),
                            listOf(
                                2
                            ),
                            listOf(
                                3
                            )
                        ),
                        listOf(
                            listOf(
                                4
                            ),
                            listOf(
                                5
                            ),
                            listOf(
                                6
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidNestedArrayPasses() {
        // valid nested array
        val schema = NestedItems.NestedItems1.getInstance()
        schema.validate(
            NestedItems.NestedItemsListBuilder()
                .add(
                    listOf(
                        listOf(
                            listOf(
                                1
                            )
                        ),
                        listOf(
                            listOf(
                                2
                            ),
                            listOf(
                                3
                            )
                        )
                    )
                )
                .add(
                    listOf(
                        listOf(
                            listOf(
                                4
                            ),
                            listOf(
                                5
                            ),
                            listOf(
                                6
                            )
                        )
                    )
                )
            .build(),
            configuration
        )
    }
}
