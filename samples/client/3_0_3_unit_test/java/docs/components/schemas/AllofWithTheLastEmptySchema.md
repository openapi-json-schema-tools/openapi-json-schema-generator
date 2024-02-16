# AllofWithTheLastEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithTheLastEmptySchema.java
public class AllofWithTheLastEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedVoid](#allofwiththelastemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedBoolean](#allofwiththelastemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedNumber](#allofwiththelastemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedString](#allofwiththelastemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedList](#allofwiththelastemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedMap](#allofwiththelastemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1](#allofwiththelastemptyschema1)<br> schema class |
| static class | [AllofWithTheLastEmptySchema.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTheLastEmptySchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1](#schema1)<br> schema class |
| static class | [AllofWithTheLastEmptySchema.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTheLastEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheLastEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithTheLastEmptySchema1Boxed
public static abstract sealed class AllofWithTheLastEmptySchema1Boxed<br>
permits<br>
[AllofWithTheLastEmptySchema1BoxedVoid](#allofwiththelastemptyschema1boxedvoid),
[AllofWithTheLastEmptySchema1BoxedBoolean](#allofwiththelastemptyschema1boxedboolean),
[AllofWithTheLastEmptySchema1BoxedNumber](#allofwiththelastemptyschema1boxednumber),
[AllofWithTheLastEmptySchema1BoxedString](#allofwiththelastemptyschema1boxedstring),
[AllofWithTheLastEmptySchema1BoxedList](#allofwiththelastemptyschema1boxedlist),
[AllofWithTheLastEmptySchema1BoxedMap](#allofwiththelastemptyschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AllofWithTheLastEmptySchema1BoxedVoid
public static final class AllofWithTheLastEmptySchema1BoxedVoid<br>
extends [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedBoolean
public static final class AllofWithTheLastEmptySchema1BoxedBoolean<br>
extends [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedNumber
public static final class AllofWithTheLastEmptySchema1BoxedNumber<br>
extends [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedString
public static final class AllofWithTheLastEmptySchema1BoxedString<br>
extends [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedList
public static final class AllofWithTheLastEmptySchema1BoxedList<br>
extends [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedMap
public static final class AllofWithTheLastEmptySchema1BoxedMap<br>
extends [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AllofWithTheLastEmptySchema1
public static class AllofWithTheLastEmptySchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

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
| [AllofWithTheLastEmptySchema1BoxedString](#allofwiththelastemptyschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AllofWithTheLastEmptySchema1BoxedVoid](#allofwiththelastemptyschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AllofWithTheLastEmptySchema1BoxedNumber](#allofwiththelastemptyschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AllofWithTheLastEmptySchema1BoxedBoolean](#allofwiththelastemptyschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AllofWithTheLastEmptySchema1BoxedMap](#allofwiththelastemptyschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AllofWithTheLastEmptySchema1BoxedList](#allofwiththelastemptyschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedVoid
public static final class Schema1BoxedVoid<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema1BoxedBoolean
public static final class Schema1BoxedBoolean<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema1BoxedNumber
public static final class Schema1BoxedNumber<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema1BoxedString
public static final class Schema1BoxedString<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1BoxedList
public static final class Schema1BoxedList<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

abstract sealed class that stores validated payloads using boxed classes

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

## Schema0
public static class Schema0<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
