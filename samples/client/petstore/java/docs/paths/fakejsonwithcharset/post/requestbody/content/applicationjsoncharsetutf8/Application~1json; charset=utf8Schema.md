# Application~1json; charset&#x3D;utf8Schema
public class Application~1json; charset&#x3D;utf8Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1BoxedVoid](#application~1json; charset&#x3D;utf8schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1BoxedBoolean](#application~1json; charset&#x3D;utf8schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1BoxedNumber](#application~1json; charset&#x3D;utf8schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1BoxedString](#application~1json; charset&#x3D;utf8schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1BoxedList](#application~1json; charset&#x3D;utf8schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1BoxedMap](#application~1json; charset&#x3D;utf8schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1json; charset&#x3D;utf8Schema.Application~1json; charset&#x3D;utf8Schema1](#application~1json; charset&#x3D;utf8schema1)<br> schema class |

## Application~1json; charset&#x3D;utf8Schema1Boxed
public static abstract sealed class Application~1json; charset&#x3D;utf8Schema1Boxed<br>
permits<br>
[Application~1json; charset&#x3D;utf8Schema1BoxedVoid](#application~1json; charset&#x3D;utf8schema1boxedvoid),
[Application~1json; charset&#x3D;utf8Schema1BoxedBoolean](#application~1json; charset&#x3D;utf8schema1boxedboolean),
[Application~1json; charset&#x3D;utf8Schema1BoxedNumber](#application~1json; charset&#x3D;utf8schema1boxednumber),
[Application~1json; charset&#x3D;utf8Schema1BoxedString](#application~1json; charset&#x3D;utf8schema1boxedstring),
[Application~1json; charset&#x3D;utf8Schema1BoxedList](#application~1json; charset&#x3D;utf8schema1boxedlist),
[Application~1json; charset&#x3D;utf8Schema1BoxedMap](#application~1json; charset&#x3D;utf8schema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1json; charset&#x3D;utf8Schema1BoxedVoid
public static final class Application~1json; charset&#x3D;utf8Schema1BoxedVoid<br>
extends [Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json; charset&#x3D;utf8Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application~1json; charset&#x3D;utf8Schema1BoxedBoolean
public static final class Application~1json; charset&#x3D;utf8Schema1BoxedBoolean<br>
extends [Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json; charset&#x3D;utf8Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application~1json; charset&#x3D;utf8Schema1BoxedNumber
public static final class Application~1json; charset&#x3D;utf8Schema1BoxedNumber<br>
extends [Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json; charset&#x3D;utf8Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1json; charset&#x3D;utf8Schema1BoxedString
public static final class Application~1json; charset&#x3D;utf8Schema1BoxedString<br>
extends [Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json; charset&#x3D;utf8Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1json; charset&#x3D;utf8Schema1BoxedList
public static final class Application~1json; charset&#x3D;utf8Schema1BoxedList<br>
extends [Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json; charset&#x3D;utf8Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application~1json; charset&#x3D;utf8Schema1BoxedMap
public static final class Application~1json; charset&#x3D;utf8Schema1BoxedMap<br>
extends [Application~1json; charset&#x3D;utf8Schema1Boxed](#application~1json; charset&#x3D;utf8schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1json; charset&#x3D;utf8Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application~1json; charset&#x3D;utf8Schema1
public static class Application~1json; charset&#x3D;utf8Schema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
