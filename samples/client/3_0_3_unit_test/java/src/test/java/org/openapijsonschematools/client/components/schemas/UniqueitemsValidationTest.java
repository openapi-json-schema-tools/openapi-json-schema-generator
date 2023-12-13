package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchemaFactory;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class UniqueitemsValidationTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final UniqueitemsValidation.UniqueitemsValidation1 schema = JsonSchemaFactory.getInstance(
        UniqueitemsValidation.UniqueitemsValidation1.class
    );

    @Test
    public void testNonUniqueArrayOfMoreThanTwoIntegersIsInvalidFails() {
        // non-unique array of more than two integers is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
            configuration
        ));
    }

    @Test
    public void testATrueAndA1AreUniquePasses() {
        // {\\\&quot;a\\\&quot;: true} and {\\\&quot;a\\\&quot;: 1} are unique
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
            configuration
        ));
    }

    @Test
    public void testNonUniqueArrayOfArraysIsInvalidFails() {
        // non-unique array of arrays is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        // {\\\&quot;a\\\&quot;: false} and {\\\&quot;a\\\&quot;: 0} are unique
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
            configuration
        ));
    }

    @Test
    public void testNumbersAreUniqueIfMathematicallyUnequalFails() {
        // numbers are unique if mathematically unequal
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
            Arrays.asList(
                1.0d,
                1.0d,
                1
            ),
            configuration
        ));
    }

    @Test
    public void testNonUniqueArrayOfStringsIsInvalidFails() {
        // non-unique array of strings is invalid
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
        Assert.assertThrows(ValidationException.class, () -> schema.validate(
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
            configuration
        ));
    }
}
