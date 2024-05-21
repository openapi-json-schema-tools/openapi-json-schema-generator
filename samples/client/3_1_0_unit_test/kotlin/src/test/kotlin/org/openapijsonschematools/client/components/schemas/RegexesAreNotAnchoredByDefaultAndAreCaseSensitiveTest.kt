package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RegexesAreNotAnchoredByDefaultAndAreCaseSensitiveTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testRegexesAreCaseSensitivePasses() {
        // regexes are case sensitive
        val schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "a_x_3",
                    3
                )
            ),
            configuration
        )
    }

    @Test
    fun testNonRecognizedMembersAreIgnoredPasses() {
        // non recognized members are ignored
        val schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "answer 1",
                    "42"
                )
            ),
            configuration
        )
    }

    @Test
    fun testRecognizedMembersAreAccountedForFails() {
        // recognized members are accounted for
        val schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "a31b",
                            null
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testRegexesAreCaseSensitive2Fails() {
        // regexes are case sensitive, 2
        val schema = RegexesAreNotAnchoredByDefaultAndAreCaseSensitive.RegexesAreNotAnchoredByDefaultAndAreCaseSensitive1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "a_X_3",
                            3
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
