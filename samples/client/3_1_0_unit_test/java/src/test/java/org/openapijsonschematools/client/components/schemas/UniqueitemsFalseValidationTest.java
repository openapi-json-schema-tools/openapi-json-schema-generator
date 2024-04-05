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

public class UniqueitemsFalseValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalPasses() throws ValidationException {
        // numbers are unique if mathematically unequal
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1.0d,
                1.0d,
                1
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfIntegersIsValidPasses() throws ValidationException {
        // non-unique array of integers is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                1
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfObjectsIsValidPasses() throws ValidationException {
        // non-unique array of objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
    }

    @Test
    public void testNonUniqueArrayOfArraysIsValidPasses() throws ValidationException {
        // non-unique array of arrays is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
    }

    @Test
    public void test1AndTrueAreUniquePasses() throws ValidationException {
        // 1 and true are unique
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                true
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfNestedObjectsIsValidPasses() throws ValidationException {
        // unique array of nested objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                true
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueHeterogeneousTypesAreValidPasses() throws ValidationException {
        // non-unique heterogeneous types are valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
    }

    @Test
    public void testFalseIsNotEqualToZeroPasses() throws ValidationException {
        // false is not equal to zero
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1,
                2
            ),
            configuration
        );
    }

    @Test
    public void test0AndFalseAreUniquePasses() throws ValidationException {
        // 0 and false are unique
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                0,
                false
            ),
            configuration
        );
    }

    @Test
    public void testUniqueHeterogeneousTypesAreValidPasses() throws ValidationException {
        // unique heterogeneous types are valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapUtils.makeMap(
                ),
                Arrays.asList(
                    1
                ),
                true,
                null,
                1
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfObjectsIsValidPasses() throws ValidationException {
        // unique array of objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
    public void testNonUniqueArrayOfNestedObjectsIsValidPasses() throws ValidationException {
        // non-unique array of nested objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
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
    }
}
