package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PatternValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testIgnoresBooleansPasses() {
        // ignores booleans
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            true,
            configuration
        )
    }

    @Test
    fun testIgnoresFloatsPasses() {
        // ignores floats
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            1.0,
            configuration
        )
    }

    @Test
    fun testANonMatchingPatternIsInvalidFails() {
        // a non-matching pattern is invalid
        val schema = PatternValidation.PatternValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "abc",
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresIntegersPasses() {
        // ignores integers
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            123,
            configuration
        )
    }

    @Test
    fun testAMatchingPatternIsValidPasses() {
        // a matching pattern is valid
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            "aaa",
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresObjectsPasses() {
        // ignores objects
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresNullPasses() {
        // ignores null
        val schema = PatternValidation.PatternValidation1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }
}
