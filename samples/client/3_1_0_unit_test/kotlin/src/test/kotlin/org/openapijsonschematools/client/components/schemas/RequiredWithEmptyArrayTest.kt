package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RequiredWithEmptyArrayTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testPropertyNotRequiredPasses() {
        // property not required
        val schema = RequiredWithEmptyArray.RequiredWithEmptyArray1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }
}
