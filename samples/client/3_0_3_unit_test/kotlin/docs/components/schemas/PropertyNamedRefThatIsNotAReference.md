# PropertyNamedRefThatIsNotAReference
org.openapijsonschematools.client.components.schemas.PropertyNamedRefThatIsNotAReference.java
class PropertyNamedRefThatIsNotAReference<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)<br> sealed interface for validated payloads |
| data class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedVoid](#propertynamedrefthatisnotareference1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedBoolean](#propertynamedrefthatisnotareference1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedNumber](#propertynamedrefthatisnotareference1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedString](#propertynamedrefthatisnotareference1boxedstring)<br> boxed class to store validated String payloads |
| data class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedList](#propertynamedrefthatisnotareference1boxedlist)<br> boxed class to store validated List payloads |
| data class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1BoxedMap](#propertynamedrefthatisnotareference1boxedmap)<br> boxed class to store validated Map payloads |
| class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1](#propertynamedrefthatisnotareference1)<br> schema class |
| class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder)<br> builder for Map payloads |
| class | [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap)<br> output class for Map payloads |
| sealed interface | [PropertyNamedRefThatIsNotAReference.RefBoxed](#refboxed)<br> sealed interface for validated payloads |
| data class | [PropertyNamedRefThatIsNotAReference.RefBoxedString](#refboxedstring)<br> boxed class to store validated String payloads |
| class | [PropertyNamedRefThatIsNotAReference.Ref](#ref)<br> schema class |

## PropertyNamedRefThatIsNotAReference1Boxed
sealed interface PropertyNamedRefThatIsNotAReference1Boxed<br>
permits<br>
[PropertyNamedRefThatIsNotAReference1BoxedVoid](#propertynamedrefthatisnotareference1boxedvoid),
[PropertyNamedRefThatIsNotAReference1BoxedBoolean](#propertynamedrefthatisnotareference1boxedboolean),
[PropertyNamedRefThatIsNotAReference1BoxedNumber](#propertynamedrefthatisnotareference1boxednumber),
[PropertyNamedRefThatIsNotAReference1BoxedString](#propertynamedrefthatisnotareference1boxedstring),
[PropertyNamedRefThatIsNotAReference1BoxedList](#propertynamedrefthatisnotareference1boxedlist),
[PropertyNamedRefThatIsNotAReference1BoxedMap](#propertynamedrefthatisnotareference1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertyNamedRefThatIsNotAReference1BoxedVoid
data class PropertyNamedRefThatIsNotAReference1BoxedVoid<br>
implements [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedBoolean
data class PropertyNamedRefThatIsNotAReference1BoxedBoolean<br>
implements [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedNumber
data class PropertyNamedRefThatIsNotAReference1BoxedNumber<br>
implements [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedString
data class PropertyNamedRefThatIsNotAReference1BoxedString<br>
implements [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedList
data class PropertyNamedRefThatIsNotAReference1BoxedList<br>
implements [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNamedRefThatIsNotAReference1BoxedMap
data class PropertyNamedRefThatIsNotAReference1BoxedMap<br>
implements [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReference1BoxedMap([PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertyNamedRefThatIsNotAReference1
class PropertyNamedRefThatIsNotAReference1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"\$ref" to [Ref::class.java](#ref))<br>)<br> |

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
| [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | validate(arg: [Map&lt;*, *&gt;](#propertynamedrefthatisnotareferencemapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1BoxedString](#propertynamedrefthatisnotareference1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1BoxedVoid](#propertynamedrefthatisnotareference1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1BoxedNumber](#propertynamedrefthatisnotareference1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1BoxedBoolean](#propertynamedrefthatisnotareference1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1BoxedMap](#propertynamedrefthatisnotareference1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#propertynamedrefthatisnotareferencemapbuilder), configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1BoxedList](#propertynamedrefthatisnotareference1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PropertyNamedRefThatIsNotAReference1Boxed](#propertynamedrefthatisnotareference1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## PropertyNamedRefThatIsNotAReferenceMapBuilder
class PropertyNamedRefThatIsNotAReferenceMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertyNamedRefThatIsNotAReferenceMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | reverseSolidusDollarSignRef(value: String) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Boolean) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: String) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Int) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Float) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Long) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Double) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [PropertyNamedRefThatIsNotAReferenceMapBuilder](#propertynamedrefthatisnotareferencemapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## PropertyNamedRefThatIsNotAReferenceMap
class PropertyNamedRefThatIsNotAReferenceMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertyNamedRefThatIsNotAReferenceMap](#propertynamedrefthatisnotareferencemap) | of([Map<String, Any?>](#propertynamedrefthatisnotareferencemapbuilder) arg, SchemaConfiguration configuration) |
| Any? | get(String key)<br>This schema has invalid Kotlin names so this method must be used when you access instance["\$ref"],  |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## RefBoxed
sealed interface RefBoxed<br>
permits<br>
[RefBoxedString](#refboxedstring)

sealed interface that stores validated payloads using boxed classes

## RefBoxedString
data class RefBoxedString<br>
implements [RefBoxed](#refboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ref
class Ref<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
