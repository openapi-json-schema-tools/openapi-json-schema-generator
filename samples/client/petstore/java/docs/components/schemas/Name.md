# Name
org.openapijsonschematools.client.components.schemas.Name.java
public class Name

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Name.Name1Boxed](#name1boxed)<br> sealed validated payload class |
| static class | [Name.Name1](#name1)<br> schema class |
| static class | [Name.NameMapBuilder1](#namemapbuilder1)<br> builder for Map payloads |
| static class | [Name.NameMap](#namemap)<br> output class for Map payloads |
| static class | [Name.PropertyBoxed](#propertyboxed)<br> sealed validated payload class |
| static class | [Name.Property](#property)<br> schema class |
| static class | [Name.SnakeCaseBoxed](#snakecaseboxed)<br> sealed validated payload class |
| static class | [Name.SnakeCase](#snakecase)<br> schema class |
| static class | [Name.Name2Boxed](#name2boxed)<br> sealed validated payload class |
| static class | [Name.Name2](#name2)<br> schema class |

## Name1Boxed
public static abstract sealed class Name1Boxed<br>
permits<br>
[Name1BoxedVoid](#name1boxedvoid),
[Name1BoxedBoolean](#name1boxedboolean),
[Name1BoxedNumber](#name1boxednumber),
[Name1BoxedString](#name1boxedstring),
[Name1BoxedList](#name1boxedlist),
[Name1BoxedMap](#name1boxedmap)

A sealed class that stores validated payloads using boxed classes

## Name1
public static class Name1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing model name same as property name

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name2.class](#name2))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("snake_case", [SnakeCase.class](#snakecase))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("property", [Property.class](#property)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"name"<br>)<br> |

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
| [NameMap](#namemap) | validate([Map&lt;?, ?&gt;](#namemapbuilder1) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NameMap0Builder
public class NameMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [NameMap0Builder](#namemap0builder) | snake_case(int value) |
| [NameMap0Builder](#namemap0builder) | snake_case(float value) |
| [NameMap0Builder](#namemap0builder) | property(String value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, Void value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, boolean value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, String value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, int value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, float value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, long value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, double value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, List<?> value) |
| [NameMap0Builder](#namemap0builder) | additionalProperty(String key, Map<String, ?> value) |

## NameMapBuilder1
public class NameMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NameMap0Builder](#namemap0builder) | name(int value) |
| [NameMap0Builder](#namemap0builder) | name(float value) |

## NameMap
public static class NameMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NameMap](#namemap) | of([Map<String, ? extends @Nullable Object>](#namemapbuilder1) arg, SchemaConfiguration configuration) |
| Number | name()<br> value must be a 32 bit integer |
| Number | snake_case()<br>[optional] value must be a 32 bit integer |
| String | property()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## PropertyBoxed
public static abstract sealed class PropertyBoxed<br>
permits<br>
[PropertyBoxedString](#propertyboxedstring)

A sealed class that stores validated payloads using boxed classes

## Property
public static class Property<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## SnakeCaseBoxed
public static abstract sealed class SnakeCaseBoxed<br>
permits<br>
[SnakeCaseBoxedNumber](#snakecaseboxednumber)

A sealed class that stores validated payloads using boxed classes

## SnakeCase
public static class SnakeCase<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Name2Boxed
public static abstract sealed class Name2Boxed<br>
permits<br>
[Name2BoxedNumber](#name2boxednumber)

A sealed class that stores validated payloads using boxed classes

## Name2
public static class Name2<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
