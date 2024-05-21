# MinitemsValidation
unit_test_api.components.schemas.MinitemsValidation.java
public class MinitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinitemsValidation.MinitemsValidation1Boxed](#minitemsvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MinitemsValidation.MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinitemsValidation.MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinitemsValidation.MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinitemsValidation.MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinitemsValidation.MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinitemsValidation.MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinitemsValidation.MinitemsValidation1](#minitemsvalidation1)<br> schema class |

## MinitemsValidation1Boxed
public sealed interface MinitemsValidation1Boxed<br>
permits<br>
[MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid),
[MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean),
[MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber),
[MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring),
[MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist),
[MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinitemsValidation1BoxedVoid
public record MinitemsValidation1BoxedVoid<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinitemsValidation1BoxedBoolean
public record MinitemsValidation1BoxedBoolean<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinitemsValidation1BoxedNumber
public record MinitemsValidation1BoxedNumber<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinitemsValidation1BoxedString
public record MinitemsValidation1BoxedString<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinitemsValidation1BoxedList
public record MinitemsValidation1BoxedList<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinitemsValidation1BoxedMap
public record MinitemsValidation1BoxedMap<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## MinitemsValidation1
public static class MinitemsValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minItems = 1 |

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
| [MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [MinitemsValidation1Boxed](#minitemsvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
