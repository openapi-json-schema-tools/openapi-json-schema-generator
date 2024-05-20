package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ForbiddenPropertyTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testPropertyPresentFails() {
        // property present
        val schema = ForbiddenProperty.ForbiddenProperty1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            1
                        ),
                        Pair(
                            "bar",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testPropertyAbsentPasses() {
        // property absent
        val schema = ForbiddenProperty.ForbiddenProperty1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    1
                ),
                Pair(
                    "baz",
                    2
                )
            ),
            configuration
        )
    }
}
