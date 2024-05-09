package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PropertiesWithEscapedCharactersTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testObjectWithAllNumbersIsValidPasses() {
        // object with all numbers is valid
        val schema = PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1.getInstance()
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

    @Test
    fun testObjectWithStringsIsInvalidFails() {
        // object with strings is invalid
        val schema = PropertiesWithEscapedCharacters.PropertiesWithEscapedCharacters1.getInstance()
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
                        ),
                        Pair(
                            "foo\\bar",
                            "1"
                        ),
                        Pair(
                            "foo\rbar",
                            "1"
                        ),
                        Pair(
                            "foo\tbar",
                            "1"
                        ),
                        Pair(
                            "foo\u000Cbar",
                            "1"
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
