# Ipv6Format
org.openapijsonschematools.client.components.schemas.Ipv6Format.java
public class Ipv6Format

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Ipv6Format.Ipv6Format1Boxed](#ipv6format1boxed)<br> abstract sealed validated payload class |
| static class | [Ipv6Format.Ipv6Format1BoxedVoid](#ipv6format1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Ipv6Format.Ipv6Format1BoxedBoolean](#ipv6format1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Ipv6Format.Ipv6Format1BoxedNumber](#ipv6format1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Ipv6Format.Ipv6Format1BoxedString](#ipv6format1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Ipv6Format.Ipv6Format1BoxedList](#ipv6format1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Ipv6Format.Ipv6Format1BoxedMap](#ipv6format1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Ipv6Format.Ipv6Format1](#ipv6format1)<br> schema class |

## Ipv6Format1Boxed
public static abstract sealed class Ipv6Format1Boxed<br>
permits<br>
[Ipv6Format1BoxedVoid](#ipv6format1boxedvoid),
[Ipv6Format1BoxedBoolean](#ipv6format1boxedboolean),
[Ipv6Format1BoxedNumber](#ipv6format1boxednumber),
[Ipv6Format1BoxedString](#ipv6format1boxedstring),
[Ipv6Format1BoxedList](#ipv6format1boxedlist),
[Ipv6Format1BoxedMap](#ipv6format1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Ipv6Format1BoxedVoid
public static final class Ipv6Format1BoxedVoid<br>
extends [Ipv6Format1Boxed](#ipv6format1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Ipv6Format1BoxedBoolean
public static final class Ipv6Format1BoxedBoolean<br>
extends [Ipv6Format1Boxed](#ipv6format1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Ipv6Format1BoxedNumber
public static final class Ipv6Format1BoxedNumber<br>
extends [Ipv6Format1Boxed](#ipv6format1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Ipv6Format1BoxedString
public static final class Ipv6Format1BoxedString<br>
extends [Ipv6Format1Boxed](#ipv6format1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Ipv6Format1BoxedList
public static final class Ipv6Format1BoxedList<br>
extends [Ipv6Format1Boxed](#ipv6format1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Ipv6Format1BoxedMap
public static final class Ipv6Format1BoxedMap<br>
extends [Ipv6Format1Boxed](#ipv6format1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Ipv6Format1
public static class Ipv6Format1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "ipv6"; |

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
| [Ipv6Format1BoxedString](#ipv6format1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Ipv6Format1BoxedVoid](#ipv6format1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Ipv6Format1BoxedNumber](#ipv6format1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Ipv6Format1BoxedBoolean](#ipv6format1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Ipv6Format1BoxedMap](#ipv6format1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Ipv6Format1BoxedList](#ipv6format1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
