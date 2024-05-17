package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class SimpleEnumValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testSomethingElseIsInvalidFails() {
        // something else is invalid
        val schema = SimpleEnumValidation.SimpleEnumValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    4,
                    configuration
                )
            }
        )
    }

    @Test
    fun testOneOfTheEnumIsValidPasses() {
        // one of the enum is valid
        val schema = SimpleEnumValidation.SimpleEnumValidation1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
