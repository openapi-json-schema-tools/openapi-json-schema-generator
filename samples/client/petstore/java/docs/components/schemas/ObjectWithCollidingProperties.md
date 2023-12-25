# ObjectWithCollidingProperties
org.openapijsonschematools.client.components.schemas.ObjectWithCollidingProperties.java
public class ObjectWithCollidingProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingProperties1](#objectwithcollidingproperties1)<br> schema class |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMapInput](#objectwithcollidingpropertiesmapinput)<br> builder for Map payloads |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap)<br> output class for Map payloads |
| static class | [ObjectWithCollidingProperties.Someprop](#someprop)<br> schema class |
| static class | [ObjectWithCollidingProperties.SomeProp](#someprop)<br> schema class |

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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ObjectWithCollidingProperties.ObjectWithCollidingPropertiesMap validatedPayload =
    ObjectWithCollidingProperties.ObjectWithCollidingProperties1.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [SomeProp.class](#someprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someprop", [Someprop.class](#someprop)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap) | validate([Map<?, ?>](#objectwithcollidingpropertiesmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ObjectWithCollidingPropertiesMapInput
public class ObjectWithCollidingPropertiesMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **someProp** | Map<String, ? extends @Nullable Object> |  | [optional] |
| **someprop** | Map<String, ? extends @Nullable Object> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ObjectWithCollidingPropertiesMap
public static class ObjectWithCollidingPropertiesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap) | of([Map<String, ? extends @Nullable Object>](#objectwithcollidingpropertiesmapinput) arg, SchemaConfiguration configuration) |
| FrozenMap<?> | someProp()<br>[optional] |
| FrozenMap<?> | someprop()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Someprop
public static class Someprop<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## SomeProp
public static class SomeProp<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
