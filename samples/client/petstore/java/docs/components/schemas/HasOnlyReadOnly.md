# HasOnlyReadOnly
org.openapijsonschematools.components.schemas.HasOnlyReadOnly.java
public class HasOnlyReadOnly

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | HasOnlyReadOnly.HasOnlyReadOnly1<br> schema class |
| static class | HasOnlyReadOnly.HasOnlyReadOnlyMap<br> output class for Map payloads |
| static class | HasOnlyReadOnly.Foo<br> schema class |
| static class | HasOnlyReadOnly.Bar<br> schema class |

## HasOnlyReadOnly1
public class HasOnlyReadOnly1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static HasOnlyReadOnlyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | String |  | [optional]
**foo** | String |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## HasOnlyReadOnlyMap
public class HasOnlyReadOnlyMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static HasOnlyReadOnlyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | bar()<br>[optional] |
| String | foo()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public class Foo
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Bar
public class Bar
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
