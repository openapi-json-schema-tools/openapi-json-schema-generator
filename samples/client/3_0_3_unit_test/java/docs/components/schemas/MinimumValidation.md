# MinimumValidation
org.openapijsonschematools.client.components.schemas.MinimumValidation.java
public class MinimumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MinimumValidation.MinimumValidation1Boxed](#minimumvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [MinimumValidation.MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MinimumValidation.MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MinimumValidation.MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MinimumValidation.MinimumValidation1BoxedString](#minimumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MinimumValidation.MinimumValidation1BoxedList](#minimumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MinimumValidation.MinimumValidation1BoxedMap](#minimumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinimumValidation.MinimumValidation1](#minimumvalidation1)<br> schema class |

## MinimumValidation1Boxed
public static abstract sealed class MinimumValidation1Boxed<br>
permits<br>
[MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid),
[MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean),
[MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber),
[MinimumValidation1BoxedString](#minimumvalidation1boxedstring),
[MinimumValidation1BoxedList](#minimumvalidation1boxedlist),
[MinimumValidation1BoxedMap](#minimumvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MinimumValidation1BoxedVoid
public static final class MinimumValidation1BoxedVoid<br>
extends [MinimumValidation1Boxed](#minimumvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MinimumValidation1BoxedBoolean
public static final class MinimumValidation1BoxedBoolean<br>
extends [MinimumValidation1Boxed](#minimumvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MinimumValidation1BoxedNumber
public static final class MinimumValidation1BoxedNumber<br>
extends [MinimumValidation1Boxed](#minimumvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MinimumValidation1BoxedString
public static final class MinimumValidation1BoxedString<br>
extends [MinimumValidation1Boxed](#minimumvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MinimumValidation1BoxedList
public static final class MinimumValidation1BoxedList<br>
extends [MinimumValidation1Boxed](#minimumvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MinimumValidation1BoxedMap
public static final class MinimumValidation1BoxedMap<br>
extends [MinimumValidation1Boxed](#minimumvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MinimumValidation1
public static class MinimumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 1.1 |

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
| [MinimumValidation1BoxedString](#minimumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedMap](#minimumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MinimumValidation1BoxedList](#minimumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
