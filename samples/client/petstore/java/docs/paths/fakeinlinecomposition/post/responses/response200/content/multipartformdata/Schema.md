# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1Boxed](#schema1boxed)<br> sealed validated payload class |
| static class | [Schema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMapBuilder](#schemamapbuilder)<br> builder for Map payloads |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.SomePropBoxed](#somepropboxed)<br> sealed validated payload class |
| static class | [Schema.SomePropBoxedVoid](#somepropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [Schema.SomePropBoxedBoolean](#somepropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Schema.SomePropBoxedNumber](#somepropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema.SomePropBoxedString](#somepropboxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema.SomePropBoxedList](#somepropboxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema.SomePropBoxedMap](#somepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema.SomeProp](#someprop)<br> schema class |
| static class | [Schema.Schema0Boxed](#schema0boxed)<br> sealed validated payload class |
| static class | [Schema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema.Schema0](#schema0)<br> schema class |

## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends Schema1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(SchemaMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| SchemaMap | data<br>validated payload |

## Schema1
public static class Schema1<br>
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

// Map validation
Schema.SchemaMap validatedPayload =
    Schema.Schema1.validate(
    new Schema.SchemaMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [SomeProp.class](#someprop)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([SchemaMap](#schemamap) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilder
public class SchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(Void value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(boolean value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(String value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(int value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(float value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(long value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(double value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(List<?> value) |
| [SchemaMapBuilder](#schemamapbuilder) | someProp(Map<String, ?> value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, Void value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, boolean value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, String value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, int value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, float value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, long value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, double value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, List<?> value) |
| [SchemaMapBuilder](#schemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SomePropBoxed
public static abstract sealed class SomePropBoxed<br>
permits<br>
[SomePropBoxedVoid](#somepropboxedvoid),
[SomePropBoxedBoolean](#somepropboxedboolean),
[SomePropBoxedNumber](#somepropboxednumber),
[SomePropBoxedString](#somepropboxedstring),
[SomePropBoxedList](#somepropboxedlist),
[SomePropBoxedMap](#somepropboxedmap)

A sealed class that stores validated payloads using boxed classes

## SomePropBoxedVoid
public static final class SomePropBoxedVoid<br>
extends SomePropBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## SomePropBoxedBoolean
public static final class SomePropBoxedBoolean<br>
extends SomePropBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## SomePropBoxedNumber
public static final class SomePropBoxedNumber<br>
extends SomePropBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## SomePropBoxedString
public static final class SomePropBoxedString<br>
extends SomePropBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## SomePropBoxedList
public static final class SomePropBoxedList<br>
extends SomePropBoxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## SomePropBoxedMap
public static final class SomePropBoxedMap<br>
extends SomePropBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## SomeProp
public static class SomeProp<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [SomePropBoxedString](#somepropboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SomePropBoxedVoid](#somepropboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [SomePropBoxedNumber](#somepropboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SomePropBoxedBoolean](#somepropboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SomePropBoxedMap](#somepropboxedmap) | validateAndBox(FrozenMap<@Nullable Object> arg, SchemaConfiguration configuration) |
| [SomePropBoxedList](#somepropboxedlist) | validateAndBox(FrozenList<@Nullable Object> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedString](#schema0boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends Schema0Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0
public static class Schema0<br>
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
String validatedPayload = Schema.Schema0.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | minLength = 1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |