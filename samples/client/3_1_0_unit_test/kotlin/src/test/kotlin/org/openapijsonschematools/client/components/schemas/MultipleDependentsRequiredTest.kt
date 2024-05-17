package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class MultipleDependentsRequiredTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testNondependantsPasses() {
        // nondependants
        val schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance()
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
    fun testMissingOtherDependencyFails() {
        // missing other dependency
        val schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "bar",
                            1
                        ),
                        Pair(
                            "quux",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testWithDependenciesPasses() {
        // with dependencies
        val schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance()
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
                    "quux",
                    3
                )
            ),
            configuration
        )
    }

    @Test
    fun testMissingBothDependenciesFails() {
        // missing both dependencies
        val schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "quux",
                            1
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testMissingDependencyFails() {
        // missing dependency
        val schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            1
                        ),
                        Pair(
                            "quux",
                            2
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNeitherPasses() {
        // neither
        val schema = MultipleDependentsRequired.MultipleDependentsRequired1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }
}
