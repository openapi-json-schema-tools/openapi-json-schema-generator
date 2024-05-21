# AllofWithTheFirstEmptySchema
unit_test_api.components.schemas.AllofWithTheFirstEmptySchema.java
public class AllofWithTheFirstEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1](#allofwiththefirstemptyschema1)<br> schema class |
| sealed interface | [AllofWithTheFirstEmptySchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTheFirstEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema1](#schema1)<br> schema class |
| sealed interface | [AllofWithTheFirstEmptySchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTheFirstEmptySchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTheFirstEmptySchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTheFirstEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTheFirstEmptySchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTheFirstEmptySchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTheFirstEmptySchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithTheFirstEmptySchema1Boxed
public sealed interface AllofWithTheFirstEmptySchema1Boxed<br>
permits<br>
[AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid),
[AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean),
[AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber),
[AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring),
[AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist),
[AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithTheFirstEmptySchema1BoxedVoid
public record AllofWithTheFirstEmptySchema1BoxedVoid<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedBoolean
public record AllofWithTheFirstEmptySchema1BoxedBoolean<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedNumber
public record AllofWithTheFirstEmptySchema1BoxedNumber<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedString
public record AllofWithTheFirstEmptySchema1BoxedString<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedList
public record AllofWithTheFirstEmptySchema1BoxedList<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedMap
public record AllofWithTheFirstEmptySchema1BoxedMap<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1
public static class AllofWithTheFirstEmptySchema1<br>
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
| [AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedNumber](#schema1boxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Schema1
public static class Schema1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
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
