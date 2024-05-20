package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NonAsciiPatternWithAdditionalpropertiesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testNotMatchingThePatternIsInvalidFails() {
        // not matching the pattern is invalid
        val schema = NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "élmény",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMatchingThePatternIsValidPasses() {
        // matching the pattern is valid
        val schema = NonAsciiPatternWithAdditionalproperties.NonAsciiPatternWithAdditionalproperties1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "ármányos",
                    2
                )
            ),
            configuration
        )
    }
}
