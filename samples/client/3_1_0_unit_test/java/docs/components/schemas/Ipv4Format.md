# Ipv4Format
org.openapijsonschematools.client.components.schemas.Ipv4Format.java
public class Ipv4Format<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Ipv4Format.Ipv4Format1Boxed](#ipv4format1boxed)<br> abstract sealed validated payload class |
| static class | [Ipv4Format.Ipv4Format1BoxedVoid](#ipv4format1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Ipv4Format.Ipv4Format1BoxedBoolean](#ipv4format1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Ipv4Format.Ipv4Format1BoxedNumber](#ipv4format1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Ipv4Format.Ipv4Format1BoxedString](#ipv4format1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Ipv4Format.Ipv4Format1BoxedList](#ipv4format1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Ipv4Format.Ipv4Format1BoxedMap](#ipv4format1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Ipv4Format.Ipv4Format1](#ipv4format1)<br> schema class |

## Ipv4Format1Boxed
public static abstract sealed class Ipv4Format1Boxed<br>
permits<br>
[Ipv4Format1BoxedVoid](#ipv4format1boxedvoid),
[Ipv4Format1BoxedBoolean](#ipv4format1boxedboolean),
[Ipv4Format1BoxedNumber](#ipv4format1boxednumber),
[Ipv4Format1BoxedString](#ipv4format1boxedstring),
[Ipv4Format1BoxedList](#ipv4format1boxedlist),
[Ipv4Format1BoxedMap](#ipv4format1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Ipv4Format1BoxedVoid
public static final class Ipv4Format1BoxedVoid<br>
extends [Ipv4Format1Boxed](#ipv4format1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Ipv4Format1BoxedBoolean
public static final class Ipv4Format1BoxedBoolean<br>
extends [Ipv4Format1Boxed](#ipv4format1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Ipv4Format1BoxedNumber
public static final class Ipv4Format1BoxedNumber<br>
extends [Ipv4Format1Boxed](#ipv4format1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Ipv4Format1BoxedString
public static final class Ipv4Format1BoxedString<br>
extends [Ipv4Format1Boxed](#ipv4format1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Ipv4Format1BoxedList
public static final class Ipv4Format1BoxedList<br>
extends [Ipv4Format1Boxed](#ipv4format1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Ipv4Format1BoxedMap
public static final class Ipv4Format1BoxedMap<br>
extends [Ipv4Format1Boxed](#ipv4format1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv4Format1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Ipv4Format1
public static class Ipv4Format1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "ipv4"; |

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
| [Ipv4Format1BoxedString](#ipv4format1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedVoid](#ipv4format1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedNumber](#ipv4format1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedBoolean](#ipv4format1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedMap](#ipv4format1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Ipv4Format1BoxedList](#ipv4format1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
