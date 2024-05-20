# NotMultipleTypes
org.openapijsonschematools.client.components.schemas.NotMultipleTypes.java
class NotMultipleTypes<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NotMultipleTypes.NotMultipleTypes1Boxed](#notmultipletypes1boxed)<br> sealed interface for validated payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring)<br> boxed class to store validated String payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist)<br> boxed class to store validated List payloads |
| record | [NotMultipleTypes.NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NotMultipleTypes.NotMultipleTypes1](#notmultipletypes1)<br> schema class |
| sealed interface | [NotMultipleTypes.NotBoxed](#notboxed)<br> sealed interface for validated payloads |
| record | [NotMultipleTypes.NotBoxedNumber](#notboxednumber)<br> boxed class to store validated Number payloads |
| record | [NotMultipleTypes.NotBoxedBoolean](#notboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NotMultipleTypes.Not](#not)<br> schema class |

## NotMultipleTypes1Boxed
sealed interface NotMultipleTypes1Boxed<br>
permits<br>
[NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid),
[NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean),
[NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber),
[NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring),
[NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist),
[NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NotMultipleTypes1BoxedVoid
data class NotMultipleTypes1BoxedVoid<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMultipleTypes1BoxedBoolean
data class NotMultipleTypes1BoxedBoolean<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMultipleTypes1BoxedNumber
data class NotMultipleTypes1BoxedNumber<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMultipleTypes1BoxedString
data class NotMultipleTypes1BoxedString<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMultipleTypes1BoxedList
data class NotMultipleTypes1BoxedList<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMultipleTypes1BoxedMap
data class NotMultipleTypes1BoxedMap<br>
implements [NotMultipleTypes1Boxed](#notmultipletypes1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotMultipleTypes1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotMultipleTypes1
class NotMultipleTypes1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not::class.java](#not) |

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
| [NotMultipleTypes1BoxedString](#notmultipletypes1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NotMultipleTypes1BoxedVoid](#notmultipletypes1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [NotMultipleTypes1BoxedNumber](#notmultipletypes1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [NotMultipleTypes1BoxedBoolean](#notmultipletypes1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [NotMultipleTypes1BoxedMap](#notmultipletypes1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [NotMultipleTypes1BoxedList](#notmultipletypes1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [NotMultipleTypes1Boxed](#notmultipletypes1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## NotBoxed
sealed interface NotBoxed<br>
permits<br>
[NotBoxedNumber](#notboxednumber),
[NotBoxedBoolean](#notboxedboolean)

sealed interface that stores validated payloads using boxed classes

## NotBoxedNumber
data class NotBoxedNumber<br>
implements [NotBoxed](#notboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NotBoxedBoolean
data class NotBoxedBoolean<br>
implements [NotBoxed](#notboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NotBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not
class Not<br>
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
import org.openapijsonschematools.client.components.schemas.NotMultipleTypes

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// int validation
val validatedPayload: Int = NotMultipleTypes.Not.validate(
    1L,
    configuration
)

// boolean validation
val validatedPayload: Boolean = NotMultipleTypes.Not.validate(
    true,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Boolean::class.java<br/>)<br/> |
| String | type = "int"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| [NotBoxedNumber](#notboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| [NotBoxedBoolean](#notboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [NotBoxed](#notboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
