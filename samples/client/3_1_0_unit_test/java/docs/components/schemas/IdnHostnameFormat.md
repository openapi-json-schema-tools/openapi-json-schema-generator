# IdnHostnameFormat
org.openapijsonschematools.client.components.schemas.IdnHostnameFormat.java
public class IdnHostnameFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IdnHostnameFormat.IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)<br> abstract sealed validated payload class |
| static class | [IdnHostnameFormat.IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IdnHostnameFormat.IdnHostnameFormat1](#idnhostnameformat1)<br> schema class |

## IdnHostnameFormat1Boxed
public static abstract sealed class IdnHostnameFormat1Boxed<br>
permits<br>
[IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid),
[IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean),
[IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber),
[IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring),
[IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist),
[IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IdnHostnameFormat1BoxedVoid
public static final class IdnHostnameFormat1BoxedVoid<br>
extends [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IdnHostnameFormat1BoxedBoolean
public static final class IdnHostnameFormat1BoxedBoolean<br>
extends [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IdnHostnameFormat1BoxedNumber
public static final class IdnHostnameFormat1BoxedNumber<br>
extends [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IdnHostnameFormat1BoxedString
public static final class IdnHostnameFormat1BoxedString<br>
extends [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IdnHostnameFormat1BoxedList
public static final class IdnHostnameFormat1BoxedList<br>
extends [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IdnHostnameFormat1BoxedMap
public static final class IdnHostnameFormat1BoxedMap<br>
extends [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IdnHostnameFormat1
public static class IdnHostnameFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "idn-hostname"; |

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
| [IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
