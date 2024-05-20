package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofSimpleTypesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testMismatchOneFails() {
        // mismatch one
        val schema = AllofSimpleTypes.AllofSimpleTypes1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    35,
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidPasses() {
        // valid
        val schema = AllofSimpleTypes.AllofSimpleTypes1.getInstance()
        schema.validate(
            25,
            configuration
        )
    }
}
