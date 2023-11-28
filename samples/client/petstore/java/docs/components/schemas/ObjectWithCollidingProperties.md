# ObjectWithCollidingProperties
org.openapijsonschematools.components.schemas.ObjectWithCollidingProperties.java
public class ObjectWithCollidingProperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

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
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("someProp", SomeProp.class),
    new PropertyEntry("someprop", Someprop.class)
)))
));</code> |

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
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SomeProp
public static class SomeProp<br>
extends MapJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FrozenMap<String, Object> | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
