# RefInNot
org.openapijsonschematools.client.components.schemas.RefInNot.java
public class RefInNot

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefInNot.RefInNot1Boxed](#refinnot1boxed)<br> abstract sealed validated payload class |
| static class | [RefInNot.RefInNot1BoxedVoid](#refinnot1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RefInNot.RefInNot1BoxedBoolean](#refinnot1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RefInNot.RefInNot1BoxedNumber](#refinnot1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RefInNot.RefInNot1BoxedString](#refinnot1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RefInNot.RefInNot1BoxedList](#refinnot1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RefInNot.RefInNot1BoxedMap](#refinnot1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInNot.RefInNot1](#refinnot1)<br> schema class |

## RefInNot1Boxed
public static abstract sealed class RefInNot1Boxed<br>
permits<br>
[RefInNot1BoxedVoid](#refinnot1boxedvoid),
[RefInNot1BoxedBoolean](#refinnot1boxedboolean),
[RefInNot1BoxedNumber](#refinnot1boxednumber),
[RefInNot1BoxedString](#refinnot1boxedstring),
[RefInNot1BoxedList](#refinnot1boxedlist),
[RefInNot1BoxedMap](#refinnot1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RefInNot1BoxedVoid
public static final class RefInNot1BoxedVoid<br>
extends [RefInNot1Boxed](#refinnot1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefInNot1BoxedBoolean
public static final class RefInNot1BoxedBoolean<br>
extends [RefInNot1Boxed](#refinnot1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefInNot1BoxedNumber
public static final class RefInNot1BoxedNumber<br>
extends [RefInNot1Boxed](#refinnot1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefInNot1BoxedString
public static final class RefInNot1BoxedString<br>
extends [RefInNot1Boxed](#refinnot1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefInNot1BoxedList
public static final class RefInNot1BoxedList<br>
extends [RefInNot1Boxed](#refinnot1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RefInNot1BoxedMap
public static final class RefInNot1BoxedMap<br>
extends [RefInNot1Boxed](#refinnot1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
