package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AdditionalItemsAreAllowedByDefaultTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
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
