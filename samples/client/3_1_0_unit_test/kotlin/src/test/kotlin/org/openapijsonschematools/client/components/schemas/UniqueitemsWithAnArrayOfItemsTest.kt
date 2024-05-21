package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeyword
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UniqueitemsWithAnArrayOfItemsTest {
    companion object {
        val configuration = SchemaConfiguration(disabledKeywordFlags=setOf(JsonSchemaKeyword.FORMAT))
    }

    @Test
    fun testTrueTrueFromItemsArrayIsNotValidFails() {
        // [true, true] from items array is not valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        true,
                        true
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testUniqueArrayExtendedFromFalseTrueIsValidPasses() {
        // unique array extended from [false, true] is valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

                .add("foo")

                .add("bar")

            .build(),
            configuration
        )
    }

    @Test
    fun testFalseFalseFromItemsArrayIsNotValidFails() {
        // [false, false] from items array is not valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        false,
                        false
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testUniqueArrayExtendedFromTrueFalseIsValidPasses() {
        // unique array extended from [true, false] is valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

                .add("foo")

                .add("bar")

            .build(),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayExtendedFromFalseTrueIsNotValidFails() {
        // non-unique array extended from [false, true] is not valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        false,
                        true,
                        "foo",
                        "foo"
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNonUniqueArrayExtendedFromTrueFalseIsNotValidFails() {
        // non-unique array extended from [true, false] is not valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        true,
                        false,
                        "foo",
                        "foo"
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testFalseTrueFromItemsArrayIsValidPasses() {
        // [false, true] from items array is valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

            .build(),
            configuration
        )
    }

    @Test
    fun testTrueFalseFromItemsArrayIsValidPasses() {
        // [true, false] from items array is valid
        val schema = UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

            .build(),
            configuration
        )
    }
}
