package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ObjectTypeMatchesObjectsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAnObjectIsAnObjectPasses() {
        // an object is an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAnArrayIsNotAnObjectFails() {
        // an array is not an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf<Any?>(
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testAnIntegerIsNotAnObjectFails() {
        // an integer is not an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1,
                    configuration
                )
            }
        )
    }

    @Test
    fun testABooleanIsNotAnObjectFails() {
        // a boolean is not an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    true,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAStringIsNotAnObjectFails() {
        // a string is not an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "foo",
                    configuration
                )
            }
        )
    }

    @Test
    fun testAFloatIsNotAnObjectFails() {
        // a float is not an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.1,
                    configuration
                )
            }
        )
    }

    @Test
    fun testNullIsNotAnObjectFails() {
        // null is not an object
        val schema = ObjectTypeMatchesObjects.ObjectTypeMatchesObjects1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    null,
                    configuration
                )
            }
        )
    }
}
