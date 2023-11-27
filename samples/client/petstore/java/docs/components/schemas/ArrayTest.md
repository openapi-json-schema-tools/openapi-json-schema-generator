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
public class ArrayTest1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTestMap](#arraytestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ArrayTestMap
public class ArrayTestMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayTestMap](#arraytestmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| ArrayOfStringList | array_of_string()<br>[optional] |
| ArrayArrayOfIntegerList | array_array_of_integer()<br>[optional] |
| ArrayArrayOfModelList | array_array_of_model()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**array_of_string** | List<String> |  | [optional]
**array_array_of_integer** | List<List<long>> |  | [optional]
**array_array_of_model** | List<List<Map<String, Object>>> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayArrayOfModel
public class ArrayArrayOfModel
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfModelList](#arrayarrayofmodellist) | validate(List<List<Map<String, Object>>> arg, SchemaConfiguration configuration) |

## ArrayArrayOfModelList
public class ArrayArrayOfModelList
extends FrozenList<ItemsList1>

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
public class Items3
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | validate(List<Map<String, Object>> arg, SchemaConfiguration configuration) |

## ItemsList1
public class ItemsList1
extends FrozenList<ReadOnlyFirst.ReadOnlyFirstMap>

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
public class ArrayArrayOfInteger
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayOfIntegerList](#arrayarrayofintegerlist) | validate(List<List<Long>> arg, SchemaConfiguration configuration) |

## ArrayArrayOfIntegerList
public class ArrayArrayOfIntegerList
extends FrozenList<ItemsList>

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
public class Items1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | validate(List<Long> arg, SchemaConfiguration configuration) |

## ItemsList
public class ItemsList
extends FrozenList<Long>

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
public class Items2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## ArrayOfString
public class ArrayOfString
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfStringList](#arrayofstringlist) | validate(List<String> arg, SchemaConfiguration configuration) |

## ArrayOfStringList
public class ArrayOfStringList
extends FrozenList<String>

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
public class Items
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
