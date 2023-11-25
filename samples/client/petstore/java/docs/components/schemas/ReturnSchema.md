# ReturnSchema1
org.openapijsonschematools.components.schemas.ReturnSchema.java
```
type: JsonSchema
```

## Description
Model for testing reserved words

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
| static ReturnMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**return** | int | this is a reserved python keyword | [optional] value must be a 32 bit integer
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ReturnMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ReturnMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Object | get(String key)<br>This model has invalid python names so this method is used under the hood when you access instance["return"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
