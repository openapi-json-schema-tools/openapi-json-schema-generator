package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testTostringPresentFails() {
        // toString present
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "toString",
                            mapOf(
                                Pair(
                                    "length",
                                    37
                                )
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNoneOfThePropertiesMentionedFails() {
        // none of the properties mentioned
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
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
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testConstructorPresentFails() {
        // constructor present
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "constructor",
                            mapOf(
                                Pair(
                                    "length",
                                    37
                                )
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testAllPresentPasses() {
        // all present
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "__proto__",
                    12
                ),
                Pair(
                    "toString",
                    mapOf(
                        Pair(
                            "length",
                            "foo"
                        )
                    )
                ),
                Pair(
                    "constructor",
                    37
                )
            ),
            configuration
        )
    }

    @Test
    fun testProtoPresentFails() {
        // __proto__ present
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "__proto__",
                            "foo"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }
}
