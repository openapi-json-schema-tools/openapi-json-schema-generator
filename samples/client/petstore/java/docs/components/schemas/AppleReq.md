# AppleReq
org.openapijsonschematools.components.schemas.AppleReq.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | AppleReq.AdditionalProperties<br> schema class |
| static class | AppleReq.Cultivar<br> schema class |
| static class | AppleReq.Mealy<br> schema class |
| static class | AppleReq.AppleReqMap<br> output class for Map payloads |
| static class | AppleReq.AppleReq1<br> schema class |

## AppleReq1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AppleReqMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**cultivar** | String |  |
**mealy** | boolean |  | [optional]

## AppleReqMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AppleReqMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| boolean | mealy()<br>[optional] |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
