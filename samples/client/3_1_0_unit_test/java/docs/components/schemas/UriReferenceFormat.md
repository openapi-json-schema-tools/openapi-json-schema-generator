# UriReferenceFormat
org.openapijsonschematools.client.components.schemas.UriReferenceFormat.java
public class UriReferenceFormat

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UriReferenceFormat.UriReferenceFormat1Boxed](#urireferenceformat1boxed)<br> abstract sealed validated payload class |
| static class | [UriReferenceFormat.UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1](#urireferenceformat1)<br> schema class |

## UriReferenceFormat1Boxed
public static abstract sealed class UriReferenceFormat1Boxed<br>
permits<br>
[UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid),
[UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean),
[UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber),
[UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring),
[UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist),
[UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UriReferenceFormat1BoxedVoid
public static final class UriReferenceFormat1BoxedVoid<br>
extends [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UriReferenceFormat1BoxedBoolean
public static final class UriReferenceFormat1BoxedBoolean<br>
extends [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UriReferenceFormat1BoxedNumber
public static final class UriReferenceFormat1BoxedNumber<br>
extends [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UriReferenceFormat1BoxedString
public static final class UriReferenceFormat1BoxedString<br>
extends [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UriReferenceFormat1BoxedList
public static final class UriReferenceFormat1BoxedList<br>
extends [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UriReferenceFormat1BoxedMap
public static final class UriReferenceFormat1BoxedMap<br>
extends [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UriReferenceFormat1
public static class UriReferenceFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri-reference"; |

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
| [UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
