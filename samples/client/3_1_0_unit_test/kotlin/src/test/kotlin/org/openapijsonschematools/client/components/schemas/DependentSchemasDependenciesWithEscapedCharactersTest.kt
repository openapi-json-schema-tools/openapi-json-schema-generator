package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class DependentSchemasDependenciesWithEscapedCharactersTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testQuotedQuoteInvalidUnderDependentSchemaFails() {
        // quoted quote invalid under dependent schema
        val schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo'bar",
                            1
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testQuotedTabInvalidUnderDependentSchemaFails() {
        // quoted tab invalid under dependent schema
        val schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo\tbar",
                            1
                        ),
                        Pair(
                            "a",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testQuotedTabPasses() {
        // quoted tab
        val schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo\tbar",
                    1
                ),
                Pair(
                    "a",
                    2
                ),
                Pair(
                    "b",
                    3
                ),
                Pair(
                    "c",
                    4
                )
            ),
            configuration
        )
    }

    @Test
    fun testQuotedQuoteFails() {
        // quoted quote
        val schema = DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo'bar",
                            mapOf(
                                Pair(
                                    "foo\"bar",
                                    1
                                )
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
