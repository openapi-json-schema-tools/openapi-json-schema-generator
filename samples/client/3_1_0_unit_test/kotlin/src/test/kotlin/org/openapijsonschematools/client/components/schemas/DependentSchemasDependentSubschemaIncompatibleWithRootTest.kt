package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class DependentSchemasDependentSubschemaIncompatibleWithRootTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testMatchesRootFails() {
        // matches root
        val schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testMatchesDependencyPasses() {
        // matches dependency
        val schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "bar",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testNoDependencyPasses() {
        // no dependency
        val schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "baz",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testMatchesBothFails() {
        // matches both
        val schema = DependentSchemasDependentSubschemaIncompatibleWithRoot.DependentSchemasDependentSubschemaIncompatibleWithRoot1.getInstance()
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
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
