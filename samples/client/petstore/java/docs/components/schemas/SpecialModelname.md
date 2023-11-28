# SpecialModelname
org.openapijsonschematools.components.schemas.SpecialModelname.java
public class SpecialModelname

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SpecialModelname.SpecialModelname1](#specialmodelname1)<br> schema class |
| static class | [SpecialModelname.SpecialModelnameMap](#specialmodelnamemap)<br> output class for Map payloads |
| static class | [SpecialModelname.A](#a)<br> schema class |

## SpecialModelname1
public static class SpecialModelname1<br>
extends JsonSchema

A schema class that validates payloads

## Description
model with an invalid class name for python
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("a", A.class)
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SpecialModelnameMap](#specialmodelnamemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## SpecialModelnameMap
public static class SpecialModelnameMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SpecialModelnameMap](#specialmodelnamemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **a** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## A
public static class A<br>
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
