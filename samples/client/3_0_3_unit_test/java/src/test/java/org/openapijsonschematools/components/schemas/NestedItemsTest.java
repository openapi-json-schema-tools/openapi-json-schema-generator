package org.openapijsonschematools.components.schemas;

import org.junit.Assert;
import org.junit.Test;
import org.openapijsonschematools.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.configurations.SchemaConfiguration;
import org.openapijsonschematools.exceptions.ValidationException;
import org.openapijsonschematools.schemas.validation.JsonSchema;

import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class NestedItemsTest {
    static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

    @Test
    public void testNestedArrayWithInvalidTypeFails() {
        // nested array with invalid type
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NestedItems.NestedItems1.class,
            List.of(
                List.of(
                    List.of(
                        List.of(
                            "1"
                        )
                    ),
                    List.of(
                        List.of(
                            2
                        ),
                        List.of(
                            3
                        )
                    )
                ),
                List.of(
                    List.of(
                        List.of(
                            4
                        ),
                        List.of(
                            5
                        ),
                        List.of(
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
        Assert.assertThrows(ValidationException.class, () -> JsonSchema.validateObject(
            NestedItems.NestedItems1.class,
            List.of(
                List.of(
                    List.of(
                        1
                    ),
                    List.of(
                        2
                    ),
                    List.of(
                        3
                    )
                ),
                List.of(
                    List.of(
                        4
                    ),
                    List.of(
                        5
                    ),
                    List.of(
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
            List.of(
                List.of(
                    List.of(
                        List.of(
                            1
                        )
                    ),
                    List.of(
                        List.of(
                            2
                        ),
                        List.of(
                            3
                        )
                    )
                ),
                List.of(
                    List.of(
                        List.of(
                            4
                        ),
                        List.of(
                            5
                        ),
                        List.of(
                            6
                        )
                    )
                )
            ),
            configuration
        );
    }
}
