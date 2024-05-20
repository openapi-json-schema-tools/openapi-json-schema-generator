package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RequiredValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testPresentRequiredPropertyIsValidPasses() {
        // present required property is valid
        val schema = RequiredValidation.RequiredValidation1.getInstance()
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
        val schema = RequiredValidation.RequiredValidation1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = RequiredValidation.RequiredValidation1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = RequiredValidation.RequiredValidation1.getInstance()
        schema.validate(
            "",
            configuration
        )
    }

    @Test
    fun testNonPresentRequiredPropertyIsInvalidFails() {
        // non-present required property is invalid
        val schema = RequiredValidation.RequiredValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "bar",
                            1
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
