package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class IriFormatTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAllStringFormatsIgnoreIntegersPasses() {
        // all string formats ignore integers
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreNullsPasses() {
        // all string formats ignore nulls
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreObjectsPasses() {
        // all string formats ignore objects
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreFloatsPasses() {
        // all string formats ignore floats
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            13.7,
            configuration
        )
    }

    @Test
    fun testInvalidIriStringIsOnlyAnAnnotationByDefaultPasses() {
        // invalid iri string is only an annotation by default
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            "http://2001:0db8:85a3:0000:0000:8a2e:0370:7334",
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreArraysPasses() {
        // all string formats ignore arrays
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            listOf<Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAllStringFormatsIgnoreBooleansPasses() {
        // all string formats ignore booleans
        val schema = IriFormat.IriFormat1.getInstance()
        schema.validate(
            false,
            configuration
        )
    }
}
