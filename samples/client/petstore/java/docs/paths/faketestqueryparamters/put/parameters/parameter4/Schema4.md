# Schema4
public class Schema4<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41Boxed](#schema41boxed)<br> abstract sealed validated payload class |
| static class | [Schema4.Schema41BoxedList](#schema41boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema4.Schema41](#schema41)<br> schema class |
| static class | [Schema4.SchemaListBuilder4](#schemalistbuilder4)<br> builder for List payloads |
| static class | [Schema4.SchemaList4](#schemalist4)<br> output class for List payloads |
| static class | [Schema4.Items4Boxed](#items4boxed)<br> abstract sealed validated payload class |
| static class | [Schema4.Items4BoxedString](#items4boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema4.Items4](#items4)<br> schema class |

## Schema41Boxed
public sealed interface Schema41Boxed<br>
permits<br>
[Schema41BoxedList](#schema41boxedlist)

sealed interface that stores validated payloads using boxed classes

## Schema41BoxedList
public static final class Schema41BoxedList<br>
implements [Schema41Boxed](#schema41boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema41BoxedList([SchemaList4](#schemalist4) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaList4](#schemalist4) | data<br>validated payload |

## Schema41
public static class Schema41<br>
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

// List validation
Schema4.SchemaList4 validatedPayload =
    Schema4.Schema41.validate(
    new Schema4.SchemaListBuilder4()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items4.class](#items4) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList4](#schemalist4) | validate([List<?>](#schemalistbuilder4) arg, SchemaConfiguration configuration) |
| [Schema41BoxedList](#schema41boxedlist) | validateAndBox([List<?>](#schemalistbuilder4) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilder4
public class SchemaListBuilder4<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilder4()<br>Creates an empty list |
| SchemaListBuilder4(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilder4 | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaList4
public class SchemaList4<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList4](#schemalist4) | of([List<String>](#schemalistbuilder4) arg, SchemaConfiguration configuration) |

## Items4Boxed
public sealed interface Items4Boxed<br>
permits<br>
[Items4BoxedString](#items4boxedstring)

sealed interface that stores validated payloads using boxed classes

## Items4BoxedString
public static final class Items4BoxedString<br>
implements [Items4Boxed](#items4boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items4BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Items4
public static class Items4<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
