package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EmptyDependentsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testEmptyObjectPasses() {
        // empty object
        val schema = EmptyDependents.EmptyDependents1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testNonObjectIsValidPasses() {
        // non-object is valid
        val schema = EmptyDependents.EmptyDependents1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }

    @Test
    fun testObjectWithOnePropertyPasses() {
        // object with one property
        val schema = EmptyDependents.EmptyDependents1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    2
                )
            ),
            configuration
        )
    }
}
