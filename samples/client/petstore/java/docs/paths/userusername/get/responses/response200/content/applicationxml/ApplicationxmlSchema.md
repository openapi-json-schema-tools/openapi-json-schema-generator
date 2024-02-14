# ApplicationxmlSchema
public class ApplicationxmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedVoid](#applicationxmlschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedBoolean](#applicationxmlschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedNumber](#applicationxmlschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedString](#applicationxmlschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedList](#applicationxmlschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1BoxedMap](#applicationxmlschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationxmlSchema.ApplicationxmlSchema1](#applicationxmlschema1)<br> schema class |

## ApplicationxmlSchema1Boxed
public static abstract sealed class ApplicationxmlSchema1Boxed<br>
permits<br>
[ApplicationxmlSchema1BoxedVoid](#applicationxmlschema1boxedvoid),
[ApplicationxmlSchema1BoxedBoolean](#applicationxmlschema1boxedboolean),
[ApplicationxmlSchema1BoxedNumber](#applicationxmlschema1boxednumber),
[ApplicationxmlSchema1BoxedString](#applicationxmlschema1boxedstring),
[ApplicationxmlSchema1BoxedList](#applicationxmlschema1boxedlist),
[ApplicationxmlSchema1BoxedMap](#applicationxmlschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationxmlSchema1BoxedVoid
public static final class ApplicationxmlSchema1BoxedVoid<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ApplicationxmlSchema1BoxedBoolean
public static final class ApplicationxmlSchema1BoxedBoolean<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ApplicationxmlSchema1BoxedNumber
public static final class ApplicationxmlSchema1BoxedNumber<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ApplicationxmlSchema1BoxedString
public static final class ApplicationxmlSchema1BoxedString<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationxmlSchema1BoxedList
public static final class ApplicationxmlSchema1BoxedList<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ApplicationxmlSchema1BoxedMap
public static final class ApplicationxmlSchema1BoxedMap<br>
extends [ApplicationxmlSchema1Boxed](#applicationxmlschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ApplicationxmlSchema1
public static class ApplicationxmlSchema1<br>
extends [User.User1](../../../../../../../../components/schemas/User.md#user1)

A schema class that validates payloads
