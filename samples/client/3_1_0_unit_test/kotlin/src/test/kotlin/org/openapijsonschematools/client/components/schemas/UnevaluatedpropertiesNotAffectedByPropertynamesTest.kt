package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UnevaluatedpropertiesNotAffectedByPropertynamesTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAllowsOnlyNumberPropertiesPasses() {
        // allows only number properties
        val schema = UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "a",
                    1
                )
            ),
            configuration
        )
    }

    @Test
    fun testStringPropertyIsInvalidFails() {
        // string property is invalid
        val schema = UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    mapOf(
                        Pair(
                            "a",
                            "b"
                        )
                    ),
                    configuration
                )
            }
        )
    }
}
