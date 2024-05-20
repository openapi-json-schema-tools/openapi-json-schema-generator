package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AnyofTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testBothAnyofValidPasses() {
        // both anyOf valid
        val schema = Anyof.Anyof1.getInstance()
        schema.validate(
            3,
            configuration
        )
    }

    @Test
    fun testNeitherAnyofValidFails() {
        // neither anyOf valid
        val schema = Anyof.Anyof1.getInstance()
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
    fun testFirstAnyofValidPasses() {
        // first anyOf valid
        val schema = Anyof.Anyof1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }

    @Test
    fun testSecondAnyofValidPasses() {
        // second anyOf valid
        val schema = Anyof.Anyof1.getInstance()
        schema.validate(
            2.5,
            configuration
        )
    }
}
