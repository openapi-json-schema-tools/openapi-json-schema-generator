# Multipart1formdataSchema
public class Multipart1formdataSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1Boxed](#multipart1formdataschema1boxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSchema1](#multipart1formdataschema1)<br> schema class |
| static class | [Multipart1formdataSchema.Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder)<br> builder for Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSchemaMap](#multipart1formdataschemamap)<br> output class for Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxedVoid](#multipart1formdatasomepropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxedBoolean](#multipart1formdatasomepropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxedNumber](#multipart1formdatasomepropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxedString](#multipart1formdatasomepropboxedstring)<br> boxed class to store validated String payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxedList](#multipart1formdatasomepropboxedlist)<br> boxed class to store validated List payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomePropBoxedMap](#multipart1formdatasomepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart1formdataSchema.Multipart1formdataSomeProp](#multipart1formdatasomeprop)<br> schema class |
| static class | [Multipart1formdataSchema.Multipart1formdata0Boxed](#multipart1formdata0boxed)<br> abstract sealed validated payload class |
| static class | [Multipart1formdataSchema.Multipart1formdata0BoxedString](#multipart1formdata0boxedstring)<br> boxed class to store validated String payloads |
| static class | [Multipart1formdataSchema.Multipart1formdata0](#multipart1formdata0)<br> schema class |

## Multipart1formdataSchema1Boxed
public static abstract sealed class Multipart1formdataSchema1Boxed<br>
permits<br>
[Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataSchema1BoxedMap
public static final class Multipart1formdataSchema1BoxedMap<br>
extends [Multipart1formdataSchema1Boxed](#multipart1formdataschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSchema1BoxedMap([Multipart1formdataSchemaMap](#multipart1formdataschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Multipart1formdataSchemaMap](#multipart1formdataschemamap) | data<br>validated payload |

## Multipart1formdataSchema1
public static class Multipart1formdataSchema1<br>
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
Multipart1formdataSchema.Multipart1formdataSchemaMap validatedPayload =
    Multipart1formdataSchema.Multipart1formdataSchema1.validate(
    new Multipart1formdataSchema.Multipart1formdataSchemaMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [Multipart1formdataSomeProp.class](#multipart1formdatasomeprop)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Multipart1formdataSchemaMap](#multipart1formdataschemamap) | validate([Map&lt;?, ?&gt;](#multipart1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Multipart1formdataSchema1BoxedMap](#multipart1formdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipart1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart1formdataSchemaMapBuilder
public class Multipart1formdataSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(Void value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(boolean value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(String value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(int value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(float value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(long value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(double value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(List<?> value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | someProp(Map<String, ?> value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, Void value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, String value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, int value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, float value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, long value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, double value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Multipart1formdataSchemaMapBuilder](#multipart1formdataschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Multipart1formdataSchemaMap
public static class Multipart1formdataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Multipart1formdataSchemaMap](#multipart1formdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipart1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Multipart1formdataSomePropBoxed
public static abstract sealed class Multipart1formdataSomePropBoxed<br>
permits<br>
[Multipart1formdataSomePropBoxedVoid](#multipart1formdatasomepropboxedvoid),
[Multipart1formdataSomePropBoxedBoolean](#multipart1formdatasomepropboxedboolean),
[Multipart1formdataSomePropBoxedNumber](#multipart1formdatasomepropboxednumber),
[Multipart1formdataSomePropBoxedString](#multipart1formdatasomepropboxedstring),
[Multipart1formdataSomePropBoxedList](#multipart1formdatasomepropboxedlist),
[Multipart1formdataSomePropBoxedMap](#multipart1formdatasomepropboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdataSomePropBoxedVoid
public static final class Multipart1formdataSomePropBoxedVoid<br>
extends [Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSomePropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Multipart1formdataSomePropBoxedBoolean
public static final class Multipart1formdataSomePropBoxedBoolean<br>
extends [Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSomePropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Multipart1formdataSomePropBoxedNumber
public static final class Multipart1formdataSomePropBoxedNumber<br>
extends [Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSomePropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Multipart1formdataSomePropBoxedString
public static final class Multipart1formdataSomePropBoxedString<br>
extends [Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSomePropBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Multipart1formdataSomePropBoxedList
public static final class Multipart1formdataSomePropBoxedList<br>
extends [Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSomePropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Multipart1formdataSomePropBoxedMap
public static final class Multipart1formdataSomePropBoxedMap<br>
extends [Multipart1formdataSomePropBoxed](#multipart1formdatasomepropboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdataSomePropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Multipart1formdataSomeProp
public static class Multipart1formdataSomeProp<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Multipart1formdata0.class](#multipart1formdata0)<br>;)<br> |

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
| [Multipart1formdataSomePropBoxedString](#multipart1formdatasomepropboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Multipart1formdataSomePropBoxedVoid](#multipart1formdatasomepropboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Multipart1formdataSomePropBoxedNumber](#multipart1formdatasomepropboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Multipart1formdataSomePropBoxedBoolean](#multipart1formdatasomepropboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Multipart1formdataSomePropBoxedMap](#multipart1formdatasomepropboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Multipart1formdataSomePropBoxedList](#multipart1formdatasomepropboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart1formdata0Boxed
public static abstract sealed class Multipart1formdata0Boxed<br>
permits<br>
[Multipart1formdata0BoxedString](#multipart1formdata0boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Multipart1formdata0BoxedString
public static final class Multipart1formdata0BoxedString<br>
extends [Multipart1formdata0Boxed](#multipart1formdata0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart1formdata0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Multipart1formdata0
public static class Multipart1formdata0<br>
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
String validatedPayload = Multipart1formdataSchema.Multipart1formdata0.validate(
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
| [Multipart1formdata0BoxedString](#multipart1formdata0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |