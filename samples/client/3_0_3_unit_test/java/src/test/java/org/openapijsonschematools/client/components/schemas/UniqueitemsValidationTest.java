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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;
import java.util.LinkedHashSet;

public class UniqueitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testNonUniqueArrayOfMoreThanTwoIntegersIsInvalidFails() {
        // non-unique array of more than two integers is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                1,
                2,
                1
            ),
            validationMetadata
        ));
    }

    @Test
    public void testNonUniqueArrayOfObjectsIsInvalidFails() {
        // non-unique array of objects is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "bar"
                    )
                ),
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "bar"
                    )
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testATrueAndA1AreUniquePasses() {
        // {\\\&quot;a\\\&quot;: true} and {\\\&quot;a\\\&quot;: 1} are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        true
                    )
                ),
                MapMaker.makeMap(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                1,
                1
            ),
            validationMetadata
        ));
    }

    @Test
    public void testNested0AndFalseAreUniquePasses() {
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        1
                    ),
                    new AbstractMap.SimpleEntry<>(
                        "b",
                        2
                    )
                ),
                MapMaker.makeMap(
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
            validationMetadata
        ));
    }

    @Test
    public void testNonUniqueArrayOfArraysIsInvalidFails() {
        // non-unique array of arrays is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                Arrays.asList(
                    "foo"
                ),
                Arrays.asList(
                    "foo"
                )
            ),
            validationMetadata
        ));
    }

    @Test
    public void testAFalseAndA0AreUniquePasses() {
        // {\\\&quot;a\\\&quot;: false} and {\\\&quot;a\\\&quot;: 0} are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        false
                    )
                ),
                MapMaker.makeMap(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
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
            validationMetadata
        ));
    }

    @Test
    public void test0AndFalseAreUniquePasses() {
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                MapMaker.makeMap(
                                    new AbstractMap.SimpleEntry<>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                MapMaker.makeMap(
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
            validationMetadata
        ));
    }

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalFails() {
        // numbers are unique if mathematically unequal
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                1.0d,
                1.0d,
                1
            ),
            validationMetadata
        ));
    }

    @Test
    public void testNonUniqueArrayOfStringsIsInvalidFails() {
        // non-unique array of strings is invalid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                "foo",
                "bar",
                "foo"
            ),
            validationMetadata
        ));
    }

    @Test
    public void testUniqueArrayOfNestedObjectsIsValidPasses() {
        // unique array of nested objects is valid
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                MapMaker.makeMap(
                                    new AbstractMap.SimpleEntry<>(
                                        "baz",
                                        true
                                    )
                                )
                            )
                        )
                    )
                ),
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        MapMaker.makeMap(
                            new AbstractMap.SimpleEntry<>(
                                "bar",
                                MapMaker.makeMap(
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
    public void testTrueIsNotEqualToOnePasses() {
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
    public void testNested1AndTrueAreUniquePasses() {
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
    public void testUniqueArrayOfStringsIsValidPasses() {
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
    public void testFalseIsNotEqualToZeroPasses() {
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
    public void testUniqueArrayOfIntegersIsValidPasses() {
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
    public void testDifferentObjectsAreUniquePasses() {
        // different objects are unique
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "a",
                        1
                    ),
                    new AbstractMap.SimpleEntry<>(
                        "b",
                        2
                    )
                ),
                MapMaker.makeMap(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        schema.validate(
            Arrays.asList(
                MapMaker.makeMap(
                    new AbstractMap.SimpleEntry<>(
                        "foo",
                        "bar"
                    )
                ),
                MapMaker.makeMap(
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
        final var schema = UniqueitemsValidation.UniqueitemsValidation1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
            Arrays.asList(
                MapMaker.makeMap(
                ),
                Arrays.asList(
                    1
                ),
                true,
                (Void) null,
                MapMaker.makeMap(
                ),
                1
            ),
            validationMetadata
        ));
    }
}
