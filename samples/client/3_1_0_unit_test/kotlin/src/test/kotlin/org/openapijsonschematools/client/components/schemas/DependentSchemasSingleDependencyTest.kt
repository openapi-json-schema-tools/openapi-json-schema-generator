package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class DependentSchemasSingleDependencyTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testWrongTypeFails() {
        // wrong type
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
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

    @Test
    fun testValidPasses() {
        // valid
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
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
    fun testNoDependencyPasses() {
        // no dependency
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    "quux"
                )
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
        schema.validate(
            listOf(
                "bar"
            ),
            configuration
        )
    }

    @Test
    fun testWrongTypeBothFails() {
        // wrong type both
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
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
                            "quux"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
        schema.validate(
            "foobar",
            configuration
        )
    }

    @Test
    fun testWrongTypeOtherFails() {
        // wrong type other
        val schema = DependentSchemasSingleDependency.DependentSchemasSingleDependency1.getInstance()
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
