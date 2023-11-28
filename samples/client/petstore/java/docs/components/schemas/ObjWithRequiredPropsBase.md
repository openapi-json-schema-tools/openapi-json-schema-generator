# ObjWithRequiredPropsBase
org.openapijsonschematools.components.schemas.ObjWithRequiredPropsBase.java
public class ObjWithRequiredPropsBase

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjWithRequiredPropsBase.ObjWithRequiredPropsBase1](#objwithrequiredpropsbase1)<br> schema class |
| static class | [ObjWithRequiredPropsBase.ObjWithRequiredPropsBaseMap](#objwithrequiredpropsbasemap)<br> output class for Map payloads |
| static class | [ObjWithRequiredPropsBase.B](#b)<br> schema class |

## ObjWithRequiredPropsBase1
public static class ObjWithRequiredPropsBase1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", B.class)<br>))),<br>new KeywordEntry("required", new RequiredValidator(Set.of(
    "b"
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjWithRequiredPropsBaseMap](#objwithrequiredpropsbasemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjWithRequiredPropsBaseMap
public static class ObjWithRequiredPropsBaseMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjWithRequiredPropsBaseMap](#objwithrequiredpropsbasemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | b()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **b** | String |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## B
public static class B<br>
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
