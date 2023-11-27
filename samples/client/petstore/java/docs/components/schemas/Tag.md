# Tag
org.openapijsonschematools.components.schemas.Tag.java
public class Tag

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Tag.Tag1<br> schema class |
| static class | Tag.TagMap<br> output class for Map payloads |
| static class | Tag.Name<br> schema class |
| static class | Tag.Id<br> schema class |

## Tag1
public class Tag1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [TagMap](#tagmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## TagMap
public class TagMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static TagMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | id()<br>[optional] value must be a 64 bit integer |
| String | name()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | [optional] value must be a 64 bit integer
**name** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Name
public class Name
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Id
public class Id
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
