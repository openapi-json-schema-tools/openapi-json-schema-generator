package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class NestedItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNestedArrayWithInvalidTypeFails() {
        // nested array with invalid type
        final var schema = NestedItems.NestedItems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    Arrays.asList(
                        Arrays.asList(
                            Arrays.asList(
                                "1"
                            )
                        ),
                        Arrays.asList(
                            Arrays.asList(
                                2L
                            ),
                            Arrays.asList(
                                3L
                            )
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            Arrays.asList(
                                4L
                            ),
                            Arrays.asList(
                                5L
                            ),
                            Arrays.asList(
                                6L
                            )
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testNotDeepEnoughFails() {
        // not deep enough
        final var schema = NestedItems.NestedItems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    Arrays.asList(
                        Arrays.asList(
                            1L
                        ),
                        Arrays.asList(
                            2L
                        ),
                        Arrays.asList(
                            3L
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            4L
                        ),
                        Arrays.asList(
                            5L
                        ),
                        Arrays.asList(
                            6L
                        )
                    )
                ),
                configuration
            );
            throw new RuntimeException("A different exception must be thrown");
        } catch (ValidationException | InvalidTypeException ignored) {
            ;
        }
    }

    @Test
    public void testValidNestedArrayPasses() {
        // valid nested array
        final var schema = NestedItems.NestedItems1.getInstance();
        schema.validate(
            Arrays.asList(
                Arrays.asList(
                    Arrays.asList(
                        Arrays.asList(
                            1L
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            2L
                        ),
                        Arrays.asList(
                            3L
                        )
                    )
                ),
                Arrays.asList(
                    Arrays.asList(
                        Arrays.asList(
                            4L
                        ),
                        Arrays.asList(
                            5L
                        ),
                        Arrays.asList(
                            6L
                        )
                    )
                )
            ),
            configuration
        );
    }
}
