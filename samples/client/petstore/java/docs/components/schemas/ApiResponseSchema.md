# ApiResponseSchema
org.openapijsonschematools.components.schemas.ApiResponseSchema.java
public class ApiResponseSchema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ApiResponseSchema.Code<br> schema class |
| static class | ApiResponseSchema.Type<br> schema class |
| static class | ApiResponseSchema.Message<br> schema class |
| static class | ApiResponseSchema.ApiResponseMap<br> output class for Map payloads |
| static class | ApiResponseSchema.ApiResponseSchema1<br> schema class |

## ApiResponseSchema1
public class ApiResponseSchema1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ApiResponseMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**code** | int |  | [optional] value must be a 32 bit integer
**type** | String |  | [optional]
**message** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ApiResponseMap
public class ApiResponseMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ApiResponseMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| int | code()<br>[optional] value must be a 32 bit integer |
| String | type()<br>[optional] |
| String | message()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
