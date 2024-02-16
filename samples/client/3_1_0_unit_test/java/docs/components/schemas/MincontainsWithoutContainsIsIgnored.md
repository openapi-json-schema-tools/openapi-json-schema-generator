# MincontainsWithoutContainsIsIgnored
org.openapijsonschematools.client.components.schemas.MincontainsWithoutContainsIsIgnored.java
public class MincontainsWithoutContainsIsIgnored<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)<br> abstract sealed validated payload class |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedVoid](#mincontainswithoutcontainsisignored1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedBoolean](#mincontainswithoutcontainsisignored1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedNumber](#mincontainswithoutcontainsisignored1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedString](#mincontainswithoutcontainsisignored1boxedstring)<br> boxed class to store validated String payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedList](#mincontainswithoutcontainsisignored1boxedlist)<br> boxed class to store validated List payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedMap](#mincontainswithoutcontainsisignored1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1](#mincontainswithoutcontainsisignored1)<br> schema class |

## MincontainsWithoutContainsIsIgnored1Boxed
public static abstract sealed class MincontainsWithoutContainsIsIgnored1Boxed<br>
permits<br>
[MincontainsWithoutContainsIsIgnored1BoxedVoid](#mincontainswithoutcontainsisignored1boxedvoid),
[MincontainsWithoutContainsIsIgnored1BoxedBoolean](#mincontainswithoutcontainsisignored1boxedboolean),
[MincontainsWithoutContainsIsIgnored1BoxedNumber](#mincontainswithoutcontainsisignored1boxednumber),
[MincontainsWithoutContainsIsIgnored1BoxedString](#mincontainswithoutcontainsisignored1boxedstring),
[MincontainsWithoutContainsIsIgnored1BoxedList](#mincontainswithoutcontainsisignored1boxedlist),
[MincontainsWithoutContainsIsIgnored1BoxedMap](#mincontainswithoutcontainsisignored1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## MincontainsWithoutContainsIsIgnored1BoxedVoid
public static final class MincontainsWithoutContainsIsIgnored1BoxedVoid<br>
extends [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedBoolean
public static final class MincontainsWithoutContainsIsIgnored1BoxedBoolean<br>
extends [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedNumber
public static final class MincontainsWithoutContainsIsIgnored1BoxedNumber<br>
extends [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedString
public static final class MincontainsWithoutContainsIsIgnored1BoxedString<br>
extends [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedList
public static final class MincontainsWithoutContainsIsIgnored1BoxedList<br>
extends [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedMap
public static final class MincontainsWithoutContainsIsIgnored1BoxedMap<br>
extends [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## MincontainsWithoutContainsIsIgnored1
public static class MincontainsWithoutContainsIsIgnored1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minContains = 1 |

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
| [MincontainsWithoutContainsIsIgnored1BoxedString](#mincontainswithoutcontainsisignored1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [MincontainsWithoutContainsIsIgnored1BoxedVoid](#mincontainswithoutcontainsisignored1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [MincontainsWithoutContainsIsIgnored1BoxedNumber](#mincontainswithoutcontainsisignored1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [MincontainsWithoutContainsIsIgnored1BoxedBoolean](#mincontainswithoutcontainsisignored1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [MincontainsWithoutContainsIsIgnored1BoxedMap](#mincontainswithoutcontainsisignored1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [MincontainsWithoutContainsIsIgnored1BoxedList](#mincontainswithoutcontainsisignored1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
