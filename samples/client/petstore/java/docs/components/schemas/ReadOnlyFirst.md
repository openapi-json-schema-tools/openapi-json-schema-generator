# ReadOnlyFirst
org.openapijsonschematools.components.schemas.ReadOnlyFirst.java
public class ReadOnlyFirst

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReadOnlyFirst.ReadOnlyFirst1](#readonlyfirst1)<br> schema class |
| static class | [ReadOnlyFirst.ReadOnlyFirstMap](#readonlyfirstmap)<br> output class for Map payloads |
| static class | [ReadOnlyFirst.Baz](#baz)<br> schema class |
| static class | [ReadOnlyFirst.Bar](#bar)<br> schema class |

## ReadOnlyFirst1
public static class ReadOnlyFirst1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),
new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("bar", Bar.class),
    new PropertyEntry("baz", Baz.class)
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReadOnlyFirstMap](#readonlyfirstmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ReadOnlyFirstMap
public static class ReadOnlyFirstMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReadOnlyFirstMap](#readonlyfirstmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| String | baz()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **bar** | String |  | [optional] |
| **baz** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Baz
public static class Baz<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Bar
public static class Bar<br>
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
