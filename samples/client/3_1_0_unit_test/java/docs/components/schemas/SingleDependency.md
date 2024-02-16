# SingleDependency
org.openapijsonschematools.client.components.schemas.SingleDependency.java
public class SingleDependency<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SingleDependency.SingleDependency1Boxed](#singledependency1boxed)<br> abstract sealed validated payload class |
| static class | [SingleDependency.SingleDependency1BoxedVoid](#singledependency1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [SingleDependency.SingleDependency1BoxedBoolean](#singledependency1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [SingleDependency.SingleDependency1BoxedNumber](#singledependency1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [SingleDependency.SingleDependency1BoxedString](#singledependency1boxedstring)<br> boxed class to store validated String payloads |
| static class | [SingleDependency.SingleDependency1BoxedList](#singledependency1boxedlist)<br> boxed class to store validated List payloads |
| static class | [SingleDependency.SingleDependency1BoxedMap](#singledependency1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SingleDependency.SingleDependency1](#singledependency1)<br> schema class |

## SingleDependency1Boxed
public static abstract sealed class SingleDependency1Boxed<br>
permits<br>
[SingleDependency1BoxedVoid](#singledependency1boxedvoid),
[SingleDependency1BoxedBoolean](#singledependency1boxedboolean),
[SingleDependency1BoxedNumber](#singledependency1boxednumber),
[SingleDependency1BoxedString](#singledependency1boxedstring),
[SingleDependency1BoxedList](#singledependency1boxedlist),
[SingleDependency1BoxedMap](#singledependency1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SingleDependency1BoxedVoid
public static final class SingleDependency1BoxedVoid<br>
extends [SingleDependency1Boxed](#singledependency1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## SingleDependency1BoxedBoolean
public static final class SingleDependency1BoxedBoolean<br>
extends [SingleDependency1Boxed](#singledependency1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## SingleDependency1BoxedNumber
public static final class SingleDependency1BoxedNumber<br>
extends [SingleDependency1Boxed](#singledependency1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## SingleDependency1BoxedString
public static final class SingleDependency1BoxedString<br>
extends [SingleDependency1Boxed](#singledependency1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## SingleDependency1BoxedList
public static final class SingleDependency1BoxedList<br>
extends [SingleDependency1Boxed](#singledependency1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## SingleDependency1BoxedMap
public static final class SingleDependency1BoxedMap<br>
extends [SingleDependency1Boxed](#singledependency1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
