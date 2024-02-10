# AllofWithOneEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithOneEmptySchema.java
public class AllofWithOneEmptySchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedVoid](#allofwithoneemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedBoolean](#allofwithoneemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedNumber](#allofwithoneemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedString](#allofwithoneemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedList](#allofwithoneemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedMap](#allofwithoneemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1](#allofwithoneemptyschema1)<br> schema class |
| static class | [AllofWithOneEmptySchema.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithOneEmptySchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithOneEmptySchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithOneEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithOneEmptySchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithOneEmptySchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithOneEmptySchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithOneEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithOneEmptySchema1Boxed
public static abstract sealed class AllofWithOneEmptySchema1Boxed<br>
permits<br>
[AllofWithOneEmptySchema1BoxedVoid](#allofwithoneemptyschema1boxedvoid),
[AllofWithOneEmptySchema1BoxedBoolean](#allofwithoneemptyschema1boxedboolean),
[AllofWithOneEmptySchema1BoxedNumber](#allofwithoneemptyschema1boxednumber),
[AllofWithOneEmptySchema1BoxedString](#allofwithoneemptyschema1boxedstring),
[AllofWithOneEmptySchema1BoxedList](#allofwithoneemptyschema1boxedlist),
[AllofWithOneEmptySchema1BoxedMap](#allofwithoneemptyschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AllofWithOneEmptySchema1BoxedVoid
public static final class AllofWithOneEmptySchema1BoxedVoid<br>
extends [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AllofWithOneEmptySchema1BoxedBoolean
public static final class AllofWithOneEmptySchema1BoxedBoolean<br>
extends [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AllofWithOneEmptySchema1BoxedNumber
public static final class AllofWithOneEmptySchema1BoxedNumber<br>
extends [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AllofWithOneEmptySchema1BoxedString
public static final class AllofWithOneEmptySchema1BoxedString<br>
extends [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AllofWithOneEmptySchema1BoxedList
public static final class AllofWithOneEmptySchema1BoxedList<br>
extends [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AllofWithOneEmptySchema1BoxedMap
public static final class AllofWithOneEmptySchema1BoxedMap<br>
extends [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AllofWithOneEmptySchema1
public static class AllofWithOneEmptySchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [AllofWithOneEmptySchema1BoxedString](#allofwithoneemptyschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AllofWithOneEmptySchema1BoxedVoid](#allofwithoneemptyschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AllofWithOneEmptySchema1BoxedNumber](#allofwithoneemptyschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AllofWithOneEmptySchema1BoxedBoolean](#allofwithoneemptyschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AllofWithOneEmptySchema1BoxedMap](#allofwithoneemptyschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AllofWithOneEmptySchema1BoxedList](#allofwithoneemptyschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0BoxedBoolean
public static final class Schema0BoxedBoolean<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema0BoxedNumber
public static final class Schema0BoxedNumber<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0BoxedList
public static final class Schema0BoxedList<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema0BoxedMap
public static final class Schema0BoxedMap<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
