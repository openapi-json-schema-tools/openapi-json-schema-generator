package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RefInItemsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testPropertyNamedRefValidPasses() {
        // property named \$ref valid
        val schema = RefInItems.RefInItems1.getInstance()
        schema.validate(
            RefInItems.RefInItemsListBuilder()
                .add(
                    mapOf(
                        Pair(
                            "\$ref",
                            "a"
                        )
                    )
                )
            .build(),
            configuration
        )
    }

    @Test
    fun testPropertyNamedRefInvalidFails() {
        // property named \$ref invalid
        val schema = RefInItems.RefInItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        mapOf(
                            Pair(
                                "\$ref",
                                2
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
