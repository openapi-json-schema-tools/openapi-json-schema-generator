# Category
org.openapijsonschematools.components.schemas.Category.java
public class Category

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Category.Category1](#category1)<br> schema class |
| static class | [Category.CategoryMap](#categorymap)<br> output class for Map payloads |
| static class | [Category.Name](#name)<br> schema class |
| static class | [Category.Id](#id)<br> schema class |

## Category1
public static class Category1<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CategoryMap](#categorymap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## CategoryMap
public static class CategoryMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CategoryMap](#categorymap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | name()<br> if omitted the server will use the default value of default-name |
| long | id()<br>[optional] value must be a 64 bit integer |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **name** | String |  | if omitted the server will use the default value of default-name |
| **id** | long |  | [optional] value must be a 64 bit integer |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Name
public static class Name<br>
extends JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## Id
public static class Id<br>
extends Int64JsonSchema

A schema class that validates payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
