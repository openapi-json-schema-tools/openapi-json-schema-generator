# RefContentSchemaHeaderSchema
public class RefContentSchemaHeaderSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1Boxed](#refcontentschemaheaderschema1boxed)<br> sealed validated payload class |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1BoxedVoid](#refcontentschemaheaderschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1BoxedBoolean](#refcontentschemaheaderschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1BoxedNumber](#refcontentschemaheaderschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1BoxedString](#refcontentschemaheaderschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1BoxedList](#refcontentschemaheaderschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1BoxedMap](#refcontentschemaheaderschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1](#refcontentschemaheaderschema1)<br> schema class |

## RefContentSchemaHeaderSchema1Boxed
public static abstract sealed class RefContentSchemaHeaderSchema1Boxed<br>
permits<br>
[RefContentSchemaHeaderSchema1BoxedVoid](#refcontentschemaheaderschema1boxedvoid),
[RefContentSchemaHeaderSchema1BoxedBoolean](#refcontentschemaheaderschema1boxedboolean),
[RefContentSchemaHeaderSchema1BoxedNumber](#refcontentschemaheaderschema1boxednumber),
[RefContentSchemaHeaderSchema1BoxedString](#refcontentschemaheaderschema1boxedstring),
[RefContentSchemaHeaderSchema1BoxedList](#refcontentschemaheaderschema1boxedlist),
[RefContentSchemaHeaderSchema1BoxedMap](#refcontentschemaheaderschema1boxedmap)

A sealed class that stores validated payloads using boxed classes

## RefContentSchemaHeaderSchema1BoxedVoid
public static final class RefContentSchemaHeaderSchema1BoxedVoid<br>
extends RefContentSchemaHeaderSchema1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeaderSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefContentSchemaHeaderSchema1BoxedBoolean
public static final class RefContentSchemaHeaderSchema1BoxedBoolean<br>
extends RefContentSchemaHeaderSchema1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeaderSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefContentSchemaHeaderSchema1BoxedNumber
public static final class RefContentSchemaHeaderSchema1BoxedNumber<br>
extends RefContentSchemaHeaderSchema1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeaderSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefContentSchemaHeaderSchema1BoxedString
public static final class RefContentSchemaHeaderSchema1BoxedString<br>
extends RefContentSchemaHeaderSchema1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeaderSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefContentSchemaHeaderSchema1BoxedList
public static final class RefContentSchemaHeaderSchema1BoxedList<br>
extends RefContentSchemaHeaderSchema1Boxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeaderSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RefContentSchemaHeaderSchema1BoxedMap
public static final class RefContentSchemaHeaderSchema1BoxedMap<br>
extends RefContentSchemaHeaderSchema1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeaderSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## RefContentSchemaHeaderSchema1
public static class RefContentSchemaHeaderSchema1<br>
extends [StringWithValidation.StringWithValidation1](../../../../../components/schemas/StringWithValidation.md#stringwithvalidation1)

A schema class that validates payloads
