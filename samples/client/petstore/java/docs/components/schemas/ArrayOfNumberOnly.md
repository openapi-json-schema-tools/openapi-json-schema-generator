# ArrayOfNumberOnly
org.openapijsonschematools.components.schemas.ArrayOfNumberOnly.java
public class ArrayOfNumberOnly

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ArrayOfNumberOnly.ArrayOfNumberOnly1<br> schema class |
| static class | ArrayOfNumberOnly.ArrayOfNumberOnlyMap<br> output class for Map payloads |
| static class | ArrayOfNumberOnly.ArrayNumber<br> schema class |
| static class | ArrayOfNumberOnly.ArrayNumberList<br> output class for List payloads |
| static class | ArrayOfNumberOnly.Items<br> schema class |

## ArrayOfNumberOnly1
public class ArrayOfNumberOnly1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayOfNumberOnlyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayNumber** | List<Number> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayOfNumberOnlyMap
public class ArrayOfNumberOnlyMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayOfNumberOnlyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| ArrayNumberList | ArrayNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
