package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluatedpropertiesSchemaTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testWithInvalidUnevaluatedPropertiesFails() {
        // with invalid unevaluated properties
        val schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "fo"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testWithNoUnevaluatedPropertiesPasses() {
        // with no unevaluated properties
        val schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testWithValidUnevaluatedPropertiesPasses() {
        // with valid unevaluated properties
        val schema = UnevaluatedpropertiesSchema.UnevaluatedpropertiesSchema1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "foo"
                )
            ),
            configuration
        )
    }
}
