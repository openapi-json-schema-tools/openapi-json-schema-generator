# ApplicationjsonpatchjsonSchema
public class ApplicationjsonpatchjsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1BoxedVoid](#applicationjsonpatchjsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1BoxedBoolean](#applicationjsonpatchjsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1BoxedNumber](#applicationjsonpatchjsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1BoxedString](#applicationjsonpatchjsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1BoxedList](#applicationjsonpatchjsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1BoxedMap](#applicationjsonpatchjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1](#applicationjsonpatchjsonschema1)<br> schema class |

## ApplicationjsonpatchjsonSchema1Boxed
public static abstract sealed class ApplicationjsonpatchjsonSchema1Boxed<br>
permits<br>
[ApplicationjsonpatchjsonSchema1BoxedVoid](#applicationjsonpatchjsonschema1boxedvoid),
[ApplicationjsonpatchjsonSchema1BoxedBoolean](#applicationjsonpatchjsonschema1boxedboolean),
[ApplicationjsonpatchjsonSchema1BoxedNumber](#applicationjsonpatchjsonschema1boxednumber),
[ApplicationjsonpatchjsonSchema1BoxedString](#applicationjsonpatchjsonschema1boxedstring),
[ApplicationjsonpatchjsonSchema1BoxedList](#applicationjsonpatchjsonschema1boxedlist),
[ApplicationjsonpatchjsonSchema1BoxedMap](#applicationjsonpatchjsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationjsonpatchjsonSchema1BoxedVoid
public static final class ApplicationjsonpatchjsonSchema1BoxedVoid<br>
extends [ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ApplicationjsonpatchjsonSchema1BoxedBoolean
public static final class ApplicationjsonpatchjsonSchema1BoxedBoolean<br>
extends [ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ApplicationjsonpatchjsonSchema1BoxedNumber
public static final class ApplicationjsonpatchjsonSchema1BoxedNumber<br>
extends [ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ApplicationjsonpatchjsonSchema1BoxedString
public static final class ApplicationjsonpatchjsonSchema1BoxedString<br>
extends [ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationjsonpatchjsonSchema1BoxedList
public static final class ApplicationjsonpatchjsonSchema1BoxedList<br>
extends [ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ApplicationjsonpatchjsonSchema1BoxedMap
public static final class ApplicationjsonpatchjsonSchema1BoxedMap<br>
extends [ApplicationjsonpatchjsonSchema1Boxed](#applicationjsonpatchjsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ApplicationjsonpatchjsonSchema1
public static class ApplicationjsonpatchjsonSchema1<br>
extends [JSONPatchRequest.JSONPatchRequest1](../../../../../../components/schemas/JSONPatchRequest.md#jsonpatchrequest1)

A schema class that validates payloads
