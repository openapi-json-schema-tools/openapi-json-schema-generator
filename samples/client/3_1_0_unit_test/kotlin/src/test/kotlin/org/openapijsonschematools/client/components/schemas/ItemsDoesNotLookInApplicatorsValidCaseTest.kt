package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ItemsDoesNotLookInApplicatorsValidCaseTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testPrefixitemsInAllofDoesNotConstrainItemsValidCasePasses() {
        // prefixItems in allOf does not constrain items, valid case
        val schema = ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.getInstance()
        schema.validate(
            ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder()
                .add(5)

                .add(5)

            .build(),
            configuration
        )
    }

    @Test
    fun testPrefixitemsInAllofDoesNotConstrainItemsInvalidCaseFails() {
        // prefixItems in allOf does not constrain items, invalid case
        val schema = ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        3,
                        5
                    ),
                    configuration
                )
            }
        )
    }
}
