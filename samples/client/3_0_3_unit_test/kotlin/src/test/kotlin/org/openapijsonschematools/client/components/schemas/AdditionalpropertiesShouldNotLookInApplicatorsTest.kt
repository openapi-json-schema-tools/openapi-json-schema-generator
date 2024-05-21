package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AdditionalpropertiesShouldNotLookInApplicatorsTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testPropertiesDefinedInAllofAreNotExaminedFails() {
        // properties defined in allOf are not examined
        val schema = AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1.getInstance()
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
                            true
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testValidTestCasePasses() {
        // valid test case
        val schema = AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    false
                ),
                Pair(
                    "bar",
                    true
                )
            ),
            configuration
        )
    }
}
