# Name
org.openapijsonschematools.components.schemas.Name.java
public class Name

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Name.Name1<br> schema class |
| static class | Name.NameMap<br> output class for Map payloads |
| static class | Name.Property<br> schema class |
| static class | Name.SnakeCase<br> schema class |
| static class | Name.Name2<br> schema class |

## Name1
public class Name1
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing model name same as property name

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static NameMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## NameMap
public class NameMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NameMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| int | name()<br> value must be a 32 bit integer |
| int | snake_case()<br>[optional] value must be a 32 bit integer |
| String | property()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | int |  | value must be a 32 bit integer
**snake_case** | int |  | [optional] value must be a 32 bit integer
**property** | String | this is a reserved python keyword | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## Property
public class Property
extends JsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## SnakeCase
public class SnakeCase
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## Name2
public class Name2
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
