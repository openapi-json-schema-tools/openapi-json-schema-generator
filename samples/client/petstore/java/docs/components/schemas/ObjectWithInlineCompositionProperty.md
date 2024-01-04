# ObjectWithInlineCompositionProperty
org.openapijsonschematools.client.components.schemas.ObjectWithInlineCompositionProperty.java
public class ObjectWithInlineCompositionProperty

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionProperty1](#objectwithinlinecompositionproperty1)<br> schema class |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMapBuilder](#objectwithinlinecompositionpropertymapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithInlineCompositionProperty.ObjectWithInlineCompositionPropertyMap](#objectwithinlinecompositionpropertymap)<br> output class for Map payloads |
| static class | [ObjectWithInlineCompositionProperty.SomeProp](#someprop)<br> schema class |
| static class | [ObjectWithInlineCompositionProperty.Schema0](#schema0)<br> schema class |

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
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
