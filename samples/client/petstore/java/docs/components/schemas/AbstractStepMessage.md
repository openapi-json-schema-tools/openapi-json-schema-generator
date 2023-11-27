# AbstractStepMessage
org.openapijsonschematools.components.schemas.AbstractStepMessage.java
public class AbstractStepMessage

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AbstractStepMessage.AbstractStepMessage1](#abstractstepmessage1)<br> schema class |
| static class | [AbstractStepMessage.AbstractStepMessageMap](#abstractstepmessagemap)<br> output class for Map payloads |
| static class | [AbstractStepMessage.Discriminator](#discriminator)<br> schema class |

## AbstractStepMessage1
public static class AbstractStepMessage1
extends JsonSchema

A schema class that validates payloads

## Description
Abstract Step

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AbstractStepMessageMap](#abstractstepmessagemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AbstractStepMessageMap
public static class AbstractStepMessageMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AbstractStepMessageMap](#abstractstepmessagemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | description()<br> |
| String | discriminator()<br> |
| Object | sequenceNumber()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **description** | Object |  | |
| **discriminator** | String |  | |
| **sequenceNumber** | Object |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Discriminator
public static class Discriminator
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
