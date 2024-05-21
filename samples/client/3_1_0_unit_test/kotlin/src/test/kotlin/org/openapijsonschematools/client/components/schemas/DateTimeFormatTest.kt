package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class DateTimeFormatTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAllStringFormatsIgnoreIntegersPasses() {
        // all string formats ignore integers
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testInvalidDateTimeStringIsOnlyAnAnnotationByDefaultPasses() {
        // invalid date-time string is only an annotation by default
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            "1990-02-31T15:59:60.123-08:00",
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreNullsPasses() {
        // all string formats ignore nulls
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreObjectsPasses() {
        // all string formats ignore objects
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreFloatsPasses() {
        // all string formats ignore floats
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            13.7,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreArraysPasses() {
        // all string formats ignore arrays
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreBooleansPasses() {
        // all string formats ignore booleans
        val schema = DateTimeFormat.DateTimeFormat1.getInstance()
        schema.validate(
            false,
            configuration
        )
    }
}
