# ObjectWithDecimalProperties
org.openapijsonschematools.components.schemas.ObjectWithDecimalProperties.java
public class ObjectWithDecimalProperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithDecimalProperties.ObjectWithDecimalProperties1<br> schema class |
| static class | ObjectWithDecimalProperties.ObjectWithDecimalPropertiesMap<br> output class for Map payloads |
| static class | ObjectWithDecimalProperties.Width<br> schema class |

## ObjectWithDecimalProperties1
public class ObjectWithDecimalProperties1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDecimalPropertiesMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**length** | String |  | [optional]
**width** | String |  | [optional] value must be int or float numeric
**cost** | Map<String, Object> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDecimalPropertiesMap
public class ObjectWithDecimalPropertiesMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDecimalPropertiesMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| String | width()<br>[optional] value must be int or float numeric |
| Money.MoneyMap | cost()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Width
public class Width
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
