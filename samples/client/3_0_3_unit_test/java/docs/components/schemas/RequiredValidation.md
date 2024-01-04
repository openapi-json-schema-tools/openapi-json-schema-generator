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
## RequiredValidation0MapBuilder
public class RequiredValidation0MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredValidation0MapBuilder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build() |
| RequiredValidation0MapBuilder | bar(Void value) |
| RequiredValidation0MapBuilder | bar(boolean value) |
| RequiredValidation0MapBuilder | bar(String value) |
| RequiredValidation0MapBuilder | bar(int value) |
| RequiredValidation0MapBuilder | bar(float value) |
| RequiredValidation0MapBuilder | bar(long value) |
| RequiredValidation0MapBuilder | bar(double value) |
| RequiredValidation0MapBuilder | bar(List<?> value) |
| RequiredValidation0MapBuilder | bar(Map<String, ?> value) |
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
| RequiredValidation0MapBuilder | foo(Void value) |
| RequiredValidation0MapBuilder | foo(boolean value) |
| RequiredValidation0MapBuilder | foo(String value) |
| RequiredValidation0MapBuilder | foo(int value) |
| RequiredValidation0MapBuilder | foo(float value) |
| RequiredValidation0MapBuilder | foo(long value) |
| RequiredValidation0MapBuilder | foo(double value) |
| RequiredValidation0MapBuilder | foo(List<?> value) |
| RequiredValidation0MapBuilder | foo(Map<String, ?> value) |

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
