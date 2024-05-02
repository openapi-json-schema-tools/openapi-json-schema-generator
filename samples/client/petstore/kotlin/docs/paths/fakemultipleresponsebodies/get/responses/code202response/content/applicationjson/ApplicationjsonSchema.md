# ApplicationjsonSchema
public class ApplicationjsonSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApplicationjsonSchema.ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)<br> sealed interface for validated payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1](#applicationjsonschema1)<br> schema class |

## ApplicationjsonSchema1Boxed
public sealed interface ApplicationjsonSchema1Boxed<br>
permits<br>
[ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid),
[ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean),
[ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber),
[ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring),
[ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist),
[ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ApplicationjsonSchema1BoxedVoid
public record ApplicationjsonSchema1BoxedVoid<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedBoolean
public record ApplicationjsonSchema1BoxedBoolean<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedNumber
public record ApplicationjsonSchema1BoxedNumber<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedString
public record ApplicationjsonSchema1BoxedString<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedList
public record ApplicationjsonSchema1BoxedList<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1BoxedMap
public record ApplicationjsonSchema1BoxedMap<br>
implements [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationjsonSchema1
public static class ApplicationjsonSchema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
