# ForbiddenProperty
org.openapijsonschematools.client.components.schemas.ForbiddenProperty.java
public class ForbiddenProperty

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ForbiddenProperty.ForbiddenProperty1](#forbiddenproperty1)<br> schema class |
| static class | [ForbiddenProperty.ForbiddenPropertyMapBuilder](#forbiddenpropertymapbuilder)<br> builder for Map payloads |
| static class | [ForbiddenProperty.ForbiddenPropertyMap](#forbiddenpropertymap)<br> output class for Map payloads |
| static class | [ForbiddenProperty.Foo](#foo)<br> schema class |

## ForbiddenProperty1
public static class ForbiddenProperty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [ForbiddenPropertyMap](#forbiddenpropertymap) | validate([Map<?, ?>](#forbiddenpropertymapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ForbiddenPropertyMapBuilder
public class ForbiddenPropertyMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| ForbiddenPropertyMapBuilder()<br>Creates an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## ForbiddenPropertyMap
public static class ForbiddenPropertyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ForbiddenPropertyMap](#forbiddenpropertymap) | of([Map<String, ? extends @Nullable Object>](#forbiddenpropertymapbuilder) arg, SchemaConfiguration configuration) |
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
