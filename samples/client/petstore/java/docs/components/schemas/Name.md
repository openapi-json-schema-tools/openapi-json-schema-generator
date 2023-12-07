# Name
org.openapijsonschematools.client.components.schemas.Name.java
public class Name

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Name.Name1](#name1)<br> schema class |
| static class | [Name.NameMapInput](#namemapinput)<br> builder for Map payloads |
| static class | [Name.NameMap](#namemap)<br> output class for Map payloads |
| static class | [Name.Property](#property)<br> schema class |
| static class | [Name.SnakeCase](#snakecase)<br> schema class |
| static class | [Name.Name2](#name2)<br> schema class |

## Name1
public static class Name1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing model name same as property name

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name2.class](#name2))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("snake_case", [SnakeCase.class](#snakecase))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("property", [Property.class](#property)))<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"name"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

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
| static [NameMap](#namemap) | validate([Map<String, Object>](#namemapinput) arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## NameMapInput
public class NameMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **name** | int |  | value must be a 32 bit integer |
| **snake_case** | int |  | [optional] value must be a 32 bit integer |
| **property** | String | this is a reserved python keyword | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## NameMap
public static class NameMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NameMap](#namemap) | of([Map<String, Object>](#namemapinput) arg, SchemaConfiguration configuration) |
| int | name()<br> value must be a 32 bit integer |
| int | snake_case()<br>[optional] value must be a 32 bit integer |
| String | property()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Property
public static class Property<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## SnakeCase
public static class SnakeCase<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Name2
public static class Name2<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
