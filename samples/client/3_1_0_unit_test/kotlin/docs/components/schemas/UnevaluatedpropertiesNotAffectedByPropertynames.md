# UnevaluatedpropertiesNotAffectedByPropertynames
org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesNotAffectedByPropertynames.java
class UnevaluatedpropertiesNotAffectedByPropertynames<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedpropertiesNotAffectedByPropertynames1](#unevaluatedpropertiesnotaffectedbypropertynames1)<br> schema class |
| sealed interface | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.UnevaluatedProperties](#unevaluatedproperties)<br> schema class |
| sealed interface | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNamesBoxed](#propertynamesboxed)<br> sealed interface for validated payloads |
| record | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNamesBoxedString](#propertynamesboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNames](#propertynames)<br> schema class |

## UnevaluatedpropertiesNotAffectedByPropertynames1Boxed
sealed interface UnevaluatedpropertiesNotAffectedByPropertynames1Boxed<br>
permits<br>
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist),
[UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid
data class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean
data class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber
data class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString
data class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList
data class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap
data class UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap<br>
implements [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedpropertiesNotAffectedByPropertynames1
class UnevaluatedpropertiesNotAffectedByPropertynames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | propertyNames = [PropertyNames::class.java](#propertynames) |
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
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedString](#unevaluatedpropertiesnotaffectedbypropertynames1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedVoid](#unevaluatedpropertiesnotaffectedbypropertynames1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedNumber](#unevaluatedpropertiesnotaffectedbypropertynames1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedBoolean](#unevaluatedpropertiesnotaffectedbypropertynames1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedMap](#unevaluatedpropertiesnotaffectedbypropertynames1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1BoxedList](#unevaluatedpropertiesnotaffectedbypropertynames1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UnevaluatedpropertiesNotAffectedByPropertynames1Boxed](#unevaluatedpropertiesnotaffectedbypropertynames1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedPropertiesBoxed
sealed interface UnevaluatedPropertiesBoxed<br>
permits<br>
[UnevaluatedPropertiesBoxedNumber](#unevaluatedpropertiesboxednumber)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedPropertiesBoxedNumber
data class UnevaluatedPropertiesBoxedNumber<br>
implements [UnevaluatedPropertiesBoxed](#unevaluatedpropertiesboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedProperties
class UnevaluatedProperties<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PropertyNamesBoxed
sealed interface PropertyNamesBoxed<br>
permits<br>
[PropertyNamesBoxedString](#propertynamesboxedstring)

sealed interface that stores validated payloads using boxed classes

## PropertyNamesBoxedString
data class PropertyNamesBoxedString<br>
implements [PropertyNamesBoxed](#propertynamesboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNames
class PropertyNames<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.UnevaluatedpropertiesNotAffectedByPropertynames

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// String validation
val validatedPayload: String = UnevaluatedpropertiesNotAffectedByPropertynames.PropertyNames.validate(
    "a",
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String::class.java<br/>)<br/> |
| Int | maxLength = 1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| [PropertyNamesBoxedString](#propertynamesboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertyNamesBoxed](#propertynamesboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
