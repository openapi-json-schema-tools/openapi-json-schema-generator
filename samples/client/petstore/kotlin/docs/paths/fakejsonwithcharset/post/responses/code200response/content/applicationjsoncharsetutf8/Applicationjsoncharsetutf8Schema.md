# Applicationjsoncharsetutf8Schema
public class Applicationjsoncharsetutf8Schema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)<br> sealed interface for validated payloads |
| record | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedVoid](#applicationjsoncharsetutf8schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedBoolean](#applicationjsoncharsetutf8schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedNumber](#applicationjsoncharsetutf8schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedString](#applicationjsoncharsetutf8schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedList](#applicationjsoncharsetutf8schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1BoxedMap](#applicationjsoncharsetutf8schema1boxedmap)<br> boxed class to store validated Map payloads |
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
public record Applicationjsoncharsetutf8Schema1BoxedVoid<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedBoolean
public record Applicationjsoncharsetutf8Schema1BoxedBoolean<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedNumber
public record Applicationjsoncharsetutf8Schema1BoxedNumber<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedString
public record Applicationjsoncharsetutf8Schema1BoxedString<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedList
public record Applicationjsoncharsetutf8Schema1BoxedList<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Applicationjsoncharsetutf8Schema1BoxedMap
public record Applicationjsoncharsetutf8Schema1BoxedMap<br>
implements [Applicationjsoncharsetutf8Schema1Boxed](#applicationjsoncharsetutf8schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Applicationjsoncharsetutf8Schema1
public static class Applicationjsoncharsetutf8Schema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
