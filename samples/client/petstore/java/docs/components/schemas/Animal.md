# Animal
org.openapijsonschematools.components.schemas.Animal.java
public class Animal

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Animal.Animal1](#animal1)<br> schema class |
| static class | [Animal.AnimalMap](#animalmap)<br> output class for Map payloads |
| static class | [Animal.Color](#color)<br> schema class |
| static class | [Animal.ClassName](#classname)<br> schema class |

## Animal1
public static class Animal1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("className", ClassName.class),
    new PropertyEntry("color", Color.class)
))),
new KeywordEntry("required", new RequiredValidator(Set.of(
    "className"
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalMap](#animalmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AnimalMap
public static class AnimalMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnimalMap](#animalmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> |
| String | color()<br>[optional] if omitted the server will use the default value of red |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **className** | String |  | |
| **color** | String |  | [optional] if omitted the server will use the default value of red |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Color
public static class Color<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(
    String.class
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## ClassName
public static class ClassName<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
