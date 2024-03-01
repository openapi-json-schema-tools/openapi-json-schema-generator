# IntegerEnumOneValue
org.openapijsonschematools.client.components.schemas.IntegerEnumOneValue.java
public class IntegerEnumOneValue<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IntegerEnumOneValue.IntegerEnumOneValue1Boxed](#integerenumonevalue1boxed)<br> sealed interface for validated payloads |
| record | [IntegerEnumOneValue.IntegerEnumOneValue1BoxedNumber](#integerenumonevalue1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IntegerEnumOneValue.IntegerEnumOneValue1](#integerenumonevalue1)<br> schema class |
| enum | [IntegerEnumOneValue.IntegerIntegerEnumOneValueEnums](#integerintegerenumonevalueenums)<br>Integer enum |
| enum | [IntegerEnumOneValue.LongIntegerEnumOneValueEnums](#longintegerenumonevalueenums)<br>Long enum |
| enum | [IntegerEnumOneValue.FloatIntegerEnumOneValueEnums](#floatintegerenumonevalueenums)<br>Float enum |
| enum | [IntegerEnumOneValue.DoubleIntegerEnumOneValueEnums](#doubleintegerenumonevalueenums)<br>Double enum |

## IntegerEnumOneValue1Boxed
public sealed interface IntegerEnumOneValue1Boxed<br>
permits<br>
[IntegerEnumOneValue1BoxedNumber](#integerenumonevalue1boxednumber)

sealed interface that stores validated payloads using boxed classes

## IntegerEnumOneValue1BoxedNumber
public record IntegerEnumOneValue1BoxedNumber<br>
implements [IntegerEnumOneValue1Boxed](#integerenumonevalue1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IntegerEnumOneValue1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IntegerEnumOneValue1
public static class IntegerEnumOneValue1<br>
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
import org.openapijsonschematools.client.components.schemas.IntegerEnumOneValue;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// int validation
int validatedPayload = IntegerEnumOneValue.IntegerEnumOneValue1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;0<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [IntegerEnumOneValue1BoxedNumber](#integerenumonevalue1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IntegerEnumOneValue1Boxed](#integerenumonevalue1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## IntegerIntegerEnumOneValueEnums
public enum IntegerIntegerEnumOneValueEnums<br>
extends `Enum<IntegerIntegerEnumOneValueEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |

## LongIntegerEnumOneValueEnums
public enum LongIntegerEnumOneValueEnums<br>
extends `Enum<LongIntegerEnumOneValueEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0L |

## FloatIntegerEnumOneValueEnums
public enum FloatIntegerEnumOneValueEnums<br>
extends `Enum<FloatIntegerEnumOneValueEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0f |

## DoubleIntegerEnumOneValueEnums
public enum DoubleIntegerEnumOneValueEnums<br>
extends `Enum<DoubleIntegerEnumOneValueEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
