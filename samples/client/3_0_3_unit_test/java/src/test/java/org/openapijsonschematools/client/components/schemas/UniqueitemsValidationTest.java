package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class UniqueitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().format().build());

    @Test
    public void testNonUniqueArrayOfMoreThanTwoIntegersIsInvalidFails() {
        // non-unique array of more than two integers is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    1,
                    2,
                    1
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNonUniqueArrayOfObjectsIsInvalidFails() {
        // non-unique array of objects is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, String>(
                            "foo",
                            "bar"
                        )
                    ),
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, String>(
                            "foo",
                            "bar"
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testATrueAndA1AreUniquePasses() throws ValidationException {
        // {\\\&quot;a\\\&quot;: true} and {\\\&quot;a\\\&quot;: 1} are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Boolean>(
                        "a",
                        true
                    )
                ),
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "a",
                        1
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void test1AndTrueAreUniquePasses() throws ValidationException {
        // [1] and [true] are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    1,
                    1
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNested0AndFalseAreUniquePasses() throws ValidationException {
        // nested [0] and [false] are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, Number>(
                            "a",
                            1
                        ),
                        new AbstractMap.SimpleEntry<String, Number>(
                            "b",
                            2
                        )
                    ),
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, Number>(
                            "b",
                            2
                        ),
                        new AbstractMap.SimpleEntry<String, Number>(
                            "a",
                            1
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNonUniqueArrayOfArraysIsInvalidFails() {
        // non-unique array of arrays is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
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
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testAFalseAndA0AreUniquePasses() throws ValidationException {
        // {\\\&quot;a\\\&quot;: false} and {\\\&quot;a\\\&quot;: 0} are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Boolean>(
                        "a",
                        false
                    )
                ),
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
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
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void test0AndFalseAreUniquePasses() throws ValidationException {
        // [0] and [false] are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                            "foo",
                            MapUtils.makeMap(
                                new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                                    "bar",
                                    MapUtils.makeMap(
                                        new AbstractMap.SimpleEntry<String, Boolean>(
                                            "baz",
                                            true
                                        )
                                    )
                                )
                            )
                        )
                    ),
                    MapUtils.makeMap(
                        new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                            "foo",
                            MapUtils.makeMap(
                                new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                                    "bar",
                                    MapUtils.makeMap(
                                        new AbstractMap.SimpleEntry<String, Boolean>(
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
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalFails() {
        // numbers are unique if mathematically unequal
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    1.0d,
                    1.0d,
                    1
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testNonUniqueArrayOfStringsIsInvalidFails() {
        // non-unique array of strings is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    "foo",
                    "bar",
                    "foo"
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }

    @Test
    public void testUniqueArrayOfNestedObjectsIsValidPasses() throws ValidationException {
        // unique array of nested objects is valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "foo",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                                "bar",
                                MapUtils.makeMap(
                                    new AbstractMap.SimpleEntry<String, Boolean>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                        "foo",
                        MapUtils.makeMap(
                            new AbstractMap.SimpleEntry<String, Map<String, ?>>(
                                "bar",
                                MapUtils.makeMap(
                                    new AbstractMap.SimpleEntry<String, Boolean>(
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
    public void testUniqueArrayOfArraysIsValidPasses() throws ValidationException {
        // unique array of arrays is valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
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
    public void testTrueIsNotEqualToOnePasses() throws ValidationException {
        // true is not equal to one
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                true
            ),
            configuration
        );
    }

    @Test
    public void testNested1AndTrueAreUniquePasses() throws ValidationException {
        // nested [1] and [true] are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
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
    public void testUniqueArrayOfStringsIsValidPasses() throws ValidationException {
        // unique array of strings is valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                "foo",
                "bar",
                "baz"
            ),
            configuration
        );
    }

    @Test
    public void testFalseIsNotEqualToZeroPasses() throws ValidationException {
        // false is not equal to zero
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                0,
                false
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfIntegersIsValidPasses() throws ValidationException {
        // unique array of integers is valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void testDifferentObjectsAreUniquePasses() throws ValidationException {
        // different objects are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "a",
                        1
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "b",
                        2
                    )
                ),
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, Number>(
                        "a",
                        2
                    ),
                    new AbstractMap.SimpleEntry<String, Number>(
                        "b",
                        1
                    )
                )
            ),
            configuration
        );
    }

    @Test
    public void testUniqueHeterogeneousTypesAreValidPasses() throws ValidationException {
        // unique heterogeneous types are valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                ),
                Arrays.asList(
                    1
                ),
                true,
                null,
                1,
                "{}"
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfObjectsIsValidPasses() throws ValidationException {
        // unique array of objects is valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "bar"
                    )
                ),
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    MapUtils.makeMap(
                    ),
                    Arrays.asList(
                        1
                    ),
                    true,
                    null,
                    MapUtils.makeMap(
                    ),
                    1
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException ignored) {
            ;
        }
    }
}
