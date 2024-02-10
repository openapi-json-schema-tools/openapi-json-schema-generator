# ExclusivemaximumValidation
org.openapijsonschematools.client.components.schemas.ExclusivemaximumValidation.java
public class ExclusivemaximumValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1](#exclusivemaximumvalidation1)<br> schema class |

## ExclusivemaximumValidation1Boxed
public static abstract sealed class ExclusivemaximumValidation1Boxed<br>
permits<br>
[ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid),
[ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean),
[ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber),
[ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring),
[ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist),
[ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ExclusivemaximumValidation1BoxedVoid
public static final class ExclusivemaximumValidation1BoxedVoid<br>
extends [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ExclusivemaximumValidation1BoxedBoolean
public static final class ExclusivemaximumValidation1BoxedBoolean<br>
extends [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ExclusivemaximumValidation1BoxedNumber
public static final class ExclusivemaximumValidation1BoxedNumber<br>
extends [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ExclusivemaximumValidation1BoxedString
public static final class ExclusivemaximumValidation1BoxedString<br>
extends [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ExclusivemaximumValidation1BoxedList
public static final class ExclusivemaximumValidation1BoxedList<br>
extends [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ExclusivemaximumValidation1BoxedMap
public static final class ExclusivemaximumValidation1BoxedMap<br>
extends [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ExclusivemaximumValidation1
public static class ExclusivemaximumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMaximum = 3.0 |

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
| [ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
