package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PrefixitemsWithNullInstanceElementsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAllowsNullElementsPasses() {
        // allows null elements
        val schema = PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1.getInstance()
        schema.validate(
            PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsListBuilder()
                .add(null)

            .build(),
            configuration
        )
    }
}
