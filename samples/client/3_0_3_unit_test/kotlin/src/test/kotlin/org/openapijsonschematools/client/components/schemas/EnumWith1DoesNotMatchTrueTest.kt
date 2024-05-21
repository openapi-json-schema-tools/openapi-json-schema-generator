package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EnumWith1DoesNotMatchTrueTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testTrueIsInvalidFails() {
        // true is invalid
        val schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance()
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
    fun testFloatOneIsValidPasses() {
        // float one is valid
        val schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance()
        schema.validate(
            1.0,
            configuration
        )
    }

    @Test
    fun testIntegerOneIsValidPasses() {
        // integer one is valid
        val schema = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
