# Client
org.openapijsonschematools.components.schemas.Client.java
public class Client

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Client.Client1<br> schema class |
| static class | Client.ClientMap<br> output class for Map payloads |
| static class | Client.Client2<br> schema class |

## Client1
public class Client1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ClientMap](#clientmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ClientMap
public class ClientMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ClientMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | client()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**client** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Client2
public class Client2
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
