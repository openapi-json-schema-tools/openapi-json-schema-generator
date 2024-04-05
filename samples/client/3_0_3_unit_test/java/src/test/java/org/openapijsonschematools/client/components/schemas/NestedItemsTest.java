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

public class NestedItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.onlyFormat());

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
                                2
                            ),
                            Arrays.asList(
                                3
                            )
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            Arrays.asList(
                                4
                            ),
                            Arrays.asList(
                                5
                            ),
                            Arrays.asList(
                                6
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
    public void testNotDeepEnoughFails() {
        // not deep enough
        final var schema = NestedItems.NestedItems1.getInstance();
        try {
            schema.validate(
                Arrays.asList(
                    Arrays.asList(
                        Arrays.asList(
                            1
                        ),
                        Arrays.asList(
                            2
                        ),
                        Arrays.asList(
                            3
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            4
                        ),
                        Arrays.asList(
                            5
                        ),
                        Arrays.asList(
                            6
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
    public void testValidNestedArrayPasses() throws ValidationException {
        // valid nested array
        final var schema = NestedItems.NestedItems1.getInstance();
        schema.validate(
            new NestedItems.NestedItemsListBuilder()
                .add(
                    Arrays.asList(
                        Arrays.asList(
                            Arrays.asList(
                                1
                            )
                        ),
                        Arrays.asList(
                            Arrays.asList(
                                2
                            ),
                            Arrays.asList(
                                3
                            )
                        )
                    )
                )
                .add(
                    Arrays.asList(
                        Arrays.asList(
                            Arrays.asList(
                                4
                            ),
                            Arrays.asList(
                                5
                            ),
                            Arrays.asList(
                                6
                            )
                        )
                    )
                )
            .build(),
            configuration
        );
    }
}
