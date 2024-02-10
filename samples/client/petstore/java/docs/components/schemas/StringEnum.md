# StringEnum
org.openapijsonschematools.client.components.schemas.StringEnum.java
public class StringEnum

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringEnum.StringEnum1Boxed](#stringenum1boxed)<br> sealed validated payload class |
| static class | [StringEnum.StringEnum1BoxedVoid](#stringenum1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [StringEnum.StringEnum1BoxedString](#stringenum1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringEnum.StringEnum1](#stringenum1)<br> schema class |
| enum | [StringEnum.StringStringEnumEnums](#stringstringenumenums)<br>String enum |
| enum | [StringEnum.NullStringEnumEnums](#nullstringenumenums)<br>null enum |

## StringEnum1Boxed
public static abstract sealed class StringEnum1Boxed<br>
permits<br>
[StringEnum1BoxedVoid](#stringenum1boxedvoid),
[StringEnum1BoxedString](#stringenum1boxedstring)

A sealed class that stores validated payloads using boxed classes

## StringEnum1BoxedVoid
public static final class StringEnum1BoxedVoid<br>
extends StringEnum1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringEnum1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## StringEnum1BoxedString
public static final class StringEnum1BoxedString<br>
extends StringEnum1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringEnum1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## StringEnum1
public static class StringEnum1<br>
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
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"placed",<br>&nbsp;&nbsp;&nbsp;&nbsp;"approved",<br>&nbsp;&nbsp;&nbsp;&nbsp;"delivered",<br>&nbsp;&nbsp;&nbsp;&nbsp;"single quoted",<br>&nbsp;&nbsp;&nbsp;&nbsp;"multiple\nlines",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double quote \n with newline",<br>&nbsp;&nbsp;&nbsp;&nbsp;null<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| Void | validate([NullStringEnumEnums](#nullstringenumenums) arg, SchemaConfiguration configuration) |
| [StringEnum1BoxedVoid](#stringenum1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringStringEnumEnums](#stringstringenumenums) arg, SchemaConfiguration configuration) |
| [StringEnum1BoxedString](#stringenum1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
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
