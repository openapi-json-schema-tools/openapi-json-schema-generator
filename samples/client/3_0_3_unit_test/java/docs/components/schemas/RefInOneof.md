# RefInOneof
org.openapijsonschematools.client.components.schemas.RefInOneof.java
public class RefInOneof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInOneof.RefInOneof1Boxed](#refinoneof1boxed)<br> sealed interface for validated payloads |
| record | [RefInOneof.RefInOneof1BoxedVoid](#refinoneof1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RefInOneof.RefInOneof1BoxedBoolean](#refinoneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RefInOneof.RefInOneof1BoxedNumber](#refinoneof1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RefInOneof.RefInOneof1BoxedString](#refinoneof1boxedstring)<br> boxed class to store validated String payloads |
| record | [RefInOneof.RefInOneof1BoxedList](#refinoneof1boxedlist)<br> boxed class to store validated List payloads |
| record | [RefInOneof.RefInOneof1BoxedMap](#refinoneof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInOneof.RefInOneof1](#refinoneof1)<br> schema class |

## RefInOneof1Boxed
public sealed interface RefInOneof1Boxed<br>
permits<br>
[RefInOneof1BoxedVoid](#refinoneof1boxedvoid),
[RefInOneof1BoxedBoolean](#refinoneof1boxedboolean),
[RefInOneof1BoxedNumber](#refinoneof1boxednumber),
[RefInOneof1BoxedString](#refinoneof1boxedstring),
[RefInOneof1BoxedList](#refinoneof1boxedlist),
[RefInOneof1BoxedMap](#refinoneof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInOneof1BoxedVoid
public record RefInOneof1BoxedVoid<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInOneof1BoxedBoolean
public record RefInOneof1BoxedBoolean<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInOneof1BoxedNumber
public record RefInOneof1BoxedNumber<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInOneof1BoxedString
public record RefInOneof1BoxedString<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInOneof1BoxedList
public record RefInOneof1BoxedList<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInOneof1BoxedMap
public record RefInOneof1BoxedMap<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [RefInOneof1Boxed](#refinoneof1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
