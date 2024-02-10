# Maxproperties0MeansTheObjectIsEmpty
org.openapijsonschematools.client.components.schemas.Maxproperties0MeansTheObjectIsEmpty.java
public class Maxproperties0MeansTheObjectIsEmpty

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)<br> abstract sealed validated payload class |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Maxproperties0MeansTheObjectIsEmpty.Maxproperties0MeansTheObjectIsEmpty1](#maxproperties0meanstheobjectisempty1)<br> schema class |

## Maxproperties0MeansTheObjectIsEmpty1Boxed
public static abstract sealed class Maxproperties0MeansTheObjectIsEmpty1Boxed<br>
permits<br>
[Maxproperties0MeansTheObjectIsEmpty1BoxedVoid](#maxproperties0meanstheobjectisempty1boxedvoid),
[Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean](#maxproperties0meanstheobjectisempty1boxedboolean),
[Maxproperties0MeansTheObjectIsEmpty1BoxedNumber](#maxproperties0meanstheobjectisempty1boxednumber),
[Maxproperties0MeansTheObjectIsEmpty1BoxedString](#maxproperties0meanstheobjectisempty1boxedstring),
[Maxproperties0MeansTheObjectIsEmpty1BoxedList](#maxproperties0meanstheobjectisempty1boxedlist),
[Maxproperties0MeansTheObjectIsEmpty1BoxedMap](#maxproperties0meanstheobjectisempty1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Maxproperties0MeansTheObjectIsEmpty1BoxedVoid
public static final class Maxproperties0MeansTheObjectIsEmpty1BoxedVoid<br>
extends [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean
public static final class Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean<br>
extends [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedNumber
public static final class Maxproperties0MeansTheObjectIsEmpty1BoxedNumber<br>
extends [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedString
public static final class Maxproperties0MeansTheObjectIsEmpty1BoxedString<br>
extends [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedList
public static final class Maxproperties0MeansTheObjectIsEmpty1BoxedList<br>
extends [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Maxproperties0MeansTheObjectIsEmpty1BoxedMap
public static final class Maxproperties0MeansTheObjectIsEmpty1BoxedMap<br>
extends [Maxproperties0MeansTheObjectIsEmpty1Boxed](#maxproperties0meanstheobjectisempty1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Maxproperties0MeansTheObjectIsEmpty1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
