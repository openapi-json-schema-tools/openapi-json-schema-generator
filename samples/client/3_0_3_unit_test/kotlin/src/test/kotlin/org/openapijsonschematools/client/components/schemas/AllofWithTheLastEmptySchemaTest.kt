package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofWithTheLastEmptySchemaTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testStringIsInvalidFails() {
        // string is invalid
        val schema = AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1.getInstance()
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
        val schema = AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
