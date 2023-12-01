# ReqPropsFromTrueAddProps
org.openapijsonschematools.client.components.schemas.ReqPropsFromTrueAddProps.java
public class ReqPropsFromTrueAddProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddProps1](#reqpropsfromtrueaddprops1)<br> schema class |
| static class | [ReqPropsFromTrueAddProps.ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap)<br> output class for Map payloads |
| static class | [ReqPropsFromTrueAddProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ReqPropsFromTrueAddProps1
public static class ReqPropsFromTrueAddProps1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"invalid-name",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"validName"<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties.class](#additionalproperties)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ReqPropsFromTrueAddPropsMap
public static class ReqPropsFromTrueAddPropsMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromTrueAddPropsMap](#reqpropsfromtrueaddpropsmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | validName()<br> |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["invalid-name"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **invalid-name** | Object |  | |
| **validName** | Object |  | |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties
public static class AdditionalProperties<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
