# FloatDivisionInf
unit_test_api.components.schemas.FloatDivisionInf.java
public class FloatDivisionInf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FloatDivisionInf.FloatDivisionInf1Boxed](#floatdivisioninf1boxed)<br> sealed interface for validated payloads |
| record | [FloatDivisionInf.FloatDivisionInf1BoxedNumber](#floatdivisioninf1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [FloatDivisionInf.FloatDivisionInf1](#floatdivisioninf1)<br> schema class |

## FloatDivisionInf1Boxed
public sealed interface FloatDivisionInf1Boxed<br>
permits<br>
[FloatDivisionInf1BoxedNumber](#floatdivisioninf1boxednumber)

sealed interface that stores validated payloads using boxed classes

## FloatDivisionInf1BoxedNumber
public record FloatDivisionInf1BoxedNumber<br>
implements [FloatDivisionInf1Boxed](#floatdivisioninf1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatDivisionInf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatDivisionInf1
public static class FloatDivisionInf1<br>
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
import unit_test_api.components.schemas.FloatDivisionInf;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// int validation
int validatedPayload = FloatDivisionInf.FloatDivisionInf1.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| BigDecimal | multipleOf = new BigDecimal("0.123456789") |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [FloatDivisionInf1BoxedNumber](#floatdivisioninf1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FloatDivisionInf1Boxed](#floatdivisioninf1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
