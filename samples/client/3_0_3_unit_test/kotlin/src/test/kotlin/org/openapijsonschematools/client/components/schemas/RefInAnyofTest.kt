package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RefInAnyofTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testPropertyNamedRefValidPasses() {
        // property named \$ref valid
        val schema = RefInAnyof.RefInAnyof1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "\$ref",
                    "a"
                )
            ),
            configuration
        )
    }

    @Test
    fun testPropertyNamedRefInvalidFails() {
        // property named \$ref invalid
        val schema = RefInAnyof.RefInAnyof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "\$ref",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
