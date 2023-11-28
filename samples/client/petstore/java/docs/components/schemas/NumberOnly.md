# NumberOnly
org.openapijsonschematools.components.schemas.NumberOnly.java
public class NumberOnly

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberOnly.NumberOnly1](#numberonly1)<br> schema class |
| static class | [NumberOnly.NumberOnlyMap](#numberonlymap)<br> output class for Map payloads |
| static class | [NumberOnly.JustNumber](#justnumber)<br> schema class |

## NumberOnly1
public static class NumberOnly1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("JustNumber", JustNumber.class)<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NumberOnlyMap](#numberonlymap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## NumberOnlyMap
public static class NumberOnlyMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NumberOnlyMap](#numberonlymap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | JustNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **JustNumber** | Number |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## JustNumber
public static class JustNumber<br>
extends NumberJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
