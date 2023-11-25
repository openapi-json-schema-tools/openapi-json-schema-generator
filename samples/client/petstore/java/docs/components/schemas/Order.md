# Order1
org.openapijsonschematools.components.schemas.Order.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static OrderMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | [optional] value must be a 64 bit integer
**petId** | long |  | [optional] value must be a 64 bit integer
**quantity** | int |  | [optional] value must be a 32 bit integer
**shipDate** | String |  | [optional] value must conform to RFC-3339 date-time
**status** | String | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | boolean |  | [optional] if omitted the server will use the default value of false
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## OrderMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static OrderMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | id()<br>[optional] value must be a 64 bit integer |
| long | petId()<br>[optional] value must be a 64 bit integer |
| int | quantity()<br>[optional] value must be a 32 bit integer |
| String | shipDate()<br>[optional] value must conform to RFC-3339 date-time |
| String | status()<br>[optional] must be one of ["placed", "approved", "delivered"] |
| boolean | complete()<br>[optional] if omitted the server will use the default value of false |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
