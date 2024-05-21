package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class OneofWithRequiredTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testFirstValidValidPasses() {
        // first valid - valid
        val schema = OneofWithRequired.OneofWithRequired1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
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
    fun testBothValidInvalidFails() {
        // both valid - invalid
        val schema = OneofWithRequired.OneofWithRequired1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            1
                        ),
                        Pair(
                            "bar",
                            2
                        ),
                        Pair(
                            "baz",
                            3
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testSecondValidValidPasses() {
        // second valid - valid
        val schema = OneofWithRequired.OneofWithRequired1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    1
                ),
                Pair(
                    "baz",
                    3
                )
            ),
            configuration
        )
    }

    @Test
    fun testBothInvalidInvalidFails() {
        // both invalid - invalid
        val schema = OneofWithRequired.OneofWithRequired1.getInstance()
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
}
