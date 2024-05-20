package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NotMultipleTypesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testOtherMismatchFails() {
        // other mismatch
        val schema = NotMultipleTypes.NotMultipleTypes1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    true,
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidPasses() {
        // valid
        val schema = NotMultipleTypes.NotMultipleTypes1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }

    @Test
    fun testMismatchFails() {
        // mismatch
        val schema = NotMultipleTypes.NotMultipleTypes1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1,
                    configuration
                )
            }
        )
    }
}
