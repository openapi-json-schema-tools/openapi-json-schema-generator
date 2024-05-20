package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testProtoNotValidFails() {
        // __proto__ not valid
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
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
    fun testNoneOfThePropertiesMentionedPasses() {
        // none of the properties mentioned
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testAllPresentAndValidPasses() {
        // all present and valid
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
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
    fun testConstructorNotValidFails() {
        // constructor not valid
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
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
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testTostringNotValidFails() {
        // toString not valid
        val schema = PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1.getInstance()
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
}
