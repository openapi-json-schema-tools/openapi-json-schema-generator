package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class RefInOneofTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testPropertyNamedRefValidPasses() {
        // property named \$ref valid
        val schema = RefInOneof.RefInOneof1.getInstance()
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
        val schema = RefInOneof.RefInOneof1.getInstance()
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
