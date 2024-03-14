# ClassModel
org.openapijsonschematools.client.components.schemas.ClassModel.java
public class ClassModel<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ClassModel.ClassModel1Boxed](#classmodel1boxed)<br> sealed interface for validated payloads |
| record | [ClassModel.ClassModel1BoxedVoid](#classmodel1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ClassModel.ClassModel1BoxedBoolean](#classmodel1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ClassModel.ClassModel1BoxedNumber](#classmodel1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ClassModel.ClassModel1BoxedString](#classmodel1boxedstring)<br> boxed class to store validated String payloads |
| record | [ClassModel.ClassModel1BoxedList](#classmodel1boxedlist)<br> boxed class to store validated List payloads |
| record | [ClassModel.ClassModel1BoxedMap](#classmodel1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ClassModel.ClassModel1](#classmodel1)<br> schema class |
| static class | [ClassModel.ClassModelMapBuilder](#classmodelmapbuilder)<br> builder for Map payloads |
| static class | [ClassModel.ClassModelMap](#classmodelmap)<br> output class for Map payloads |
| sealed interface | [ClassModel.ClassSchemaBoxed](#classschemaboxed)<br> sealed interface for validated payloads |
| record | [ClassModel.ClassSchemaBoxedString](#classschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [ClassModel.ClassSchema](#classschema)<br> schema class |

## ClassModel1Boxed
public sealed interface ClassModel1Boxed<br>
permits<br>
[ClassModel1BoxedVoid](#classmodel1boxedvoid),
[ClassModel1BoxedBoolean](#classmodel1boxedboolean),
[ClassModel1BoxedNumber](#classmodel1boxednumber),
[ClassModel1BoxedString](#classmodel1boxedstring),
[ClassModel1BoxedList](#classmodel1boxedlist),
[ClassModel1BoxedMap](#classmodel1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ClassModel1BoxedVoid
public record ClassModel1BoxedVoid<br>
implements [ClassModel1Boxed](#classmodel1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModel1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ClassModel1BoxedBoolean
public record ClassModel1BoxedBoolean<br>
implements [ClassModel1Boxed](#classmodel1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModel1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ClassModel1BoxedNumber
public record ClassModel1BoxedNumber<br>
implements [ClassModel1Boxed](#classmodel1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModel1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ClassModel1BoxedString
public record ClassModel1BoxedString<br>
implements [ClassModel1Boxed](#classmodel1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModel1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ClassModel1BoxedList
public record ClassModel1BoxedList<br>
implements [ClassModel1Boxed](#classmodel1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModel1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ClassModel1BoxedMap
public record ClassModel1BoxedMap<br>
implements [ClassModel1Boxed](#classmodel1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassModel1BoxedMap([ClassModelMap](#classmodelmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ClassModelMap](#classmodelmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [ClassModelMap](#classmodelmap) | validate([Map&lt;?, ?&gt;](#classmodelmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ClassModel1BoxedString](#classmodel1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ClassModel1BoxedVoid](#classmodel1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ClassModel1BoxedNumber](#classmodel1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ClassModel1BoxedBoolean](#classmodel1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ClassModel1BoxedMap](#classmodel1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#classmodelmapbuilder) arg, SchemaConfiguration configuration) |
| [ClassModel1BoxedList](#classmodel1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ClassModel1Boxed](#classmodel1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [ClassModelMapBuilder](#classmodelmapbuilder) | lowLineClass(String value) |
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

## ClassSchemaBoxed
public sealed interface ClassSchemaBoxed<br>
permits<br>
[ClassSchemaBoxedString](#classschemaboxedstring)

sealed interface that stores validated payloads using boxed classes

## ClassSchemaBoxedString
public record ClassSchemaBoxedString<br>
implements [ClassSchemaBoxed](#classschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ClassSchema
public static class ClassSchema<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
