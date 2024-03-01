# Currency
org.openapijsonschematools.client.components.schemas.Currency.java
public class Currency<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Currency.Currency1Boxed](#currency1boxed)<br> sealed interface for validated payloads |
| record | [Currency.Currency1BoxedString](#currency1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Currency.Currency1](#currency1)<br> schema class |
| enum | [Currency.StringCurrencyEnums](#stringcurrencyenums)<br>String enum |

## Currency1Boxed
public sealed interface Currency1Boxed<br>
permits<br>
[Currency1BoxedString](#currency1boxedstring)

sealed interface that stores validated payloads using boxed classes

## Currency1BoxedString
public record Currency1BoxedString<br>
implements [Currency1Boxed](#currency1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Currency1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Currency1
public static class Currency1<br>
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
import org.openapijsonschematools.client.components.schemas.Currency;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = Currency.Currency1.validate(
    "eur",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"eur",<br>&nbsp;&nbsp;&nbsp;&nbsp;"usd"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringCurrencyEnums](#stringcurrencyenums) arg, SchemaConfiguration configuration) |
| [Currency1BoxedString](#currency1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Currency1Boxed](#currency1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringCurrencyEnums
public enum StringCurrencyEnums<br>
extends `Enum<StringCurrencyEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| EUR | value = "eur" |
| USD | value = "usd" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
