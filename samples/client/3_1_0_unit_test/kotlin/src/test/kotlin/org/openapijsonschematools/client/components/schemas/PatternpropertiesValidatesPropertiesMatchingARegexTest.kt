package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PatternpropertiesValidatesPropertiesMatchingARegexTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testMultipleInvalidMatchesIsInvalidFails() {
        // multiple invalid matches is invalid
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "bar"
                        ),
                        Pair(
                            "foooooo",
                            "baz"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testASingleValidMatchIsValidPasses() {
        // a single valid match is valid
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testASingleInvalidMatchIsInvalidFails() {
        // a single invalid match is invalid
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "bar"
                        ),
                        Pair(
                            "fooooo",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMultipleValidMatchesIsValidPasses() {
        // multiple valid matches is valid
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                ),
                Pair(
                    "foooooo",
                    2
                )
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        schema.validate(
            listOf(
                "foo"
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = PatternpropertiesValidatesPropertiesMatchingARegex.PatternpropertiesValidatesPropertiesMatchingARegex1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }
}
