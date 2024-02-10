# RefSchemaHeaderSchema
public class RefSchemaHeaderSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefSchemaHeaderSchema.RefSchemaHeaderSchema1Boxed](#refschemaheaderschema1boxed)<br> sealed validated payload class |
| static class | [RefSchemaHeaderSchema.RefSchemaHeaderSchema1](#refschemaheaderschema1)<br> schema class |

## RefSchemaHeaderSchema1Boxed
public static abstract sealed class RefSchemaHeaderSchema1Boxed<br>
permits<br>
[RefSchemaHeaderSchema1BoxedVoid](#refschemaheaderschema1boxedvoid),
[RefSchemaHeaderSchema1BoxedBoolean](#refschemaheaderschema1boxedboolean),
[RefSchemaHeaderSchema1BoxedNumber](#refschemaheaderschema1boxednumber),
[RefSchemaHeaderSchema1BoxedString](#refschemaheaderschema1boxedstring),
[RefSchemaHeaderSchema1BoxedList](#refschemaheaderschema1boxedlist),
[RefSchemaHeaderSchema1BoxedMap](#refschemaheaderschema1boxedmap)

A sealed class that stores validated payloads using boxed classes

## RefSchemaHeaderSchema1BoxedVoid
public static final class RefSchemaHeaderSchema1BoxedVoid<br>
extends RefSchemaHeaderSchema1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefSchemaHeaderSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefSchemaHeaderSchema1BoxedBoolean
public static final class RefSchemaHeaderSchema1BoxedBoolean<br>
extends RefSchemaHeaderSchema1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefSchemaHeaderSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefSchemaHeaderSchema1BoxedNumber
public static final class RefSchemaHeaderSchema1BoxedNumber<br>
extends RefSchemaHeaderSchema1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefSchemaHeaderSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefSchemaHeaderSchema1BoxedString
public static final class RefSchemaHeaderSchema1BoxedString<br>
extends RefSchemaHeaderSchema1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefSchemaHeaderSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefSchemaHeaderSchema1
public static class RefSchemaHeaderSchema1<br>
extends [StringWithValidation.StringWithValidation1](../../../components/schemas/StringWithValidation.md#stringwithvalidation1)

A schema class that validates payloads
