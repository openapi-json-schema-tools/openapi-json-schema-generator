package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class InvalidStringValueForDefaultTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testValidWhenPropertyIsSpecifiedPasses() {
        // valid when property is specified
        val schema = InvalidStringValueForDefault.InvalidStringValueForDefault1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    "good"
                )
            ),
            configuration
        )
    }

    @Test
    fun testStillValidWhenTheInvalidDefaultIsUsedPasses() {
        // still valid when the invalid default is used
        val schema = InvalidStringValueForDefault.InvalidStringValueForDefault1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }
}
