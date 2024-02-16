# MinpropertiesValidation
org.openapijsonschematools.client.components.schemas.MinpropertiesValidation.java
public class MinpropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MinpropertiesValidation.MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [MinpropertiesValidation.MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinpropertiesValidation.MinpropertiesValidation1](#minpropertiesvalidation1)<br> schema class |

## MinpropertiesValidation1Boxed
public static abstract sealed class MinpropertiesValidation1Boxed<br>
permits<br>
[MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid),
[MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean),
[MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber),
[MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring),
[MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist),
[MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MinpropertiesValidation1BoxedVoid
public static final class MinpropertiesValidation1BoxedVoid<br>
extends [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MinpropertiesValidation1BoxedBoolean
public static final class MinpropertiesValidation1BoxedBoolean<br>
extends [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MinpropertiesValidation1BoxedNumber
public static final class MinpropertiesValidation1BoxedNumber<br>
extends [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MinpropertiesValidation1BoxedString
public static final class MinpropertiesValidation1BoxedString<br>
extends [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MinpropertiesValidation1BoxedList
public static final class MinpropertiesValidation1BoxedList<br>
extends [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MinpropertiesValidation1BoxedMap
public static final class MinpropertiesValidation1BoxedMap<br>
extends [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
