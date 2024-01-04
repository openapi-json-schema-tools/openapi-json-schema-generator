# RequiredValidation
org.openapijsonschematools.client.components.schemas.RequiredValidation.java
public class RequiredValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RequiredValidation.RequiredValidation1](#requiredvalidation1)<br> schema class |
| static class | [RequiredValidation.RequiredValidationMapBuilder](#requiredvalidationmapbuilder)<br> builder for Map payloads |
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo", [Foo.class](#foo))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("bar", [Bar.class](#bar)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

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
| [RequiredValidationMap](#requiredvalidationmap) | validate([Map&lt;?, ?&gt;](#requiredvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## RequiredValidationMap0Builder
public class RequiredValidationMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidationMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(Void value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(boolean value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(String value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(int value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(float value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(long value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(double value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(List<?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | bar(Map<String, ?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, Void value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, boolean value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, String value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, int value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, float value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, long value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, double value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, List<?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredValidationMapBuilder
public class RequiredValidationMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidationMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(Void value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(boolean value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(String value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(int value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(float value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(long value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(double value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(List<?> value) |
| [RequiredValidationMap0Builder](#requiredvalidationmap0builder) | foo(Map<String, ?> value) |

## RequiredValidationMap
public static class RequiredValidationMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredValidationMap](#requiredvalidationmap) | of([Map<String, ? extends @Nullable Object>](#requiredvalidationmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br> |
| @Nullable Object | bar()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
