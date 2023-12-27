# StringEnum
org.openapijsonschematools.client.components.schemas.StringEnum.java
public class StringEnum

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringEnum.StringEnum1](#stringenum1)<br> schema class |
| enum | [StringEnum.StringStringEnumEnums](#stringstringenumenums)<br>String enum |
| enum | [StringEnum.NullStringEnumEnums](#nullstringenumenums)<br>null enum |

## StringEnum1
public static class StringEnum1<br>
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

// null validation
Void validatedPayload = StringEnum.StringEnum1.validate(
    (Void) null,
    configuration
);

// String validation
String validatedPayload = StringEnum.StringEnum1.validate(
    "placed",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"placed",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"approved",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"delivered",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"single quoted",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"multiple\nlines",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"double quote \n with newline",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;null)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| Void | validate([NullStringEnumEnums](#nullstringenumenums) arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringStringEnumEnums](#stringstringenumenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringStringEnumEnums
public enum StringStringEnumEnums<br>
extends `Enum<StringStringEnumEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PLACED | value = "placed" |
| APPROVED | value = "approved" |
| DELIVERED | value = "delivered" |
| SINGLE_QUOTED | value = "single quoted" |
| MULTIPLE_LINE_FEED_LF_LINES | value = "multiple\nlines" |
| DOUBLE_QUOTE_LINE_FEED_LF_WITH_NEWLINE | value = "double quote \n with newline" |

## NullStringEnumEnums
public enum NullStringEnumEnums<br>
extends `Enum<NullStringEnumEnums>`

A class that stores null enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| NONE | value = null |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
