# RequiredWithEmptyArray
org.openapijsonschematools.client.components.schemas.RequiredWithEmptyArray.java
public class RequiredWithEmptyArray

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1](#requiredwithemptyarray1)<br> schema class |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder)<br> builder for Map payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMap](#requiredwithemptyarraymap)<br> output class for Map payloads |
| static class | [RequiredWithEmptyArray.Foo](#foo)<br> schema class |

## RequiredWithEmptyArray1
public static class RequiredWithEmptyArray1<br>
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
| [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | validate([Map&lt;?, ?&gt;](#requiredwithemptyarraymapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RequiredWithEmptyArrayMapBuilder
public class RequiredWithEmptyArrayMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredWithEmptyArrayMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(Void value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(boolean value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(String value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(int value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(float value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(long value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(double value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(List<?> value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | foo(Map<String, ?> value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, Void value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, boolean value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, String value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, int value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, float value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, long value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, double value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, List<?> value) |
| [RequiredWithEmptyArrayMapBuilder](#requiredwithemptyarraymapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredWithEmptyArrayMap
public static class RequiredWithEmptyArrayMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | of([Map<String, ? extends @Nullable Object>](#requiredwithemptyarraymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
