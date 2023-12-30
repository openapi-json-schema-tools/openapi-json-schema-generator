# Schema2
org.openapijsonschematools.client.paths.fake.get.parameters.parameter2.Schema2.java
public class Schema2

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema2.Schema21](#schema21)<br> schema class |
| static class | [Schema2.SchemaListBuilder2](#schemalistbuilder2)<br> builder for List payloads |
| static class | [Schema2.SchemaList2](#schemalist2)<br> output class for List payloads |
| static class | [Schema2.Items2](#items2)<br> schema class |
| enum | [Schema2.StringItemsEnums2](#stringitemsenums2)<br>String enum |

## Schema21
public static class Schema21<br>
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
Schema2.SchemaList2 validatedPayload =
    Schema2.Schema21.validate(
    Arrays.asList(
        ">"
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items2.class](#items2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaList2](#schemalist2) | validate([List<?>](#schemalistbuilder2) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilder2
public class SchemaListBuilder2<br>
builder for `List<String>`

A class that builds the List input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaListBuilder2()<br>Creates an empty list |
| SchemaListBuilder2(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SchemaListBuilder2 | add(String item) |
| SchemaListBuilder2 | add([StringItemsEnums2](#stringitemsenums2) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## SchemaList2
public class SchemaList2<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaList2](#schemalist2) | of([List<String>](#schemalistbuilder2) arg, SchemaConfiguration configuration) |

## Items2
public static class Items2<br>
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

// String validation
String validatedPayload = Schema2.Items2.validate(
    ">",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;">",<br>&nbsp;&nbsp;&nbsp;&nbsp;"$"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringItemsEnums2](#stringitemsenums2) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringItemsEnums2
public enum StringItemsEnums2<br>
extends `Enum<StringItemsEnums2>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| GREATER_THAN_SIGN | value = ">" |
| DOLLAR_SIGN | value = "$" |
