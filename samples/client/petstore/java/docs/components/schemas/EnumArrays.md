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


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
