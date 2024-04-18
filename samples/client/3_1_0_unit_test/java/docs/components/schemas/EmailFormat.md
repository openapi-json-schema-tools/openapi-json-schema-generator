# EmailFormat
unit_test_api.components.schemas.EmailFormat.java
public class EmailFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EmailFormat.EmailFormat1Boxed](#emailformat1boxed)<br> sealed interface for validated payloads |
| record | [EmailFormat.EmailFormat1BoxedVoid](#emailformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [EmailFormat.EmailFormat1BoxedBoolean](#emailformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [EmailFormat.EmailFormat1BoxedNumber](#emailformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [EmailFormat.EmailFormat1BoxedString](#emailformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [EmailFormat.EmailFormat1BoxedList](#emailformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [EmailFormat.EmailFormat1BoxedMap](#emailformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EmailFormat.EmailFormat1](#emailformat1)<br> schema class |

## EmailFormat1Boxed
public sealed interface EmailFormat1Boxed<br>
permits<br>
[EmailFormat1BoxedVoid](#emailformat1boxedvoid),
[EmailFormat1BoxedBoolean](#emailformat1boxedboolean),
[EmailFormat1BoxedNumber](#emailformat1boxednumber),
[EmailFormat1BoxedString](#emailformat1boxedstring),
[EmailFormat1BoxedList](#emailformat1boxedlist),
[EmailFormat1BoxedMap](#emailformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## EmailFormat1BoxedVoid
public record EmailFormat1BoxedVoid<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EmailFormat1BoxedBoolean
public record EmailFormat1BoxedBoolean<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EmailFormat1BoxedNumber
public record EmailFormat1BoxedNumber<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EmailFormat1BoxedString
public record EmailFormat1BoxedString<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EmailFormat1BoxedList
public record EmailFormat1BoxedList<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EmailFormat1BoxedMap
public record EmailFormat1BoxedMap<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [EmailFormat1Boxed](#emailformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
