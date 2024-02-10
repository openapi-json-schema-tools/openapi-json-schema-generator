# RefInAnyof
org.openapijsonschematools.client.components.schemas.RefInAnyof.java
public class RefInAnyof

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInAnyof.RefInAnyof1Boxed](#refinanyof1boxed)<br> abstract sealed validated payload class |
| static class | [RefInAnyof.RefInAnyof1BoxedVoid](#refinanyof1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RefInAnyof.RefInAnyof1BoxedBoolean](#refinanyof1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RefInAnyof.RefInAnyof1BoxedNumber](#refinanyof1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RefInAnyof.RefInAnyof1BoxedString](#refinanyof1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RefInAnyof.RefInAnyof1BoxedList](#refinanyof1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RefInAnyof.RefInAnyof1BoxedMap](#refinanyof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInAnyof.RefInAnyof1](#refinanyof1)<br> schema class |

## RefInAnyof1Boxed
public static abstract sealed class RefInAnyof1Boxed<br>
permits<br>
[RefInAnyof1BoxedVoid](#refinanyof1boxedvoid),
[RefInAnyof1BoxedBoolean](#refinanyof1boxedboolean),
[RefInAnyof1BoxedNumber](#refinanyof1boxednumber),
[RefInAnyof1BoxedString](#refinanyof1boxedstring),
[RefInAnyof1BoxedList](#refinanyof1boxedlist),
[RefInAnyof1BoxedMap](#refinanyof1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RefInAnyof1BoxedVoid
public static final class RefInAnyof1BoxedVoid<br>
extends [RefInAnyof1Boxed](#refinanyof1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefInAnyof1BoxedBoolean
public static final class RefInAnyof1BoxedBoolean<br>
extends [RefInAnyof1Boxed](#refinanyof1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefInAnyof1BoxedNumber
public static final class RefInAnyof1BoxedNumber<br>
extends [RefInAnyof1Boxed](#refinanyof1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefInAnyof1BoxedString
public static final class RefInAnyof1BoxedString<br>
extends [RefInAnyof1Boxed](#refinanyof1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefInAnyof1BoxedList
public static final class RefInAnyof1BoxedList<br>
extends [RefInAnyof1Boxed](#refinanyof1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RefInAnyof1BoxedMap
public static final class RefInAnyof1BoxedMap<br>
extends [RefInAnyof1Boxed](#refinanyof1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## RefInAnyof1
public static class RefInAnyof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1)<br>)<br> |

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
| [RefInAnyof1BoxedString](#refinanyof1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RefInAnyof1BoxedVoid](#refinanyof1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RefInAnyof1BoxedNumber](#refinanyof1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RefInAnyof1BoxedBoolean](#refinanyof1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RefInAnyof1BoxedMap](#refinanyof1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RefInAnyof1BoxedList](#refinanyof1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
