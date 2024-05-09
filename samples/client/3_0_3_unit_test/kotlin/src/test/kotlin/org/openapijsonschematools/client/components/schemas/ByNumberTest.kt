package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ByNumberTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun test35IsNotMultipleOf15Fails() {
        // 35 is not multiple of 1.5
        val schema = ByNumber.ByNumber1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    35,
                    configuration
                )
            }
        )
    }

    @Test
    fun test45IsMultipleOf15Passes() {
        // 4.5 is multiple of 1.5
        val schema = ByNumber.ByNumber1.getInstance()
        schema.validate(
            4.5,
            configuration
        )
    }

    @Test
    fun testZeroIsMultipleOfAnythingPasses() {
        // zero is multiple of anything
        val schema = ByNumber.ByNumber1.getInstance()
        schema.validate(
            0,
            configuration
        )
    }
}
