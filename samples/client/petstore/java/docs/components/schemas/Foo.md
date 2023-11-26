# Foo
org.openapijsonschematools.components.schemas.Foo.java
public class Foo

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | Foo.Foo1<br> schema class |
| static class | Foo.FooMap<br> output class for Map payloads |

## Foo1
public class Foo1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FooMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## FooMap
public class FooMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static FooMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
