package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ContainsKeywordValidationTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testArrayWithTwoItemsMatchingSchema56IsValidPasses() {
        // array with two items matching schema (5, 6) is valid
        val schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance()
        schema.validate(
            listOf(
                3,
                4,
                5,
                6
            ),
            configuration
        )
    }

    @Test
    fun testNotArrayIsValidPasses() {
        // not array is valid
        val schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance()
        schema.validate(
            mapOf<Any?, Any?>(
            ),
            configuration
        )
    }

    @Test
    fun testArrayWithItemMatchingSchema5IsValidPasses() {
        // array with item matching schema (5) is valid
        val schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance()
        schema.validate(
            listOf(
                3,
                4,
                5
            ),
            configuration
        )
    }

    @Test
    fun testArrayWithItemMatchingSchema6IsValidPasses() {
        // array with item matching schema (6) is valid
        val schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance()
        schema.validate(
            listOf(
                3,
                4,
                6
            ),
            configuration
        )
    }

    @Test
    fun testArrayWithoutItemsMatchingSchemaIsInvalidFails() {
        // array without items matching schema is invalid
        val schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        2,
                        3,
                        4
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testEmptyArrayIsInvalidFails() {
        // empty array is invalid
        val schema = ContainsKeywordValidation.ContainsKeywordValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf<Any?>(
                    ),
                    configuration
                )
            }
        )
    }
}
