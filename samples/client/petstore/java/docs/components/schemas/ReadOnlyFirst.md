# ReadOnlyFirst
org.openapijsonschematools.components.schemas.ReadOnlyFirst.java
public class ReadOnlyFirst

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ReadOnlyFirst.ReadOnlyFirst1<br> schema class |
| static class | ReadOnlyFirst.ReadOnlyFirstMap<br> output class for Map payloads |
| static class | ReadOnlyFirst.Baz<br> schema class |
| static class | ReadOnlyFirst.Bar<br> schema class |

## ReadOnlyFirst1
public class ReadOnlyFirst1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReadOnlyFirstMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | String |  | [optional]
**baz** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ReadOnlyFirstMap
public class ReadOnlyFirstMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReadOnlyFirstMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| String | baz()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Baz
public class Baz
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Bar
public class Bar
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
