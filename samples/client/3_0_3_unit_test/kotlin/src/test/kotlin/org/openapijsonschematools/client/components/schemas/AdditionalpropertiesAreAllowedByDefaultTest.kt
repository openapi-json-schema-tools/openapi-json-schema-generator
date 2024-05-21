package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AdditionalpropertiesAreAllowedByDefaultTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAdditionalPropertiesAreAllowedPasses() {
        // additional properties are allowed
        val schema = AdditionalpropertiesAreAllowedByDefault.AdditionalpropertiesAreAllowedByDefault1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                ),
                Pair(
                    "bar",
                    2
                ),
                Pair(
                    "quux",
                    true
                )
            ),
            configuration
        )
    }
}
