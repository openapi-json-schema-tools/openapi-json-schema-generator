# HealthCheckResult1
org.openapijsonschematools.components.schemas.HealthCheckResult.java
```
type: JsonSchema
```

## Description
Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static HealthCheckResultMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**NullableMessage** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## HealthCheckResultMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static HealthCheckResultMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | NullableMessage()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
