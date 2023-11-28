# ArrayHoldingAnyType
org.openapijsonschematools.components.schemas.ArrayHoldingAnyType.java
public class ArrayHoldingAnyType

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyType1](#arrayholdinganytype1)<br> schema class |
| static class | [ArrayHoldingAnyType.ArrayHoldingAnyTypeList](#arrayholdinganytypelist)<br> output class for List payloads |
| static class | [ArrayHoldingAnyType.Items](#items)<br> schema class |

## ArrayHoldingAnyType1
public static class ArrayHoldingAnyType1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | validate(List<Object> arg, SchemaConfiguration configuration) |

## ArrayHoldingAnyTypeList
public class ArrayHoldingAnyTypeList<br>
extends `FrozenList<Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayHoldingAnyTypeList](#arrayholdinganytypelist) | of(List<Object> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Object>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Object | any type can be stored here |

## Items
public static class Items<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

## Description
any type can be stored here

| Methods Inherited from class org.openapijsonschematools.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
