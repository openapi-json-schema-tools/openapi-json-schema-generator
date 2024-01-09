# IntegerEnumWithDefaultValue
org.openapijsonschematools.client.components.schemas.IntegerEnumWithDefaultValue.java
public class IntegerEnumWithDefaultValue

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1](#integerenumwithdefaultvalue1)<br> schema class |
| enum | [IntegerEnumWithDefaultValue.IntegerIntegerEnumWithDefaultValueEnums](#integerintegerenumwithdefaultvalueenums)<br>Integer enum |
| enum | [IntegerEnumWithDefaultValue.LongIntegerEnumWithDefaultValueEnums](#longintegerenumwithdefaultvalueenums)<br>Long enum |
| enum | [IntegerEnumWithDefaultValue.FloatIntegerEnumWithDefaultValueEnums](#floatintegerenumwithdefaultvalueenums)<br>Float enum |
| enum | [IntegerEnumWithDefaultValue.DoubleIntegerEnumWithDefaultValueEnums](#doubleintegerenumwithdefaultvalueenums)<br>Double enum |

## IntegerEnumWithDefaultValue1
public static class IntegerEnumWithDefaultValue1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// long validation
long validatedPayload = IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;0,<br>&nbsp;&nbsp;&nbsp;&nbsp;1,<br>&nbsp;&nbsp;&nbsp;&nbsp;2<br>)<br> |
| defaultValue | defaultValue = 0 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerIntegerEnumWithDefaultValueEnums
public enum IntegerIntegerEnumWithDefaultValueEnums<br>
extends `Enum<IntegerIntegerEnumWithDefaultValueEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |
| POSITIVE_1 | value = 1 |
| POSITIVE_2 | value = 2 |

## LongIntegerEnumWithDefaultValueEnums
public enum LongIntegerEnumWithDefaultValueEnums<br>
extends `Enum<LongIntegerEnumWithDefaultValueEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0L |
| POSITIVE_1 | value = 1L |
| POSITIVE_2 | value = 2L |

## FloatIntegerEnumWithDefaultValueEnums
public enum FloatIntegerEnumWithDefaultValueEnums<br>
extends `Enum<FloatIntegerEnumWithDefaultValueEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0f |
| POSITIVE_1 | value = 1.0f |
| POSITIVE_2 | value = 2.0f |

## DoubleIntegerEnumWithDefaultValueEnums
public enum DoubleIntegerEnumWithDefaultValueEnums<br>
extends `Enum<DoubleIntegerEnumWithDefaultValueEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0d |
| POSITIVE_1 | value = 1.0d |
| POSITIVE_2 | value = 2.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
