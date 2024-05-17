package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluatedpropertiesWithAdjacentAdditionalpropertiesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testWithAdditionalPropertiesPasses() {
        // with additional properties
        val schema = UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "foo"
                ),
                Pair(
                    "bar",
                    "bar"
                )
            ),
            configuration
        )
    }

    @Test
    fun testWithNoAdditionalPropertiesPasses() {
        // with no additional properties
        val schema = UnevaluatedpropertiesWithAdjacentAdditionalproperties.UnevaluatedpropertiesWithAdjacentAdditionalproperties1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "foo"
                )
            ),
            configuration
        )
    }
}
