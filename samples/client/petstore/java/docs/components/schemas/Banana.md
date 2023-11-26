# Banana
org.openapijsonschematools.components.schemas.Banana.java
public class Banana

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Banana.Banana1<br> schema class |
| static class | Banana.BananaMap<br> output class for Map payloads |
| static class | Banana.LengthCm<br> schema class |

## Banana1
public class Banana1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BananaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**lengthCm** | Number |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## BananaMap
public class BananaMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static BananaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | lengthCm()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## LengthCm
public class LengthCm
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
