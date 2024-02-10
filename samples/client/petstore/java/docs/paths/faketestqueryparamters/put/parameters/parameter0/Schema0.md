# Schema0
public class Schema0

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01Boxed](#schema01boxed)<br> sealed validated payload class |
| static class | [Schema0.Schema01](#schema01)<br> schema class |
| static class | [Schema0.SchemaListBuilder0](#schemalistbuilder0)<br> builder for List payloads |
| static class | [Schema0.SchemaList0](#schemalist0)<br> output class for List payloads |
| static class | [Schema0.Items0Boxed](#items0boxed)<br> sealed validated payload class |
| static class | [Schema0.Items0](#items0)<br> schema class |

## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>
permits<br>
[Schema01BoxedList](#schema01boxedlist)

A sealed class that stores validated payloads using boxed classes

## Schema01
public static class Schema01<br>
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
Schema0.SchemaList0 validatedPayload =
    Schema0.Schema01.validate(
    new Schema0.SchemaListBuilder0()
        .add("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items0.class](#items0) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList0](#schemalist0) | validate([List<?>](#schemalistbuilder0) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilder0
public class SchemaListBuilder0<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilder0()<br>Creates an empty list |
| SchemaListBuilder0(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilder0 | add(String item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaList0
public class SchemaList0<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList0](#schemalist0) | of([List<String>](#schemalistbuilder0) arg, SchemaConfiguration configuration) |

## Items0Boxed
public static abstract sealed class Items0Boxed<br>
permits<br>
[Items0BoxedString](#items0boxedstring)

A sealed class that stores validated payloads using boxed classes

## Items0
public static class Items0<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
