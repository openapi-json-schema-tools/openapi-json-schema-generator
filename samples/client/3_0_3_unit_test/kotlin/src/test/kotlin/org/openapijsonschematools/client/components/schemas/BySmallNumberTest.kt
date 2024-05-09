package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class BySmallNumberTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun test000751IsNotMultipleOf00001Fails() {
        // 0.00751 is not multiple of 0.0001
        val schema = BySmallNumber.BySmallNumber1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    0.00751,
                    configuration
                )
            }
        )
    }

    @Test
    fun test00075IsMultipleOf00001Passes() {
        // 0.0075 is multiple of 0.0001
        val schema = BySmallNumber.BySmallNumber1.getInstance()
        schema.validate(
            0.0075,
            configuration
        )
    }
}
