# RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames
org.openapijsonschematools.client.components.schemas.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.java
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)<br> sealed interface for validated payloads |
| record | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedstring)<br> boxed class to store validated String payloads |
| record | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedlist)<br> boxed class to store validated List payloads |
| record | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1)<br> schema class |
| static class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder)<br> builder for Map payloads |
| static class | [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames.RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap)<br> output class for Map payloads |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed
public sealed interface RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed<br>
permits<br>
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedvoid),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedboolean),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxednumber),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedstring),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedlist),
[RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid
public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean
public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber
public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString
public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList
public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap
public record RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap<br>
implements [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap([RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1
public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"__proto__",<br>&nbsp;&nbsp;&nbsp;&nbsp;"constructor",<br>&nbsp;&nbsp;&nbsp;&nbsp;"toString"<br>)<br> |

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
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) | validate([Map&lt;?, ?&gt;](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedString](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedVoid](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedNumber](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedBoolean](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1BoxedList](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNames1Boxed](#requiredpropertieswhosenamesarejavascriptobjectpropertynames1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | additionalProperty(String key, Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setToString(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | constructor(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | constructor(Map<String, ?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setToString(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap000Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap000builder) | setLowLineProto(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap001Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap001builder) | setLowLineProto(Map<String, ?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | setToString(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap010Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap010builder) | setLowLineProto(Map<String, ?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap100Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap100builder) | constructor(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder
public class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap011Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap011builder) | setLowLineProto(Map<String, ?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap101Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap101builder) | constructor(Map<String, ?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(Void value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(boolean value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(String value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(int value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(float value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(long value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(double value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(List<?> value) |
| [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap110Builder](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap110builder) | setToString(Map<String, ?> value) |

## RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap
public static class RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RequiredPropertiesWhoseNamesAreJavascriptObjectPropertyNamesMap](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmap) | of([Map<String, ? extends @Nullable Object>](#requiredpropertieswhosenamesarejavascriptobjectpropertynamesmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | constructor()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["__proto__"], instance["toString"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
