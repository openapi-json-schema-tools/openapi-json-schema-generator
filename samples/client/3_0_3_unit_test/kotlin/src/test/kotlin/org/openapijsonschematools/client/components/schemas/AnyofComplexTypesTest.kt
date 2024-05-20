package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AnyofComplexTypesTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testSecondAnyofValidComplexPasses() {
        // second anyOf valid (complex)
        val schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "baz"
                )
            ),
            configuration
        )
    }

    @Test
    fun testBothAnyofValidComplexPasses() {
        // both anyOf valid (complex)
        val schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "baz"
                ),
                Pair(
                    "bar",
                    2
                )
            ),
            configuration
        )
    }

    @Test
    fun testFirstAnyofValidComplexPasses() {
        // first anyOf valid (complex)
        val schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    2
                )
            ),
            configuration
        )
    }

    @Test
    fun testNeitherAnyofValidComplexFails() {
        // neither anyOf valid (complex)
        val schema = AnyofComplexTypes.AnyofComplexTypes1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            2
                        ),
                        Pair(
                            "bar",
                            "quux"
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
