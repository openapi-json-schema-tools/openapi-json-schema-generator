# Capitalization
org.openapijsonschematools.components.schemas.Capitalization.java
public class Capitalization

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Capitalization.Capitalization1<br> schema class |
| static class | Capitalization.CapitalizationMap<br> output class for Map payloads |
| static class | Capitalization.ATTNAME<br> schema class |
| static class | Capitalization.SCAETHFlowPoints<br> schema class |
| static class | Capitalization.CapitalSnake<br> schema class |
| static class | Capitalization.SmallSnake<br> schema class |
| static class | Capitalization.CapitalCamel<br> schema class |
| static class | Capitalization.SmallCamel<br> schema class |

## Capitalization1
public class Capitalization1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static CapitalizationMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## CapitalizationMap
public class CapitalizationMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static CapitalizationMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | smallCamel()<br>[optional] |
| String | CapitalCamel()<br>[optional] |
| String | small_Snake()<br>[optional] |
| String | Capital_Snake()<br>[optional] |
| String | SCA_ETH_Flow_Points()<br>[optional] |
| String | ATT_NAME()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**smallCamel** | String |  | [optional]
**CapitalCamel** | String |  | [optional]
**small_Snake** | String |  | [optional]
**Capital_Snake** | String |  | [optional]
**SCA_ETH_Flow_Points** | String |  | [optional]
**ATT_NAME** | String | Name of the pet  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ATTNAME
public class ATTNAME
extends JsonSchema

A schema class that validates payloads

## Description
Name of the pet 

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## SCAETHFlowPoints
public class SCAETHFlowPoints
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## CapitalSnake
public class CapitalSnake
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## SmallSnake
public class SmallSnake
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## CapitalCamel
public class CapitalCamel
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## SmallCamel
public class SmallCamel
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
