# RequiredWithEmptyArray
org.openapijsonschematools.client.components.schemas.RequiredWithEmptyArray.java
public class RequiredWithEmptyArray

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArray1](#requiredwithemptyarray1)<br> schema class |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMapInput](#requiredwithemptyarraymapinput)<br> builder for Map payloads |
| static class | [RequiredWithEmptyArray.RequiredWithEmptyArrayMap](#requiredwithemptyarraymap)<br> output class for Map payloads |
| static class | [RequiredWithEmptyArray.Foo](#foo)<br> schema class |

## RequiredWithEmptyArray1
public static class RequiredWithEmptyArray1<br>
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
| static [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | validate([Map<String, @Nullable Object>](#requiredwithemptyarraymapinput) arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## RequiredWithEmptyArrayMapInput
public class RequiredWithEmptyArrayMapInput<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo** | @Nullable Object |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## RequiredWithEmptyArrayMap
public static class RequiredWithEmptyArrayMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredWithEmptyArrayMap](#requiredwithemptyarraymap) | of([Map<String, @Nullable Object>](#requiredwithemptyarraymapinput) arg, SchemaConfiguration configuration) |
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
