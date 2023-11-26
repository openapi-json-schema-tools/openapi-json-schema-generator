# EnumArrays
org.openapijsonschematools.components.schemas.EnumArrays.java
public class EnumArrays

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | EnumArrays.EnumArrays1<br> schema class |
| static class | EnumArrays.EnumArraysMap<br> output class for Map payloads |
| static class | EnumArrays.ArrayEnum<br> schema class |
| static class | EnumArrays.ArrayEnumList<br> output class for List payloads |
| static class | EnumArrays.Items<br> schema class |
| static class | EnumArrays.JustSymbol<br> schema class |

## EnumArrays1
public class EnumArrays1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EnumArraysMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**just_symbol** | String |  | [optional] must be one of [">=", "$"]
**array_enum** | List<String> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## EnumArraysMap
public class EnumArraysMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EnumArraysMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | just_symbol()<br>[optional] must be one of [">=", "$"] |
| ArrayEnumList | array_enum()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayEnum
public class ArrayEnum
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayEnumList | validate(List<String> arg, SchemaConfiguration configuration) |

## ArrayEnumList
public class ArrayEnumList
extends FrozenList<String>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<String>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  | must be one of ["fish", "crab"]

## Items
public class Items
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## JustSymbol
public class JustSymbol
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
