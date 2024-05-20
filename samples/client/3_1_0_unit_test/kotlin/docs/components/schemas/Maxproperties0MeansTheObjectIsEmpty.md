# Maxproperties0MeansTheObjectIsEmpty
org.openapijsonschematools.client.components.schemas.Maxproperties0MeansTheObjectIsEmpty.java
class Maxproperties0MeansTheObjectIsEmpty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)<br> sealed interface for validated payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring)<br> boxed class to store validated String payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist)<br> boxed class to store validated List payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1](#maxproperties0meanstheobjectisempty1)<br> schema class |

## Maxproperties0MeansTheObjectIsEmpty1Boxed
sealed interface Maxproperties0MeansTheObjectIsEmpty1Boxed<br>
permits<br>
[Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid),
[Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean),
[Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber),
[Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring),
[Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist),
[Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Maxproperties0MeansTheObjectIsEmpty1BoxedVoid
data class Maxproperties0MeansTheObjectIsEmpty1BoxedVoid<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean
data class Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedNumber
data class Maxproperties0MeansTheObjectIsEmpty1BoxedNumber<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedString
data class Maxproperties0MeansTheObjectIsEmpty1BoxedString<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedList
data class Maxproperties0MeansTheObjectIsEmpty1BoxedList<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedMap
data class Maxproperties0MeansTheObjectIsEmpty1BoxedMap<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1
class Maxproperties0MeansTheObjectIsEmpty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Int | maxProperties = 0 |

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
| [Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
