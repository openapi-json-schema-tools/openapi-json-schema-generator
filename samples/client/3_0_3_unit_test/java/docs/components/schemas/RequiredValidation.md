# RequiredValidation
org.openapijsonschematools.client.components.schemas.RequiredValidation.java
public class RequiredValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredValidation.RequiredValidation1](#requiredvalidation1)<br> schema class |
| static class | [RequiredValidation.RequiredValidationMapInput](#requiredvalidationmapinput)<br> builder for Map payloads |
| static class | [RequiredValidation.RequiredValidationMap](#requiredvalidationmap)<br> output class for Map payloads |
| static class | [RequiredValidation.Bar](#bar)<br> schema class |
| static class | [RequiredValidation.Foo](#foo)<br> schema class |

## RequiredValidation1
public static class RequiredValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

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
| static [RequiredValidationMap](#requiredvalidationmap) | validate([Map<String, Object>](#requiredvalidationmapinput) arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## RequiredValidationMapInput
public class RequiredValidationMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo** | Object |  | |
| **bar** | Object |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## RequiredValidationMap
public static class RequiredValidationMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredValidationMap](#requiredvalidationmap) | of([Map<String, Object>](#requiredvalidationmapinput) arg, SchemaConfiguration configuration) |
| Object | foo()<br> |
| Object | bar()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Bar
public static class Bar<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
