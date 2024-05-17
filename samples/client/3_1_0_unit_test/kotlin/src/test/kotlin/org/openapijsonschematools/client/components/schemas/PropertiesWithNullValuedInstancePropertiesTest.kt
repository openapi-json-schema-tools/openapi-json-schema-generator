package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PropertiesWithNullValuedInstancePropertiesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAllowsNullValuesPasses() {
        // allows null values
        val schema = PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    null
                )
            ),
            configuration
        )
    }
}
