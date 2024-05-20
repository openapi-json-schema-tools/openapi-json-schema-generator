# PropertiesWhoseNamesAreJavascriptObjectPropertyNames
org.openapijsonschematools.client.components.schemas.PropertiesWhoseNamesAreJavascriptObjectPropertyNames.java
class PropertiesWhoseNamesAreJavascriptObjectPropertyNames<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)<br> sealed interface for validated payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring)<br> boxed class to store validated String payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#propertieswhosenamesarejavascriptobjectpropertynames1boxedlist)<br> boxed class to store validated List payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1](#propertieswhosenamesarejavascriptobjectpropertynames1)<br> schema class |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder)<br> builder for Map payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorSchemaBoxed](#constructorschemaboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorSchemaBoxedNumber](#constructorschemaboxednumber)<br> boxed class to store validated Number payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorSchema](#constructorschema)<br> schema class |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxed](#tostringschemaboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxedVoid](#tostringschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxedBoolean](#tostringschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxedNumber](#tostringschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxedString](#tostringschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxedList](#tostringschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchemaBoxedMap](#tostringschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringSchema](#tostringschema)<br> schema class |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringMapBuilder](#tostringmapbuilder)<br> builder for Map payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringMap](#tostringmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.LengthBoxed](#lengthboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.LengthBoxedString](#lengthboxedstring)<br> boxed class to store validated String payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Length](#length)<br> schema class |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ProtoBoxed](#protoboxed)<br> sealed interface for validated payloads |
| data class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ProtoBoxedNumber](#protoboxednumber)<br> boxed class to store validated Number payloads |
| class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Proto](#proto)<br> schema class |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed
sealed interface PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed<br>
permits<br>
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#propertieswhosenamesarejavascriptobjectpropertynames1boxedlist),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid
data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean
data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber
data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString
data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList
data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap
data class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap([PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1
class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"__proto__" to [Proto::class.java](#proto)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"toString" to [ToStringSchema::class.java](#tostringschema)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"constructor" to [ConstructorSchema::class.java](#constructorschema))<br>)<br> |

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
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | validate(arg: [Map&lt;*, *&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap) | validateAndBox([Map&lt;*, *&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder), configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#propertieswhosenamesarejavascriptobjectpropertynames1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder
class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(value: Int) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(value: Float) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(value: Long) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(value: Double) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Nothing?) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Boolean) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: String) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Int) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Float) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Long) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Double) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: List<Any?>) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(value: Map<String, Any?>) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setConstructor(value: Int) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setConstructor(value: Float) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setConstructor(value: Long) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | setConstructor(value: Double) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: String) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Int) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Float) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Long) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Double) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap
class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | of([Map<String, Any?>](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| Any? | get(String key)<br>This schema has invalid Kotlin names so this method must be used when you access instance["__proto__"], instance["toString"], instance["constructor"],  |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ConstructorSchemaBoxed
sealed interface ConstructorSchemaBoxed<br>
permits<br>
[ConstructorSchemaBoxedNumber](#constructorschemaboxednumber)

sealed interface that stores validated payloads using boxed classes

## ConstructorSchemaBoxedNumber
data class ConstructorSchemaBoxedNumber<br>
implements [ConstructorSchemaBoxed](#constructorschemaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstructorSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstructorSchema
class ConstructorSchema<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ToStringSchemaBoxed
sealed interface ToStringSchemaBoxed<br>
permits<br>
[ToStringSchemaBoxedVoid](#tostringschemaboxedvoid),
[ToStringSchemaBoxedBoolean](#tostringschemaboxedboolean),
[ToStringSchemaBoxedNumber](#tostringschemaboxednumber),
[ToStringSchemaBoxedString](#tostringschemaboxedstring),
[ToStringSchemaBoxedList](#tostringschemaboxedlist),
[ToStringSchemaBoxedMap](#tostringschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## ToStringSchemaBoxedVoid
data class ToStringSchemaBoxedVoid<br>
implements [ToStringSchemaBoxed](#tostringschemaboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringSchemaBoxedBoolean
data class ToStringSchemaBoxedBoolean<br>
implements [ToStringSchemaBoxed](#tostringschemaboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringSchemaBoxedNumber
data class ToStringSchemaBoxedNumber<br>
implements [ToStringSchemaBoxed](#tostringschemaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringSchemaBoxedString
data class ToStringSchemaBoxedString<br>
implements [ToStringSchemaBoxed](#tostringschemaboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringSchemaBoxedList
data class ToStringSchemaBoxedList<br>
implements [ToStringSchemaBoxed](#tostringschemaboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringSchemaBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringSchemaBoxedMap
data class ToStringSchemaBoxedMap<br>
implements [ToStringSchemaBoxed](#tostringschemaboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringSchemaBoxedMap([ToStringMap](#tostringmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ToStringMap](#tostringmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringSchema
class ToStringSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"length" to [Length::class.java](#length))<br>)<br> |

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
| [ToStringMap](#tostringmap) | validate(arg: [Map&lt;*, *&gt;](#tostringmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ToStringSchemaBoxedString](#tostringschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ToStringSchemaBoxedVoid](#tostringschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ToStringSchemaBoxedNumber](#tostringschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ToStringSchemaBoxedBoolean](#tostringschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ToStringSchemaBoxedMap](#tostringschemaboxedmap) | validateAndBox([Map&lt;*, *&gt;](#tostringmapbuilder), configuration: SchemaConfiguration) |
| [ToStringSchemaBoxedList](#tostringschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ToStringSchemaBoxed](#tostringschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ToStringMapBuilder
class ToStringMapBuilder<br>
builder for `Map<String, Any?>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Any?> | build()<br>Returns map input that should be used with Schema.validate |
| [ToStringMapBuilder](#tostringmapbuilder) | length(value: String) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Nothing?) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Boolean) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: String) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Int) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Float) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Long) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Double) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: List<Any?>) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(key: String, value: Map<String, Any?>) |

## ToStringMap
class ToStringMap<br>
extends FrozenMap<String, Any?>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ToStringMap](#tostringmap) | of([Map<String, Any?>](#tostringmapbuilder) arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| Any? | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## LengthBoxed
sealed interface LengthBoxed<br>
permits<br>
[LengthBoxedString](#lengthboxedstring)

sealed interface that stores validated payloads using boxed classes

## LengthBoxedString
data class LengthBoxedString<br>
implements [LengthBoxed](#lengthboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| LengthBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Length
class Length<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ProtoBoxed
sealed interface ProtoBoxed<br>
permits<br>
[ProtoBoxedNumber](#protoboxednumber)

sealed interface that stores validated payloads using boxed classes

## ProtoBoxedNumber
data class ProtoBoxedNumber<br>
implements [ProtoBoxed](#protoboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ProtoBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Proto
class Proto<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
