package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class UniqueitemsFalseValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalPasses() {
        // numbers are unique if mathematically unequal
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1.0d,
                1.0d,
                1L
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfIntegersIsValidPasses() {
        // non-unique array of integers is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                1L
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueArrayOfObjectsIsValidPasses() {
        // non-unique array of objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "bar"
                    )
                ),
                MapMaker.makeMap(
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
    public void testNonUniqueArrayOfArraysIsValidPasses() {
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
    public void test1AndTrueAreUniquePasses() {
        // 1 and true are unique
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                true
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfNestedObjectsIsValidPasses() {
        // unique array of nested objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Map>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<String, Map>(
                                "bar",
                                MapMaker.makeMap(
                                    new AbstractMap.SimpleEntry<String, Boolean>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Map>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<String, Map>(
                                "bar",
                                MapMaker.makeMap(
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
    public void testUniqueArrayOfArraysIsValidPasses() {
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
    public void testTrueIsNotEqualToOnePasses() {
        // true is not equal to one
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                true
            ),
            configuration
        );
    }

    @Test
    public void testNonUniqueHeterogeneousTypesAreValidPasses() {
        // non-unique heterogeneous types are valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                ),
                Arrays.asList(
                    1L
                ),
                true,
                null,
                MapMaker.makeMap(
                ),
                1L
            ),
            configuration
        );
    }

    @Test
    public void testFalseIsNotEqualToZeroPasses() {
        // false is not equal to zero
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                0L,
                false
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfIntegersIsValidPasses() {
        // unique array of integers is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                1L,
                2L
            ),
            configuration
        );
    }

    @Test
    public void test0AndFalseAreUniquePasses() {
        // 0 and false are unique
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                0L,
                false
            ),
            configuration
        );
    }

    @Test
    public void testUniqueHeterogeneousTypesAreValidPasses() {
        // unique heterogeneous types are valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                ),
                Arrays.asList(
                    1L
                ),
                true,
                null,
                1L
            ),
            configuration
        );
    }

    @Test
    public void testUniqueArrayOfObjectsIsValidPasses() {
        // unique array of objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "foo",
                        "bar"
                    )
                ),
                MapMaker.makeMap(
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
    public void testNonUniqueArrayOfNestedObjectsIsValidPasses() {
        // non-unique array of nested objects is valid
        final var schema = UniqueitemsFalseValidation.UniqueitemsFalseValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Map>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<String, Map>(
                                "bar",
                                MapMaker.makeMap(
                                    new AbstractMap.SimpleEntry<String, Boolean>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<String, Map>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<String, Map>(
                                "bar",
                                MapMaker.makeMap(
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
