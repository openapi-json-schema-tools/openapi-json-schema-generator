# ArrayTest
org.openapijsonschematools.components.schemas.ArrayTest.java
public class ArrayTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTest.ArrayTest1](#arraytest1)<br> schema class |
| static class | [ArrayTest.ArrayTestMap](#arraytestmap)<br> output class for Map payloads |
| static class | [ArrayTest.ArrayArrayOfModel](#arrayarrayofmodel)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfModelList](#arrayarrayofmodellist)<br> output class for List payloads |
| static class | [ArrayTest.Items3](#items3)<br> schema class |
| static class | [ArrayTest.ItemsList1](#itemslist1)<br> output class for List payloads |
| static class | [ArrayTest.ArrayArrayOfInteger](#arrayarrayofinteger)<br> schema class |
| static class | [ArrayTest.ArrayArrayOfIntegerList](#arrayarrayofintegerlist)<br> output class for List payloads |
| static class | [ArrayTest.Items1](#items1)<br> schema class |
| static class | [ArrayTest.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [ArrayTest.Items2](#items2)<br> schema class |
| static class | [ArrayTest.ArrayOfString](#arrayofstring)<br> schema class |
| static class | [ArrayTest.ArrayOfStringList](#arrayofstringlist)<br> output class for List payloads |
| static class | [ArrayTest.Items](#items)<br> schema class |

## ArrayTest1
public static class ArrayTest1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_of_string", [ArrayOfString.class](#arrayofstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_array_of_integer", [ArrayArrayOfInteger.class](#arrayarrayofinteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_array_of_model", [ArrayArrayOfModel.class](#arrayarrayofmodel)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTestMap](#arraytestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayTestMap
public static class ArrayTestMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTestMap](#arraytestmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| [ArrayOfStringList](#arrayofstringlist) | array_of_string()<br>[optional] |
| [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | array_array_of_integer()<br>[optional] |
| [ArrayArrayOfModelList](#arrayarrayofmodellist) | array_array_of_model()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **array_of_string** | List<String> |  | [optional] |
| **array_array_of_integer** | List<List<long>> |  | [optional] |
| **array_array_of_model** | List<List<Map<String, Object>>> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ArrayArrayOfModel
public static class ArrayArrayOfModel<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items3.class](#items3)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfModelList](#arrayarrayofmodellist) | validate(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) |

## ArrayArrayOfModelList
public class ArrayArrayOfModelList<br>
extends `FrozenList<ItemsList1>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfModelList](#arrayarrayofmodellist) | of(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List<Map<String, Object>>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<Map<String, Object>> |  |

## Items3
public static class Items3<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([ReadOnlyFirst.ReadOnlyFirst1.class](../../components/schemas/ReadOnlyFirst.md#readonlyfirst1))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ItemsList1
public class ItemsList1<br>
extends `FrozenList<ReadOnlyFirst.ReadOnlyFirstMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | of(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, Object>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## ArrayArrayOfInteger
public static class ArrayArrayOfInteger<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items1.class](#items1)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | validate(List<List<Long>> arg, SchemaConfiguration configuration) |

## ArrayArrayOfIntegerList
public class ArrayArrayOfIntegerList<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | of(List<List<Long>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<List<Long>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<Long> |  |

## Items1
public static class Items1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items2.class](#items2)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | validate(List<Long> arg, SchemaConfiguration configuration) |

## ItemsList
public class ItemsList<br>
extends `FrozenList<Long>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of(List<Long> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Long>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Long |  | value must be a 64 bit integer

## Items2
public static class Items2<br>
extends Int64JsonSchema

A schema class that validates payloads

## ArrayOfString
public static class ArrayOfString<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("items", new ItemsValidator([Items.class](#items)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfStringList](#arrayofstringlist) | validate(List<String> arg, SchemaConfiguration configuration) |

## ArrayOfStringList
public class ArrayOfStringList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfStringList](#arrayofstringlist) | of(List<String> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  |

## Items
public static class Items<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
