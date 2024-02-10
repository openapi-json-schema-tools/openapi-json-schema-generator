# Schema1
public class Schema1

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema1.Schema11Boxed](#schema11boxed)<br> sealed validated payload class |
| static class | [Schema1.Schema11](#schema11)<br> schema class |
| static class | [Schema1.SchemaListBuilder1](#schemalistbuilder1)<br> builder for List payloads |
| static class | [Schema1.SchemaList1](#schemalist1)<br> output class for List payloads |
| static class | [Schema1.Items1Boxed](#items1boxed)<br> sealed validated payload class |
| static class | [Schema1.Items1](#items1)<br> schema class |

## Schema11Boxed
public static abstract sealed class Schema11Boxed<br>
permits<br>
[Schema11BoxedList](#schema11boxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class Items1Boxed<br>
permits<br>
[Items1BoxedString](#items1boxedstring)

A sealed class that stores validated payloads using boxed classes

## Items1
public static class Items1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
