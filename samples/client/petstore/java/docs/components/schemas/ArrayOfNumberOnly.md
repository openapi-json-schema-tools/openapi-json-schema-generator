# ArrayOfNumberOnly
org.openapijsonschematools.components.schemas.ArrayOfNumberOnly.java
public class ArrayOfNumberOnly

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayOfNumberOnly.ArrayOfNumberOnly1](#arrayofnumberonly1)<br> schema class |
| static class | [ArrayOfNumberOnly.ArrayOfNumberOnlyMap](#arrayofnumberonlymap)<br> output class for Map payloads |
| static class | [ArrayOfNumberOnly.ArrayNumber](#arraynumber)<br> schema class |
| static class | [ArrayOfNumberOnly.ArrayNumberList](#arraynumberlist)<br> output class for List payloads |
| static class | [ArrayOfNumberOnly.Items](#items)<br> schema class |

## ArrayOfNumberOnly1
public static class ArrayOfNumberOnly1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ArrayNumber", [ArrayNumber.class](#arraynumber)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfNumberOnlyMap](#arrayofnumberonlymap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayOfNumberOnlyMap
public static class ArrayOfNumberOnlyMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfNumberOnlyMap](#arrayofnumberonlymap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| [ArrayNumberList](#arraynumberlist) | ArrayNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **ArrayNumber** | List<Number> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ArrayNumber
public static class ArrayNumber<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayNumberList](#arraynumberlist) | validate(List<Number> arg, SchemaConfiguration configuration) |

## ArrayNumberList
public class ArrayNumberList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayNumberList](#arraynumberlist) | of(List<Number> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Number>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## Items
public static class Items<br>
extends NumberJsonSchema

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
