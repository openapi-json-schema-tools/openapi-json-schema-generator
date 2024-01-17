# PropertiesPatternpropertiesAdditionalpropertiesInteraction
org.openapijsonschematools.client.components.schemas.PropertiesPatternpropertiesAdditionalpropertiesInteraction.java
public class PropertiesPatternpropertiesAdditionalpropertiesInteraction

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1](#propertiespatternpropertiesadditionalpropertiesinteraction1)<br> schema class |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap)<br> output class for Map payloads |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Bar](#bar)<br> schema class |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Foo](#foo)<br> schema class |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.Fo](#fo)<br> schema class |
| static class | [PropertiesPatternpropertiesAdditionalpropertiesInteraction.AdditionalProperties](#additionalproperties)<br> schema class |

## PropertiesPatternpropertiesAdditionalpropertiesInteraction1
public static class PropertiesPatternpropertiesAdditionalpropertiesInteraction1<br>
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
PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMap validatedPayload =
    PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteraction1.validate(
    new PropertiesPatternpropertiesAdditionalpropertiesInteraction.PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder()
        .additionalProperty("someAdditionalProperty", 1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(Pattern.compile("f.o"), [Fo.class](#fo)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | validate([Map&lt;?, ?&gt;](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder
public class PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | foo(List<@Nullable Object> value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | bar(List<@Nullable Object> value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, int value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, float value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, long value) |
| [PropertiesPatternpropertiesAdditionalpropertiesInteractionMapBuilder](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) | additionalProperty(String key, double value) |

## PropertiesPatternpropertiesAdditionalpropertiesInteractionMap
public static class PropertiesPatternpropertiesAdditionalpropertiesInteractionMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesPatternpropertiesAdditionalpropertiesInteractionMap](#propertiespatternpropertiesadditionalpropertiesinteractionmap) | of([Map<String, Object>](#propertiespatternpropertiesadditionalpropertiesinteractionmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<?> | foo()<br>[optional] |
| FrozenList<?> | bar()<br>[optional] |
| Number | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar
public static class Bar<br>
extends ListJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.ListJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foo
public static class Foo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Integer | maxItems = 3 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Fo
public static class Fo<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minItems = 2 |

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
## AdditionalProperties
public static class AdditionalProperties<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
