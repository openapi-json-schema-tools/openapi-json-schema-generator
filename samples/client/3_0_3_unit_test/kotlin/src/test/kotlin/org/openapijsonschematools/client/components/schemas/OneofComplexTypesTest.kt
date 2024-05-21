package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class OneofComplexTypesTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testSecondOneofValidComplexPasses() {
        // second oneOf valid (complex)
        val schema = OneofComplexTypes.OneofComplexTypes1.getInstance()
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
    fun testBothOneofValidComplexFails() {
        // both oneOf valid (complex)
        val schema = OneofComplexTypes.OneofComplexTypes1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testFirstOneofValidComplexPasses() {
        // first oneOf valid (complex)
        val schema = OneofComplexTypes.OneofComplexTypes1.getInstance()
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
    fun testNeitherOneofValidComplexFails() {
        // neither oneOf valid (complex)
        val schema = OneofComplexTypes.OneofComplexTypes1.getInstance()
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
