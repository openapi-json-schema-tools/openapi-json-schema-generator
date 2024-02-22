# SingleDependency
org.openapijsonschematools.client.components.schemas.SingleDependency.java
public class SingleDependency<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SingleDependency.SingleDependency1Boxed](#singledependency1boxed)<br> sealed interface for validated payloads |
| record | [SingleDependency.SingleDependency1BoxedVoid](#singledependency1boxedvoid)<br> boxed class to store validated null payloads |
| record | [SingleDependency.SingleDependency1BoxedBoolean](#singledependency1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [SingleDependency.SingleDependency1BoxedNumber](#singledependency1boxednumber)<br> boxed class to store validated Number payloads |
| record | [SingleDependency.SingleDependency1BoxedString](#singledependency1boxedstring)<br> boxed class to store validated String payloads |
| record | [SingleDependency.SingleDependency1BoxedList](#singledependency1boxedlist)<br> boxed class to store validated List payloads |
| record | [SingleDependency.SingleDependency1BoxedMap](#singledependency1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SingleDependency.SingleDependency1](#singledependency1)<br> schema class |

## SingleDependency1Boxed
public sealed interface SingleDependency1Boxed<br>
permits<br>
[SingleDependency1BoxedVoid](#singledependency1boxedvoid),
[SingleDependency1BoxedBoolean](#singledependency1boxedboolean),
[SingleDependency1BoxedNumber](#singledependency1boxednumber),
[SingleDependency1BoxedString](#singledependency1boxedstring),
[SingleDependency1BoxedList](#singledependency1boxedlist),
[SingleDependency1BoxedMap](#singledependency1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SingleDependency1BoxedVoid
public record SingleDependency1BoxedVoid<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SingleDependency1BoxedBoolean
public record SingleDependency1BoxedBoolean<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SingleDependency1BoxedNumber
public record SingleDependency1BoxedNumber<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SingleDependency1BoxedString
public record SingleDependency1BoxedString<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SingleDependency1BoxedList
public record SingleDependency1BoxedList<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SingleDependency1BoxedMap
public record SingleDependency1BoxedMap<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SingleDependency1
public static class SingleDependency1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Set<String>> | dependentRequired = MapUtils.makeMap(<br>
&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"bar",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SetMaker.makeSet(
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;)
&nbsp;&nbsp;&nbsp;&nbsp;)<br>
)
 |

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
| [SingleDependency1BoxedString](#singledependency1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SingleDependency1BoxedVoid](#singledependency1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [SingleDependency1BoxedNumber](#singledependency1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SingleDependency1BoxedBoolean](#singledependency1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SingleDependency1BoxedMap](#singledependency1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SingleDependency1BoxedList](#singledependency1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [SingleDependency1Boxed](#singledependency1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
