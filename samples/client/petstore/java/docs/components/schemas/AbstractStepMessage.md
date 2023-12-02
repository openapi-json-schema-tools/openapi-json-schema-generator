# AbstractStepMessage
org.openapijsonschematools.client.components.schemas.AbstractStepMessage.java
public class AbstractStepMessage

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AbstractStepMessage.AbstractStepMessage1](#abstractstepmessage1)<br> schema class |
| static class | [AbstractStepMessage.AbstractStepMessageMap](#abstractstepmessagemap)<br> output class for Map payloads |
| static class | [AbstractStepMessage.Discriminator](#discriminator)<br> schema class |

## AbstractStepMessage1
public static class AbstractStepMessage1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Abstract Step
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("discriminator", [Discriminator.class](#discriminator)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"description",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"discriminator",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"sequenceNumber"<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("anyOf", new AnyOfValidator(List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[AbstractStepMessage1.class](#abstractstepmessage1)<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AbstractStepMessageMap](#abstractstepmessagemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## AbstractStepMessageMap
public static class AbstractStepMessageMap<br>
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
public static class Discriminator<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
