package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class EnumWithEscapedCharactersTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testAnotherStringIsInvalidFails() {
        // another string is invalid
        val schema = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    "abc",
                    configuration
                )
            }
        )
    }

    @Test
    fun testMember2IsValidPasses() {
        // member 2 is valid
        val schema = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance()
        schema.validate(
            "foo\rbar",
            configuration
        )
    }

    @Test
    fun testMember1IsValidPasses() {
        // member 1 is valid
        val schema = EnumWithEscapedCharacters.EnumWithEscapedCharacters1.getInstance()
        schema.validate(
            "foo\nbar",
            configuration
        )
    }
}
