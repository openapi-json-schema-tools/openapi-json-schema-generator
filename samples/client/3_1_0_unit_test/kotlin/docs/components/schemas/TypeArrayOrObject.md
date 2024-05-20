# TypeArrayOrObject
org.openapijsonschematools.client.components.schemas.TypeArrayOrObject.java
class TypeArrayOrObject<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TypeArrayOrObject.TypeArrayOrObject1Boxed](#typearrayorobject1boxed)<br> sealed interface for validated payloads |
| data class | [TypeArrayOrObject.TypeArrayOrObject1BoxedList](#typearrayorobject1boxedlist)<br> boxed class to store validated List payloads |
| data class | [TypeArrayOrObject.TypeArrayOrObject1BoxedMap](#typearrayorobject1boxedmap)<br> boxed class to store validated Map payloads |
| class | [TypeArrayOrObject.TypeArrayOrObject1](#typearrayorobject1)<br> schema class |

## TypeArrayOrObject1Boxed
sealed interface TypeArrayOrObject1Boxed<br>
permits<br>
[TypeArrayOrObject1BoxedList](#typearrayorobject1boxedlist),
[TypeArrayOrObject1BoxedMap](#typearrayorobject1boxedmap)

sealed interface that stores validated payloads using boxed classes

## TypeArrayOrObject1BoxedList
data class TypeArrayOrObject1BoxedList<br>
implements [TypeArrayOrObject1Boxed](#typearrayorobject1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayOrObject1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TypeArrayOrObject1BoxedMap
data class TypeArrayOrObject1BoxedMap<br>
implements [TypeArrayOrObject1Boxed](#typearrayorobject1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TypeArrayOrObject1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TypeArrayOrObject1
class TypeArrayOrObject1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;List::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Map::class.java<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [TypeArrayOrObject1BoxedList](#typearrayorobject1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| FrozenMap<String, Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [TypeArrayOrObject1BoxedMap](#typearrayorobject1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [TypeArrayOrObject1Boxed](#typearrayorobject1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
