package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class AdditionalpropertiesCanExistByItselfTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testAnAdditionalValidPropertyIsValidPasses() {
        // an additional valid property is valid
        val schema = AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "foo",
                    true
                )
            ),
            configuration
        )
    }

    @Test
    fun testAnAdditionalInvalidPropertyIsInvalidFails() {
        // an additional invalid property is invalid
        val schema = AdditionalpropertiesCanExistByItself.AdditionalpropertiesCanExistByItself1.getInstance()
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
}
