# ObjectWithNonIntersectingValues
org.openapijsonschematools.components.schemas.ObjectWithNonIntersectingValues.java
public class ObjectWithNonIntersectingValues

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1](#objectwithnonintersectingvalues1)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap)<br> output class for Map payloads |
| static class | [ObjectWithNonIntersectingValues.A](#a)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithNonIntersectingValues1
public static class ObjectWithNonIntersectingValues1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", A.class)<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties.class](#additionalproperties)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithNonIntersectingValuesMap
public static class ObjectWithNonIntersectingValuesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | a()<br>[optional] |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **a** | Number |  | [optional] |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## A
public static class A<br>
extends NumberJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
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
