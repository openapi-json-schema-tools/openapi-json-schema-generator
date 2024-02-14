# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedMap](#schemaschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |
| static class | [SchemaSchema.SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder)<br> builder for Map payloads |
| static class | [SchemaSchema.SchemaMapSchemaMap](#schemamapschemamap)<br> output class for Map payloads |
| static class | [SchemaSchema.SomePropSomePropBoxed](#somepropsomepropboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SomePropSomePropBoxedVoid](#somepropsomepropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [SchemaSchema.SomePropSomePropBoxedBoolean](#somepropsomepropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [SchemaSchema.SomePropSomePropBoxedNumber](#somepropsomepropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.SomePropSomePropBoxedString](#somepropsomepropboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.SomePropSomePropBoxedList](#somepropsomepropboxedlist)<br> boxed class to store validated List payloads |
| static class | [SchemaSchema.SomePropSomePropBoxedMap](#somepropsomepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SomePropSomeProp](#somepropsomeprop)<br> schema class |
| static class | [SchemaSchema.Schema00Boxed](#schema00boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.Schema00BoxedString](#schema00boxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.Schema00](#schema00)<br> schema class |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedMap](#schemaschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedMap
public static final class SchemaSchema1BoxedMap<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedMap([SchemaMapSchemaMap](#schemamapschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
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
SchemaSchema.SchemaMapSchemaMap validatedPayload =
    SchemaSchema.SchemaSchema1.validate(
    new SchemaSchema.SchemaMapBuilderSchemaMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [SomePropSomeProp.class](#somepropsomeprop)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedMap](#schemaschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilderSchemaMapBuilder
public class SchemaMapBuilderSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilderSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(Void value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(boolean value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(String value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(int value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(float value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(long value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(double value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(List<?> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | someProp(Map<String, ?> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, Void value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, boolean value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, String value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, int value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, float value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, long value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, double value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMapSchemaMap
public static class SchemaMapSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMapSchemaMap](#schemamapschemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SomePropSomePropBoxed
public static abstract sealed class SomePropSomePropBoxed<br>
permits<br>
[SomePropSomePropBoxedVoid](#somepropsomepropboxedvoid),
[SomePropSomePropBoxedBoolean](#somepropsomepropboxedboolean),
[SomePropSomePropBoxedNumber](#somepropsomepropboxednumber),
[SomePropSomePropBoxedString](#somepropsomepropboxedstring),
[SomePropSomePropBoxedList](#somepropsomepropboxedlist),
[SomePropSomePropBoxedMap](#somepropsomepropboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SomePropSomePropBoxedVoid
public static final class SomePropSomePropBoxedVoid<br>
extends [SomePropSomePropBoxed](#somepropsomepropboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropSomePropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## SomePropSomePropBoxedBoolean
public static final class SomePropSomePropBoxedBoolean<br>
extends [SomePropSomePropBoxed](#somepropsomepropboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropSomePropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## SomePropSomePropBoxedNumber
public static final class SomePropSomePropBoxedNumber<br>
extends [SomePropSomePropBoxed](#somepropsomepropboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropSomePropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## SomePropSomePropBoxedString
public static final class SomePropSomePropBoxedString<br>
extends [SomePropSomePropBoxed](#somepropsomepropboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropSomePropBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## SomePropSomePropBoxedList
public static final class SomePropSomePropBoxedList<br>
extends [SomePropSomePropBoxed](#somepropsomepropboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropSomePropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## SomePropSomePropBoxedMap
public static final class SomePropSomePropBoxedMap<br>
extends [SomePropSomePropBoxed](#somepropsomepropboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomePropSomePropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## SomePropSomeProp
public static class SomePropSomeProp<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema00.class](#schema00)<br>;)<br> |

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
| [SomePropSomePropBoxedString](#somepropsomepropboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SomePropSomePropBoxedVoid](#somepropsomepropboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [SomePropSomePropBoxedNumber](#somepropsomepropboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SomePropSomePropBoxedBoolean](#somepropsomepropboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SomePropSomePropBoxedMap](#somepropsomepropboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SomePropSomePropBoxedList](#somepropsomepropboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema00Boxed
public static abstract sealed class Schema00Boxed<br>
permits<br>
[Schema00BoxedString](#schema00boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema00BoxedString
public static final class Schema00BoxedString<br>
extends [Schema00Boxed](#schema00boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema00BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema00
public static class Schema00<br>
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
String validatedPayload = SchemaSchema.Schema00.validate(
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
| [Schema00BoxedString](#schema00boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |