# PropertiesWhoseNamesAreJavascriptObjectPropertyNames
unit_test_api.components.schemas.PropertiesWhoseNamesAreJavascriptObjectPropertyNames.java
public class PropertiesWhoseNamesAreJavascriptObjectPropertyNames<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
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
| sealed interface | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorBoxed](#constructorboxed)<br> sealed interface for validated payloads |
| record | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.ConstructorBoxedNumber](#constructorboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PropertiesWhoseNamesAreJavascriptObjectPropertyNames.Constructor](#constructor)<br> schema class |
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
public sealed interface PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed<br>
permits<br>
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#propertieswhosenamesarejavascriptobjectpropertynames1boxedlist),
[PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid
public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean
public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean<br>
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
| @Nullable Object | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber
public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString
public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList
public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap
public record PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap<br>
implements [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap([PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNames1
public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("__proto__", [Proto.class](#proto))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("toString", [ToString.class](#tostring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("constructor", [Constructor.class](#constructor)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | validate([Map&lt;?, ?&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#propertieswhosenamesarejavascriptobjectpropertynames1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#propertieswhosenamesarejavascriptobjectpropertynames1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#propertieswhosenamesarejavascriptobjectpropertynames1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#propertieswhosenamesarejavascriptobjectpropertynames1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#propertieswhosenamesarejavascriptobjectpropertynames1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#propertieswhosenamesarejavascriptobjectpropertynames1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#propertieswhosenamesarejavascriptobjectpropertynames1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder
public class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | lowLineProto(double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(Void value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(boolean value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(String value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(List<?> value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | toString(Map<String, ?> value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | constructor(double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, Void value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, boolean value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, String value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, int value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, float value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, long value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, double value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, List<?> value) |
| [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap
public static class PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#propertieswhosenamesarejavascriptobjectpropertynamesmap) | of([Map<String, ? extends @Nullable Object>](#propertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | toString()<br>[optional] |
| Number | constructor()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["__proto__"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ConstructorBoxed
public sealed interface ConstructorBoxed<br>
permits<br>
[ConstructorBoxedNumber](#constructorboxednumber)

sealed interface that stores validated payloads using boxed classes

## ConstructorBoxedNumber
public record ConstructorBoxedNumber<br>
implements [ConstructorBoxed](#constructorboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstructorBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Constructor
public static class Constructor<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ToStringBoxed
public sealed interface ToStringBoxed<br>
permits<br>
[ToStringBoxedVoid](#tostringboxedvoid),
[ToStringBoxedBoolean](#tostringboxedboolean),
[ToStringBoxedNumber](#tostringboxednumber),
[ToStringBoxedString](#tostringboxedstring),
[ToStringBoxedList](#tostringboxedlist),
[ToStringBoxedMap](#tostringboxedmap)

sealed interface that stores validated payloads using boxed classes

## ToStringBoxedVoid
public record ToStringBoxedVoid<br>
implements [ToStringBoxed](#tostringboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ToStringBoxedBoolean
public record ToStringBoxedBoolean<br>
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
| @Nullable Object | getData()<br>validated payload |

## ToStringBoxedNumber
public record ToStringBoxedNumber<br>
implements [ToStringBoxed](#tostringboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ToStringBoxedString
public record ToStringBoxedString<br>
implements [ToStringBoxed](#tostringboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ToStringBoxedList
public record ToStringBoxedList<br>
implements [ToStringBoxed](#tostringboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ToStringBoxedMap
public record ToStringBoxedMap<br>
implements [ToStringBoxed](#tostringboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringBoxedMap([ToStringMap](#tostringmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ToStringMap](#tostringmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ToString
public static class ToString<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("length", [Length.class](#length)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| [ToStringMap](#tostringmap) | validate([Map&lt;?, ?&gt;](#tostringmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ToStringBoxedString](#tostringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ToStringBoxedVoid](#tostringboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ToStringBoxedNumber](#tostringboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ToStringBoxedBoolean](#tostringboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ToStringBoxedMap](#tostringboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#tostringmapbuilder) arg, SchemaConfiguration configuration) |
| [ToStringBoxedList](#tostringboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ToStringBoxed](#tostringboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ToStringMapBuilder
public class ToStringMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ToStringMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ToStringMapBuilder](#tostringmapbuilder) | length(String value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, Void value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, boolean value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, String value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, int value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, float value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, long value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, double value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, List<?> value) |
| [ToStringMapBuilder](#tostringmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ToStringMap
public static class ToStringMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ToStringMap](#tostringmap) | of([Map<String, ? extends @Nullable Object>](#tostringmapbuilder) arg, SchemaConfiguration configuration) |
| String | length()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## LengthBoxed
public sealed interface LengthBoxed<br>
permits<br>
[LengthBoxedString](#lengthboxedstring)

sealed interface that stores validated payloads using boxed classes

## LengthBoxedString
public record LengthBoxedString<br>
implements [LengthBoxed](#lengthboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| LengthBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Length
public static class Length<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ProtoBoxed
public sealed interface ProtoBoxed<br>
permits<br>
[ProtoBoxedNumber](#protoboxednumber)

sealed interface that stores validated payloads using boxed classes

## ProtoBoxedNumber
public record ProtoBoxedNumber<br>
implements [ProtoBoxed](#protoboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ProtoBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Proto
public static class Proto<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
