# ForbiddenProperty
org.openapijsonschematools.client.components.schemas.ForbiddenProperty.java
public class ForbiddenProperty

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ForbiddenProperty.ForbiddenProperty1](#forbiddenproperty1)<br> schema class |
| static class | [ForbiddenProperty.ForbiddenPropertyMapInput](#forbiddenpropertymapinput)<br> builder for Map payloads |
| static class | [ForbiddenProperty.ForbiddenPropertyMap](#forbiddenpropertymap)<br> output class for Map payloads |
| static class | [ForbiddenProperty.Foo](#foo)<br> schema class |

## ForbiddenProperty1
public static class ForbiddenProperty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static [ForbiddenPropertyMap](#forbiddenpropertymap) | validate([Map<String, ?>](#forbiddenpropertymapinput) arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<?> arg, SchemaConfiguration configuration) |

## ForbiddenPropertyMapInput
public class ForbiddenPropertyMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo** | ? extends @Nullable Object |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ForbiddenPropertyMap
public static class ForbiddenPropertyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ForbiddenPropertyMap](#forbiddenpropertymap) | of([Map<String, ? extends @Nullable Object>](#forbiddenpropertymapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
