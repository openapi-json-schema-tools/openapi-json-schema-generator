# RequiredDefaultValidation
org.openapijsonschematools.client.components.schemas.RequiredDefaultValidation.java
public class RequiredDefaultValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredDefaultValidation.RequiredDefaultValidation1](#requireddefaultvalidation1)<br> schema class |
| static class | [RequiredDefaultValidation.RequiredDefaultValidationMapBuilder](#requireddefaultvalidationmapbuilder)<br> builder for Map payloads |
| static class | [RequiredDefaultValidation.RequiredDefaultValidationMap](#requireddefaultvalidationmap)<br> output class for Map payloads |
| static class | [RequiredDefaultValidation.Foo](#foo)<br> schema class |

## RequiredDefaultValidation1
public static class RequiredDefaultValidation1<br>
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
| [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | validate([Map<?, ?>](#requireddefaultvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RequiredDefaultValidationMapBuilder
public class RequiredDefaultValidationMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredDefaultValidationMapBuilder()<br>Creates an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |

## RequiredDefaultValidationMap
public static class RequiredDefaultValidationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredDefaultValidationMap](#requireddefaultvalidationmap) | of([Map<String, ? extends @Nullable Object>](#requireddefaultvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
