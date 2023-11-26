# MyObjectDto
org.openapijsonschematools.components.schemas.MyObjectDto.java
public class MyObjectDto

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | MyObjectDto.MyObjectDto1<br> schema class |
| static class | MyObjectDto.MyObjectDtoMap<br> output class for Map payloads |
| static class | MyObjectDto.Id<br> schema class |
| static class | MyObjectDto.AdditionalProperties<br> schema class |

## MyObjectDto1
public class MyObjectDto1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MyObjectDtoMap | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | String |  | [optional] value must be a uuid

## MyObjectDtoMap
public class MyObjectDtoMap
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MyObjectDtoMap | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | id()<br>[optional] value must be a uuid |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
