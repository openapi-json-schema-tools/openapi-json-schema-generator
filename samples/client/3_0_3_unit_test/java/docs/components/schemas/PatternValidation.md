# PatternValidation
org.openapijsonschematools.client.components.schemas.PatternValidation.java
public class PatternValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PatternValidation.PatternValidation1Boxed](#patternvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [PatternValidation.PatternValidation1BoxedVoid](#patternvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PatternValidation.PatternValidation1BoxedBoolean](#patternvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [PatternValidation.PatternValidation1BoxedNumber](#patternvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [PatternValidation.PatternValidation1BoxedString](#patternvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [PatternValidation.PatternValidation1BoxedList](#patternvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PatternValidation.PatternValidation1BoxedMap](#patternvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternValidation.PatternValidation1](#patternvalidation1)<br> schema class |

## PatternValidation1Boxed
public static abstract sealed class PatternValidation1Boxed<br>
permits<br>
[PatternValidation1BoxedVoid](#patternvalidation1boxedvoid),
[PatternValidation1BoxedBoolean](#patternvalidation1boxedboolean),
[PatternValidation1BoxedNumber](#patternvalidation1boxednumber),
[PatternValidation1BoxedString](#patternvalidation1boxedstring),
[PatternValidation1BoxedList](#patternvalidation1boxedlist),
[PatternValidation1BoxedMap](#patternvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## PatternValidation1BoxedVoid
public static final class PatternValidation1BoxedVoid<br>
extends [PatternValidation1Boxed](#patternvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## PatternValidation1BoxedBoolean
public static final class PatternValidation1BoxedBoolean<br>
extends [PatternValidation1Boxed](#patternvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## PatternValidation1BoxedNumber
public static final class PatternValidation1BoxedNumber<br>
extends [PatternValidation1Boxed](#patternvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## PatternValidation1BoxedString
public static final class PatternValidation1BoxedString<br>
extends [PatternValidation1Boxed](#patternvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## PatternValidation1BoxedList
public static final class PatternValidation1BoxedList<br>
extends [PatternValidation1Boxed](#patternvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## PatternValidation1BoxedMap
public static final class PatternValidation1BoxedMap<br>
extends [PatternValidation1Boxed](#patternvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## PatternValidation1
public static class PatternValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^a*$"<br>)<br> |

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
| [PatternValidation1BoxedString](#patternvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PatternValidation1BoxedVoid](#patternvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PatternValidation1BoxedNumber](#patternvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PatternValidation1BoxedBoolean](#patternvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PatternValidation1BoxedMap](#patternvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [PatternValidation1BoxedList](#patternvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
