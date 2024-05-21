# UnevaluatedpropertiesWithNullValuedInstanceProperties
unit_test_api.components.schemas.UnevaluatedpropertiesWithNullValuedInstanceProperties.java
public class UnevaluatedpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1](#unevaluatedpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| sealed interface | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed
public sealed interface UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid
public record UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean
public record UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber
public record UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString
public record UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList
public record UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap
public record UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1
public static class UnevaluatedpropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties.class](#unevaluatedproperties) |

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
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UnevaluatedPropertiesBoxed
public sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedVoid
public record UnevaluatedPropertiesBoxedVoid<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UnevaluatedProperties
public static class UnevaluatedProperties<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
