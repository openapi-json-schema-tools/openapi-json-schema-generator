package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap;

public class UniqueitemsFalseValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalPasses() {
        // numbers are unique if mathematically unequal
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                1.0,
                1.0,
                1
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfIntegersIsValidPasses() {
        // non-unique array of integers is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                1,
                1
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfObjectsIsValidPasses() {
        // non-unique array of objects is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "bar"
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "bar"
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfArraysIsValidPasses() {
        // non-unique array of arrays is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Arrays.asList(
                    "foo"
                ),
                Arrays.asList(
                    "foo"
                )
            ),
            configuration
        );
    }

    @Test
    public void test1AndTrueAreUniquePasses() {
        // 1 and true are unique
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                1,
                true
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfNestedObjectsIsValidPasses() {
        // unique array of nested objects is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        Map.ofEntries(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                Map.ofEntries(
                                    new AbstractMap.SimpleEntry<>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        Map.ofEntries(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                Map.ofEntries(
                                    new AbstractMap.SimpleEntry<>(
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
        );
    }

    @Test
    public void testUniqueArrayOfArraysIsValidPasses() {
        // unique array of arrays is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Arrays.asList(
                    "foo"
                ),
                Arrays.asList(
                    "bar"
                )
            ),
            configuration
        );
    }

    @Test
    public void testTrueIsNotEqualToOnePasses() {
        // true is not equal to one
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                1,
                true
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueHeterogeneousTypesAreValidPasses() {
        // non-unique heterogeneous types are valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                ),
                Arrays.asList(
                    1
                ),
                true,
                (Void) null,
                Map.ofEntries(
                ),
                1
            ),
            configuration
        );
    }

    @Test
    public void testFalseIsNotEqualToZeroPasses() {
        // false is not equal to zero
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                0,
                false
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfIntegersIsValidPasses() {
        // unique array of integers is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void test0AndFalseAreUniquePasses() {
        // 0 and false are unique
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                0,
                false
            ),
            configuration
        );
    }

    @Test
    public void testUniqueHeterogeneousTypesAreValidPasses() {
        // unique heterogeneous types are valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                ),
                Arrays.asList(
                    1
                ),
                true,
                (Void) null,
                1
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfObjectsIsValidPasses() {
        // unique array of objects is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "bar"
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "baz"
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfNestedObjectsIsValidPasses() {
        // non-unique array of nested objects is valid
        UniqueitemsFalseValidation.UniqueitemsFalseValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        Map.ofEntries(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                Map.ofEntries(
                                    new AbstractMap.SimpleEntry<>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        Map.ofEntries(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                Map.ofEntries(
                                    new AbstractMap.SimpleEntry<>(
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
        );
    }
}
