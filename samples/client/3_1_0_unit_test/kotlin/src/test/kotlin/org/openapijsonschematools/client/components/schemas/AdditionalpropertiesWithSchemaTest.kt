package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AdditionalpropertiesWithSchemaTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testNoAdditionalPropertiesIsValidPasses() {
        // no additional properties is valid
        val schema = AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1.getInstance()
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
    fun testAnAdditionalValidPropertyIsValidPasses() {
        // an additional valid property is valid
        val schema = AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1.getInstance()
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
                    true
                )
            ),
            configuration
        )
    }

    @Test
    fun testAnAdditionalInvalidPropertyIsInvalidFails() {
        // an additional invalid property is invalid
        val schema = AdditionalpropertiesWithSchema.AdditionalpropertiesWithSchema1.getInstance()
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
                            "quux",
                            12
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
