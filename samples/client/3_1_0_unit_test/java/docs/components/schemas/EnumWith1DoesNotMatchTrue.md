# EnumWith1DoesNotMatchTrue
unit_test_api.components.schemas.EnumWith1DoesNotMatchTrue.java
public class EnumWith1DoesNotMatchTrue<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1Boxed](#enumwith1doesnotmatchtrue1boxed)<br> sealed interface for validated payloads |
| record | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1BoxedNumber](#enumwith1doesnotmatchtrue1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1](#enumwith1doesnotmatchtrue1)<br> schema class |
| enum | [EnumWith1DoesNotMatchTrue.IntegerEnumWith1DoesNotMatchTrueEnums](#integerenumwith1doesnotmatchtrueenums)<br>Integer enum |
| enum | [EnumWith1DoesNotMatchTrue.LongEnumWith1DoesNotMatchTrueEnums](#longenumwith1doesnotmatchtrueenums)<br>Long enum |
| enum | [EnumWith1DoesNotMatchTrue.FloatEnumWith1DoesNotMatchTrueEnums](#floatenumwith1doesnotmatchtrueenums)<br>Float enum |
| enum | [EnumWith1DoesNotMatchTrue.DoubleEnumWith1DoesNotMatchTrueEnums](#doubleenumwith1doesnotmatchtrueenums)<br>Double enum |

## EnumWith1DoesNotMatchTrue1Boxed
public sealed interface EnumWith1DoesNotMatchTrue1Boxed<br>
permits<br>
[EnumWith1DoesNotMatchTrue1BoxedNumber](#enumwith1doesnotmatchtrue1boxednumber)

sealed interface that stores validated payloads using boxed classes

## EnumWith1DoesNotMatchTrue1BoxedNumber
public record EnumWith1DoesNotMatchTrue1BoxedNumber<br>
implements [EnumWith1DoesNotMatchTrue1Boxed](#enumwith1doesnotmatchtrue1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWith1DoesNotMatchTrue1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EnumWith1DoesNotMatchTrue1
public static class EnumWith1DoesNotMatchTrue1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import unit_test_api.configurations.JsonSchemaKeywordFlags;
import unit_test_api.configurations.SchemaConfiguration;
import unit_test_api.exceptions.ValidationException;
import unit_test_api.schemas.validation.MapUtils;
import unit_test_api.schemas.validation.FrozenList;
import unit_test_api.schemas.validation.FrozenMap;
import unit_test_api.components.schemas.EnumWith1DoesNotMatchTrue;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [EnumWith1DoesNotMatchTrue1BoxedNumber](#enumwith1doesnotmatchtrue1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [EnumWith1DoesNotMatchTrue1Boxed](#enumwith1doesnotmatchtrue1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
