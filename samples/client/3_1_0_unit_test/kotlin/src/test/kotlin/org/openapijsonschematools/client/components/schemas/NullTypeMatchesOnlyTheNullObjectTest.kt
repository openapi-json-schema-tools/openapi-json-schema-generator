package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NullTypeMatchesOnlyTheNullObjectTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testZeroIsNotNullFails() {
        // zero is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    0,
                    configuration
                )
            }
        )
    }

    @Test
    fun testAnArrayIsNotNullFails() {
        // an array is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
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
    fun testAnObjectIsNotNullFails() {
        // an object is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
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
    fun testTrueIsNotNullFails() {
        // true is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
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
    fun testFalseIsNotNullFails() {
        // false is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    false,
                    configuration
                )
            }
        )
    }

    @Test
    fun testNullIsNullPasses() {
        // null is null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }

    @Test
    fun testAStringIsNotNullFails() {
        // a string is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
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
    fun testAnIntegerIsNotNullFails() {
        // an integer is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
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
    fun testAnEmptyStringIsNotNullFails() {
        // an empty string is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "",
                    configuration
                )
            }
        )
    }

    @Test
    fun testAFloatIsNotNullFails() {
        // a float is not null
        val schema = NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.1,
                    configuration
                )
            }
        )
    }
}
