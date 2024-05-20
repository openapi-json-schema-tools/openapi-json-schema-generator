package org.openapijsonschematools.client.components.schemas

import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException

import kotlin.test.Test
import kotlin.test.assertFailsWith

class UniqueitemsValidationTest {
    companion object {
        val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().format().build())
    }

    @Test
    fun testNonUniqueArrayOfMoreThanTwoIntegersIsInvalidFails() {
        // non-unique array of more than two integers is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        1,
                        2,
                        1
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNonUniqueArrayOfObjectsIsInvalidFails() {
        // non-unique array of objects is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testATrueAndA1AreUniquePasses() {
        // {\\\&quot;a\\\&quot;: true} and {\\\&quot;a\\\&quot;: 1} are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "a",
                        true
                    )
                ),
                mapOf(
                    Pair(
                        "a",
                        1
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun test1AndTrueAreUniquePasses() {
        // [1] and [true] are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                listOf(
                    1
                ),
                listOf(
                    true
                )
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfIntegersIsInvalidFails() {
        // non-unique array of integers is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        1,
                        1
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNested0AndFalseAreUniquePasses() {
        // nested [0] and [false] are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                listOf(
                    listOf(
                        0
                    ),
                    "foo"
                ),
                listOf(
                    listOf(
                        false
                    ),
                    "foo"
                )
            ),
            configuration
        )
    }

    @Test
    fun testObjectsAreNonUniqueDespiteKeyOrderFails() {
        // objects are non-unique despite key order
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        mapOf(
                            Pair(
                                "a",
                                1
                            ),
                            Pair(
                                "b",
                                2
                            )
                        ),
                        mapOf(
                            Pair(
                                "b",
                                2
                            ),
                            Pair(
                                "a",
                                1
                            )
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNonUniqueArrayOfArraysIsInvalidFails() {
        // non-unique array of arrays is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testAFalseAndA0AreUniquePasses() {
        // {\\\&quot;a\\\&quot;: false} and {\\\&quot;a\\\&quot;: 0} are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "a",
                        false
                    )
                ),
                mapOf(
                    Pair(
                        "a",
                        0
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfMoreThanTwoArraysIsInvalidFails() {
        // non-unique array of more than two arrays is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        listOf(
                            "foo"
                        ),
                        listOf(
                            "bar"
                        ),
                        listOf(
                            "foo"
                        )
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun test0AndFalseAreUniquePasses() {
        // [0] and [false] are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                listOf(
                    0
                ),
                listOf(
                    false
                )
            ),
            configuration
        )
    }

    @Test
    fun testNonUniqueArrayOfNestedObjectsIsInvalidFails() {
        // non-unique array of nested objects is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }

    @Test
    fun testNumbersAreUniqueIfMathematicallyUnequalFails() {
        // numbers are unique if mathematically unequal
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        1.0,
                        1.0,
                        1
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testNonUniqueArrayOfStringsIsInvalidFails() {
        // non-unique array of strings is invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
                schema.validate(
                    listOf(
                        "foo",
                        "bar",
                        "foo"
                    ),
                    configuration
                )
            }
        )
    }

    @Test
    fun testUniqueArrayOfNestedObjectsIsValidPasses() {
        // unique array of nested objects is valid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
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
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
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
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                true
            ),
            configuration
        )
    }

    @Test
    fun testNested1AndTrueAreUniquePasses() {
        // nested [1] and [true] are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                listOf(
                    listOf(
                        1
                    ),
                    "foo"
                ),
                listOf(
                    listOf(
                        true
                    ),
                    "foo"
                )
            ),
            configuration
        )
    }

    @Test
    fun testUniqueArrayOfStringsIsValidPasses() {
        // unique array of strings is valid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                "foo",
                "bar",
                "baz"
            ),
            configuration
        )
    }

    @Test
    fun testFalseIsNotEqualToZeroPasses() {
        // false is not equal to zero
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
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
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                1,
                2
            ),
            configuration
        )
    }

    @Test
    fun testDifferentObjectsAreUniquePasses() {
        // different objects are unique
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf(
                    Pair(
                        "a",
                        1
                    ),
                    Pair(
                        "b",
                        2
                    )
                ),
                mapOf(
                    Pair(
                        "a",
                        2
                    ),
                    Pair(
                        "b",
                        1
                    )
                )
            ),
            configuration
        )
    }

    @Test
    fun testUniqueHeterogeneousTypesAreValidPasses() {
        // unique heterogeneous types are valid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        schema.validate(
            listOf(
                mapOf<Any?, Any?>(
                ),
                listOf(
                    1
                ),
                true,
                null,
                1,
                "{}"
            ),
            configuration
        )
    }

    @Test
    fun testUniqueArrayOfObjectsIsValidPasses() {
        // unique array of objects is valid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
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
    fun testNonUniqueHeterogeneousTypesAreInvalidFails() {
        // non-unique heterogeneous types are invalid
        val schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance()
        assertFailsWith<ValidationException>(
            block = {
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
        )
    }
}
