# UniqueitemsFalseValidation
org.openapijsonschematools.client.components.schemas.UniqueitemsFalseValidation.java
public class UniqueitemsFalseValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)<br> abstract sealed validated payload class |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1](#uniqueitemsfalsevalidation1)<br> schema class |

## UniqueitemsFalseValidation1Boxed
public static abstract sealed class UniqueitemsFalseValidation1Boxed<br>
permits<br>
[UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid),
[UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean),
[UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber),
[UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring),
[UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist),
[UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UniqueitemsFalseValidation1BoxedVoid
public static final class UniqueitemsFalseValidation1BoxedVoid<br>
extends [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UniqueitemsFalseValidation1BoxedBoolean
public static final class UniqueitemsFalseValidation1BoxedBoolean<br>
extends [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UniqueitemsFalseValidation1BoxedNumber
public static final class UniqueitemsFalseValidation1BoxedNumber<br>
extends [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UniqueitemsFalseValidation1BoxedString
public static final class UniqueitemsFalseValidation1BoxedString<br>
extends [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UniqueitemsFalseValidation1BoxedList
public static final class UniqueitemsFalseValidation1BoxedList<br>
extends [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UniqueitemsFalseValidation1BoxedMap
public static final class UniqueitemsFalseValidation1BoxedMap<br>
extends [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## UniqueitemsFalseValidation1
public static class UniqueitemsFalseValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = false |

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
| [UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
