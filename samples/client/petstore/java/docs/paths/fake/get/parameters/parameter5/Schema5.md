# Schema5
public class Schema5<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema5.Schema51Boxed](#schema51boxed)<br> abstract sealed validated payload class |
| static class | [Schema5.Schema51BoxedNumber](#schema51boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema5.Schema51](#schema51)<br> schema class |
| enum | [Schema5.DoubleSchemaEnums5](#doubleschemaenums5)<br>Double enum |
| enum | [Schema5.FloatSchemaEnums5](#floatschemaenums5)<br>Float enum |

## Schema51Boxed
public static abstract sealed class Schema51Boxed<br>
permits<br>
[Schema51BoxedNumber](#schema51boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Schema51BoxedNumber
public static final class Schema51BoxedNumber<br>
extends [Schema51Boxed](#schema51boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema51
public static class Schema51<br>
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

// double validation
double validatedPayload = Schema5.Schema51.validate(
    3.14d,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "double"; |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;1.1,<br>&nbsp;&nbsp;&nbsp;&nbsp;-1.2<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| double | validate(double arg, SchemaConfiguration configuration) |
| [Schema51BoxedNumber](#schema51boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DoubleSchemaEnums5
public enum DoubleSchemaEnums5<br>
extends `Enum<DoubleSchemaEnums5>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1_PT_1 | value = 1.1d |
| NEGATIVE_1_PT_2 | value = -1.2d |

## FloatSchemaEnums5
public enum FloatSchemaEnums5<br>
extends `Enum<FloatSchemaEnums5>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1_PT_1 | value = 1.1f |
| NEGATIVE_1_PT_2 | value = -1.2f |
