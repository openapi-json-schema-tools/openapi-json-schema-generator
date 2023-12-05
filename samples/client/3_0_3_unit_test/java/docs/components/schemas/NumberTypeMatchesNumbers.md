# NumberTypeMatchesNumbers
org.openapijsonschematools.client.components.schemas.NumberTypeMatchesNumbers.java
public class NumberTypeMatchesNumbers

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1](#numbertypematchesnumbers1)<br> schema class |

## NumberTypeMatchesNumbers1
public static class NumberTypeMatchesNumbers1<br>
extends NumberJsonSchema

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

// json schema type number validation
NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1.validate(
    3.14,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
