# BananaReq
org.openapijsonschematools.components.schemas.BananaReq.java
public class BananaReq

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | BananaReq.BananaReq1<br> schema class |
| static class | BananaReq.BananaReqMap<br> output class for Map payloads |
| static class | BananaReq.Sweet<br> schema class |
| static class | BananaReq.LengthCm<br> schema class |
| static class | BananaReq.AdditionalProperties<br> schema class |

## BananaReq1
public class BananaReq1
extends JsonSchema

A schema class that validates payloads


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
public class BananaReqMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BananaReqMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| boolean | sweet()<br>[optional] |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
