# HostnameFormat
org.openapijsonschematools.client.components.schemas.HostnameFormat.java
public class HostnameFormat

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [HostnameFormat.HostnameFormat1Boxed](#hostnameformat1boxed)<br> abstract sealed validated payload class |
| static class | [HostnameFormat.HostnameFormat1BoxedVoid](#hostnameformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [HostnameFormat.HostnameFormat1BoxedBoolean](#hostnameformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [HostnameFormat.HostnameFormat1BoxedNumber](#hostnameformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [HostnameFormat.HostnameFormat1BoxedString](#hostnameformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [HostnameFormat.HostnameFormat1BoxedList](#hostnameformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [HostnameFormat.HostnameFormat1BoxedMap](#hostnameformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [HostnameFormat.HostnameFormat1](#hostnameformat1)<br> schema class |

## HostnameFormat1Boxed
public static abstract sealed class HostnameFormat1Boxed<br>
permits<br>
[HostnameFormat1BoxedVoid](#hostnameformat1boxedvoid),
[HostnameFormat1BoxedBoolean](#hostnameformat1boxedboolean),
[HostnameFormat1BoxedNumber](#hostnameformat1boxednumber),
[HostnameFormat1BoxedString](#hostnameformat1boxedstring),
[HostnameFormat1BoxedList](#hostnameformat1boxedlist),
[HostnameFormat1BoxedMap](#hostnameformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## HostnameFormat1BoxedVoid
public static final class HostnameFormat1BoxedVoid<br>
extends [HostnameFormat1Boxed](#hostnameformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HostnameFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## HostnameFormat1BoxedBoolean
public static final class HostnameFormat1BoxedBoolean<br>
extends [HostnameFormat1Boxed](#hostnameformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HostnameFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## HostnameFormat1BoxedNumber
public static final class HostnameFormat1BoxedNumber<br>
extends [HostnameFormat1Boxed](#hostnameformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HostnameFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## HostnameFormat1BoxedString
public static final class HostnameFormat1BoxedString<br>
extends [HostnameFormat1Boxed](#hostnameformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HostnameFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## HostnameFormat1BoxedList
public static final class HostnameFormat1BoxedList<br>
extends [HostnameFormat1Boxed](#hostnameformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HostnameFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## HostnameFormat1BoxedMap
public static final class HostnameFormat1BoxedMap<br>
extends [HostnameFormat1Boxed](#hostnameformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HostnameFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## HostnameFormat1
public static class HostnameFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "hostname"; |

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
| [HostnameFormat1BoxedString](#hostnameformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [HostnameFormat1BoxedVoid](#hostnameformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [HostnameFormat1BoxedNumber](#hostnameformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [HostnameFormat1BoxedBoolean](#hostnameformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [HostnameFormat1BoxedMap](#hostnameformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [HostnameFormat1BoxedList](#hostnameformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
