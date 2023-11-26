# Apple
org.openapijsonschematools.components.schemas.Apple.java
public class Apple

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Apple.Apple1<br> schema class |
| static class | Apple.AppleMap<br> output class for Map payloads |
| static class | Apple.Origin<br> schema class |
| static class | Apple.Cultivar<br> schema class |

## Apple1
public class Apple1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static AppleMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AppleMap
public class AppleMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AppleMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | cultivar()<br> |
| String | origin()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**cultivar** | String |  |
**origin** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Origin
public class Origin
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Cultivar
public class Cultivar
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
