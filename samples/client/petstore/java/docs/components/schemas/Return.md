# Return
org.openapijsonschematools.client.components.schemas.Return.java
public class Return<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Return.Return1Boxed](#return1boxed)<br> sealed interface for validated payloads |
| record | [Return.Return1BoxedVoid](#return1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Return.Return1BoxedBoolean](#return1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Return.Return1BoxedNumber](#return1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Return.Return1BoxedString](#return1boxedstring)<br> boxed class to store validated String payloads |
| record | [Return.Return1BoxedList](#return1boxedlist)<br> boxed class to store validated List payloads |
| record | [Return.Return1BoxedMap](#return1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Return.Return1](#return1)<br> schema class |
| static class | [Return.ReturnMapBuilder1](#returnmapbuilder1)<br> builder for Map payloads |
| static class | [Return.ReturnMap](#returnmap)<br> output class for Map payloads |
| sealed interface | [Return.Return2Boxed](#return2boxed)<br> sealed interface for validated payloads |
| record | [Return.Return2BoxedNumber](#return2boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Return.Return2](#return2)<br> schema class |

## Return1Boxed
public sealed interface Return1Boxed<br>
permits<br>
[Return1BoxedVoid](#return1boxedvoid),
[Return1BoxedBoolean](#return1boxedboolean),
[Return1BoxedNumber](#return1boxednumber),
[Return1BoxedString](#return1boxedstring),
[Return1BoxedList](#return1boxedlist),
[Return1BoxedMap](#return1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Return1BoxedVoid
public record Return1BoxedVoid<br>
implements [Return1Boxed](#return1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return1BoxedBoolean
public record Return1BoxedBoolean<br>
implements [Return1Boxed](#return1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return1BoxedNumber
public record Return1BoxedNumber<br>
implements [Return1Boxed](#return1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return1BoxedString
public record Return1BoxedString<br>
implements [Return1Boxed](#return1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return1BoxedList
public record Return1BoxedList<br>
implements [Return1Boxed](#return1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return1BoxedMap
public record Return1BoxedMap<br>
implements [Return1Boxed](#return1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return1BoxedMap([ReturnMap](#returnmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ReturnMap](#returnmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return1
public static class Return1<br>
extends JsonSchema

A schema class that validates payloads

## Description
Model for testing reserved words

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("return", [Return2.class](#return2)))<br>)<br> |

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
| [ReturnMap](#returnmap) | validate([Map&lt;?, ?&gt;](#returnmapbuilder1) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Return1BoxedString](#return1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Return1BoxedVoid](#return1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Return1BoxedNumber](#return1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Return1BoxedBoolean](#return1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Return1BoxedMap](#return1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#returnmapbuilder1) arg, SchemaConfiguration configuration) |
| [Return1BoxedList](#return1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Return1Boxed](#return1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ReturnMapBuilder1
public class ReturnMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ReturnMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ReturnMapBuilder1](#returnmapbuilder1) | return(int value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | return(float value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, Void value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, boolean value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, String value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, int value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, float value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, long value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, double value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, List<?> value) |
| [ReturnMapBuilder1](#returnmapbuilder1) | additionalProperty(String key, Map<String, ?> value) |

## ReturnMap
public static class ReturnMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ReturnMap](#returnmap) | of([Map<String, ? extends @Nullable Object>](#returnmapbuilder1) arg, SchemaConfiguration configuration) |
| Number | return()<br>[optional] value must be a 32 bit integer |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Return2Boxed
public sealed interface Return2Boxed<br>
permits<br>
[Return2BoxedNumber](#return2boxednumber)

sealed interface that stores validated payloads using boxed classes

## Return2BoxedNumber
public record Return2BoxedNumber<br>
implements [Return2Boxed](#return2boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Return2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Return2
public static class Return2<br>
extends Int32JsonSchema.Int32JsonSchema1

A schema class that validates payloads

## Description
this is a reserved python keyword

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int32JsonSchema.Int32JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
