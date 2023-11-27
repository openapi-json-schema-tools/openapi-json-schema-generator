# Player
org.openapijsonschematools.components.schemas.Player.java
public class Player

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Player.Player1](#player1)<br> schema class |
| static class | [Player.PlayerMap](#playermap)<br> output class for Map payloads |
| static class | [Player.Name](#name)<br> schema class |

## Player1
public static class Player1
extends JsonSchema

A schema class that validates payloads

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PlayerMap](#playermap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## PlayerMap
public static class PlayerMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PlayerMap](#playermap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| PlayerMap | enemyPlayer()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **name** | String |  | [optional] |
| **enemyPlayer** | Map<String, Object> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Name
public static class Name
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
