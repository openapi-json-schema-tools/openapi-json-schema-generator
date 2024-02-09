# ClassModel
org.openapijsonschematools.client.components.schemas.ClassModel.java
public class ClassModel

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ClassModel.ClassModel1](#classmodel1)<br> schema class |
| static class | [ClassModel.ClassModelMapBuilder](#classmodelmapbuilder)<br> builder for Map payloads |
| static class | [ClassModel.ClassModelMap](#classmodelmap)<br> output class for Map payloads |
| static class | [ClassModel.ClassSchema](#classschema)<br> schema class |

## ClassModel1
public static class ClassModel1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing model with &quot;_class&quot; property

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("_class", [ClassSchema.class](#classschema)))<br>)<br> |

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
| [ClassModelMap](#classmodelmap) | validate([Map&lt;?, ?&gt;](#classmodelmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ClassModelMapBuilder
public class ClassModelMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModelMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ClassModelMapBuilder](#classmodelmapbuilder) | setClass(String value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, Void value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, boolean value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, String value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, int value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, float value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, long value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, double value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, List<?> value) |
| [ClassModelMapBuilder](#classmodelmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ClassModelMap
public static class ClassModelMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ClassModelMap](#classmodelmap) | of([Map<String, ? extends @Nullable Object>](#classmodelmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["_class"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ClassSchema
public static class ClassSchema<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
