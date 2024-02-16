# IdnEmailFormat
org.openapijsonschematools.client.components.schemas.IdnEmailFormat.java
public class IdnEmailFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IdnEmailFormat.IdnEmailFormat1Boxed](#idnemailformat1boxed)<br> abstract sealed validated payload class |
| static class | [IdnEmailFormat.IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1BoxedString](#idnemailformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1BoxedList](#idnemailformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1](#idnemailformat1)<br> schema class |

## IdnEmailFormat1Boxed
public static abstract sealed class IdnEmailFormat1Boxed<br>
permits<br>
[IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid),
[IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean),
[IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber),
[IdnEmailFormat1BoxedString](#idnemailformat1boxedstring),
[IdnEmailFormat1BoxedList](#idnemailformat1boxedlist),
[IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IdnEmailFormat1BoxedVoid
public static final class IdnEmailFormat1BoxedVoid<br>
extends [IdnEmailFormat1Boxed](#idnemailformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IdnEmailFormat1BoxedBoolean
public static final class IdnEmailFormat1BoxedBoolean<br>
extends [IdnEmailFormat1Boxed](#idnemailformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IdnEmailFormat1BoxedNumber
public static final class IdnEmailFormat1BoxedNumber<br>
extends [IdnEmailFormat1Boxed](#idnemailformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IdnEmailFormat1BoxedString
public static final class IdnEmailFormat1BoxedString<br>
extends [IdnEmailFormat1Boxed](#idnemailformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IdnEmailFormat1BoxedList
public static final class IdnEmailFormat1BoxedList<br>
extends [IdnEmailFormat1Boxed](#idnemailformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IdnEmailFormat1BoxedMap
public static final class IdnEmailFormat1BoxedMap<br>
extends [IdnEmailFormat1Boxed](#idnemailformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IdnEmailFormat1
public static class IdnEmailFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "idn-email"; |

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
| [IdnEmailFormat1BoxedString](#idnemailformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IdnEmailFormat1BoxedList](#idnemailformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
