package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testMismatchSecondFails() {
        // mismatch second
        val schema = Allof.Allof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testWrongTypeFails() {
        // wrong type
        val schema = Allof.Allof1.getInstance()
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
                            "quux"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMismatchFirstFails() {
        // mismatch first
        val schema = Allof.Allof1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testAllofPasses() {
        // allOf
        val schema = Allof.Allof1.getInstance()
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
}
