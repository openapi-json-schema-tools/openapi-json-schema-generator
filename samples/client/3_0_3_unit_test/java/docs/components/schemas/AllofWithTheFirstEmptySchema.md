# AllofWithTheFirstEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithTheFirstEmptySchema.java
public class AllofWithTheFirstEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1](#allofwiththefirstemptyschema1)<br> schema class |
| static class | [AllofWithTheFirstEmptySchema.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTheFirstEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema1](#schema1)<br> schema class |
| static class | [AllofWithTheFirstEmptySchema.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [AllofWithTheFirstEmptySchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheFirstEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithTheFirstEmptySchema1Boxed
public static abstract sealed class AllofWithTheFirstEmptySchema1Boxed<br>
permits<br>
[AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid),
[AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean),
[AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber),
[AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring),
[AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist),
[AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AllofWithTheFirstEmptySchema1BoxedVoid
public static final class AllofWithTheFirstEmptySchema1BoxedVoid<br>
extends [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedBoolean
public static final class AllofWithTheFirstEmptySchema1BoxedBoolean<br>
extends [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedNumber
public static final class AllofWithTheFirstEmptySchema1BoxedNumber<br>
extends [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedString
public static final class AllofWithTheFirstEmptySchema1BoxedString<br>
extends [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedList
public static final class AllofWithTheFirstEmptySchema1BoxedList<br>
extends [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedMap
public static final class AllofWithTheFirstEmptySchema1BoxedMap<br>
extends [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedNumber](#schema1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

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

## Schema1
public static class Schema1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
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
