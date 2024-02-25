# ConstNulCharactersInStrings
org.openapijsonschematools.client.components.schemas.ConstNulCharactersInStrings.java
public class ConstNulCharactersInStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)<br> sealed interface for validated payloads |
| record | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring)<br> boxed class to store validated String payloads |
| record | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist)<br> boxed class to store validated List payloads |
| record | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1](#constnulcharactersinstrings1)<br> schema class |
| enum | [ConstNulCharactersInStrings.StringConstNulCharactersInStringsConst](#stringconstnulcharactersinstringsconst)<br>String enum |

## ConstNulCharactersInStrings1Boxed
public sealed interface ConstNulCharactersInStrings1Boxed<br>
permits<br>
[ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid),
[ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean),
[ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber),
[ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring),
[ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist),
[ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ConstNulCharactersInStrings1BoxedVoid
public record ConstNulCharactersInStrings1BoxedVoid<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedBoolean
public record ConstNulCharactersInStrings1BoxedBoolean<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedNumber
public record ConstNulCharactersInStrings1BoxedNumber<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedString
public record ConstNulCharactersInStrings1BoxedString<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedList
public record ConstNulCharactersInStrings1BoxedList<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedMap
public record ConstNulCharactersInStrings1BoxedMap<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ConstNulCharactersInStrings1
public static class ConstNulCharactersInStrings1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| @Nullable Object | constValue = "hello\0there" |

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
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringConstNulCharactersInStringsConst
public enum StringConstNulCharactersInStringsConst<br>
extends `Enum<StringConstNulCharactersInStringsConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| HELLO_NULL_THERE | value = "hello\0there" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
