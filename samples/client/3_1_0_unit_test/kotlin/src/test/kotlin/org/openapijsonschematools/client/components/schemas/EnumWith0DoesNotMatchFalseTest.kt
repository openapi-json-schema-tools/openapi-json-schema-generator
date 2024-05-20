package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EnumWith0DoesNotMatchFalseTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testFloatZeroIsValidPasses() {
        // float zero is valid
        val schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance()
        schema.validate(
            0.0,
            configuration
        )
    }

    @Test
    fun testFalseIsInvalidFails() {
        // false is invalid
        val schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance()
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
    fun testIntegerZeroIsValidPasses() {
        // integer zero is valid
        val schema = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.getInstance()
        schema.validate(
            0,
            configuration
        )
    }
}
