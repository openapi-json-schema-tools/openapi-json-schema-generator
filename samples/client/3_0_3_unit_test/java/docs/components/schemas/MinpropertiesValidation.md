# MinpropertiesValidation
org.openapijsonschematools.client.components.schemas.MinpropertiesValidation.java
public class MinpropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinpropertiesValidation.MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MinpropertiesValidation.MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinpropertiesValidation.MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinpropertiesValidation.MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinpropertiesValidation.MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinpropertiesValidation.MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinpropertiesValidation.MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1](#minpropertiesvalidation1)<br> schema class |

## MinpropertiesValidation1Boxed
public sealed interface MinpropertiesValidation1Boxed<br>
permits<br>
[MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid),
[MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean),
[MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber),
[MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring),
[MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist),
[MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinpropertiesValidation1BoxedVoid
public record MinpropertiesValidation1BoxedVoid<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinpropertiesValidation1BoxedBoolean
public record MinpropertiesValidation1BoxedBoolean<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinpropertiesValidation1BoxedNumber
public record MinpropertiesValidation1BoxedNumber<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinpropertiesValidation1BoxedString
public record MinpropertiesValidation1BoxedString<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinpropertiesValidation1BoxedList
public record MinpropertiesValidation1BoxedList<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinpropertiesValidation1BoxedMap
public record MinpropertiesValidation1BoxedMap<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinpropertiesValidation1
public static class MinpropertiesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minProperties = 1 |

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
| [MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
