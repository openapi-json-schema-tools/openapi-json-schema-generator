# MultipartformdataSchema
public class MultipartformdataSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipartformdataSchema.MultipartformdataSchema1Boxed](#multipartformdataschema1boxed)<br> sealed interface for validated payloads |
| record | [MultipartformdataSchema.MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSchema1](#multipartformdataschema1)<br> schema class |
| static class | [MultipartformdataSchema.MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder)<br> builder for Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSchemaMap](#multipartformdataschemamap)<br> output class for Map payloads |
| sealed interface | [MultipartformdataSchema.MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)<br> sealed interface for validated payloads |
| record | [MultipartformdataSchema.MultipartformdataSomePropBoxedVoid](#multipartformdatasomepropboxedvoid)<br> boxed class to store validated null payloads |
| record | [MultipartformdataSchema.MultipartformdataSomePropBoxedBoolean](#multipartformdatasomepropboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MultipartformdataSchema.MultipartformdataSomePropBoxedNumber](#multipartformdatasomepropboxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipartformdataSchema.MultipartformdataSomePropBoxedString](#multipartformdatasomepropboxedstring)<br> boxed class to store validated String payloads |
| record | [MultipartformdataSchema.MultipartformdataSomePropBoxedList](#multipartformdatasomepropboxedlist)<br> boxed class to store validated List payloads |
| record | [MultipartformdataSchema.MultipartformdataSomePropBoxedMap](#multipartformdatasomepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipartformdataSchema.MultipartformdataSomeProp](#multipartformdatasomeprop)<br> schema class |
| sealed interface | [MultipartformdataSchema.Multipartformdata0Boxed](#multipartformdata0boxed)<br> sealed interface for validated payloads |
| record | [MultipartformdataSchema.Multipartformdata0BoxedString](#multipartformdata0boxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipartformdataSchema.Multipartformdata0](#multipartformdata0)<br> schema class |

## MultipartformdataSchema1Boxed
public sealed interface MultipartformdataSchema1Boxed<br>
permits<br>
[MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataSchema1BoxedMap
public record MultipartformdataSchema1BoxedMap<br>
implements [MultipartformdataSchema1Boxed](#multipartformdataschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSchema1BoxedMap([MultipartformdataSchemaMap](#multipartformdataschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSchema1
public static class MultipartformdataSchema1<br>
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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.code200response.content.multipartformdata.MultipartformdataSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
MultipartformdataSchema.MultipartformdataSchemaMap validatedPayload =
    MultipartformdataSchema.MultipartformdataSchema1.validate(
    new MultipartformdataSchema.MultipartformdataSchemaMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [MultipartformdataSomeProp.class](#multipartformdatasomeprop)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchemaMap](#multipartformdataschemamap) | validate([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataSchema1BoxedMap](#multipartformdataschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| [MultipartformdataSchema1Boxed](#multipartformdataschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## MultipartformdataSchemaMapBuilder
public class MultipartformdataSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(Void value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(boolean value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(String value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(int value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(float value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(long value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(double value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(List<?> value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | someProp(Map<String, ?> value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, Void value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, boolean value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, String value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, int value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, float value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, long value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, double value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [MultipartformdataSchemaMapBuilder](#multipartformdataschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## MultipartformdataSchemaMap
public static class MultipartformdataSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [MultipartformdataSchemaMap](#multipartformdataschemamap) | of([Map<String, ? extends @Nullable Object>](#multipartformdataschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## MultipartformdataSomePropBoxed
public sealed interface MultipartformdataSomePropBoxed<br>
permits<br>
[MultipartformdataSomePropBoxedVoid](#multipartformdatasomepropboxedvoid),
[MultipartformdataSomePropBoxedBoolean](#multipartformdatasomepropboxedboolean),
[MultipartformdataSomePropBoxedNumber](#multipartformdatasomepropboxednumber),
[MultipartformdataSomePropBoxedString](#multipartformdatasomepropboxedstring),
[MultipartformdataSomePropBoxedList](#multipartformdatasomepropboxedlist),
[MultipartformdataSomePropBoxedMap](#multipartformdatasomepropboxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipartformdataSomePropBoxedVoid
public record MultipartformdataSomePropBoxedVoid<br>
implements [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSomePropBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSomePropBoxedBoolean
public record MultipartformdataSomePropBoxedBoolean<br>
implements [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSomePropBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSomePropBoxedNumber
public record MultipartformdataSomePropBoxedNumber<br>
implements [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSomePropBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSomePropBoxedString
public record MultipartformdataSomePropBoxedString<br>
implements [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSomePropBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSomePropBoxedList
public record MultipartformdataSomePropBoxedList<br>
implements [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSomePropBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSomePropBoxedMap
public record MultipartformdataSomePropBoxedMap<br>
implements [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataSomePropBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipartformdataSomeProp
public static class MultipartformdataSomeProp<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Multipartformdata0.class](#multipartformdata0)<br>;)<br> |

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
| [MultipartformdataSomePropBoxedString](#multipartformdatasomepropboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MultipartformdataSomePropBoxedVoid](#multipartformdatasomepropboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MultipartformdataSomePropBoxedNumber](#multipartformdatasomepropboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MultipartformdataSomePropBoxedBoolean](#multipartformdatasomepropboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MultipartformdataSomePropBoxedMap](#multipartformdatasomepropboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MultipartformdataSomePropBoxedList](#multipartformdatasomepropboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MultipartformdataSomePropBoxed](#multipartformdatasomepropboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Multipartformdata0Boxed
public sealed interface Multipartformdata0Boxed<br>
permits<br>
[Multipartformdata0BoxedString](#multipartformdata0boxedstring)

sealed interface that stores validated payloads using boxed classes

## Multipartformdata0BoxedString
public record Multipartformdata0BoxedString<br>
implements [Multipartformdata0Boxed](#multipartformdata0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Multipartformdata0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Multipartformdata0
public static class Multipartformdata0<br>
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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.code200response.content.multipartformdata.MultipartformdataSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// String validation
String validatedPayload = MultipartformdataSchema.Multipartformdata0.validate(
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
| [Multipartformdata0BoxedString](#multipartformdata0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Multipartformdata0Boxed](#multipartformdata0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
