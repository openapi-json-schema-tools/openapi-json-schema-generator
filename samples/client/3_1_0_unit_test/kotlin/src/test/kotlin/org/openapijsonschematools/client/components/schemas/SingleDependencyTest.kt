package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class SingleDependencyTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testNondependantPasses() {
        // nondependant
        val schema = SingleDependency.SingleDependency1.getInstance()
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
    fun testWithDependencyPasses() {
        // with dependency
        val schema = SingleDependency.SingleDependency1.getInstance()
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
    fun testMissingDependencyFails() {
        // missing dependency
        val schema = SingleDependency.SingleDependency1.getInstance()
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
    fun testIgnoresOtherNonObjectsPasses() {
        // ignores other non-objects
        val schema = SingleDependency.SingleDependency1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = SingleDependency.SingleDependency1.getInstance()
        schema.validate(
            listOf(
                "bar"
            ),
            configuration
        )
    }

    @Test
    fun testNeitherPasses() {
        // neither
        val schema = SingleDependency.SingleDependency1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = SingleDependency.SingleDependency1.getInstance()
        schema.validate(
            "foobar",
            configuration
        )
    }
}
