# RegexFormat
org.openapijsonschematools.client.components.schemas.RegexFormat.java
public class RegexFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RegexFormat.RegexFormat1Boxed](#regexformat1boxed)<br> abstract sealed validated payload class |
| static class | [RegexFormat.RegexFormat1BoxedVoid](#regexformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RegexFormat.RegexFormat1BoxedBoolean](#regexformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RegexFormat.RegexFormat1BoxedNumber](#regexformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RegexFormat.RegexFormat1BoxedString](#regexformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RegexFormat.RegexFormat1BoxedList](#regexformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RegexFormat.RegexFormat1BoxedMap](#regexformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RegexFormat.RegexFormat1](#regexformat1)<br> schema class |

## RegexFormat1Boxed
public static abstract sealed class RegexFormat1Boxed<br>
permits<br>
[RegexFormat1BoxedVoid](#regexformat1boxedvoid),
[RegexFormat1BoxedBoolean](#regexformat1boxedboolean),
[RegexFormat1BoxedNumber](#regexformat1boxednumber),
[RegexFormat1BoxedString](#regexformat1boxedstring),
[RegexFormat1BoxedList](#regexformat1boxedlist),
[RegexFormat1BoxedMap](#regexformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RegexFormat1BoxedVoid
public static final class RegexFormat1BoxedVoid<br>
extends [RegexFormat1Boxed](#regexformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RegexFormat1BoxedBoolean
public static final class RegexFormat1BoxedBoolean<br>
extends [RegexFormat1Boxed](#regexformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RegexFormat1BoxedNumber
public static final class RegexFormat1BoxedNumber<br>
extends [RegexFormat1Boxed](#regexformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RegexFormat1BoxedString
public static final class RegexFormat1BoxedString<br>
extends [RegexFormat1Boxed](#regexformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RegexFormat1BoxedList
public static final class RegexFormat1BoxedList<br>
extends [RegexFormat1Boxed](#regexformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RegexFormat1BoxedMap
public static final class RegexFormat1BoxedMap<br>
extends [RegexFormat1Boxed](#regexformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## RegexFormat1
public static class RegexFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "regex"; |

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
| [RegexFormat1BoxedString](#regexformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RegexFormat1BoxedVoid](#regexformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RegexFormat1BoxedNumber](#regexformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RegexFormat1BoxedBoolean](#regexformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RegexFormat1BoxedMap](#regexformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RegexFormat1BoxedList](#regexformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
