# EnumWith0DoesNotMatchFalse
org.openapijsonschematools.client.components.schemas.EnumWith0DoesNotMatchFalse.java
public class EnumWith0DoesNotMatchFalse

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1](#enumwith0doesnotmatchfalse1)<br> schema class |
| enum | [EnumWith0DoesNotMatchFalse.IntegerEnumWith0DoesNotMatchFalseEnums](#integerenumwith0doesnotmatchfalseenums)<br>integer enum |
| enum | [EnumWith0DoesNotMatchFalse.NumberEnumWith0DoesNotMatchFalseEnums](#numberenumwith0doesnotmatchfalseenums)<br>number enum |

## EnumWith0DoesNotMatchFalse1
public static class EnumWith0DoesNotMatchFalse1<br>
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
int validatedPayload = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.validate(
    0L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerEnumWith0DoesNotMatchFalseEnums
public enum IntegerEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<IntegerEnumWith0DoesNotMatchFalseEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |


## NumberEnumWith0DoesNotMatchFalseEnums
public enum NumberEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<NumberEnumWith0DoesNotMatchFalseEnums>`

A class that stores Number enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
