# MultipleDependentsRequired
unit_test_api.components.schemas.MultipleDependentsRequired.java
public class MultipleDependentsRequired<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipleDependentsRequired.MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)<br> sealed interface for validated payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring)<br> boxed class to store validated String payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist)<br> boxed class to store validated List payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1](#multipledependentsrequired1)<br> schema class |

## MultipleDependentsRequired1Boxed
public sealed interface MultipleDependentsRequired1Boxed<br>
permits<br>
[MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid),
[MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean),
[MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber),
[MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring),
[MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist),
[MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipleDependentsRequired1BoxedVoid
public record MultipleDependentsRequired1BoxedVoid<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedBoolean
public record MultipleDependentsRequired1BoxedBoolean<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedNumber
public record MultipleDependentsRequired1BoxedNumber<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedString
public record MultipleDependentsRequired1BoxedString<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedList
public record MultipleDependentsRequired1BoxedList<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedMap
public record MultipleDependentsRequired1BoxedMap<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MultipleDependentsRequired1
public static class MultipleDependentsRequired1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Set<String>> | dependentRequired = MapUtils.makeMap(<br>
&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"quux",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SetMaker.makeSet(
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>
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
| [MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
