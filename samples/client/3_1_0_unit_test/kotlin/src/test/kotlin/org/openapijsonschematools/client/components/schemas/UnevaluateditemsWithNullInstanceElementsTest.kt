package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluateditemsWithNullInstanceElementsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAllowsNullElementsPasses() {
        // allows null elements
        val schema = UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1.getInstance()
        schema.validate(
            listOf(
                null
            ),
            configuration
        )
    }
}
