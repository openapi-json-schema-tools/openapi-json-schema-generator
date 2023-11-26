# Whale
org.openapijsonschematools.components.schemas.Whale.java
public class Whale

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Whale.Whale1<br> schema class |
| static class | Whale.WhaleMap<br> output class for Map payloads |
| static class | Whale.ClassName<br> schema class |
| static class | Whale.HasTeeth<br> schema class |
| static class | Whale.HasBaleen<br> schema class |

## Whale1
public class Whale1
extends JsonSchema

A schema class that validates payloads


## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static WhaleMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  | must be one of ["whale"]
**hasBaleen** | boolean |  | [optional]
**hasTeeth** | boolean |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## WhaleMap
public class WhaleMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static WhaleMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | className()<br> must be one of ["whale"] |
| boolean | hasBaleen()<br>[optional] |
| boolean | hasTeeth()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
