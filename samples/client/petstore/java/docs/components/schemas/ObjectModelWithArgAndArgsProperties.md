# ObjectModelWithArgAndArgsProperties
org.openapijsonschematools.components.schemas.ObjectModelWithArgAndArgsProperties.java
public class ObjectModelWithArgAndArgsProperties

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsProperties1](#objectmodelwithargandargsproperties1)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap)<br> output class for Map payloads |
| static class | [ObjectModelWithArgAndArgsProperties.Args](#args)<br> schema class |
| static class | [ObjectModelWithArgAndArgsProperties.Arg](#arg)<br> schema class |

## ObjectModelWithArgAndArgsProperties1
public static class ObjectModelWithArgAndArgsProperties1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectModelWithArgAndArgsPropertiesMap
public static class ObjectModelWithArgAndArgsPropertiesMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectModelWithArgAndArgsPropertiesMap](#objectmodelwithargandargspropertiesmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | arg()<br> |
| String | args()<br> |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**arg** | String |  |
**args** | String |  |
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Args
public static class Args
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Arg
public static class Arg
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
