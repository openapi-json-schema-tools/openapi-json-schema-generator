# ObjectWithOptionalTestProp
org.openapijsonschematools.components.schemas.ObjectWithOptionalTestProp.java
public class ObjectWithOptionalTestProp

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestProp1](#objectwithoptionaltestprop1)<br> schema class |
| static class | [ObjectWithOptionalTestProp.ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap)<br> output class for Map payloads |
| static class | [ObjectWithOptionalTestProp.Test](#test)<br> schema class |

## ObjectWithOptionalTestProp1
public static class ObjectWithOptionalTestProp1
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## ObjectWithOptionalTestPropMap
public static class ObjectWithOptionalTestPropMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOptionalTestPropMap](#objectwithoptionaltestpropmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | test()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **test** | String |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Test
public static class Test
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
