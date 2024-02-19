# StringEnumWithDefaultValue
org.openapijsonschematools.client.components.schemas.StringEnumWithDefaultValue.java
public class StringEnumWithDefaultValue<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringEnumWithDefaultValue.StringEnumWithDefaultValue1Boxed](#stringenumwithdefaultvalue1boxed)<br> abstract sealed validated payload class |
| static class | [StringEnumWithDefaultValue.StringEnumWithDefaultValue1BoxedString](#stringenumwithdefaultvalue1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringEnumWithDefaultValue.StringEnumWithDefaultValue1](#stringenumwithdefaultvalue1)<br> schema class |
| enum | [StringEnumWithDefaultValue.StringStringEnumWithDefaultValueEnums](#stringstringenumwithdefaultvalueenums)<br>String enum |

## StringEnumWithDefaultValue1Boxed
public sealed interface StringEnumWithDefaultValue1Boxed<br>
permits<br>
[StringEnumWithDefaultValue1BoxedString](#stringenumwithdefaultvalue1boxedstring)

sealed interface that stores validated payloads using boxed classes

## StringEnumWithDefaultValue1BoxedString
public static final class StringEnumWithDefaultValue1BoxedString<br>
implements [StringEnumWithDefaultValue1Boxed](#stringenumwithdefaultvalue1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringEnumWithDefaultValue1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## StringEnumWithDefaultValue1
public static class StringEnumWithDefaultValue1<br>
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

// String validation
String validatedPayload = StringEnumWithDefaultValue.StringEnumWithDefaultValue1.validate(
    "placed",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"placed",<br>&nbsp;&nbsp;&nbsp;&nbsp;"approved",<br>&nbsp;&nbsp;&nbsp;&nbsp;"delivered"<br>)<br> |
| @Nullable Object | defaultValue = "placed" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringStringEnumWithDefaultValueEnums](#stringstringenumwithdefaultvalueenums) arg, SchemaConfiguration configuration) |
| [StringEnumWithDefaultValue1BoxedString](#stringenumwithdefaultvalue1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringStringEnumWithDefaultValueEnums
public enum StringStringEnumWithDefaultValueEnums<br>
extends `Enum<StringStringEnumWithDefaultValueEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| PLACED | value = "placed" |
| APPROVED | value = "approved" |
| DELIVERED | value = "delivered" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
