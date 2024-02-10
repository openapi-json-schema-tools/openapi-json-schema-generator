# IriReferenceFormat
org.openapijsonschematools.client.components.schemas.IriReferenceFormat.java
public class IriReferenceFormat

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IriReferenceFormat.IriReferenceFormat1Boxed](#irireferenceformat1boxed)<br> abstract sealed validated payload class |
| static class | [IriReferenceFormat.IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IriReferenceFormat.IriReferenceFormat1](#irireferenceformat1)<br> schema class |

## IriReferenceFormat1Boxed
public static abstract sealed class IriReferenceFormat1Boxed<br>
permits<br>
[IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid),
[IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean),
[IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber),
[IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring),
[IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist),
[IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IriReferenceFormat1BoxedVoid
public static final class IriReferenceFormat1BoxedVoid<br>
extends [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IriReferenceFormat1BoxedBoolean
public static final class IriReferenceFormat1BoxedBoolean<br>
extends [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IriReferenceFormat1BoxedNumber
public static final class IriReferenceFormat1BoxedNumber<br>
extends [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IriReferenceFormat1BoxedString
public static final class IriReferenceFormat1BoxedString<br>
extends [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IriReferenceFormat1BoxedList
public static final class IriReferenceFormat1BoxedList<br>
extends [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IriReferenceFormat1BoxedMap
public static final class IriReferenceFormat1BoxedMap<br>
extends [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IriReferenceFormat1
public static class IriReferenceFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "iri-reference"; |

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
| [IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
