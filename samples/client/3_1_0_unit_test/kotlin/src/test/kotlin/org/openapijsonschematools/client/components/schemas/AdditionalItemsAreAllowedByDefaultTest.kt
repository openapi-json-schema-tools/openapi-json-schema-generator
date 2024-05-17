package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AdditionalItemsAreAllowedByDefaultTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testOnlyTheFirstItemIsValidatedPasses() {
        // only the first item is validated
        val schema = AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1.getInstance()
        schema.validate(
            AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultListBuilder()
                .add(1)

                .add("foo")

                .add(false)

            .build(),
            configuration
        )
    }
}
