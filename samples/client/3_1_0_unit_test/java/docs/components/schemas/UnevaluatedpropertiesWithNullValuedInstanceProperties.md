# UnevaluatedpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesWithNullValuedInstanceProperties.java
public class UnevaluatedpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedpropertiesWithNullValuedInstanceProperties1](#unevaluatedpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluatedpropertiesWithNullValuedInstanceProperties.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed
public static abstract sealed class UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid
public static final class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
extends [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean
public static final class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
extends [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber
public static final class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
extends [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString
public static final class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString<br>
extends [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList
public static final class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList<br>
extends [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap
public static final class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
extends [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedPropertiesBoxed
public static abstract sealed class UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedVoid
public static final class UnevaluatedPropertiesBoxedVoid<br>
extends [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UnevaluatedProperties
public static class UnevaluatedProperties<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
