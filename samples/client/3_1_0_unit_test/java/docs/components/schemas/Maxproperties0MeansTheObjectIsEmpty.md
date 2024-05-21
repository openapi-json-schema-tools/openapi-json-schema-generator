# Maxproperties0MeansTheObjectIsEmpty
unit_test_api.components.schemas.Maxproperties0MeansTheObjectIsEmpty.java
public class Maxproperties0MeansTheObjectIsEmpty<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)<br> sealed interface for validated payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring)<br> boxed class to store validated String payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist)<br> boxed class to store validated List payloads |
| record | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1](#maxproperties0meanstheobjectisempty1)<br> schema class |

## Maxproperties0MeansTheObjectIsEmpty1Boxed
public sealed interface Maxproperties0MeansTheObjectIsEmpty1Boxed<br>
permits<br>
[Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid),
[Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean),
[Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber),
[Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring),
[Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist),
[Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Maxproperties0MeansTheObjectIsEmpty1BoxedVoid
public record Maxproperties0MeansTheObjectIsEmpty1BoxedVoid<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean
public record Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedNumber
public record Maxproperties0MeansTheObjectIsEmpty1BoxedNumber<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedString
public record Maxproperties0MeansTheObjectIsEmpty1BoxedString<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedList
public record Maxproperties0MeansTheObjectIsEmpty1BoxedList<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedMap
public record Maxproperties0MeansTheObjectIsEmpty1BoxedMap<br>
implements [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1
public static class Maxproperties0MeansTheObjectIsEmpty1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxProperties = 0 |

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
| [Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
