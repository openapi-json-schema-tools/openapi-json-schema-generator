# NotMoreComplexSchema
org.openapijsonschematools.client.components.schemas.NotMoreComplexSchema.java
public class NotMoreComplexSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NotMoreComplexSchema.NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)<br> sealed interface for validated payloads |
| record | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedVoid](#notmorecomplexschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedBoolean](#notmorecomplexschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedNumber](#notmorecomplexschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedString](#notmorecomplexschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedList](#notmorecomplexschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [NotMoreComplexSchema.NotMoreComplexSchema1BoxedMap](#notmorecomplexschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NotMoreComplexSchema.NotMoreComplexSchema1](#notmorecomplexschema1)<br> schema class |
| sealed interface | [NotMoreComplexSchema.NotBoxed](#notboxed)<br> sealed interface for validated payloads |
| record | [NotMoreComplexSchema.NotBoxedMap](#notboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NotMoreComplexSchema.Not](#not)<br> schema class |
| static class | [NotMoreComplexSchema.NotMapBuilder](#notmapbuilder)<br> builder for Map payloads |
| static class | [NotMoreComplexSchema.NotMap](#notmap)<br> output class for Map payloads |
| sealed interface | [NotMoreComplexSchema.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [NotMoreComplexSchema.FooBoxedString](#fooboxedstring)<br> boxed class to store validated String payloads |
| static class | [NotMoreComplexSchema.Foo](#foo)<br> schema class |

## NotMoreComplexSchema1Boxed
public sealed interface NotMoreComplexSchema1Boxed<br>
permits<br>
[NotMoreComplexSchema1BoxedVoid](#notmorecomplexschema1boxedvoid),
[NotMoreComplexSchema1BoxedBoolean](#notmorecomplexschema1boxedboolean),
[NotMoreComplexSchema1BoxedNumber](#notmorecomplexschema1boxednumber),
[NotMoreComplexSchema1BoxedString](#notmorecomplexschema1boxedstring),
[NotMoreComplexSchema1BoxedList](#notmorecomplexschema1boxedlist),
[NotMoreComplexSchema1BoxedMap](#notmorecomplexschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NotMoreComplexSchema1BoxedVoid
public record NotMoreComplexSchema1BoxedVoid<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedBoolean
public record NotMoreComplexSchema1BoxedBoolean<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedNumber
public record NotMoreComplexSchema1BoxedNumber<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedString
public record NotMoreComplexSchema1BoxedString<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedList
public record NotMoreComplexSchema1BoxedList<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMoreComplexSchema1BoxedMap
public record NotMoreComplexSchema1BoxedMap<br>
implements [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMoreComplexSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NotMoreComplexSchema1
public static class NotMoreComplexSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not.class](#not) |

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
| [NotMoreComplexSchema1BoxedString](#notmorecomplexschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NotMoreComplexSchema1BoxedVoid](#notmorecomplexschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NotMoreComplexSchema1BoxedNumber](#notmorecomplexschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NotMoreComplexSchema1BoxedBoolean](#notmorecomplexschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NotMoreComplexSchema1BoxedMap](#notmorecomplexschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NotMoreComplexSchema1BoxedList](#notmorecomplexschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [NotMoreComplexSchema1Boxed](#notmorecomplexschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NotBoxed
public sealed interface NotBoxed<br>
permits<br>
[NotBoxedMap](#notboxedmap)

sealed interface that stores validated payloads using boxed classes

## NotBoxedMap
public record NotBoxedMap<br>
implements [NotBoxed](#notboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedMap([NotMap](#notmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NotMap](#notmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Not
public static class Not<br>
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
import org.openapijsonschematools.client.components.schemas.NotMoreComplexSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
NotMoreComplexSchema.NotMap validatedPayload =
    NotMoreComplexSchema.Not.validate(
    new NotMoreComplexSchema.NotMapBuilder()
        .foo("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NotMap](#notmap) | validate([Map&lt;?, ?&gt;](#notmapbuilder) arg, SchemaConfiguration configuration) |
| [NotBoxedMap](#notboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#notmapbuilder) arg, SchemaConfiguration configuration) |
| [NotBoxed](#notboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NotMapBuilder
public class NotMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [NotMapBuilder](#notmapbuilder) | foo(String value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, Void value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, boolean value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, String value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, int value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, float value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, long value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, double value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, List<?> value) |
| [NotMapBuilder](#notmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## NotMap
public static class NotMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NotMap](#notmap) | of([Map<String, ? extends @Nullable Object>](#notmapbuilder) arg, SchemaConfiguration configuration) |
| String | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
public sealed interface FooBoxed<br>
permits<br>
[FooBoxedString](#fooboxedstring)

sealed interface that stores validated payloads using boxed classes

## FooBoxedString
public record FooBoxedString<br>
implements [FooBoxed](#fooboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Foo
public static class Foo<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
