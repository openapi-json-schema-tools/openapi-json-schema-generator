# Schema2
public class Schema2

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema2.Schema21Boxed](#schema21boxed)<br> sealed validated payload class |
| static class | [Schema2.Schema21BoxedList](#schema21boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema2.Schema21](#schema21)<br> schema class |
| static class | [Schema2.SchemaListBuilder2](#schemalistbuilder2)<br> builder for List payloads |
| static class | [Schema2.SchemaList2](#schemalist2)<br> output class for List payloads |
| static class | [Schema2.Items2Boxed](#items2boxed)<br> sealed validated payload class |
| static class | [Schema2.Items2BoxedString](#items2boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema2.Items2](#items2)<br> schema class |
| enum | [Schema2.StringItemsEnums2](#stringitemsenums2)<br>String enum |

## Schema21Boxed
public static abstract sealed class Schema21Boxed<br>
permits<br>
[Schema21BoxedList](#schema21boxedlist)

A sealed class that stores validated payloads using boxed classes

## Schema21BoxedList
public static final class Schema21BoxedList<br>
extends Schema21Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema21BoxedList(SchemaList2 data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| SchemaList2 | data<br>validated payload |

## Schema21
public static class Schema21<br>
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
Schema2.SchemaList2 validatedPayload =
    Schema2.Schema21.validate(
    new Schema2.SchemaListBuilder2()
        .add(">")

    .build(),
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
| [Schema21BoxedList](#schema21boxedlist) | validateAndBox([SchemaList2](#schemalist2) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaListBuilder2
public class SchemaListBuilder2<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
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

## Items2Boxed
public static abstract sealed class Items2Boxed<br>
permits<br>
[Items2BoxedString](#items2boxedstring)

A sealed class that stores validated payloads using boxed classes

## Items2BoxedString
public static final class Items2BoxedString<br>
extends Items2Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Items2
public static class Items2<br>
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
| @Nullable Object | defaultValue = "$" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringItemsEnums2](#stringitemsenums2) arg, SchemaConfiguration configuration) |
| [Items2BoxedString](#items2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
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
