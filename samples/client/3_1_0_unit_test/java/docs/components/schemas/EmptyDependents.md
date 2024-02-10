# EmptyDependents
org.openapijsonschematools.client.components.schemas.EmptyDependents.java
public class EmptyDependents

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EmptyDependents.EmptyDependents1Boxed](#emptydependents1boxed)<br> abstract sealed validated payload class |
| static class | [EmptyDependents.EmptyDependents1BoxedVoid](#emptydependents1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [EmptyDependents.EmptyDependents1BoxedBoolean](#emptydependents1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [EmptyDependents.EmptyDependents1BoxedNumber](#emptydependents1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [EmptyDependents.EmptyDependents1BoxedString](#emptydependents1boxedstring)<br> boxed class to store validated String payloads |
| static class | [EmptyDependents.EmptyDependents1BoxedList](#emptydependents1boxedlist)<br> boxed class to store validated List payloads |
| static class | [EmptyDependents.EmptyDependents1BoxedMap](#emptydependents1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EmptyDependents.EmptyDependents1](#emptydependents1)<br> schema class |

## EmptyDependents1Boxed
public static abstract sealed class EmptyDependents1Boxed<br>
permits<br>
[EmptyDependents1BoxedVoid](#emptydependents1boxedvoid),
[EmptyDependents1BoxedBoolean](#emptydependents1boxedboolean),
[EmptyDependents1BoxedNumber](#emptydependents1boxednumber),
[EmptyDependents1BoxedString](#emptydependents1boxedstring),
[EmptyDependents1BoxedList](#emptydependents1boxedlist),
[EmptyDependents1BoxedMap](#emptydependents1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## EmptyDependents1BoxedVoid
public static final class EmptyDependents1BoxedVoid<br>
extends [EmptyDependents1Boxed](#emptydependents1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## EmptyDependents1BoxedBoolean
public static final class EmptyDependents1BoxedBoolean<br>
extends [EmptyDependents1Boxed](#emptydependents1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## EmptyDependents1BoxedNumber
public static final class EmptyDependents1BoxedNumber<br>
extends [EmptyDependents1Boxed](#emptydependents1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## EmptyDependents1BoxedString
public static final class EmptyDependents1BoxedString<br>
extends [EmptyDependents1Boxed](#emptydependents1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## EmptyDependents1BoxedList
public static final class EmptyDependents1BoxedList<br>
extends [EmptyDependents1Boxed](#emptydependents1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## EmptyDependents1BoxedMap
public static final class EmptyDependents1BoxedMap<br>
extends [EmptyDependents1Boxed](#emptydependents1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## EmptyDependents1
public static class EmptyDependents1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Set<String>> | dependentRequired = MapUtils.makeMap(<br>
&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"bar",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SetMaker.makeSet(
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
| [EmptyDependents1BoxedString](#emptydependents1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [EmptyDependents1BoxedVoid](#emptydependents1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [EmptyDependents1BoxedNumber](#emptydependents1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [EmptyDependents1BoxedBoolean](#emptydependents1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [EmptyDependents1BoxedMap](#emptydependents1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [EmptyDependents1BoxedList](#emptydependents1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
