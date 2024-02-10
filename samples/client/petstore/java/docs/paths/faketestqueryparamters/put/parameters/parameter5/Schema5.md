# Schema5
public class Schema5

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema5.Schema51Boxed](#schema51boxed)<br> sealed validated payload class |
| static class | [Schema5.Schema51BoxedVoid](#schema51boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Schema5.Schema51BoxedBoolean](#schema51boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Schema5.Schema51BoxedNumber](#schema51boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema5.Schema51BoxedString](#schema51boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema5.Schema51BoxedList](#schema51boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema5.Schema51BoxedMap](#schema51boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema5.Schema51](#schema51)<br> schema class |

## Schema51Boxed
public static abstract sealed class Schema51Boxed<br>
permits<br>
[Schema51BoxedVoid](#schema51boxedvoid),
[Schema51BoxedBoolean](#schema51boxedboolean),
[Schema51BoxedNumber](#schema51boxednumber),
[Schema51BoxedString](#schema51boxedstring),
[Schema51BoxedList](#schema51boxedlist),
[Schema51BoxedMap](#schema51boxedmap)

A sealed class that stores validated payloads using boxed classes

## Schema51BoxedVoid
public static final class Schema51BoxedVoid<br>
extends Schema51Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema51BoxedBoolean
public static final class Schema51BoxedBoolean<br>
extends Schema51Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema51BoxedNumber
public static final class Schema51BoxedNumber<br>
extends Schema51Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema51BoxedString
public static final class Schema51BoxedString<br>
extends Schema51Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema51BoxedList
public static final class Schema51BoxedList<br>
extends Schema51Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema51BoxedMap
public static final class Schema51BoxedMap<br>
extends Schema51Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema51
public static class Schema51<br>
extends [StringWithValidation.StringWithValidation1](../../../components/schemas/StringWithValidation.md#stringwithvalidation1)

A schema class that validates payloads
