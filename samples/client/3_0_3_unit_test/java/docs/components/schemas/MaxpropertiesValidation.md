# MaxpropertiesValidation
org.openapijsonschematools.client.components.schemas.MaxpropertiesValidation.java
public class MaxpropertiesValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1](#maxpropertiesvalidation1)<br> schema class |

## MaxpropertiesValidation1Boxed
public static abstract sealed class MaxpropertiesValidation1Boxed<br>
permits<br>
[MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid),
[MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean),
[MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber),
[MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring),
[MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist),
[MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MaxpropertiesValidation1BoxedVoid
public static final class MaxpropertiesValidation1BoxedVoid<br>
extends [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MaxpropertiesValidation1BoxedBoolean
public static final class MaxpropertiesValidation1BoxedBoolean<br>
extends [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MaxpropertiesValidation1BoxedNumber
public static final class MaxpropertiesValidation1BoxedNumber<br>
extends [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MaxpropertiesValidation1BoxedString
public static final class MaxpropertiesValidation1BoxedString<br>
extends [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MaxpropertiesValidation1BoxedList
public static final class MaxpropertiesValidation1BoxedList<br>
extends [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MaxpropertiesValidation1BoxedMap
public static final class MaxpropertiesValidation1BoxedMap<br>
extends [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MaxpropertiesValidation1
public static class MaxpropertiesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxProperties = 2 |

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
| [MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
