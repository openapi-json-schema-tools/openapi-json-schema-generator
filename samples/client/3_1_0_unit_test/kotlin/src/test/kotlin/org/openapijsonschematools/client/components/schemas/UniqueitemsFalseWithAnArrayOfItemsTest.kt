package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UniqueitemsFalseWithAnArrayOfItemsTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testFalseFalseFromItemsArrayIsValidPasses() {
        // [false, false] from items array is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(false)

            .build(),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayExtendedFromFalseTrueIsValidPasses() {
        // non-unique array extended from [false, true] is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

                .add("foo")

                .add("foo")

            .build(),
            configuration
        )
    }

    @Test
    fun testTrueTrueFromItemsArrayIsValidPasses() {
        // [true, true] from items array is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(true)

            .build(),
            configuration
        )
    }

    @Test
    fun testUniqueArrayExtendedFromFalseTrueIsValidPasses() {
        // unique array extended from [false, true] is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

                .add("foo")

                .add("bar")

            .build(),
            configuration
        )
    }

    @Test
    fun testUniqueArrayExtendedFromTrueFalseIsValidPasses() {
        // unique array extended from [true, false] is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

                .add("foo")

                .add("bar")

            .build(),
            configuration
        )
    }

    @Test
    fun testFalseTrueFromItemsArrayIsValidPasses() {
        // [false, true] from items array is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(false)

                .add(true)

            .build(),
            configuration
        )
    }

    @Test
    fun testTrueFalseFromItemsArrayIsValidPasses() {
        // [true, false] from items array is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

            .build(),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayExtendedFromTrueFalseIsValidPasses() {
        // non-unique array extended from [true, false] is valid
        val schema = UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1.getInstance()
        schema.validate(
            UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder()
                .add(true)

                .add(false)

                .add("foo")

                .add("foo")

            .build(),
            configuration
        )
    }
}
