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

public class NestedItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
    static final ValidationMetadata validationMetadata = new ValidationMetadata(
            List.of("args[0"),
            configuration,
            new PathToSchemasMap(),
            new LinkedHashSet<>()
    );

    @Test
    public void testNestedArrayWithInvalidTypeFails() {
        // nested array with invalid type
        final var schema = NestedItems.NestedItems1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
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
            validationMetadata
        ));
    }

    @Test
    public void testNotDeepEnoughFails() {
        // not deep enough
        final var schema = NestedItems.NestedItems1.getInstance();
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            schema,
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
            validationMetadata
        ));
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
