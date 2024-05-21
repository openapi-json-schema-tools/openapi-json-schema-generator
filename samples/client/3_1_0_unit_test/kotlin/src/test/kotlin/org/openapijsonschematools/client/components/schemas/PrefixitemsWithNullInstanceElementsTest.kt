package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PrefixitemsWithNullInstanceElementsTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
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
