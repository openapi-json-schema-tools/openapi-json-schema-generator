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
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring)<br> boxed class to store validated String payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#propertieswhosenamesarejavascriptobjectpropertynames1boxedlist)<br> boxed class to store validated List payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNames1](#propertieswhosenamesarejavascriptobjectpropertynames1)<br> schema class |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorSchemaBoxed](#constructorschemaboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorSchemaBoxedNumber](#constructorschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorSchema](#constructorschema)<br> schema class |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxed](#tostringboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxedVoid](#tostringboxedvoid)<br> boxed class to store validated null payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxedBoolean](#tostringboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxedNumber](#tostringboxednumber)<br> boxed class to store validated Number payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxedString](#tostringboxedstring)<br> boxed class to store validated String payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxedList](#tostringboxedlist)<br> boxed class to store validated List payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringBoxedMap](#tostringboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToString](#tostring)<br> schema class |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringMapBuilder](#tostringmapbuilder)<br> builder for Map payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ToStringMap](#tostringmap)<br> output class for Map payloads |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.LengthBoxed](#lengthboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.LengthBoxedString](#lengthboxedstring)<br> boxed class to store validated String payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Length](#length)<br> schema class |
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ProtoBoxed](#protoboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ProtoBoxedNumber](#protoboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Proto](#proto)<br> schema class |

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

record that stores validated boolean payloads, sealed permits implementation

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
| Map<String, Class<? extends JsonSchema>> | properties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;"__proto__" to [Proto::class.java](#proto)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"toString" to [ToString::class.java](#tostring)),<br>&nbsp;&nbsp;&nbsp;&nbsp;"constructor" to [ConstructorSchema::class.java](#constructorschema))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | validate(arg: [Map&lt;?, ?&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder), configuration: SchemaConfiguration) |
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
| Any? | toString()<br>[optional] |
| Any? | get(String key)<br>This schema has invalid Kotlin names so this method must be used when you access instance["__proto__"], instance["constructor"],  |
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

## ToStringBoxed
sealed interface ToStringBoxed<br>
permits<br>
[ToStringBoxedVoid](#tostringboxedvoid),
[ToStringBoxedBoolean](#tostringboxedboolean),
[ToStringBoxedNumber](#tostringboxednumber),
[ToStringBoxedString](#tostringboxedstring),
[ToStringBoxedList](#tostringboxedlist),
[ToStringBoxedMap](#tostringboxedmap)

sealed interface that stores validated payloads using boxed classes

## ToStringBoxedVoid
data class ToStringBoxedVoid<br>
implements [ToStringBoxed](#tostringboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringBoxedBoolean
data class ToStringBoxedBoolean<br>
implements [ToStringBoxed](#tostringboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringBoxedNumber
data class ToStringBoxedNumber<br>
implements [ToStringBoxed](#tostringboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringBoxedString
data class ToStringBoxedString<br>
implements [ToStringBoxed](#tostringboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringBoxedList
data class ToStringBoxedList<br>
implements [ToStringBoxed](#tostringboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToStringBoxedMap
data class ToStringBoxedMap<br>
implements [ToStringBoxed](#tostringboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedMap([ToStringMap](#tostringmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ToStringMap](#tostringmap) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ToString
class ToString<br>
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
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| [ToStringMap](#tostringmap) | validate(arg: [Map&lt;?, ?&gt;](#tostringmapbuilder), configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ToStringBoxedString](#tostringboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ToStringBoxedVoid](#tostringboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ToStringBoxedNumber](#tostringboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ToStringBoxedBoolean](#tostringboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ToStringBoxedMap](#tostringboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#tostringmapbuilder), configuration: SchemaConfiguration) |
| [ToStringBoxedList](#tostringboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ToStringBoxed](#tostringboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
