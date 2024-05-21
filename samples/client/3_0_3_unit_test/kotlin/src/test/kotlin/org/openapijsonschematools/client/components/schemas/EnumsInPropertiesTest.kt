package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EnumsInPropertiesTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testWrongBarValueFails() {
        // wrong bar value
        val schema = EnumsInProperties.EnumsInProperties1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "foo"
                        ),
                        Pair(
                            "bar",
                            "bart"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testWrongFooValueFails() {
        // wrong foo value
        val schema = EnumsInProperties.EnumsInProperties1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "foot"
                        ),
                        Pair(
                            "bar",
                            "bar"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMissingAllPropertiesIsInvalidFails() {
        // missing all properties is invalid
        val schema = EnumsInProperties.EnumsInProperties1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf<Any?, Any?>(
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testBothPropertiesAreValidPasses() {
        // both properties are valid
        val schema = EnumsInProperties.EnumsInProperties1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "foo"
                ),
                Pair(
                    "bar",
                    "bar"
                )
            ),
            configuration
        )
    }

    @Test
    fun testMissingOptionalPropertyIsValidPasses() {
        // missing optional property is valid
        val schema = EnumsInProperties.EnumsInProperties1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    "bar"
                )
            ),
            configuration
        )
    }

    @Test
    fun testMissingRequiredPropertyIsInvalidFails() {
        // missing required property is invalid
        val schema = EnumsInProperties.EnumsInProperties1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "foo"
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
