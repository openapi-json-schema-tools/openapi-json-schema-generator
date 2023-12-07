package org.openapijsonschematools.client.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.JsonSchema;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

public class NestedItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNestedArrayWithInvalidTypeFails() {
        // nested array with invalid type
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            NestedItems.NestedItems1.class,
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
        ));
    }

    @Test
    public void testNotDeepEnoughFails() {
        // not deep enough
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validate(
            NestedItems.NestedItems1.class,
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
        ));
    }

    @Test
    public void testValidNestedArrayPasses() {
        // valid nested array
        NestedItems.NestedItems1.validate(
                new NestedItems.NestedItemsListInput(
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
            )),
            configuration
        );
    }
}
