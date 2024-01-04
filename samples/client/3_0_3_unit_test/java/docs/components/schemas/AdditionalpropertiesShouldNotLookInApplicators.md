# AdditionalpropertiesShouldNotLookInApplicators
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesShouldNotLookInApplicators.java
public class AdditionalpropertiesShouldNotLookInApplicators

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1](#additionalpropertiesshouldnotlookinapplicators1)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0](#schema0)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0Map](#schema0map)<br> output class for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Foo](#foo)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalpropertiesShouldNotLookInApplicators1
public static class AdditionalpropertiesShouldNotLookInApplicators1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>;)<br> |

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
| [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | validate([Map<?, ?>](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder
public class AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalpropertiesShouldNotLookInApplicatorsMapBuilder()<br>Creates a builder that contains an empty map |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Boolean> | build() |


## AdditionalpropertiesShouldNotLookInApplicatorsMap
public static class AdditionalpropertiesShouldNotLookInApplicatorsMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | of([Map<String, Boolean>](#additionalpropertiesshouldnotlookinapplicatorsmapbuilder) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Schema0
public static class Schema0<br>
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
| [Schema0Map](#schema0map) | validate([Map<?, ?>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0MapBuilder
public class Schema0MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0MapBuilder()<br>Creates a builder that contains an empty map |


### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build() |


## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | foo()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Foo
public static class Foo<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends BooleanJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
