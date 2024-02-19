# NumberWithExclusiveMinMax
org.openapijsonschematools.client.components.schemas.NumberWithExclusiveMinMax.java
public class NumberWithExclusiveMinMax<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberWithExclusiveMinMax.NumberWithExclusiveMinMax1Boxed](#numberwithexclusiveminmax1boxed)<br> abstract sealed validated payload class |
| static class | [NumberWithExclusiveMinMax.NumberWithExclusiveMinMax1BoxedNumber](#numberwithexclusiveminmax1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NumberWithExclusiveMinMax.NumberWithExclusiveMinMax1](#numberwithexclusiveminmax1)<br> schema class |

## NumberWithExclusiveMinMax1Boxed
public sealed interface NumberWithExclusiveMinMax1Boxed<br>
permits<br>
[NumberWithExclusiveMinMax1BoxedNumber](#numberwithexclusiveminmax1boxednumber)

sealed interface that stores validated payloads using boxed classes

## NumberWithExclusiveMinMax1BoxedNumber
public static final class NumberWithExclusiveMinMax1BoxedNumber<br>
implements [NumberWithExclusiveMinMax1Boxed](#numberwithexclusiveminmax1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberWithExclusiveMinMax1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NumberWithExclusiveMinMax1
public static class NumberWithExclusiveMinMax1<br>
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
int validatedPayload = NumberWithExclusiveMinMax.NumberWithExclusiveMinMax1.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | exclusiveMaximum = 12 |
| Number | exclusiveMinimum = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| [NumberWithExclusiveMinMax1BoxedNumber](#numberwithexclusiveminmax1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
