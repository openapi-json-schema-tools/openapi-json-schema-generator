# Schema200Response
org.openapijsonschematools.client.components.schemas.Schema200Response.java
public class Schema200Response

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to store list input interfaces, extends List

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema200Response.Schema200Response1](#schema200response1)<br> schema class |
| static class | [Schema200Response.Schema200ResponseMap](#schema200responsemap)<br> output class for Map payloads |
| static class | [Schema200Response.ClassSchema](#classschema)<br> schema class |
| static class | [Schema200Response.Name](#name)<br> schema class |

## Schema200Response1
public static class Schema200Response1<br>
extends JsonSchema

A schema class that validates payloads

## Description
model with an invalid class name for python, starts with a number

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("class", [ClassSchema.class](#classschema)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

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
| static [Schema200ResponseMap](#schema200responsemap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

## Schema200ResponseMap
public static class Schema200ResponseMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema200ResponseMap](#schema200responsemap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| int | name()<br>[optional] value must be a 32 bit integer |
| Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["class"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **name** | int |  | [optional] value must be a 32 bit integer |
| **class** | String | this is a reserved python keyword | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ClassSchema
public static class ClassSchema<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Name
public static class Name<br>
extends Int32JsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
