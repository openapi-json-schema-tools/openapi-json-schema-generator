# Schema200Response
org.openapijsonschematools.client.components.schemas.Schema200Response.java
public class Schema200Response

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema200Response.Schema200Response1](#schema200response1)<br> schema class |
| static class | [Schema200Response.Schema200ResponseMapBuilder](#schema200responsemapbuilder)<br> builder for Map payloads |
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("class", [ClassSchema.class](#classschema)))<br>)<br> |

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
| [Schema200ResponseMap](#schema200responsemap) | validate([Map&lt;?, ?&gt;](#schema200responsemapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema200ResponseMapBuilder
public class Schema200ResponseMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200ResponseMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | name(int value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | name(float value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | setClass(String value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, Void value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, boolean value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, String value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, int value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, float value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, long value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, double value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema200ResponseMapBuilder](#schema200responsemapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema200ResponseMap
public static class Schema200ResponseMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema200ResponseMap](#schema200responsemap) | of([Map<String, ? extends @Nullable Object>](#schema200responsemapbuilder) arg, SchemaConfiguration configuration) |
| Number | name()<br>[optional] value must be a 32 bit integer |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["class"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ClassSchema
public static class ClassSchema<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
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
