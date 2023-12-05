# NullTypeMatchesOnlyTheNullObject
org.openapijsonschematools.client.components.schemas.NullTypeMatchesOnlyTheNullObject.java
public class NullTypeMatchesOnlyTheNullObject

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1](#nulltypematchesonlythenullobject1)<br> schema class |

## NullTypeMatchesOnlyTheNullObject1
public static class NullTypeMatchesOnlyTheNullObject1<br>
extends NullJsonSchema

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

// json schema type null validation
NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1.validate(
    (Void) null,
    configuration
);
```

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
