# Schema200Response
org.openapijsonschematools.client.components.schemas.Schema200Response.java
public class Schema200Response<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema200Response.Schema200Response1Boxed](#schema200response1boxed)<br> abstract sealed validated payload class |
| static class | [Schema200Response.Schema200Response1BoxedVoid](#schema200response1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Schema200Response.Schema200Response1BoxedBoolean](#schema200response1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Schema200Response.Schema200Response1BoxedNumber](#schema200response1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema200Response.Schema200Response1BoxedString](#schema200response1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema200Response.Schema200Response1BoxedList](#schema200response1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema200Response.Schema200Response1BoxedMap](#schema200response1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema200Response.Schema200Response1](#schema200response1)<br> schema class |
| static class | [Schema200Response.Schema200ResponseMapBuilder](#schema200responsemapbuilder)<br> builder for Map payloads |
| static class | [Schema200Response.Schema200ResponseMap](#schema200responsemap)<br> output class for Map payloads |
| static class | [Schema200Response.ClassSchemaBoxed](#classschemaboxed)<br> abstract sealed validated payload class |
| static class | [Schema200Response.ClassSchemaBoxedString](#classschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema200Response.ClassSchema](#classschema)<br> schema class |
| static class | [Schema200Response.NameBoxed](#nameboxed)<br> abstract sealed validated payload class |
| static class | [Schema200Response.NameBoxedNumber](#nameboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema200Response.Name](#name)<br> schema class |

## Schema200Response1Boxed
public static abstract sealed class Schema200Response1Boxed<br>
permits<br>
[Schema200Response1BoxedVoid](#schema200response1boxedvoid),
[Schema200Response1BoxedBoolean](#schema200response1boxedboolean),
[Schema200Response1BoxedNumber](#schema200response1boxednumber),
[Schema200Response1BoxedString](#schema200response1boxedstring),
[Schema200Response1BoxedList](#schema200response1boxedlist),
[Schema200Response1BoxedMap](#schema200response1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema200Response1BoxedVoid
public static final class Schema200Response1BoxedVoid<br>
extends [Schema200Response1Boxed](#schema200response1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Response1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema200Response1BoxedBoolean
public static final class Schema200Response1BoxedBoolean<br>
extends [Schema200Response1Boxed](#schema200response1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Response1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema200Response1BoxedNumber
public static final class Schema200Response1BoxedNumber<br>
extends [Schema200Response1Boxed](#schema200response1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Response1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema200Response1BoxedString
public static final class Schema200Response1BoxedString<br>
extends [Schema200Response1Boxed](#schema200response1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Response1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema200Response1BoxedList
public static final class Schema200Response1BoxedList<br>
extends [Schema200Response1Boxed](#schema200response1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Response1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema200Response1BoxedMap
public static final class Schema200Response1BoxedMap<br>
extends [Schema200Response1Boxed](#schema200response1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema200Response1BoxedMap([Schema200ResponseMap](#schema200responsemap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Schema200ResponseMap](#schema200responsemap) | data<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [Schema200ResponseMap](#schema200responsemap) | validate([Map&lt;?, ?&gt;](#schema200responsemapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Schema200Response1BoxedString](#schema200response1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema200Response1BoxedVoid](#schema200response1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema200Response1BoxedNumber](#schema200response1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema200Response1BoxedBoolean](#schema200response1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema200Response1BoxedMap](#schema200response1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema200responsemapbuilder) arg, SchemaConfiguration configuration) |
| [Schema200Response1BoxedList](#schema200response1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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

## ClassSchemaBoxed
public static abstract sealed class ClassSchemaBoxed<br>
permits<br>
[ClassSchemaBoxedString](#classschemaboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ClassSchemaBoxedString
public static final class ClassSchemaBoxedString<br>
extends [ClassSchemaBoxed](#classschemaboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ClassSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ClassSchema
public static class ClassSchema<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## NameBoxed
public static abstract sealed class NameBoxed<br>
permits<br>
[NameBoxedNumber](#nameboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## NameBoxedNumber
public static final class NameBoxedNumber<br>
extends [NameBoxed](#nameboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Name
public static class Name<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
