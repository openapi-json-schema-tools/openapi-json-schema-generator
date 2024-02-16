# ContainsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.ContainsWithNullInstanceElements.java
public class ContainsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)<br> abstract sealed validated payload class |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1](#containswithnullinstanceelements1)<br> schema class |
| static class | [ContainsWithNullInstanceElements.ContainsBoxed](#containsboxed)<br> abstract sealed validated payload class |
| static class | [ContainsWithNullInstanceElements.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ContainsWithNullInstanceElements.Contains](#contains)<br> schema class |

## ContainsWithNullInstanceElements1Boxed
public static abstract sealed class ContainsWithNullInstanceElements1Boxed<br>
permits<br>
[ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid),
[ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean),
[ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber),
[ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring),
[ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist),
[ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ContainsWithNullInstanceElements1BoxedVoid
public static final class ContainsWithNullInstanceElements1BoxedVoid<br>
extends [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ContainsWithNullInstanceElements1BoxedBoolean
public static final class ContainsWithNullInstanceElements1BoxedBoolean<br>
extends [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ContainsWithNullInstanceElements1BoxedNumber
public static final class ContainsWithNullInstanceElements1BoxedNumber<br>
extends [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ContainsWithNullInstanceElements1BoxedString
public static final class ContainsWithNullInstanceElements1BoxedString<br>
extends [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ContainsWithNullInstanceElements1BoxedList
public static final class ContainsWithNullInstanceElements1BoxedList<br>
extends [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ContainsWithNullInstanceElements1BoxedMap
public static final class ContainsWithNullInstanceElements1BoxedMap<br>
extends [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ContainsWithNullInstanceElements1
public static class ContainsWithNullInstanceElements1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | contains = [Contains.class](#contains) |

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
| [ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ContainsBoxed
public static abstract sealed class ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## ContainsBoxedVoid
public static final class ContainsBoxedVoid<br>
extends [ContainsBoxed](#containsboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Contains
public static class Contains<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
