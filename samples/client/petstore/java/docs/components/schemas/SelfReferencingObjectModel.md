# SelfReferencingObjectModel
org.openapijsonschematools.components.schemas.SelfReferencingObjectModel.java
public class SelfReferencingObjectModel

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | SelfReferencingObjectModel.SelfReferencingObjectModelMap<br> output class for Map payloads |
| static class | SelfReferencingObjectModel.SelfReferencingObjectModel1<br> schema class |

## SelfReferencingObjectModel1
public class SelfReferencingObjectModel1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SelfReferencingObjectModelMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**selfRef** | Map |  | [optional]
**anyStringName** | Map | any string name can be used but the value must be the correct type | [optional]

## SelfReferencingObjectModelMap
public class SelfReferencingObjectModelMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static SelfReferencingObjectModelMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| SelfReferencingObjectModelMap | selfRef()<br>[optional] |
| SelfReferencingObjectModelMap | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
