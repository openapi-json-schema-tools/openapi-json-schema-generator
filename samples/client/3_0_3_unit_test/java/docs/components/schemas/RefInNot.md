# RefInNot
org.openapijsonschematools.client.components.schemas.RefInNot.java
public class RefInNot<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInNot.RefInNot1Boxed](#refinnot1boxed)<br> sealed interface for validated payloads |
| record | [RefInNot.RefInNot1BoxedVoid](#refinnot1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RefInNot.RefInNot1BoxedBoolean](#refinnot1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RefInNot.RefInNot1BoxedNumber](#refinnot1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RefInNot.RefInNot1BoxedString](#refinnot1boxedstring)<br> boxed class to store validated String payloads |
| record | [RefInNot.RefInNot1BoxedList](#refinnot1boxedlist)<br> boxed class to store validated List payloads |
| record | [RefInNot.RefInNot1BoxedMap](#refinnot1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInNot.RefInNot1](#refinnot1)<br> schema class |

## RefInNot1Boxed
public sealed interface RefInNot1Boxed<br>
permits<br>
[RefInNot1BoxedVoid](#refinnot1boxedvoid),
[RefInNot1BoxedBoolean](#refinnot1boxedboolean),
[RefInNot1BoxedNumber](#refinnot1boxednumber),
[RefInNot1BoxedString](#refinnot1boxedstring),
[RefInNot1BoxedList](#refinnot1boxedlist),
[RefInNot1BoxedMap](#refinnot1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInNot1BoxedVoid
public record RefInNot1BoxedVoid<br>
implements [RefInNot1Boxed](#refinnot1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInNot1BoxedBoolean
public record RefInNot1BoxedBoolean<br>
implements [RefInNot1Boxed](#refinnot1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInNot1BoxedNumber
public record RefInNot1BoxedNumber<br>
implements [RefInNot1Boxed](#refinnot1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInNot1BoxedString
public record RefInNot1BoxedString<br>
implements [RefInNot1Boxed](#refinnot1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInNot1BoxedList
public record RefInNot1BoxedList<br>
implements [RefInNot1Boxed](#refinnot1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInNot1BoxedMap
public record RefInNot1BoxedMap<br>
implements [RefInNot1Boxed](#refinnot1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RefInNot1
public static class RefInNot1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1.class](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1) |

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
| [RefInNot1BoxedString](#refinnot1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RefInNot1BoxedVoid](#refinnot1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RefInNot1BoxedNumber](#refinnot1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RefInNot1BoxedBoolean](#refinnot1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RefInNot1BoxedMap](#refinnot1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RefInNot1BoxedList](#refinnot1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RefInNot1Boxed](#refinnot1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
