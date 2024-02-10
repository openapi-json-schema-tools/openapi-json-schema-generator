# RefInOneof
org.openapijsonschematools.client.components.schemas.RefInOneof.java
public class RefInOneof

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInOneof.RefInOneof1Boxed](#refinoneof1boxed)<br> abstract sealed validated payload class |
| static class | [RefInOneof.RefInOneof1BoxedVoid](#refinoneof1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RefInOneof.RefInOneof1BoxedBoolean](#refinoneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RefInOneof.RefInOneof1BoxedNumber](#refinoneof1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RefInOneof.RefInOneof1BoxedString](#refinoneof1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RefInOneof.RefInOneof1BoxedList](#refinoneof1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RefInOneof.RefInOneof1BoxedMap](#refinoneof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInOneof.RefInOneof1](#refinoneof1)<br> schema class |

## RefInOneof1Boxed
public static abstract sealed class RefInOneof1Boxed<br>
permits<br>
[RefInOneof1BoxedVoid](#refinoneof1boxedvoid),
[RefInOneof1BoxedBoolean](#refinoneof1boxedboolean),
[RefInOneof1BoxedNumber](#refinoneof1boxednumber),
[RefInOneof1BoxedString](#refinoneof1boxedstring),
[RefInOneof1BoxedList](#refinoneof1boxedlist),
[RefInOneof1BoxedMap](#refinoneof1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RefInOneof1BoxedVoid
public static final class RefInOneof1BoxedVoid<br>
extends [RefInOneof1Boxed](#refinoneof1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefInOneof1BoxedBoolean
public static final class RefInOneof1BoxedBoolean<br>
extends [RefInOneof1Boxed](#refinoneof1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefInOneof1BoxedNumber
public static final class RefInOneof1BoxedNumber<br>
extends [RefInOneof1Boxed](#refinoneof1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefInOneof1BoxedString
public static final class RefInOneof1BoxedString<br>
extends [RefInOneof1Boxed](#refinoneof1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefInOneof1BoxedList
public static final class RefInOneof1BoxedList<br>
extends [RefInOneof1Boxed](#refinoneof1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RefInOneof1BoxedMap
public static final class RefInOneof1BoxedMap<br>
extends [RefInOneof1Boxed](#refinoneof1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## RefInOneof1
public static class RefInOneof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1)<br>))<br> |

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
| [RefInOneof1BoxedString](#refinoneof1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RefInOneof1BoxedVoid](#refinoneof1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RefInOneof1BoxedNumber](#refinoneof1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RefInOneof1BoxedBoolean](#refinoneof1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RefInOneof1BoxedMap](#refinoneof1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RefInOneof1BoxedList](#refinoneof1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
