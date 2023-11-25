# ArrayTest
org.openapijsonschematools.components.schemas.ArrayTest.java
public class ArrayTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayTest.Items<br> schema class |
| static class | ArrayTest.ArrayOfStringList<br> output class for List payloads |
| static class | ArrayTest.ArrayOfString<br> schema class |
| static class | ArrayTest.Items2<br> schema class |
| static class | ArrayTest.ItemsList<br> output class for List payloads |
| static class | ArrayTest.Items1<br> schema class |
| static class | ArrayTest.ArrayArrayOfIntegerList<br> output class for List payloads |
| static class | ArrayTest.ArrayArrayOfInteger<br> schema class |
| static class | ArrayTest.ItemsList1<br> output class for List payloads |
| static class | ArrayTest.Items3<br> schema class |
| static class | ArrayTest.ArrayArrayOfModelList<br> output class for List payloads |
| static class | ArrayTest.ArrayArrayOfModel<br> schema class |
| static class | ArrayTest.ArrayTestMap<br> output class for Map payloads |
| static class | ArrayTest.ArrayTest1<br> schema class |

## ArrayTest1
public class ArrayTest1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

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

## ArrayTestMap
public class ArrayTestMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| ArrayOfStringList | array_of_string()<br>[optional] |
| ArrayArrayOfIntegerList | array_array_of_integer()<br>[optional] |
| ArrayArrayOfModelList | array_array_of_model()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
