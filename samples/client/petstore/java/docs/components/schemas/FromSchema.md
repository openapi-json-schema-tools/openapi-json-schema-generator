# FromSchema
org.openapijsonschematools.components.schemas.FromSchema.java
public class FromSchema

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | FromSchema.FromSchema1<br> schema class |
| static class | FromSchema.FromSchemaMap<br> output class for Map payloads |
| static class | FromSchema.Id<br> schema class |
| static class | FromSchema.Data<br> schema class |

## FromSchema1
public class FromSchema1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FromSchemaMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## FromSchemaMap
public class FromSchemaMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FromSchemaMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | data()<br>[optional] |
| long | id()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**data** | String |  | [optional]
**id** | long |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Id
public class Id
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Data
public class Data
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
