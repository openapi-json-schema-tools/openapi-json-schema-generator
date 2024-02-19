# Applicationjsoncharsetutf8Schema
public class Applicationjsoncharsetutf8Schema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)<br> abstract sealed validated payload class |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedVoid](#applicationjsoncharsetutf8schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedBoolean](#applicationjsoncharsetutf8schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedNumber](#applicationjsoncharsetutf8schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedString](#applicationjsoncharsetutf8schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedList](#applicationjsoncharsetutf8schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedMap](#applicationjsoncharsetutf8schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1](#applicationjsoncharsetutf8schema1)<br> schema class |

## Applicationjsoncharsetutf8Schema1Boxed
public sealed interface Applicationjsoncharsetutf8Schema1Boxed<br>
permits<br>
[Applicationjsoncharsetutf8Schema1BoxedVoid](#applicationjsoncharsetutf8schema1boxedvoid),
[Applicationjsoncharsetutf8Schema1BoxedBoolean](#applicationjsoncharsetutf8schema1boxedboolean),
[Applicationjsoncharsetutf8Schema1BoxedNumber](#applicationjsoncharsetutf8schema1boxednumber),
[Applicationjsoncharsetutf8Schema1BoxedString](#applicationjsoncharsetutf8schema1boxedstring),
[Applicationjsoncharsetutf8Schema1BoxedList](#applicationjsoncharsetutf8schema1boxedlist),
[Applicationjsoncharsetutf8Schema1BoxedMap](#applicationjsoncharsetutf8schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Applicationjsoncharsetutf8Schema1BoxedVoid
public static final class Applicationjsoncharsetutf8Schema1BoxedVoid<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedBoolean
public static final class Applicationjsoncharsetutf8Schema1BoxedBoolean<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedNumber
public static final class Applicationjsoncharsetutf8Schema1BoxedNumber<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedString
public static final class Applicationjsoncharsetutf8Schema1BoxedString<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedList
public static final class Applicationjsoncharsetutf8Schema1BoxedList<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedMap
public static final class Applicationjsoncharsetutf8Schema1BoxedMap<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Applicationjsoncharsetutf8Schema1
public static class Applicationjsoncharsetutf8Schema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
