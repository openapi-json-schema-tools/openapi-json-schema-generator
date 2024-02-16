# RelativeJsonPointerFormat
org.openapijsonschematools.client.components.schemas.RelativeJsonPointerFormat.java
public class RelativeJsonPointerFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)<br> abstract sealed validated payload class |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1](#relativejsonpointerformat1)<br> schema class |

## RelativeJsonPointerFormat1Boxed
public static abstract sealed class RelativeJsonPointerFormat1Boxed<br>
permits<br>
[RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid),
[RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean),
[RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber),
[RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring),
[RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist),
[RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## RelativeJsonPointerFormat1BoxedVoid
public static final class RelativeJsonPointerFormat1BoxedVoid<br>
extends [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RelativeJsonPointerFormat1BoxedBoolean
public static final class RelativeJsonPointerFormat1BoxedBoolean<br>
extends [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RelativeJsonPointerFormat1BoxedNumber
public static final class RelativeJsonPointerFormat1BoxedNumber<br>
extends [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RelativeJsonPointerFormat1BoxedString
public static final class RelativeJsonPointerFormat1BoxedString<br>
extends [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RelativeJsonPointerFormat1BoxedList
public static final class RelativeJsonPointerFormat1BoxedList<br>
extends [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RelativeJsonPointerFormat1BoxedMap
public static final class RelativeJsonPointerFormat1BoxedMap<br>
extends [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## RelativeJsonPointerFormat1
public static class RelativeJsonPointerFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "relative-json-pointer"; |

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
| [RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
