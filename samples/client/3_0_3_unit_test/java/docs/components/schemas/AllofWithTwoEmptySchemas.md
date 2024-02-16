# AllofWithTwoEmptySchemas
org.openapijsonschematools.client.components.schemas.AllofWithTwoEmptySchemas.java
public class AllofWithTwoEmptySchemas<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1](#allofwithtwoemptyschemas1)<br> schema class |
| static class | [AllofWithTwoEmptySchemas.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTwoEmptySchemas.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1](#schema1)<br> schema class |
| static class | [AllofWithTwoEmptySchemas.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTwoEmptySchemas.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0](#schema0)<br> schema class |

## AllofWithTwoEmptySchemas1Boxed
public static abstract sealed class AllofWithTwoEmptySchemas1Boxed<br>
permits<br>
[AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid),
[AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean),
[AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber),
[AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring),
[AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist),
[AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AllofWithTwoEmptySchemas1BoxedVoid
public static final class AllofWithTwoEmptySchemas1BoxedVoid<br>
extends [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedBoolean
public static final class AllofWithTwoEmptySchemas1BoxedBoolean<br>
extends [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedNumber
public static final class AllofWithTwoEmptySchemas1BoxedNumber<br>
extends [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedString
public static final class AllofWithTwoEmptySchemas1BoxedString<br>
extends [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedList
public static final class AllofWithTwoEmptySchemas1BoxedList<br>
extends [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedMap
public static final class AllofWithTwoEmptySchemas1BoxedMap<br>
extends [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AllofWithTwoEmptySchemas1
public static class AllofWithTwoEmptySchemas1<br>
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
| [AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
