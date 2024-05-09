package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class OneofWithEmptySchemaTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testOneValidValidPasses() {
        // one valid - valid
        val schema = OneofWithEmptySchema.OneofWithEmptySchema1.getInstance()
        schema.validate(
            "foo",
            configuration
        )
    }

    @Test
    fun testBothValidInvalidFails() {
        // both valid - invalid
        val schema = OneofWithEmptySchema.OneofWithEmptySchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    123,
                    configuration
                )
            }
        )
    }
}
