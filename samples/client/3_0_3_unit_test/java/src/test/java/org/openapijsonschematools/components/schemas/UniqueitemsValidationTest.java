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

public class UniqueitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNonUniqueArrayOfMoreThanTwoIntegersIsInvalidFails() {
        // non-unique array of more than two integers is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                1,
                2,
                1
            ),
            configuration
        ));
    }

    @Test
    public void testNonUniqueArrayOfObjectsIsInvalidFails() {
        // non-unique array of objects is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
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
        ));
    }

    @Test
    public void testATrueAndA1AreUniquePasses() {
        // {&quot;a&quot;: true} and {&quot;a&quot;: 1} are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        true
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        1
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void test1AndTrueAreUniquePasses() {
        // [1] and [true] are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Arrays.asList(
                    1
                ),
                Arrays.asList(
                    true
                )
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfIntegersIsInvalidFails() {
        // non-unique array of integers is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                1,
                1
            ),
            configuration
        ));
    }

    @Test
    public void testNested0AndFalseAreUniquePasses() {
        // nested [0] and [false] are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Arrays.asList(
                    Arrays.asList(
                        0
                    ),
                    "foo"
                ),
                Arrays.asList(
                    Arrays.asList(
                        false
                    ),
                    "foo"
                )
            ),
            configuration
        );
    }

    @Test
    public void testObjectsAreNonUniqueDespiteKeyOrderFails() {
        // objects are non-unique despite key order
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        1
                    ),
                    new AbstractMap.SimpleEntry<>(
                        "b",
                        2
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "b",
                        2
                    ),
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        1
                    )
                )
            ),
            configuration
        ));
    }

    @Test
    public void testNonUniqueArrayOfArraysIsInvalidFails() {
        // non-unique array of arrays is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                Arrays.asList(
                    "foo"
                ),
                Arrays.asList(
                    "foo"
                )
            ),
            configuration
        ));
    }

    @Test
    public void testAFalseAndA0AreUniquePasses() {
        // {&quot;a&quot;: false} and {&quot;a&quot;: 0} are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        false
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        0
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfMoreThanTwoArraysIsInvalidFails() {
        // non-unique array of more than two arrays is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                Arrays.asList(
                    "foo"
                ),
                Arrays.asList(
                    "bar"
                ),
                Arrays.asList(
                    "foo"
                )
            ),
            configuration
        ));
    }

    @Test
    public void test0AndFalseAreUniquePasses() {
        // [0] and [false] are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Arrays.asList(
                    0
                ),
                Arrays.asList(
                    false
                )
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfNestedObjectsIsInvalidFails() {
        // non-unique array of nested objects is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
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
        ));
    }

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalFails() {
        // numbers are unique if mathematically unequal
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                1.0,
                1.0,
                1
            ),
            configuration
        ));
    }

    @Test
    public void testNonUniqueArrayOfStringsIsInvalidFails() {
        // non-unique array of strings is invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
            Arrays.asList(
                "foo",
                "bar",
                "foo"
            ),
            configuration
        ));
    }

    @Test
    public void testUniqueArrayOfNestedObjectsIsValidPasses() {
        // unique array of nested objects is valid
        UniqueitemsValidation.UniqueitemsValidation1.validate(
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
        UniqueitemsValidation.UniqueitemsValidation1.validate(
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
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                1,
                true
            ),
            configuration
        );
    }

    @Test
    public void testNested1AndTrueAreUniquePasses() {
        // nested [1] and [true] are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Arrays.asList(
                    Arrays.asList(
                        1
                    ),
                    "foo"
                ),
                Arrays.asList(
                    Arrays.asList(
                        true
                    ),
                    "foo"
                )
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfStringsIsValidPasses() {
        // unique array of strings is valid
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                "foo",
                "bar",
                "baz"
            ),
            configuration
        );
    }

    @Test
    public void testFalseIsNotEqualToZeroPasses() {
        // false is not equal to zero
        UniqueitemsValidation.UniqueitemsValidation1.validate(
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
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testDifferentObjectsAreUniquePasses() {
        // different objects are unique
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        1
                    ),
                    new AbstractMap.SimpleEntry<>(
                        "b",
                        2
                    )
                ),
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        2
                    ),
                    new AbstractMap.SimpleEntry<>(
                        "b",
                        1
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testUniqueHeterogeneousTypesAreValidPasses() {
        // unique heterogeneous types are valid
        UniqueitemsValidation.UniqueitemsValidation1.validate(
            Arrays.asList(
                Map.ofEntries(
                ),
                Arrays.asList(
                    1
                ),
                true,
                (Void) null,
                1,
                "{}"
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfObjectsIsValidPasses() {
        // unique array of objects is valid
        UniqueitemsValidation.UniqueitemsValidation1.validate(
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
    public void testNonUniqueHeterogeneousTypesAreInvalidFails() {
        // non-unique heterogeneous types are invalid
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            UniqueitemsValidation.UniqueitemsValidation1.class,
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
        ));
    }
}
