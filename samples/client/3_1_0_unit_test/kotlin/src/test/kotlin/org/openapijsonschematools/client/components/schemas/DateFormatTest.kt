package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class DateFormatTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAllStringFormatsIgnoreIntegersPasses() {
        // all string formats ignore integers
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreNullsPasses() {
        // all string formats ignore nulls
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreObjectsPasses() {
        // all string formats ignore objects
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testInvalidDateStringIsOnlyAnAnnotationByDefaultPasses() {
        // invalid date string is only an annotation by default
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            "06/19/1963",
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreFloatsPasses() {
        // all string formats ignore floats
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            13.7,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreArraysPasses() {
        // all string formats ignore arrays
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreBooleansPasses() {
        // all string formats ignore booleans
        val schema = DateFormat.DateFormat1.getInstance()
        schema.validate(
            false,
            configuration
        )
    }
}
