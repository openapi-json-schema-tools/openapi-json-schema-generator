package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class ASchemaGivenForPrefixitemsTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testCorrectTypesPasses() {
        // correct types
        val schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance()
        schema.validate(
            ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder()
                .add(1)

                .add("foo")

            .build(),
            configuration
        )
    }

    @Test
    fun testArrayWithAdditionalItemsPasses() {
        // array with additional items
        val schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance()
        schema.validate(
            ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder()
                .add(1)

                .add("foo")

                .add(true)

            .build(),
            configuration
        )
    }

    @Test
    fun testJavascriptPseudoArrayIsValidPasses() {
        // JavaScript pseudo-array is valid
        val schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance()
        schema.validate(
            mapOf(
                Pair(
                    "0",
                    "invalid"
                ),
                Pair(
                    "1",
                    "valid"
                ),
                Pair(
                    "length",
                    2
                )
            ),
            configuration
        )
    }

    @Test
    fun testEmptyArrayPasses() {
        // empty array
        val schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance()
        schema.validate(
            ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder()
            .build(),
            configuration
        )
    }

    @Test
    fun testWrongTypesFails() {
        // wrong types
        val schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        "foo",
                        1
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testIncompleteArrayOfItemsPasses() {
        // incomplete array of items
        val schema = ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1.getInstance()
        schema.validate(
            ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder()
                .add(1)

            .build(),
            configuration
        )
    }
}
