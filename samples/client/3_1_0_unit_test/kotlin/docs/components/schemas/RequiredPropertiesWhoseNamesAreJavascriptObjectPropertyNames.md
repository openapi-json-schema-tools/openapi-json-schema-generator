# RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames
org.openapijsonschematools.client.components.schemas.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.java
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)<br> sealed interface for validated payloads |
| data class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1)<br> schema class |
| class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder)<br> builder for Map payloads |
| class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap)<br> output class for Map payloads |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed
sealed interface RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed<br>
permits<br>
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedvoid),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedboolean),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxednumber),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedstring),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedlist),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid
data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean
data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber
data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString
data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList
data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap
data class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap([RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"__proto__",<br>&nbsp;&nbsp;&nbsp;&nbsp;"constructor",<br>&nbsp;&nbsp;&nbsp;&nbsp;"toString"<br>)<br> |

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
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) | validate(arg: [Map&lt;*, *&gt;](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder), configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(key: String, value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | toString(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setConstructor(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setConstructor(value: Map<String, Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | toString(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | lowLineProto(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | lowLineProto(value: Map<String, Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | toString(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder(Map<String, Any?> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | lowLineProto(value: Map<String, Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setConstructor(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | lowLineProto(value: Map<String, Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | setConstructor(value: Map<String, Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Nothing?) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Boolean) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: String) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Int) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Float) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Long) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Double) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: List<Any?>) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | toString(value: Map<String, Any?>) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap
class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) | of([Map<String, Any?>](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | get(String key)<br>This schema has invalid Kotlin names so this method must be used when you access instance["__proto__"], instance["constructor"], instance["toString"],  |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
