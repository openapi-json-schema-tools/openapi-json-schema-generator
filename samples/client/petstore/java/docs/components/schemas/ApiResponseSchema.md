# ApiResponseSchema1
org.openapijsonschematools.components.schemas.ApiResponseSchema.java
```
type: JsonSchema
```

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
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ApiResponseMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| int | code()<br>[optional] value must be a 32 bit integer |
| String | type()<br>[optional] |
| String | message()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
