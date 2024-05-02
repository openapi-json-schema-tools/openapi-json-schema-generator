# StringEnum
org.openapijsonschematools.client.components.schemas.StringEnum.java
public class StringEnum<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StringEnum.StringEnum1Boxed](#stringenum1boxed)<br> sealed interface for validated payloads |
| record | [StringEnum.StringEnum1BoxedVoid](#stringenum1boxedvoid)<br> boxed class to store validated null payloads |
| record | [StringEnum.StringEnum1BoxedString](#stringenum1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringEnum.StringEnum1](#stringenum1)<br> schema class |
| enum | [StringEnum.StringStringEnumEnums](#stringstringenumenums)<br>String enum |
| enum | [StringEnum.NullStringEnumEnums](#nullstringenumenums)<br>null enum |

## StringEnum1Boxed
public sealed interface StringEnum1Boxed<br>
permits<br>
[StringEnum1BoxedVoid](#stringenum1boxedvoid),
[StringEnum1BoxedString](#stringenum1boxedstring)

sealed interface that stores validated payloads using boxed classes

## StringEnum1BoxedVoid
public record StringEnum1BoxedVoid<br>
implements [StringEnum1Boxed](#stringenum1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringEnum1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StringEnum1BoxedString
public record StringEnum1BoxedString<br>
implements [StringEnum1Boxed](#stringenum1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringEnum1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.StringEnum;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// null validation
Nothing? validatedPayload = StringEnum.StringEnum1.validate(
    (Nothing?) null,
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
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Nothing?.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"placed",<br>&nbsp;&nbsp;&nbsp;&nbsp;"approved",<br>&nbsp;&nbsp;&nbsp;&nbsp;"delivered",<br>&nbsp;&nbsp;&nbsp;&nbsp;"single quoted",<br>&nbsp;&nbsp;&nbsp;&nbsp;"multiple\nlines",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double quote \n with newline",<br>&nbsp;&nbsp;&nbsp;&nbsp;null<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| Nothing? | validate([NullStringEnumEnums](#nullstringenumenums) arg, SchemaConfiguration configuration) |
| [StringEnum1BoxedVoid](#stringenum1boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringStringEnumEnums](#stringstringenumenums) arg, SchemaConfiguration configuration) |
| [StringEnum1BoxedString](#stringenum1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [StringEnum1Boxed](#stringenum1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
