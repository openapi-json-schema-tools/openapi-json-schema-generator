# AllofWithTwoEmptySchemas
unit_test_api.components.schemas.AllofWithTwoEmptySchemas.java
public class AllofWithTwoEmptySchemas<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1](#allofwithtwoemptyschemas1)<br> schema class |
| sealed interface | [AllofWithTwoEmptySchemas.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1](#schema1)<br> schema class |
| sealed interface | [AllofWithTwoEmptySchemas.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0](#schema0)<br> schema class |

## AllofWithTwoEmptySchemas1Boxed
public sealed interface AllofWithTwoEmptySchemas1Boxed<br>
permits<br>
[AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid),
[AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean),
[AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber),
[AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring),
[AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist),
[AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithTwoEmptySchemas1BoxedVoid
public record AllofWithTwoEmptySchemas1BoxedVoid<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedBoolean
public record AllofWithTwoEmptySchemas1BoxedBoolean<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedNumber
public record AllofWithTwoEmptySchemas1BoxedNumber<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedString
public record AllofWithTwoEmptySchemas1BoxedString<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedList
public record AllofWithTwoEmptySchemas1BoxedList<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedMap
public record AllofWithTwoEmptySchemas1BoxedMap<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
public record Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedBoolean
public record Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedNumber
public record Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedString
public record Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedList
public record Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
public record Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedBoolean
public record Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedString
public record Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedList
public record Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedMap
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
