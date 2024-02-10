# IntegerEnumBig
org.openapijsonschematools.client.components.schemas.IntegerEnumBig.java
public class IntegerEnumBig

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IntegerEnumBig.IntegerEnumBig1Boxed](#integerenumbig1boxed)<br> sealed validated payload class |
| static class | [IntegerEnumBig.IntegerEnumBig1](#integerenumbig1)<br> schema class |
| enum | [IntegerEnumBig.IntegerIntegerEnumBigEnums](#integerintegerenumbigenums)<br>Integer enum |
| enum | [IntegerEnumBig.LongIntegerEnumBigEnums](#longintegerenumbigenums)<br>Long enum |
| enum | [IntegerEnumBig.FloatIntegerEnumBigEnums](#floatintegerenumbigenums)<br>Float enum |
| enum | [IntegerEnumBig.DoubleIntegerEnumBigEnums](#doubleintegerenumbigenums)<br>Double enum |

## IntegerEnumBig1Boxed
public static abstract sealed class IntegerEnumBig1Boxed<br>
permits<br>
[IntegerEnumBig1BoxedNumber](#integerenumbig1boxednumber)

A sealed class that stores validated payloads using boxed classes

## IntegerEnumBig1
public static class IntegerEnumBig1<br>
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

// int validation
int validatedPayload = IntegerEnumBig.IntegerEnumBig1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;10,<br>&nbsp;&nbsp;&nbsp;&nbsp;11,<br>&nbsp;&nbsp;&nbsp;&nbsp;12<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerIntegerEnumBigEnums
public enum IntegerIntegerEnumBigEnums<br>
extends `Enum<IntegerIntegerEnumBigEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_10 | value = 10 |
| POSITIVE_11 | value = 11 |
| POSITIVE_12 | value = 12 |

## LongIntegerEnumBigEnums
public enum LongIntegerEnumBigEnums<br>
extends `Enum<LongIntegerEnumBigEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_10 | value = 10L |
| POSITIVE_11 | value = 11L |
| POSITIVE_12 | value = 12L |

## FloatIntegerEnumBigEnums
public enum FloatIntegerEnumBigEnums<br>
extends `Enum<FloatIntegerEnumBigEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_10 | value = 10.0f |
| POSITIVE_11 | value = 11.0f |
| POSITIVE_12 | value = 12.0f |

## DoubleIntegerEnumBigEnums
public enum DoubleIntegerEnumBigEnums<br>
extends `Enum<DoubleIntegerEnumBigEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_10 | value = 10.0d |
| POSITIVE_11 | value = 11.0d |
| POSITIVE_12 | value = 12.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
