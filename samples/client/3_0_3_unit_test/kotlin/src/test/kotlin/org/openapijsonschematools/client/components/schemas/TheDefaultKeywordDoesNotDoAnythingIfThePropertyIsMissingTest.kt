package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissingTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testMissingPropertiesAreNotFilledInWithTheDefaultPasses() {
        // missing properties are not filled in with the default
        val schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testAnExplicitPropertyValueIsCheckedAgainstMaximumPassingPasses() {
        // an explicit property value is checked against maximum (passing)
        val schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "alpha",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testAnExplicitPropertyValueIsCheckedAgainstMaximumFailingFails() {
        // an explicit property value is checked against maximum (failing)
        val schema = TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing.TheDefaultKeywordDoesNotDoAnythingIfThePropertyIsMissing1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "alpha",
                            5
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
