# IntegerEnum
org.openapijsonschematools.client.components.schemas.IntegerEnum.java
public class IntegerEnum<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IntegerEnum.IntegerEnum1Boxed](#integerenum1boxed)<br> sealed interface for validated payloads |
| record | [IntegerEnum.IntegerEnum1BoxedNumber](#integerenum1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IntegerEnum.IntegerEnum1](#integerenum1)<br> schema class |
| enum | [IntegerEnum.IntegerIntegerEnumEnums](#integerintegerenumenums)<br>Integer enum |
| enum | [IntegerEnum.LongIntegerEnumEnums](#longintegerenumenums)<br>Long enum |
| enum | [IntegerEnum.FloatIntegerEnumEnums](#floatintegerenumenums)<br>Float enum |
| enum | [IntegerEnum.DoubleIntegerEnumEnums](#doubleintegerenumenums)<br>Double enum |

## IntegerEnum1Boxed
public sealed interface IntegerEnum1Boxed<br>
permits<br>
[IntegerEnum1BoxedNumber](#integerenum1boxednumber)

sealed interface that stores validated payloads using boxed classes

## IntegerEnum1BoxedNumber
public record IntegerEnum1BoxedNumber<br>
implements [IntegerEnum1Boxed](#integerenum1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IntegerEnum1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IntegerEnum1
public static class IntegerEnum1<br>
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
int validatedPayload = IntegerEnum.IntegerEnum1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;0,<br>&nbsp;&nbsp;&nbsp;&nbsp;1,<br>&nbsp;&nbsp;&nbsp;&nbsp;2<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [IntegerEnum1BoxedNumber](#integerenum1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IntegerEnum1Boxed](#integerenum1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## IntegerIntegerEnumEnums
public enum IntegerIntegerEnumEnums<br>
extends `Enum<IntegerIntegerEnumEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |
| POSITIVE_1 | value = 1 |
| POSITIVE_2 | value = 2 |

## LongIntegerEnumEnums
public enum LongIntegerEnumEnums<br>
extends `Enum<LongIntegerEnumEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0L |
| POSITIVE_1 | value = 1L |
| POSITIVE_2 | value = 2L |

## FloatIntegerEnumEnums
public enum FloatIntegerEnumEnums<br>
extends `Enum<FloatIntegerEnumEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0f |
| POSITIVE_1 | value = 1.0f |
| POSITIVE_2 | value = 2.0f |

## DoubleIntegerEnumEnums
public enum DoubleIntegerEnumEnums<br>
extends `Enum<DoubleIntegerEnumEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0d |
| POSITIVE_1 | value = 1.0d |
| POSITIVE_2 | value = 2.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
