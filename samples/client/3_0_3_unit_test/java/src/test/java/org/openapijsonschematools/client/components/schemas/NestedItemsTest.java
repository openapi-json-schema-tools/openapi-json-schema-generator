package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.validation.PathToSchemasMap;
import org.openapijsonschematools.client.schemas.validation.ValidationMetadata;

import java.util.Arrays;
import java.util.List;
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
    }
}
