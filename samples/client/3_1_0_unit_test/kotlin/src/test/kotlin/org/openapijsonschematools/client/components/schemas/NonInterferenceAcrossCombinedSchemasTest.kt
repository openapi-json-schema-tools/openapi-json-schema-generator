package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NonInterferenceAcrossCombinedSchemasTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testValidButWouldHaveBeenInvalidThroughElsePasses() {
        // valid, but would have been invalid through else
        val schema = NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1.getInstance()
        schema.validate(
            3,
            configuration
        )
    }

    @Test
    fun testValidButWouldHaveBeenInvalidThroughThenPasses() {
        // valid, but would have been invalid through then
        val schema = NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1.getInstance()
        schema.validate(
            -100,
            configuration
        )
    }
}
