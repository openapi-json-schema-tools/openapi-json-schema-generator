package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NotTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testDisallowedFails() {
        // disallowed
        val schema = Not.Not1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllowedPasses() {
        // allowed
        val schema = Not.Not1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }
}
