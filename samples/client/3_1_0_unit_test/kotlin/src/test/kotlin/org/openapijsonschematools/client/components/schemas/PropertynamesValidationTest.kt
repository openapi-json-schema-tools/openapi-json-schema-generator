package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class PropertynamesValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testSomePropertyNamesInvalidFails() {
        // some property names invalid
        val schema = PropertynamesValidation.PropertynamesValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "foo",
                            mapOf<Any?, Any?>(
                            )
                        ),
                        Pair(
                            "foobar",
                            mapOf<Any?, Any?>(
                            )
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
        val schema = PropertynamesValidation.PropertynamesValidation1.getInstance()
        schema.validate(
            12,
            configuration
        )
    }

    @Test
    fun testAllPropertyNamesValidPasses() {
        // all property names valid
        val schema = PropertynamesValidation.PropertynamesValidation1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "f",
                    mapOf<Any?, Any?>(
                    )
                ),
                Pair(
                    "foo",
                    mapOf<Any?, Any?>(
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testObjectWithoutPropertiesIsValidPasses() {
        // object without properties is valid
        val schema = PropertynamesValidation.PropertynamesValidation1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresArraysPasses() {
        // ignores arrays
        val schema = PropertynamesValidation.PropertynamesValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                2,
                3,
                4
            ),
            configuration
        )
    }

    @Test
    fun testIgnoresStringsPasses() {
        // ignores strings
        val schema = PropertynamesValidation.PropertynamesValidation1.getInstance()
        schema.validate(
            "foobar",
            configuration
        )
    }
}
