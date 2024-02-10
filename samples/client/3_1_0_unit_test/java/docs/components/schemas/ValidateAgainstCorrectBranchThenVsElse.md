# ValidateAgainstCorrectBranchThenVsElse
org.openapijsonschematools.client.components.schemas.ValidateAgainstCorrectBranchThenVsElse.java
public class ValidateAgainstCorrectBranchThenVsElse

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)<br> abstract sealed validated payload class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1](#validateagainstcorrectbranchthenvselse1)<br> schema class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxed](#thenboxed)<br> abstract sealed validated payload class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.Then](#then)<br> schema class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxed](#ifschemaboxed)<br> abstract sealed validated payload class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.IfSchema](#ifschema)<br> schema class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxed](#elseschemaboxed)<br> abstract sealed validated payload class |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchema](#elseschema)<br> schema class |

## ValidateAgainstCorrectBranchThenVsElse1Boxed
public static abstract sealed class ValidateAgainstCorrectBranchThenVsElse1Boxed<br>
permits<br>
[ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid),
[ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean),
[ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber),
[ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring),
[ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist),
[ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ValidateAgainstCorrectBranchThenVsElse1BoxedVoid
public static final class ValidateAgainstCorrectBranchThenVsElse1BoxedVoid<br>
extends [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean
public static final class ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean<br>
extends [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedNumber
public static final class ValidateAgainstCorrectBranchThenVsElse1BoxedNumber<br>
extends [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedString
public static final class ValidateAgainstCorrectBranchThenVsElse1BoxedString<br>
extends [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedList
public static final class ValidateAgainstCorrectBranchThenVsElse1BoxedList<br>
extends [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedMap
public static final class ValidateAgainstCorrectBranchThenVsElse1BoxedMap<br>
extends [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1
public static class ValidateAgainstCorrectBranchThenVsElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema.class](#ifschema) |
| Class<? extends JsonSchema> | then = [Then.class](#then) |
| Class<? extends JsonSchema> | elseSchema = [ElseSchema.class](#elseschema) |

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
| [ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ThenBoxed
public static abstract sealed class ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ThenBoxedVoid
public static final class ThenBoxedVoid<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ThenBoxedBoolean
public static final class ThenBoxedBoolean<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ThenBoxedNumber
public static final class ThenBoxedNumber<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ThenBoxedString
public static final class ThenBoxedString<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ThenBoxedList
public static final class ThenBoxedList<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ThenBoxedMap
public static final class ThenBoxedMap<br>
extends [ThenBoxed](#thenboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Then
public static class Then<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = -10 |

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
| [ThenBoxedString](#thenboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ThenBoxedVoid](#thenboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ThenBoxedNumber](#thenboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ThenBoxedBoolean](#thenboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ThenBoxedMap](#thenboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ThenBoxedList](#thenboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IfSchemaBoxed
public static abstract sealed class IfSchemaBoxed<br>
permits<br>
[IfSchemaBoxedVoid](#ifschemaboxedvoid),
[IfSchemaBoxedBoolean](#ifschemaboxedboolean),
[IfSchemaBoxedNumber](#ifschemaboxednumber),
[IfSchemaBoxedString](#ifschemaboxedstring),
[IfSchemaBoxedList](#ifschemaboxedlist),
[IfSchemaBoxedMap](#ifschemaboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## IfSchemaBoxedVoid
public static final class IfSchemaBoxedVoid<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## IfSchemaBoxedBoolean
public static final class IfSchemaBoxedBoolean<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## IfSchemaBoxedNumber
public static final class IfSchemaBoxedNumber<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IfSchemaBoxedString
public static final class IfSchemaBoxedString<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## IfSchemaBoxedList
public static final class IfSchemaBoxedList<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## IfSchemaBoxedMap
public static final class IfSchemaBoxedMap<br>
extends [IfSchemaBoxed](#ifschemaboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## IfSchema
public static class IfSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMaximum = 0 |

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
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ElseSchemaBoxed
public static abstract sealed class ElseSchemaBoxed<br>
permits<br>
[ElseSchemaBoxedVoid](#elseschemaboxedvoid),
[ElseSchemaBoxedBoolean](#elseschemaboxedboolean),
[ElseSchemaBoxedNumber](#elseschemaboxednumber),
[ElseSchemaBoxedString](#elseschemaboxedstring),
[ElseSchemaBoxedList](#elseschemaboxedlist),
[ElseSchemaBoxedMap](#elseschemaboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ElseSchemaBoxedVoid
public static final class ElseSchemaBoxedVoid<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ElseSchemaBoxedBoolean
public static final class ElseSchemaBoxedBoolean<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ElseSchemaBoxedNumber
public static final class ElseSchemaBoxedNumber<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ElseSchemaBoxedString
public static final class ElseSchemaBoxedString<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ElseSchemaBoxedList
public static final class ElseSchemaBoxedList<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ElseSchemaBoxedMap
public static final class ElseSchemaBoxedMap<br>
extends [ElseSchemaBoxed](#elseschemaboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ElseSchema
public static class ElseSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = new BigDecimal("2") |

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
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
