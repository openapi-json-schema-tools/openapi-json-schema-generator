# RefInProperty
org.openapijsonschematools.client.components.schemas.RefInProperty.java
class RefInProperty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInProperty.RefInProperty1Boxed](#refinproperty1boxed)<br> sealed interface for validated payloads |
| record | [RefInProperty.RefInProperty1BoxedVoid](#refinproperty1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RefInProperty.RefInProperty1BoxedBoolean](#refinproperty1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RefInProperty.RefInProperty1BoxedNumber](#refinproperty1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RefInProperty.RefInProperty1BoxedString](#refinproperty1boxedstring)<br> boxed class to store validated String payloads |
| record | [RefInProperty.RefInProperty1BoxedList](#refinproperty1boxedlist)<br> boxed class to store validated List payloads |
| record | [RefInProperty.RefInProperty1BoxedMap](#refinproperty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInProperty.RefInProperty1](#refinproperty1)<br> schema class |
| static class | [RefInProperty.RefInPropertyMapBuilder](#refinpropertymapbuilder)<br> builder for Map payloads |
| static class | [RefInProperty.RefInPropertyMap](#refinpropertymap)<br> output class for Map payloads |

## RefInProperty1Boxed
sealed interface RefInProperty1Boxed<br>
permits<br>
[RefInProperty1BoxedVoid](#refinproperty1boxedvoid),
[RefInProperty1BoxedBoolean](#refinproperty1boxedboolean),
[RefInProperty1BoxedNumber](#refinproperty1boxednumber),
[RefInProperty1BoxedString](#refinproperty1boxedstring),
[RefInProperty1BoxedList](#refinproperty1boxedlist),
[RefInProperty1BoxedMap](#refinproperty1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInProperty1BoxedVoid
data class RefInProperty1BoxedVoid<br>
implements [RefInProperty1Boxed](#refinproperty1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInProperty1BoxedBoolean
data class RefInProperty1BoxedBoolean<br>
implements [RefInProperty1Boxed](#refinproperty1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInProperty1BoxedNumber
data class RefInProperty1BoxedNumber<br>
implements [RefInProperty1Boxed](#refinproperty1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInProperty1BoxedString
data class RefInProperty1BoxedString<br>
implements [RefInProperty1Boxed](#refinproperty1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInProperty1BoxedList
data class RefInProperty1BoxedList<br>
implements [RefInProperty1Boxed](#refinproperty1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInProperty1BoxedMap
data class RefInProperty1BoxedMap<br>
implements [RefInProperty1Boxed](#refinproperty1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInProperty1BoxedMap([RefInPropertyMap](#refinpropertymap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInPropertyMap](#refinpropertymap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInProperty1
class RefInProperty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"a" to [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1)<br>)<br> |

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
| [RefInPropertyMap](#refinpropertymap) | validate(arg: [Map&lt;*, *&gt;](#refinpropertymapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [RefInProperty1BoxedString](#refinproperty1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RefInProperty1BoxedVoid](#refinproperty1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RefInProperty1BoxedNumber](#refinproperty1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RefInProperty1BoxedBoolean](#refinproperty1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RefInProperty1BoxedMap](#refinproperty1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#refinpropertymapbuilder), configuration: SchemaConfiguration) |
| [RefInProperty1BoxedList](#refinproperty1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RefInProperty1Boxed](#refinproperty1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RefInPropertyMapBuilder
class RefInPropertyMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInPropertyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Nothing?) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Boolean) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: String) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Int) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Float) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Long) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Double) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: List<Any?>) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | a(value: Map<String, Any?>) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Boolean) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: String) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Int) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Float) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Long) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Double) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [RefInPropertyMapBuilder](#refinpropertymapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## RefInPropertyMap
class RefInPropertyMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInPropertyMap](#refinpropertymap) | of([Map<String, Any?>](#refinpropertymapbuilder) arg, SchemaConfiguration configuration) |
| Any? | a()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
