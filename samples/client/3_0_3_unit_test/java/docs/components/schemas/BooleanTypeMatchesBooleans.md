# BooleanTypeMatchesBooleans
org.openapijsonschematools.client.components.schemas.BooleanTypeMatchesBooleans.java
public class BooleanTypeMatchesBooleans

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1](#booleantypematchesbooleans1)<br> schema class |

## BooleanTypeMatchesBooleans1
public static class BooleanTypeMatchesBooleans1<br>
extends BooleanJsonSchema

A schema class that validates payloads

## Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// json schema type boolean validation
BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1.validate(
    true,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
