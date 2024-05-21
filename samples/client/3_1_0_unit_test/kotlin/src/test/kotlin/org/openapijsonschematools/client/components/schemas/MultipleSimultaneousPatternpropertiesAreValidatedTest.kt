package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MultipleSimultaneousPatternpropertiesAreValidatedTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testASimultaneousMatchIsValidPasses() {
        // a simultaneous match is valid
        val schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "aaaa",
                    18
                )
            ),
            configuration
        )
    }

    @Test
    fun testASingleValidMatchIsValidPasses() {
        // a single valid match is valid
        val schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "a",
                    21
                )
            ),
            configuration
        )
    }

    @Test
    fun testAnInvalidDueToTheOtherIsInvalidFails() {
        // an invalid due to the other is invalid
        val schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "aaaa",
                            31
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMultipleMatchesIsValidPasses() {
        // multiple matches is valid
        val schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "a",
                    21
                ),
                Pair(
                    "aaaa",
                    18
                )
            ),
            configuration
        )
    }

    @Test
    fun testAnInvalidDueToOneIsInvalidFails() {
        // an invalid due to one is invalid
        val schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "a",
                            "bar"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testAnInvalidDueToBothIsInvalidFails() {
        // an invalid due to both is invalid
        val schema = MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "aaa",
                            "foo"
                        ),
                        Pair(
                            "aaaa",
                            31
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
