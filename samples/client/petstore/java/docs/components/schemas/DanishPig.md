# DanishPig
org.openapijsonschematools.components.schemas.DanishPig.java
public class DanishPig

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | DanishPig.ClassName<br> schema class |
| static class | DanishPig.DanishPigMap<br> output class for Map payloads |
| static class | DanishPig.DanishPig1<br> schema class |

## DanishPig1
public class DanishPig1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static DanishPigMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  | must be one of ["DanishPig"]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## DanishPigMap
public class DanishPigMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static DanishPigMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["DanishPig"] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
