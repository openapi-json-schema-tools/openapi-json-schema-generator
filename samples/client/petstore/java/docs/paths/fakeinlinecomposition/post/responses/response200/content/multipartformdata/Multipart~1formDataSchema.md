# Multipart~1formDataSchema
public class Multipart~1formDataSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchema1Boxed](#multipart~1formdataschema1boxed)<br> abstract sealed validated payload class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchema1BoxedMap](#multipart~1formdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchema1](#multipart~1formdataschema1)<br> schema class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder)<br> builder for Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSchemaMap](#multipart~1formdataschemamap)<br> output class for Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)<br> abstract sealed validated payload class |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxedVoid](#multipart~1formdatasomepropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxedBoolean](#multipart~1formdatasomepropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxedNumber](#multipart~1formdatasomepropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxedString](#multipart~1formdatasomepropboxedstring)<br> boxed class to store validated String payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxedList](#multipart~1formdatasomepropboxedlist)<br> boxed class to store validated List payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomePropBoxedMap](#multipart~1formdatasomepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formDataSomeProp](#multipart~1formdatasomeprop)<br> schema class |
| static class | [Multipart~1formDataSchema.Multipart~1formData0Boxed](#multipart~1formdata0boxed)<br> abstract sealed validated payload class |
| static class | [Multipart~1formDataSchema.Multipart~1formData0BoxedString](#multipart~1formdata0boxedstring)<br> boxed class to store validated String payloads |
| static class | [Multipart~1formDataSchema.Multipart~1formData0](#multipart~1formdata0)<br> schema class |

## Multipart~1formDataSchema1Boxed
public static abstract sealed class Multipart~1formDataSchema1Boxed<br>
permits<br>
[Multipart~1formDataSchema1BoxedMap](#multipart~1formdataschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Multipart~1formDataSchema1BoxedMap
public static final class Multipart~1formDataSchema1BoxedMap<br>
extends [Multipart~1formDataSchema1Boxed](#multipart~1formdataschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSchema1BoxedMap([Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) | data<br>validated payload |

## Multipart~1formDataSchema1
public static class Multipart~1formDataSchema1<br>
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
Multipart~1formDataSchema.Multipart~1formDataSchemaMap validatedPayload =
    Multipart~1formDataSchema.Multipart~1formDataSchema1.validate(
    new Multipart~1formDataSchema.Multipart~1formDataSchemaMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [Multipart~1formDataSomeProp.class](#multipart~1formdatasomeprop)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) | validate([Map&lt;?, ?&gt;](#multipart~1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSchema1BoxedMap](#multipart~1formdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipart~1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart~1formDataSchemaMapBuilder
public class Multipart~1formDataSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(Void value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(boolean value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(String value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(int value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(float value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(long value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(double value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(List<?> value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | someProp(Map<String, ?> value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, Void value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, String value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, int value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, float value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, long value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, double value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Multipart~1formDataSchemaMapBuilder](#multipart~1formdataschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Multipart~1formDataSchemaMap
public static class Multipart~1formDataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Multipart~1formDataSchemaMap](#multipart~1formdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipart~1formdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Multipart~1formDataSomePropBoxed
public static abstract sealed class Multipart~1formDataSomePropBoxed<br>
permits<br>
[Multipart~1formDataSomePropBoxedVoid](#multipart~1formdatasomepropboxedvoid),
[Multipart~1formDataSomePropBoxedBoolean](#multipart~1formdatasomepropboxedboolean),
[Multipart~1formDataSomePropBoxedNumber](#multipart~1formdatasomepropboxednumber),
[Multipart~1formDataSomePropBoxedString](#multipart~1formdatasomepropboxedstring),
[Multipart~1formDataSomePropBoxedList](#multipart~1formdatasomepropboxedlist),
[Multipart~1formDataSomePropBoxedMap](#multipart~1formdatasomepropboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Multipart~1formDataSomePropBoxedVoid
public static final class Multipart~1formDataSomePropBoxedVoid<br>
extends [Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSomePropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Multipart~1formDataSomePropBoxedBoolean
public static final class Multipart~1formDataSomePropBoxedBoolean<br>
extends [Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSomePropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Multipart~1formDataSomePropBoxedNumber
public static final class Multipart~1formDataSomePropBoxedNumber<br>
extends [Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSomePropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Multipart~1formDataSomePropBoxedString
public static final class Multipart~1formDataSomePropBoxedString<br>
extends [Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSomePropBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Multipart~1formDataSomePropBoxedList
public static final class Multipart~1formDataSomePropBoxedList<br>
extends [Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSomePropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Multipart~1formDataSomePropBoxedMap
public static final class Multipart~1formDataSomePropBoxedMap<br>
extends [Multipart~1formDataSomePropBoxed](#multipart~1formdatasomepropboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formDataSomePropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Multipart~1formDataSomeProp
public static class Multipart~1formDataSomeProp<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Multipart~1formData0.class](#multipart~1formdata0)<br>;)<br> |

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
| [Multipart~1formDataSomePropBoxedString](#multipart~1formdatasomepropboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSomePropBoxedVoid](#multipart~1formdatasomepropboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSomePropBoxedNumber](#multipart~1formdatasomepropboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSomePropBoxedBoolean](#multipart~1formdatasomepropboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSomePropBoxedMap](#multipart~1formdatasomepropboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Multipart~1formDataSomePropBoxedList](#multipart~1formdatasomepropboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Multipart~1formData0Boxed
public static abstract sealed class Multipart~1formData0Boxed<br>
permits<br>
[Multipart~1formData0BoxedString](#multipart~1formdata0boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Multipart~1formData0BoxedString
public static final class Multipart~1formData0BoxedString<br>
extends [Multipart~1formData0Boxed](#multipart~1formdata0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipart~1formData0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Multipart~1formData0
public static class Multipart~1formData0<br>
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
String validatedPayload = Multipart~1formDataSchema.Multipart~1formData0.validate(
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
| [Multipart~1formData0BoxedString](#multipart~1formdata0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |