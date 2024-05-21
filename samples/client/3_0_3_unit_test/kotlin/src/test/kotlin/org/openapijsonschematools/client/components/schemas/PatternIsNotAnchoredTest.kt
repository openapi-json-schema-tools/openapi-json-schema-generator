package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PatternIsNotAnchoredTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
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
