# Schema4
org.openapijsonschematools.client.paths.faketestqueryparamters.put.parameters.parameter4.Schema4.java
public class Schema4

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41](#schema41)<br> schema class |
| static class | [Schema4.SchemaListBuilder4](#schemalistbuilder4)<br> builder for List payloads |
| static class | [Schema4.SchemaList4](#schemalist4)<br> output class for List payloads |
| static class | [Schema4.Items4](#items4)<br> schema class |

## Schema41
public static class Schema41<br>
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

// List validation
Schema4.SchemaList4 validatedPayload =
    Schema4.Schema41.validate(
    Arrays.asList(
        "a"
    ),
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilder4
public class SchemaListBuilder4<br>
builder for `List<String>`

A class that builds the List input type

## Constructor Summary
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

## Items4
public static class Items4<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |
