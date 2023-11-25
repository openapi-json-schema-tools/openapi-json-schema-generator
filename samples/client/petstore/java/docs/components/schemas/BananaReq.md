# BananaReq
org.openapijsonschematools.components.schemas.BananaReq.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | BananaReq.AdditionalProperties<br> schema class |
| static class | BananaReq.LengthCm<br> schema class |
| static class | BananaReq.Sweet<br> schema class |
| static class | BananaReq.BananaReqMap<br> output class for Map payloads |
| static class | BananaReq.BananaReq1<br> schema class |

## BananaReq1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BananaReqMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**lengthCm** | Number |  |
**sweet** | boolean |  | [optional]

## BananaReqMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BananaReqMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| boolean | sweet()<br>[optional] |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
