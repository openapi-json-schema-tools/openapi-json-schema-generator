# OneofWithEmptySchema
org.openapijsonschematools.client.components.schemas.OneofWithEmptySchema.java
public class OneofWithEmptySchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)<br> abstract sealed validated payload class |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1BoxedVoid](#oneofwithemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1BoxedBoolean](#oneofwithemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1BoxedNumber](#oneofwithemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1BoxedString](#oneofwithemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1BoxedList](#oneofwithemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1BoxedMap](#oneofwithemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithEmptySchema.OneofWithEmptySchema1](#oneofwithemptyschema1)<br> schema class |
| static class | [OneofWithEmptySchema.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [OneofWithEmptySchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [OneofWithEmptySchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [OneofWithEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [OneofWithEmptySchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [OneofWithEmptySchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [OneofWithEmptySchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithEmptySchema.Schema1](#schema1)<br> schema class |
| static class | [OneofWithEmptySchema.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [OneofWithEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [OneofWithEmptySchema.Schema0](#schema0)<br> schema class |

## OneofWithEmptySchema1Boxed
public static abstract sealed class OneofWithEmptySchema1Boxed<br>
permits<br>
[OneofWithEmptySchema1BoxedVoid](#oneofwithemptyschema1boxedvoid),
[OneofWithEmptySchema1BoxedBoolean](#oneofwithemptyschema1boxedboolean),
[OneofWithEmptySchema1BoxedNumber](#oneofwithemptyschema1boxednumber),
[OneofWithEmptySchema1BoxedString](#oneofwithemptyschema1boxedstring),
[OneofWithEmptySchema1BoxedList](#oneofwithemptyschema1boxedlist),
[OneofWithEmptySchema1BoxedMap](#oneofwithemptyschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## OneofWithEmptySchema1BoxedVoid
public static final class OneofWithEmptySchema1BoxedVoid<br>
extends [OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithEmptySchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## OneofWithEmptySchema1BoxedBoolean
public static final class OneofWithEmptySchema1BoxedBoolean<br>
extends [OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## OneofWithEmptySchema1BoxedNumber
public static final class OneofWithEmptySchema1BoxedNumber<br>
extends [OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## OneofWithEmptySchema1BoxedString
public static final class OneofWithEmptySchema1BoxedString<br>
extends [OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## OneofWithEmptySchema1BoxedList
public static final class OneofWithEmptySchema1BoxedList<br>
extends [OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithEmptySchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## OneofWithEmptySchema1BoxedMap
public static final class OneofWithEmptySchema1BoxedMap<br>
extends [OneofWithEmptySchema1Boxed](#oneofwithemptyschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithEmptySchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## OneofWithEmptySchema1
public static class OneofWithEmptySchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>))<br> |

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
| [OneofWithEmptySchema1BoxedString](#oneofwithemptyschema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [OneofWithEmptySchema1BoxedVoid](#oneofwithemptyschema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [OneofWithEmptySchema1BoxedNumber](#oneofwithemptyschema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [OneofWithEmptySchema1BoxedBoolean](#oneofwithemptyschema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [OneofWithEmptySchema1BoxedMap](#oneofwithemptyschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [OneofWithEmptySchema1BoxedList](#oneofwithemptyschema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
