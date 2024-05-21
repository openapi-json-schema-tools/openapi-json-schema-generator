package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofWithTheFirstEmptySchemaTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testStringIsInvalidFails() {
        // string is invalid
        val schema = AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1.getInstance()
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
    fun testNumberIsValidPasses() {
        // number is valid
        val schema = AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
