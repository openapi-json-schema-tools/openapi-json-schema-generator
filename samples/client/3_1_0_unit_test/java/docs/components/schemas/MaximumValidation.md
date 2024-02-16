# MaximumValidation
org.openapijsonschematools.client.components.schemas.MaximumValidation.java
public class MaximumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MaximumValidation.MaximumValidation1Boxed](#maximumvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [MaximumValidation.MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MaximumValidation.MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MaximumValidation.MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MaximumValidation.MaximumValidation1BoxedString](#maximumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MaximumValidation.MaximumValidation1BoxedList](#maximumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MaximumValidation.MaximumValidation1BoxedMap](#maximumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaximumValidation.MaximumValidation1](#maximumvalidation1)<br> schema class |

## MaximumValidation1Boxed
public static abstract sealed class MaximumValidation1Boxed<br>
permits<br>
[MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid),
[MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean),
[MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber),
[MaximumValidation1BoxedString](#maximumvalidation1boxedstring),
[MaximumValidation1BoxedList](#maximumvalidation1boxedlist),
[MaximumValidation1BoxedMap](#maximumvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MaximumValidation1BoxedVoid
public static final class MaximumValidation1BoxedVoid<br>
extends [MaximumValidation1Boxed](#maximumvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MaximumValidation1BoxedBoolean
public static final class MaximumValidation1BoxedBoolean<br>
extends [MaximumValidation1Boxed](#maximumvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MaximumValidation1BoxedNumber
public static final class MaximumValidation1BoxedNumber<br>
extends [MaximumValidation1Boxed](#maximumvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MaximumValidation1BoxedString
public static final class MaximumValidation1BoxedString<br>
extends [MaximumValidation1Boxed](#maximumvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MaximumValidation1BoxedList
public static final class MaximumValidation1BoxedList<br>
extends [MaximumValidation1Boxed](#maximumvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MaximumValidation1BoxedMap
public static final class MaximumValidation1BoxedMap<br>
extends [MaximumValidation1Boxed](#maximumvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MaximumValidation1
public static class MaximumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 3.0 |

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
| [MaximumValidation1BoxedString](#maximumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedMap](#maximumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaximumValidation1BoxedList](#maximumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
