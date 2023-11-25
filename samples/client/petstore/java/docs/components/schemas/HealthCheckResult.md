# HealthCheckResult
org.openapijsonschematools.components.schemas.HealthCheckResult.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | HealthCheckResult.NullableMessage<br> schema class |
| static class | HealthCheckResult.HealthCheckResultMap<br> output class for Map payloads |
| static class | HealthCheckResult.HealthCheckResult1<br> schema class |

## HealthCheckResult1
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
