package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class NotMoreComplexSchemaTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testOtherMatchPasses() {
        // other match
        val schema = NotMoreComplexSchema.NotMoreComplexSchema1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testMismatchFails() {
        // mismatch
        val schema = NotMoreComplexSchema.NotMoreComplexSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "bar"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMatchPasses() {
        // match
        val schema = NotMoreComplexSchema.NotMoreComplexSchema1.getInstance()
        schema.validate(
            1,
            configuration
        )
    }
}
