# AbstractStepMessage
org.openapijsonschematools.components.schemas.AbstractStepMessage.java
public class AbstractStepMessage

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | AbstractStepMessage.Discriminator<br> schema class |
| static class | AbstractStepMessage.AbstractStepMessageMap<br> output class for Map payloads |
| static class | AbstractStepMessage.AbstractStepMessage1<br> schema class |

## AbstractStepMessage1
public class AbstractStepMessage1
extends JsonSchema

A schema class that validates payloads


## Description
Abstract Step

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AbstractStepMessageMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**description** | Object |  |
**discriminator** | String |  |
**sequenceNumber** | Object |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## AbstractStepMessageMap
public class AbstractStepMessageMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static AbstractStepMessageMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | description()<br> |
| String | discriminator()<br> |
| Object | sequenceNumber()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
 |  | 

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
