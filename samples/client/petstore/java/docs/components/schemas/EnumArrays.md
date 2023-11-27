# EnumArrays
org.openapijsonschematools.components.schemas.EnumArrays.java
public class EnumArrays

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumArrays.EnumArrays1](#enumarrays1)<br> schema class |
| static class | [EnumArrays.EnumArraysMap](#enumarraysmap)<br> output class for Map payloads |
| static class | [EnumArrays.ArrayEnum](#arrayenum)<br> schema class |
| static class | [EnumArrays.ArrayEnumList](#arrayenumlist)<br> output class for List payloads |
| static class | [EnumArrays.Items](#items)<br> schema class |
| static class | [EnumArrays.JustSymbol](#justsymbol)<br> schema class |

## EnumArrays1
public class EnumArrays1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumArraysMap](#enumarraysmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## EnumArraysMap
public class EnumArraysMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumArraysMap](#enumarraysmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | just_symbol()<br>[optional] must be one of [">=", "$"] |
| ArrayEnumList | array_enum()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**just_symbol** | String |  | [optional] must be one of [">=", "$"]
**array_enum** | List<String> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayEnum
public class ArrayEnum
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayEnumList](#arrayenumlist) | validate(List<String> arg, SchemaConfiguration configuration) |

## ArrayEnumList
public class ArrayEnumList
extends FrozenList<String>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayEnumList](#arrayenumlist) | of(List<String> arg, SchemaConfiguration configuration) |

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

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## JustSymbol
public class JustSymbol
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
