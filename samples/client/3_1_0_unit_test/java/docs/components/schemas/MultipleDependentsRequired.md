# MultipleDependentsRequired
org.openapijsonschematools.client.components.schemas.MultipleDependentsRequired.java
public class MultipleDependentsRequired

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)<br> abstract sealed validated payload class |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1](#multipledependentsrequired1)<br> schema class |

## MultipleDependentsRequired1Boxed
public static abstract sealed class MultipleDependentsRequired1Boxed<br>
permits<br>
[MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid),
[MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean),
[MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber),
[MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring),
[MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist),
[MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MultipleDependentsRequired1BoxedVoid
public static final class MultipleDependentsRequired1BoxedVoid<br>
extends [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MultipleDependentsRequired1BoxedBoolean
public static final class MultipleDependentsRequired1BoxedBoolean<br>
extends [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MultipleDependentsRequired1BoxedNumber
public static final class MultipleDependentsRequired1BoxedNumber<br>
extends [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MultipleDependentsRequired1BoxedString
public static final class MultipleDependentsRequired1BoxedString<br>
extends [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MultipleDependentsRequired1BoxedList
public static final class MultipleDependentsRequired1BoxedList<br>
extends [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MultipleDependentsRequired1BoxedMap
public static final class MultipleDependentsRequired1BoxedMap<br>
extends [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
