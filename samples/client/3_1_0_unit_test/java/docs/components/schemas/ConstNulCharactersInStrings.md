# ConstNulCharactersInStrings
org.openapijsonschematools.client.components.schemas.ConstNulCharactersInStrings.java
public class ConstNulCharactersInStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)<br> abstract sealed validated payload class |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1](#constnulcharactersinstrings1)<br> schema class |
| enum | [ConstNulCharactersInStrings.StringConstNulCharactersInStringsConst](#stringconstnulcharactersinstringsconst)<br>String enum |

## ConstNulCharactersInStrings1Boxed
public static abstract sealed class ConstNulCharactersInStrings1Boxed<br>
permits<br>
[ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid),
[ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean),
[ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber),
[ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring),
[ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist),
[ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ConstNulCharactersInStrings1BoxedVoid
public static final class ConstNulCharactersInStrings1BoxedVoid<br>
extends [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ConstNulCharactersInStrings1BoxedBoolean
public static final class ConstNulCharactersInStrings1BoxedBoolean<br>
extends [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ConstNulCharactersInStrings1BoxedNumber
public static final class ConstNulCharactersInStrings1BoxedNumber<br>
extends [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ConstNulCharactersInStrings1BoxedString
public static final class ConstNulCharactersInStrings1BoxedString<br>
extends [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ConstNulCharactersInStrings1BoxedList
public static final class ConstNulCharactersInStrings1BoxedList<br>
extends [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ConstNulCharactersInStrings1BoxedMap
public static final class ConstNulCharactersInStrings1BoxedMap<br>
extends [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
