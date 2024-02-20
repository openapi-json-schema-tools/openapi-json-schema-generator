# Schema1
public class Schema1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema1.Schema11Boxed](#schema11boxed)<br> abstract sealed validated payload class |
| record | [Schema1.Schema11BoxedList](#schema11boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema1.Schema11](#schema11)<br> schema class |
| static class | [Schema1.SchemaListBuilder1](#schemalistbuilder1)<br> builder for List payloads |
| static class | [Schema1.SchemaList1](#schemalist1)<br> output class for List payloads |
| sealed interface | [Schema1.Items1Boxed](#items1boxed)<br> abstract sealed validated payload class |
| record | [Schema1.Items1BoxedString](#items1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema1.Items1](#items1)<br> schema class |

## Schema11Boxed
public sealed interface Schema11Boxed<br>
permits<br>
[Schema11BoxedList](#schema11boxedlist)

sealed interface that stores validated payloads using boxed classes

## Schema11BoxedList
public record Schema11BoxedList<br>
implements [Schema11Boxed](#schema11boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedList([SchemaList1](#schemalist1) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList1](#schemalist1) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema11
public static class Schema11<br>
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
Schema1.SchemaList1 validatedPayload =
    Schema1.Schema11.validate(
    new Schema1.SchemaListBuilder1()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items1.class](#items1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList1](#schemalist1) | validate([List<?>](#schemalistbuilder1) arg, SchemaConfiguration configuration) |
| [Schema11BoxedList](#schema11boxedlist) | validateAndBox([List<?>](#schemalistbuilder1) arg, SchemaConfiguration configuration) |
| [Schema11Boxed](#schema11boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## SchemaListBuilder1
public class SchemaListBuilder1<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilder1()<br>Creates an empty list |
| SchemaListBuilder1(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilder1 | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaList1
public class SchemaList1<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList1](#schemalist1) | of([List<String>](#schemalistbuilder1) arg, SchemaConfiguration configuration) |

## Items1Boxed
public sealed interface Items1Boxed<br>
permits<br>
[Items1BoxedString](#items1boxedstring)

sealed interface that stores validated payloads using boxed classes

## Items1BoxedString
public record Items1BoxedString<br>
implements [Items1Boxed](#items1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Items1
public static class Items1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
