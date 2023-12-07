# ObjectWithCollidingProperties
org.openapijsonschematools.client.components.schemas.ObjectWithCollidingProperties.java
public class ObjectWithCollidingProperties

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithCollidingProperties.ObjectWithCollidingProperties1](#objectwithcollidingproperties1)<br> schema class |
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
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [SomeProp.class](#someprop))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someprop", [Someprop.class](#someprop)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithCollidingPropertiesMap
public static class ObjectWithCollidingPropertiesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithCollidingPropertiesMap](#objectwithcollidingpropertiesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenMap<String, Object> | someProp()<br>[optional] |
| FrozenMap<String, Object> | someprop()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **someProp** | Map<String, Object> |  | [optional] |
| **someprop** | Map<String, Object> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

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
