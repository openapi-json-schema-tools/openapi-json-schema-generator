package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NestedAllofToCheckValidationSemanticsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testNullIsValidPasses() {
        // null is valid
        val schema = NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1.getInstance()
        schema.validate(
            null,
            configuration
        )
    }

    @Test
    fun testAnythingNonNullIsInvalidFails() {
        // anything non-null is invalid
        val schema = NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1.getInstance()
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
