# InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf
org.openapijsonschematools.client.components.schemas.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.java
public class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxed)<br> abstract sealed validated payload class |
| static class | [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1)<br> schema class |

## InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed
public static abstract sealed class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed<br>
permits<br>
[InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber
public static final class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber<br>
extends [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1
public static class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1<br>
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
int validatedPayload = InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.validate(
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
| [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
