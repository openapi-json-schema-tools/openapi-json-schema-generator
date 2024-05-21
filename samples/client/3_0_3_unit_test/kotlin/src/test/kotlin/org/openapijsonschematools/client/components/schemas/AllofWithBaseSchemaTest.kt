package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AllofWithBaseSchemaTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testMismatchBaseSchemaFails() {
        // mismatch base schema
        val schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "quux"
                        ),
                        Pair(
                            "baz",
                            null
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMismatchFirstAllofFails() {
        // mismatch first allOf
        val schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "bar",
                            2
                        ),
                        Pair(
                            "baz",
                            null
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidPasses() {
        // valid
        val schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "quux"
                ),
                Pair(
                    "bar",
                    2
                ),
                Pair(
                    "baz",
                    null
                )
            ),
            configuration
        )
    }

    @Test
    fun testMismatchBothFails() {
        // mismatch both
        val schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance()
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
    fun testMismatchSecondAllofFails() {
        // mismatch second allOf
        val schema = AllofWithBaseSchema.AllofWithBaseSchema1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            "quux"
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
}
