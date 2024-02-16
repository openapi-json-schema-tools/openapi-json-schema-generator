# MinitemsValidation
org.openapijsonschematools.client.components.schemas.MinitemsValidation.java
public class MinitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MinitemsValidation.MinitemsValidation1Boxed](#minitemsvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [MinitemsValidation.MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MinitemsValidation.MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MinitemsValidation.MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MinitemsValidation.MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MinitemsValidation.MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MinitemsValidation.MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinitemsValidation.MinitemsValidation1](#minitemsvalidation1)<br> schema class |

## MinitemsValidation1Boxed
public static abstract sealed class MinitemsValidation1Boxed<br>
permits<br>
[MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid),
[MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean),
[MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber),
[MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring),
[MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist),
[MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MinitemsValidation1BoxedVoid
public static final class MinitemsValidation1BoxedVoid<br>
extends [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MinitemsValidation1BoxedBoolean
public static final class MinitemsValidation1BoxedBoolean<br>
extends [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MinitemsValidation1BoxedNumber
public static final class MinitemsValidation1BoxedNumber<br>
extends [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MinitemsValidation1BoxedString
public static final class MinitemsValidation1BoxedString<br>
extends [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MinitemsValidation1BoxedList
public static final class MinitemsValidation1BoxedList<br>
extends [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MinitemsValidation1BoxedMap
public static final class MinitemsValidation1BoxedMap<br>
extends [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
