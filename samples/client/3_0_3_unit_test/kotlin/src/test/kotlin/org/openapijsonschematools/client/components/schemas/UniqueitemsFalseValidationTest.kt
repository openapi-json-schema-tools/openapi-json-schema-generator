package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UniqueitemsFalseValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testNumbersAreUniqueIfMathematicallyUnequalPasses() {
        // numbers are unique if mathematically unequal
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                1.0,
                1.0,
                1
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfIntegersIsValidPasses() {
        // non-unique array of integers is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                1
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfObjectsIsValidPasses() {
        // non-unique array of objects is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "foo",
                        "bar"
                    )
                ),
                mapOf(
                    Pair(
                        "foo",
                        "bar"
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfArraysIsValidPasses() {
        // non-unique array of arrays is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                listOf(
                    "foo"
                ),
                listOf(
                    "foo"
                )
            ),
            configuration
        )
    }

    @Test
    fun test1AndTrueAreUniquePasses() {
        // 1 and true are unique
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                true
            ),
            configuration
        )
    }

    @Test
    fun testUniqueArrayOfNestedObjectsIsValidPasses() {
        // unique array of nested objects is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "foo",
                        mapOf(
                            Pair(
                                "bar",
                                mapOf(
                                    Pair(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                mapOf(
                    Pair(
                        "foo",
                        mapOf(
                            Pair(
                                "bar",
                                mapOf(
                                    Pair(
                                        "baz",
                                        false
                                    )
                                )
                            )
                        )
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testUniqueArrayOfArraysIsValidPasses() {
        // unique array of arrays is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                listOf(
                    "foo"
                ),
                listOf(
                    "bar"
                )
            ),
            configuration
        )
    }

    @Test
    fun testTrueIsNotEqualToOnePasses() {
        // true is not equal to one
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                true
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueHeterogeneousTypesAreValidPasses() {
        // non-unique heterogeneous types are valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf<Any?, Any?>(
                ),
                listOf(
                    1
                ),
                true,
                null,
                mapOf<Any?, Any?>(
                ),
                1
            ),
            configuration
        )
    }

    @Test
    fun testFalseIsNotEqualToZeroPasses() {
        // false is not equal to zero
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                0,
                false
            ),
            configuration
        )
    }

    @Test
    fun testUniqueArrayOfIntegersIsValidPasses() {
        // unique array of integers is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                2
            ),
            configuration
        )
    }

    @Test
    fun test0AndFalseAreUniquePasses() {
        // 0 and false are unique
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                0,
                false
            ),
            configuration
        )
    }

    @Test
    fun testUniqueHeterogeneousTypesAreValidPasses() {
        // unique heterogeneous types are valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf<Any?, Any?>(
                ),
                listOf(
                    1
                ),
                true,
                null,
                1
            ),
            configuration
        )
    }

    @Test
    fun testUniqueArrayOfObjectsIsValidPasses() {
        // unique array of objects is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "foo",
                        "bar"
                    )
                ),
                mapOf(
                    Pair(
                        "foo",
                        "baz"
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfNestedObjectsIsValidPasses() {
        // non-unique array of nested objects is valid
        val schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "foo",
                        mapOf(
                            Pair(
                                "bar",
                                mapOf(
                                    Pair(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                mapOf(
                    Pair(
                        "foo",
                        mapOf(
                            Pair(
                                "bar",
                                mapOf(
                                    Pair(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                )
            ),
            configuration
        )
    }
}
