# ObjectWithInlineCompositionProperty
org.openapijsonschematools.client.components.schemas.ObjectWithInlineCompositionProperty.java
public class ObjectWithInlineCompositionProperty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1Boxed](#objectwithinlinecompositionproperty1boxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1BoxedMap](#objectwithinlinecompositionproperty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1](#objectwithinlinecompositionproperty1)<br> schema class |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap)<br> output class for Map payloads |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxed](#somepropboxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxedVoid](#somepropboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxedBoolean](#somepropboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxedNumber](#somepropboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxedString](#somepropboxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxedList](#somepropboxedlist)<br> boxed class to store validated List payloads |
| static class | [ObjectWithInlineCompositionProperty.SomePropBoxedMap](#somepropboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ObjectWithInlineCompositionProperty.SomeProp](#someprop)<br> schema class |
| static class | [ObjectWithInlineCompositionProperty.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [ObjectWithInlineCompositionProperty.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [ObjectWithInlineCompositionProperty.Schema0](#schema0)<br> schema class |

## ObjectWithInlineCompositionProperty1Boxed
public sealed interface ObjectWithInlineCompositionProperty1Boxed<br>
permits<br>
[ObjectWithInlineCompositionProperty1BoxedMap](#objectwithinlinecompositionproperty1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ObjectWithInlineCompositionProperty1BoxedMap
public static final class ObjectWithInlineCompositionProperty1BoxedMap<br>
implements [ObjectWithInlineCompositionProperty1Boxed](#objectwithinlinecompositionproperty1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithInlineCompositionProperty1BoxedMap([ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap) | data<br>validated payload |

## ObjectWithInlineCompositionProperty1
public static class ObjectWithInlineCompositionProperty1<br>
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
ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMap validatedPayload =
    ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1.validate(
    new ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMapBuilder()
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
| [ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap) | validate([Map&lt;?, ?&gt;](#objectwithinlinecompositionpropertymapbuilder) arg, SchemaConfiguration configuration) |
| [ObjectWithInlineCompositionProperty1BoxedMap](#objectwithinlinecompositionproperty1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#objectwithinlinecompositionpropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithInlineCompositionPropertyMapBuilder
public class ObjectWithInlineCompositionPropertyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithInlineCompositionPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(Void value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(boolean value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(String value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(int value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(float value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(long value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(double value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(List<?> value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | someProp(Map<String, ?> value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, Void value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, boolean value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, String value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, int value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, float value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, long value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, double value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, List<?> value) |
| [ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectWithInlineCompositionPropertyMap
public static class ObjectWithInlineCompositionPropertyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap) | of([Map<String, ? extends @Nullable Object>](#objectwithinlinecompositionpropertymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SomePropBoxed
public sealed interface SomePropBoxed<br>
permits<br>
[SomePropBoxedVoid](#somepropboxedvoid),
[SomePropBoxedBoolean](#somepropboxedboolean),
[SomePropBoxedNumber](#somepropboxednumber),
[SomePropBoxedString](#somepropboxedstring),
[SomePropBoxedList](#somepropboxedlist),
[SomePropBoxedMap](#somepropboxedmap)

sealed interface that stores validated payloads using boxed classes

## SomePropBoxedVoid
public static final class SomePropBoxedVoid<br>
implements [SomePropBoxed](#somepropboxed)

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
implements [SomePropBoxed](#somepropboxed)

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
implements [SomePropBoxed](#somepropboxed)

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
implements [SomePropBoxed](#somepropboxed)

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
implements [SomePropBoxed](#somepropboxed)

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
implements [SomePropBoxed](#somepropboxed)

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
| [SomePropBoxedMap](#somepropboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SomePropBoxedList](#somepropboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedString](#schema0boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedString
public static final class Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

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
String validatedPayload = ObjectWithInlineCompositionProperty.Schema0.validate(
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
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
