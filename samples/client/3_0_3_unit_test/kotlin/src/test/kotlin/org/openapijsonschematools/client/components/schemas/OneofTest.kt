package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class OneofTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testBothOneofValidFails() {
        // both oneOf valid
        val schema = Oneof.Oneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    3,
                    configuration
                )
            }
        )
    }

    @Test
    fun testNeitherOneofValidFails() {
        // neither oneOf valid
        val schema = Oneof.Oneof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    1.5,
                    configuration
                )
            }
        )
    }

    @Test
    fun testSecondOneofValidPasses() {
        // second oneOf valid
        val schema = Oneof.Oneof1.getInstance()
        schema.validate(
            2.5,
            configuration
        )
    }

    @Test
    fun testFirstOneofValidPasses() {
        // first oneOf valid
        val schema = Oneof.Oneof1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
