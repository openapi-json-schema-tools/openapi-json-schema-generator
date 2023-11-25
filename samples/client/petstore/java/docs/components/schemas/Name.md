# Name1
org.openapijsonschematools.components.schemas.Name.java
```
type: JsonSchema
```

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

## NameMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NameMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| int | name()<br> value must be a 32 bit integer |
| int | snake_case()<br>[optional] value must be a 32 bit integer |
| String | property()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
