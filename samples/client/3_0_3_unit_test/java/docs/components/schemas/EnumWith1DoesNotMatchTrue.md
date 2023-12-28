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
| enum | [EnumWith1DoesNotMatchTrue.IntegerEnumWith1DoesNotMatchTrueEnums](#integerenumwith1doesnotmatchtrueenums)<br>Integer enum |
| enum | [EnumWith1DoesNotMatchTrue.LongEnumWith1DoesNotMatchTrueEnums](#longenumwith1doesnotmatchtrueenums)<br>Long enum |
| enum | [EnumWith1DoesNotMatchTrue.FloatEnumWith1DoesNotMatchTrueEnums](#floatenumwith1doesnotmatchtrueenums)<br>Float enum |
| enum | [EnumWith1DoesNotMatchTrue.DoubleEnumWith1DoesNotMatchTrueEnums](#doubleenumwith1doesnotmatchtrueenums)<br>Double enum |

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
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;1<br>)<br> |

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

## LongEnumWith1DoesNotMatchTrueEnums
public enum LongEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<LongEnumWith1DoesNotMatchTrueEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1L |

## FloatEnumWith1DoesNotMatchTrueEnums
public enum FloatEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<FloatEnumWith1DoesNotMatchTrueEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0f |

## DoubleEnumWith1DoesNotMatchTrueEnums
public enum DoubleEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<DoubleEnumWith1DoesNotMatchTrueEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
