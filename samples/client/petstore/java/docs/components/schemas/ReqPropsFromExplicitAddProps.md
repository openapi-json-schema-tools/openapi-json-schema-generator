# ReqPropsFromExplicitAddProps
org.openapijsonschematools.components.schemas.ReqPropsFromExplicitAddProps.java
public class ReqPropsFromExplicitAddProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddProps1](#reqpropsfromexplicitaddprops1)<br> schema class |
| static class | [ReqPropsFromExplicitAddProps.ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap)<br> output class for Map payloads |
| static class | [ReqPropsFromExplicitAddProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ReqPropsFromExplicitAddProps1
public static class ReqPropsFromExplicitAddProps1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"invalid-name",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"validName"<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator([AdditionalProperties.class](#additionalproperties)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | validate(Map<String, String> arg, SchemaConfiguration configuration) |

## ReqPropsFromExplicitAddPropsMap
public static class ReqPropsFromExplicitAddPropsMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReqPropsFromExplicitAddPropsMap](#reqpropsfromexplicitaddpropsmap) | of(Map<String, String> arg, SchemaConfiguration configuration) |
| String | validName()<br> |
| String | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["invalid-name"],  |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **invalid-name** | String |  | |
| **validName** | String |  | |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
