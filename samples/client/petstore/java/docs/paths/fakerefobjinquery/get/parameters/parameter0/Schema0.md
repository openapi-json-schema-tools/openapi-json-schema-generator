# Schema0
public class Schema0

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [Schema0.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Schema0.Schema01BoxedBoolean](#schema01boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Schema0.Schema01BoxedNumber](#schema01boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema0.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema0.Schema01BoxedList](#schema01boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema0.Schema01BoxedMap](#schema01boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema0.Schema01](#schema01)<br> schema class |

## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid),
[Schema01BoxedBoolean](#schema01boxedboolean),
[Schema01BoxedNumber](#schema01boxednumber),
[Schema01BoxedString](#schema01boxedstring),
[Schema01BoxedList](#schema01boxedlist),
[Schema01BoxedMap](#schema01boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema01BoxedVoid
public static final class Schema01BoxedVoid<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema01BoxedBoolean
public static final class Schema01BoxedBoolean<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema01BoxedNumber
public static final class Schema01BoxedNumber<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema01BoxedString
public static final class Schema01BoxedString<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema01BoxedList
public static final class Schema01BoxedList<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema01BoxedMap
public static final class Schema01BoxedMap<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema01
public static class Schema01<br>
extends [Foo.Foo1](../../../components/schemas/Foo.md#foo1)

A schema class that validates payloads
