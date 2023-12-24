# AdditionalpropertiesShouldNotLookInApplicators
org.openapijsonschematools.client.components.schemas.AdditionalpropertiesShouldNotLookInApplicators.java
public class AdditionalpropertiesShouldNotLookInApplicators

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicators1](#additionalpropertiesshouldnotlookinapplicators1)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMapInput](#additionalpropertiesshouldnotlookinapplicatorsmapinput)<br> builder for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap)<br> output class for Map payloads |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0](#schema0)<br> schema class |
| static class | [AdditionalpropertiesShouldNotLookInApplicators.Schema0MapInput](#schema0mapinput)<br> builder for Map payloads |
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
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |
| List<Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

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
| static [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | validate([Map<?, ?>](#additionalpropertiesshouldnotlookinapplicatorsmapinput) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AdditionalpropertiesShouldNotLookInApplicatorsMapInput
public class AdditionalpropertiesShouldNotLookInApplicatorsMapInput<br>
builder for `Map<String, Boolean>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **anyStringName** | boolean | any string name can be used but the value must be the correct type | [optional] |

## AdditionalpropertiesShouldNotLookInApplicatorsMap
public static class AdditionalpropertiesShouldNotLookInApplicatorsMap<br>
extends FrozenMap<String, Boolean>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalpropertiesShouldNotLookInApplicatorsMap](#additionalpropertiesshouldnotlookinapplicatorsmap) | of([Map<String, Boolean>](#additionalpropertiesshouldnotlookinapplicatorsmapinput) arg, SchemaConfiguration configuration) |
| boolean | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Schema0
public static class Schema0<br>
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
| static [Schema0Map](#schema0map) | validate([Map<?, ?>](#schema0mapinput) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0MapInput
public class Schema0MapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **foo** | ? extends @Nullable Object |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapinput) arg, SchemaConfiguration configuration) |
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
