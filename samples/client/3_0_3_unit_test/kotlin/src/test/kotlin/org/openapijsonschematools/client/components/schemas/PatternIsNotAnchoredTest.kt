package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PatternIsNotAnchoredTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testMatchesASubstringPasses() {
        // matches a substring
        val schema = PatternIsNotAnchored.PatternIsNotAnchored1.getInstance()
        schema.validate(
            "xxaayy",
            configuration
        )
    }
}
