package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ContainsWithNullInstanceElementsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAllowsNullItemsPasses() {
        // allows null items
        val schema = ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1.getInstance()
        schema.validate(
            listOf(
                null
            ),
            configuration
        )
    }
}
