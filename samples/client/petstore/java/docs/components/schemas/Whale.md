# Whale
org.openapijsonschematools.components.schemas.Whale.java
public class Whale

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Whale.Whale1](#whale1)<br> schema class |
| static class | [Whale.WhaleMap](#whalemap)<br> output class for Map payloads |
| static class | [Whale.ClassName](#classname)<br> schema class |
| static class | [Whale.HasTeeth](#hasteeth)<br> schema class |
| static class | [Whale.HasBaleen](#hasbaleen)<br> schema class |

## Whale1
public static class Whale1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("hasBaleen", [HasBaleen.class](#hasbaleen))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("hasTeeth", [HasTeeth.class](#hasteeth))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("className", [ClassName.class](#classname)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"className"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [WhaleMap](#whalemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## WhaleMap
public static class WhaleMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [WhaleMap](#whalemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["whale"] |
| boolean | hasBaleen()<br>[optional] |
| boolean | hasTeeth()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **className** | String |  | must be one of ["whale"] |
| **hasBaleen** | boolean |  | [optional] |
| **hasTeeth** | boolean |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ClassName
public static class ClassName<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## HasTeeth
public static class HasTeeth<br>
extends BooleanJsonSchema

A schema class that validates payloads

## HasBaleen
public static class HasBaleen<br>
extends BooleanJsonSchema

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
