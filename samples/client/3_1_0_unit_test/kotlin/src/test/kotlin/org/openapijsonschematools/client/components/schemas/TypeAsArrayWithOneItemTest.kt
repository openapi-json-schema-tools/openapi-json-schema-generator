package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class TypeAsArrayWithOneItemTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testNumberIsInvalidFails() {
        // number is invalid
        val schema = TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    123,
                    configuration
                )
            }
        )
    }

    @Test
    fun testStringIsValidPasses() {
        // string is valid
        val schema = TypeAsArrayWithOneItem.TypeAsArrayWithOneItem1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }
}
