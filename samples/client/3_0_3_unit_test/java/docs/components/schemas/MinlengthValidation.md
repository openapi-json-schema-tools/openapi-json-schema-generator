# MinlengthValidation
org.openapijsonschematools.client.components.schemas.MinlengthValidation.java
public class MinlengthValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MinlengthValidation.MinlengthValidation1Boxed](#minlengthvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [MinlengthValidation.MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MinlengthValidation.MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MinlengthValidation.MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MinlengthValidation.MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MinlengthValidation.MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MinlengthValidation.MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinlengthValidation.MinlengthValidation1](#minlengthvalidation1)<br> schema class |

## MinlengthValidation1Boxed
public static abstract sealed class MinlengthValidation1Boxed<br>
permits<br>
[MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid),
[MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean),
[MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber),
[MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring),
[MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist),
[MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MinlengthValidation1BoxedVoid
public static final class MinlengthValidation1BoxedVoid<br>
extends [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MinlengthValidation1BoxedBoolean
public static final class MinlengthValidation1BoxedBoolean<br>
extends [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MinlengthValidation1BoxedNumber
public static final class MinlengthValidation1BoxedNumber<br>
extends [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MinlengthValidation1BoxedString
public static final class MinlengthValidation1BoxedString<br>
extends [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MinlengthValidation1BoxedList
public static final class MinlengthValidation1BoxedList<br>
extends [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MinlengthValidation1BoxedMap
public static final class MinlengthValidation1BoxedMap<br>
extends [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MinlengthValidation1
public static class MinlengthValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minLength = 2 |

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
| [MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
