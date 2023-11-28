# Client
org.openapijsonschematools.components.schemas.Client.java
public class Client

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Client.Client1](#client1)<br> schema class |
| static class | [Client.ClientMap](#clientmap)<br> output class for Map payloads |
| static class | [Client.Client2](#client2)<br> schema class |

## Client1
public static class Client1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(
    new PropertyEntry("client", Client2.class)
)))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ClientMap](#clientmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ClientMap
public static class ClientMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ClientMap](#clientmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | client()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **client** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Client2
public static class Client2<br>
extends StringJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
