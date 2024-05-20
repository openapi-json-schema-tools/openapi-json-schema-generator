package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NulCharactersInStringsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testMatchStringWithNulPasses() {
        // match string with nul
        val schema = NulCharactersInStrings.NulCharactersInStrings1.getInstance()
        schema.validate(
            "hello\u0000there",
            configuration
        )
    }

    @Test
    fun testDoNotMatchStringLackingNulFails() {
        // do not match string lacking nul
        val schema = NulCharactersInStrings.NulCharactersInStrings1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "hellothere",
                    configuration
                )
            }
        )
    }
}
