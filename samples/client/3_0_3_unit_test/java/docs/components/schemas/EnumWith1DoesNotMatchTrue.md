# EnumWith1DoesNotMatchTrue
org.openapijsonschematools.client.components.schemas.EnumWith1DoesNotMatchTrue.java
public class EnumWith1DoesNotMatchTrue

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1](#enumwith1doesnotmatchtrue1)<br> schema class |
| enum | [EnumWith1DoesNotMatchTrue.IntegerEnumWith1DoesNotMatchTrueEnums](#integerenumwith1doesnotmatchtrueenums)<br>integer enum |
| enum | [EnumWith1DoesNotMatchTrue.NumberEnumWith1DoesNotMatchTrueEnums](#numberenumwith1doesnotmatchtrueenums)<br>number enum |

## EnumWith1DoesNotMatchTrue1
public static class EnumWith1DoesNotMatchTrue1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// int validation
int validatedPayload = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerEnumWith1DoesNotMatchTrueEnums
public enum IntegerEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<IntegerEnumWith1DoesNotMatchTrueEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1 |


## NumberEnumWith1DoesNotMatchTrueEnums
public enum NumberEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<NumberEnumWith1DoesNotMatchTrueEnums>`

A class that stores Number enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1 |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
