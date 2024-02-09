# ObjectWithCollidingProperties
org.openapijsonschematools.client.components.schemas.ObjectWithCollidingProperties.java
public class ObjectWithCollidingProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingProperties1Boxed](#objectwithcollidingproperties1boxed)<br> sealed validated payload class |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingProperties1](#objectwithcollidingproperties1)<br> schema class |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder)<br> builder for Map payloads |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap)<br> output class for Map payloads |
| static class | [ObjectWithCollidingProperties.SomepropBoxed](#somepropboxed)<br> sealed validated payload class |
| static class | [ObjectWithCollidingProperties.Someprop](#someprop)<br> schema class |
| static class | [ObjectWithCollidingProperties.SomePropBoxed](#somepropboxed)<br> sealed validated payload class |
| static class | [ObjectWithCollidingProperties.SomeProp](#someprop)<br> schema class |

## ObjectWithCollidingProperties1Boxed
public static abstract sealed class ObjectWithCollidingProperties1Boxed<br>

## ObjectWithCollidingProperties1
public static class ObjectWithCollidingProperties1<br>
extends JsonSchema

A schema class that validates payloads

## Description
component with properties that have name collisions

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
ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMap validatedPayload =
    ObjectWithCollidingProperties.ObjectWithCollidingProperties1.validate(
    new ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [SomeProp.class](#someprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someprop", [Someprop.class](#someprop)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap) | validate([Map&lt;?, ?&gt;](#objectwithcollidingpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithCollidingPropertiesMapBuilder
public class ObjectWithCollidingPropertiesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ObjectWithCollidingPropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | someProp(Map<String, @Nullable Object> value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | someprop(Map<String, @Nullable Object> value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, Void value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, boolean value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, String value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, int value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, float value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, long value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, double value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, List<?> value) |
| [ObjectWithCollidingPropertiesMapBuilder](#objectwithcollidingpropertiesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ObjectWithCollidingPropertiesMap
public static class ObjectWithCollidingPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectwithcollidingpropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenMap<?> | someProp()<br>[optional] |
| FrozenMap<?> | someprop()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SomepropBoxed
public static abstract sealed class SomepropBoxed<br>

## Someprop
public static class Someprop<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SomePropBoxed
public static abstract sealed class SomePropBoxed<br>

## SomeProp
public static class SomeProp<br>
extends MapJsonSchema.MapJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema.MapJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
