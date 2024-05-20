package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RequiredWithEscapedCharactersTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testObjectWithSomePropertiesMissingIsInvalidFails() {
        // object with some properties missing is invalid
        val schema = RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo\nbar",
                            "1"
                        ),
                        Pair(
                            "foo\"bar",
                            "1"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testObjectWithAllPropertiesPresentIsValidPasses() {
        // object with all properties present is valid
        val schema = RequiredWithEscapedCharacters.RequiredWithEscapedCharacters1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo\nbar",
                    1
                ),
                Pair(
                    "foo\"bar",
                    1
                ),
                Pair(
                    "foo\\bar",
                    1
                ),
                Pair(
                    "foo\rbar",
                    1
                ),
                Pair(
                    "foo\tbar",
                    1
                ),
                Pair(
                    "foo\u000Cbar",
                    1
                )
            ),
            configuration
        )
    }
}
