# IriFormat
org.openapijsonschematools.client.components.schemas.IriFormat.java
public class IriFormat

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IriFormat.IriFormat1Boxed](#iriformat1boxed)<br> abstract sealed validated payload class |
| static class | [IriFormat.IriFormat1BoxedVoid](#iriformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IriFormat.IriFormat1BoxedBoolean](#iriformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IriFormat.IriFormat1BoxedNumber](#iriformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IriFormat.IriFormat1BoxedString](#iriformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IriFormat.IriFormat1BoxedList](#iriformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IriFormat.IriFormat1BoxedMap](#iriformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IriFormat.IriFormat1](#iriformat1)<br> schema class |

## IriFormat1Boxed
public static abstract sealed class IriFormat1Boxed<br>
permits<br>
[IriFormat1BoxedVoid](#iriformat1boxedvoid),
[IriFormat1BoxedBoolean](#iriformat1boxedboolean),
[IriFormat1BoxedNumber](#iriformat1boxednumber),
[IriFormat1BoxedString](#iriformat1boxedstring),
[IriFormat1BoxedList](#iriformat1boxedlist),
[IriFormat1BoxedMap](#iriformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IriFormat1BoxedVoid
public static final class IriFormat1BoxedVoid<br>
extends [IriFormat1Boxed](#iriformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IriFormat1BoxedBoolean
public static final class IriFormat1BoxedBoolean<br>
extends [IriFormat1Boxed](#iriformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IriFormat1BoxedNumber
public static final class IriFormat1BoxedNumber<br>
extends [IriFormat1Boxed](#iriformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IriFormat1BoxedString
public static final class IriFormat1BoxedString<br>
extends [IriFormat1Boxed](#iriformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IriFormat1BoxedList
public static final class IriFormat1BoxedList<br>
extends [IriFormat1Boxed](#iriformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IriFormat1BoxedMap
public static final class IriFormat1BoxedMap<br>
extends [IriFormat1Boxed](#iriformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IriFormat1
public static class IriFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "iri"; |

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
| [IriFormat1BoxedString](#iriformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedVoid](#iriformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedNumber](#iriformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedBoolean](#iriformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedMap](#iriformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IriFormat1BoxedList](#iriformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
