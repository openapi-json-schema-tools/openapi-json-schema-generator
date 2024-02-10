# ExclusiveminimumValidation
org.openapijsonschematools.client.components.schemas.ExclusiveminimumValidation.java
public class ExclusiveminimumValidation

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)<br> abstract sealed validated payload class |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1](#exclusiveminimumvalidation1)<br> schema class |

## ExclusiveminimumValidation1Boxed
public static abstract sealed class ExclusiveminimumValidation1Boxed<br>
permits<br>
[ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid),
[ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean),
[ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber),
[ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring),
[ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist),
[ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ExclusiveminimumValidation1BoxedVoid
public static final class ExclusiveminimumValidation1BoxedVoid<br>
extends [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ExclusiveminimumValidation1BoxedBoolean
public static final class ExclusiveminimumValidation1BoxedBoolean<br>
extends [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ExclusiveminimumValidation1BoxedNumber
public static final class ExclusiveminimumValidation1BoxedNumber<br>
extends [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ExclusiveminimumValidation1BoxedString
public static final class ExclusiveminimumValidation1BoxedString<br>
extends [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ExclusiveminimumValidation1BoxedList
public static final class ExclusiveminimumValidation1BoxedList<br>
extends [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ExclusiveminimumValidation1BoxedMap
public static final class ExclusiveminimumValidation1BoxedMap<br>
extends [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ExclusiveminimumValidation1
public static class ExclusiveminimumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMinimum = 1.1 |

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
| [ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
