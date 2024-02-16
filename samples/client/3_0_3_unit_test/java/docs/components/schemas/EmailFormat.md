# EmailFormat
org.openapijsonschematools.client.components.schemas.EmailFormat.java
public class EmailFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EmailFormat.EmailFormat1Boxed](#emailformat1boxed)<br> abstract sealed validated payload class |
| static class | [EmailFormat.EmailFormat1BoxedVoid](#emailformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [EmailFormat.EmailFormat1BoxedBoolean](#emailformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [EmailFormat.EmailFormat1BoxedNumber](#emailformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [EmailFormat.EmailFormat1BoxedString](#emailformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [EmailFormat.EmailFormat1BoxedList](#emailformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [EmailFormat.EmailFormat1BoxedMap](#emailformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EmailFormat.EmailFormat1](#emailformat1)<br> schema class |

## EmailFormat1Boxed
public static abstract sealed class EmailFormat1Boxed<br>
permits<br>
[EmailFormat1BoxedVoid](#emailformat1boxedvoid),
[EmailFormat1BoxedBoolean](#emailformat1boxedboolean),
[EmailFormat1BoxedNumber](#emailformat1boxednumber),
[EmailFormat1BoxedString](#emailformat1boxedstring),
[EmailFormat1BoxedList](#emailformat1boxedlist),
[EmailFormat1BoxedMap](#emailformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## EmailFormat1BoxedVoid
public static final class EmailFormat1BoxedVoid<br>
extends [EmailFormat1Boxed](#emailformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## EmailFormat1BoxedBoolean
public static final class EmailFormat1BoxedBoolean<br>
extends [EmailFormat1Boxed](#emailformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## EmailFormat1BoxedNumber
public static final class EmailFormat1BoxedNumber<br>
extends [EmailFormat1Boxed](#emailformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## EmailFormat1BoxedString
public static final class EmailFormat1BoxedString<br>
extends [EmailFormat1Boxed](#emailformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## EmailFormat1BoxedList
public static final class EmailFormat1BoxedList<br>
extends [EmailFormat1Boxed](#emailformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## EmailFormat1BoxedMap
public static final class EmailFormat1BoxedMap<br>
extends [EmailFormat1Boxed](#emailformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## EmailFormat1
public static class EmailFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "email"; |

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
| [EmailFormat1BoxedString](#emailformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [EmailFormat1BoxedVoid](#emailformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [EmailFormat1BoxedNumber](#emailformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [EmailFormat1BoxedBoolean](#emailformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [EmailFormat1BoxedMap](#emailformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [EmailFormat1BoxedList](#emailformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
