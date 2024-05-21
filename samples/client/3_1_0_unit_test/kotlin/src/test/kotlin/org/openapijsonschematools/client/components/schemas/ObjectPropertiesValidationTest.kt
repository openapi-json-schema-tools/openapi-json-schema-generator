package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ObjectPropertiesValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testBothPropertiesPresentAndValidIsValidPasses() {
        // both properties present and valid is valid
        val schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                ),
                Pair(
                    "bar",
                    "baz"
                )
            ),
            configuration
        )
    }

    @Test
    fun testDoesnTInvalidateOtherPropertiesPasses() {
        // doesn&#x27;t invalidate other properties
        val schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "quux",
                    listOf<Any?>(
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testBothPropertiesInvalidIsInvalidFails() {
        // both properties invalid is invalid
        val schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            listOf<Any?>(
                            )
                        ),
                        Pair(
                            "bar",
                            mapOf<Any?, Any?>(
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
        val schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testOnePropertyInvalidIsInvalidFails() {
        // one property invalid is invalid
        val schema = ObjectPropertiesValidation.ObjectPropertiesValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            1
                        ),
                        Pair(
                            "bar",
                            mapOf<Any?, Any?>(
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
