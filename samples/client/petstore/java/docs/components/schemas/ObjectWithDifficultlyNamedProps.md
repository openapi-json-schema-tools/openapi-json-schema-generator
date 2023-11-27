# ObjectWithDifficultlyNamedProps
org.openapijsonschematools.components.schemas.ObjectWithDifficultlyNamedProps.java
public class ObjectWithDifficultlyNamedProps

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedProps1<br> schema class |
| static class | ObjectWithDifficultlyNamedProps.ObjectWithDifficultlyNamedPropsMap<br> output class for Map payloads |
| static class | ObjectWithDifficultlyNamedProps.Schema123Number<br> schema class |
| static class | ObjectWithDifficultlyNamedProps.Schema123list<br> schema class |
| static class | ObjectWithDifficultlyNamedProps.Specialpropertyname<br> schema class |

## ObjectWithDifficultlyNamedProps1
public class ObjectWithDifficultlyNamedProps1
extends JsonSchema

A schema class that validates payloads

## Description
model with properties that have invalid names for python

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithDifficultlyNamedPropsMap](#objectwithdifficultlynamedpropsmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithDifficultlyNamedPropsMap
public class ObjectWithDifficultlyNamedPropsMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ObjectWithDifficultlyNamedPropsMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["123-list"], instance["$special[property.name]"], instance["123Number"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**123-list** | String |  |
**$special[property.name]** | long |  | [optional] value must be a 64 bit integer
**123Number** | long |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Schema123Number
public class Schema123Number
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## Schema123list
public class Schema123list
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Specialpropertyname
public class Specialpropertyname
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
