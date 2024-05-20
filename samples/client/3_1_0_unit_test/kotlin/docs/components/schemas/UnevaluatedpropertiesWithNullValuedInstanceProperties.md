# UnevaluatedpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesWithNullValuedInstanceProperties.java
class UnevaluatedpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist),
[UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid
data class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean
data class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber
data class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString
data class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList
data class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap
data class UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesWithNullValuedInstanceProperties1
class UnevaluatedpropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | unevaluatedProperties = [UnevaluatedProperties::class.java](#unevaluatedproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedString](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedVoid](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedNumber](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedMap](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1BoxedList](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesWithNullValuedInstanceProperties1Boxed](#unevaluatedpropertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedPropertiesBoxed
sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedVoid](#unevaluatedpropertiesboxedvoid)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedVoid
data class UnevaluatedPropertiesBoxedVoid<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedProperties
class UnevaluatedProperties<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
