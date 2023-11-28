# HealthCheckResult
org.openapijsonschematools.components.schemas.HealthCheckResult.java
public class HealthCheckResult

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [HealthCheckResult.HealthCheckResult1](#healthcheckresult1)<br> schema class |
| static class | [HealthCheckResult.HealthCheckResultMap](#healthcheckresultmap)<br> output class for Map payloads |
| static class | [HealthCheckResult.NullableMessage](#nullablemessage)<br> schema class |

## HealthCheckResult1
public static class HealthCheckResult1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("NullableMessage", NullableMessage.class)<br>)))<br>));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HealthCheckResultMap](#healthcheckresultmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## HealthCheckResultMap
public static class HealthCheckResultMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HealthCheckResultMap](#healthcheckresultmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | NullableMessage()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **NullableMessage** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## NullableMessage
public static class NullableMessage<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
