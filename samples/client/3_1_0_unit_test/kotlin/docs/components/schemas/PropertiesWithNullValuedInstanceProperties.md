# PropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.PropertiesWithNullValuedInstanceProperties.java
class PropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedVoid](#propertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedBoolean](#propertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedNumber](#propertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedString](#propertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| record | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedList](#propertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| record | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1BoxedMap](#propertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstanceProperties1](#propertieswithnullvaluedinstanceproperties1)<br> schema class |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWithNullValuedInstanceProperties.FooBoxed](#fooboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWithNullValuedInstanceProperties.FooBoxedVoid](#fooboxedvoid)<br> boxed class to store validated null payloads |
| static class | [PropertiesWithNullValuedInstanceProperties.Foo](#foo)<br> schema class |

## PropertiesWithNullValuedInstanceProperties1Boxed
sealed interface PropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[PropertiesWithNullValuedInstanceProperties1BoxedVoid](#propertieswithnullvaluedinstanceproperties1boxedvoid),
[PropertiesWithNullValuedInstanceProperties1BoxedBoolean](#propertieswithnullvaluedinstanceproperties1boxedboolean),
[PropertiesWithNullValuedInstanceProperties1BoxedNumber](#propertieswithnullvaluedinstanceproperties1boxednumber),
[PropertiesWithNullValuedInstanceProperties1BoxedString](#propertieswithnullvaluedinstanceproperties1boxedstring),
[PropertiesWithNullValuedInstanceProperties1BoxedList](#propertieswithnullvaluedinstanceproperties1boxedlist),
[PropertiesWithNullValuedInstanceProperties1BoxedMap](#propertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesWithNullValuedInstanceProperties1BoxedVoid
data class PropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
implements [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedBoolean
data class PropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
implements [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedNumber
data class PropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
implements [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedString
data class PropertiesWithNullValuedInstanceProperties1BoxedString<br>
implements [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedList
data class PropertiesWithNullValuedInstanceProperties1BoxedList<br>
implements [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1BoxedMap
data class PropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstanceProperties1BoxedMap([PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWithNullValuedInstanceProperties1
class PropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo" to [Foo::class.java](#foo))<br>)<br> |

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
| [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | validate(arg: [Map&lt;*, *&gt;](#propertieswithnullvaluedinstancepropertiesmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedString](#propertieswithnullvaluedinstanceproperties1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedVoid](#propertieswithnullvaluedinstanceproperties1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedNumber](#propertieswithnullvaluedinstanceproperties1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedBoolean](#propertieswithnullvaluedinstanceproperties1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedMap](#propertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#propertieswithnullvaluedinstancepropertiesmapbuilder), configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1BoxedList](#propertieswithnullvaluedinstanceproperties1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PropertiesWithNullValuedInstanceProperties1Boxed](#propertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## PropertiesWithNullValuedInstancePropertiesMapBuilder
class PropertiesWithNullValuedInstancePropertiesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWithNullValuedInstancePropertiesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | foo(value: Nothing?) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: String) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Int) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Float) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Long) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Double) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [PropertiesWithNullValuedInstancePropertiesMapBuilder](#propertieswithnullvaluedinstancepropertiesmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## PropertiesWithNullValuedInstancePropertiesMap
class PropertiesWithNullValuedInstancePropertiesMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWithNullValuedInstancePropertiesMap](#propertieswithnullvaluedinstancepropertiesmap) | of([Map<String, Any?>](#propertieswithnullvaluedinstancepropertiesmapbuilder) arg, SchemaConfiguration configuration) |
| Nothing? | foo()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FooBoxed
sealed interface FooBoxed<br>
permits<br>
[FooBoxedVoid](#fooboxedvoid)

sealed interface that stores validated payloads using boxed classes

## FooBoxedVoid
data class FooBoxedVoid<br>
implements [FooBoxed](#fooboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Foo
class Foo<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
