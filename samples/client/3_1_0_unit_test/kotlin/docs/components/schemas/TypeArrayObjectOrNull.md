# TypeArrayObjectOrNull
org.openapijsonschematools.client.components.schemas.TypeArrayObjectOrNull.java
class TypeArrayObjectOrNull<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)<br> sealed interface for validated payloads |
| data class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1BoxedList](#typearrayobjectornull1boxedlist)<br> boxed class to store validated List payloads |
| data class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1BoxedMap](#typearrayobjectornull1boxedmap)<br> boxed class to store validated Map payloads |
| data class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1BoxedVoid](#typearrayobjectornull1boxedvoid)<br> boxed class to store validated null payloads |
| class | [TypeArrayObjectOrNull.TypeArrayObjectOrNull1](#typearrayobjectornull1)<br> schema class |

## TypeArrayObjectOrNull1Boxed
sealed interface TypeArrayObjectOrNull1Boxed<br>
permits<br>
[TypeArrayObjectOrNull1BoxedList](#typearrayobjectornull1boxedlist),
[TypeArrayObjectOrNull1BoxedMap](#typearrayobjectornull1boxedmap),
[TypeArrayObjectOrNull1BoxedVoid](#typearrayobjectornull1boxedvoid)

sealed interface that stores validated payloads using boxed classes

## TypeArrayObjectOrNull1BoxedList
data class TypeArrayObjectOrNull1BoxedList<br>
implements [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayObjectOrNull1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TypeArrayObjectOrNull1BoxedMap
data class TypeArrayObjectOrNull1BoxedMap<br>
implements [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayObjectOrNull1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TypeArrayObjectOrNull1BoxedVoid
data class TypeArrayObjectOrNull1BoxedVoid<br>
implements [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayObjectOrNull1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TypeArrayObjectOrNull1
class TypeArrayObjectOrNull1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.TypeArrayObjectOrNull

val configuration = SchemaConfiguration()

// null validation
val validatedPayload: Nothing? = TypeArrayObjectOrNull.TypeArrayObjectOrNull1.validate(
    null,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;List::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void::class.java<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [TypeArrayObjectOrNull1BoxedList](#typearrayobjectornull1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| FrozenMap<String, Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [TypeArrayObjectOrNull1BoxedMap](#typearrayobjectornull1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| [TypeArrayObjectOrNull1BoxedVoid](#typearrayobjectornull1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [TypeArrayObjectOrNull1Boxed](#typearrayobjectornull1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
