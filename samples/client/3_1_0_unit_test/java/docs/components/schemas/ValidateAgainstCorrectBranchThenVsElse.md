# ValidateAgainstCorrectBranchThenVsElse
org.openapijsonschematools.client.components.schemas.ValidateAgainstCorrectBranchThenVsElse.java
public class ValidateAgainstCorrectBranchThenVsElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)<br> sealed interface for validated payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring)<br> boxed class to store validated String payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist)<br> boxed class to store validated List payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1](#validateagainstcorrectbranchthenvselse1)<br> schema class |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.Then](#then)<br> schema class |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.IfBoxed](#ifboxed)<br> sealed interface for validated payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.IfBoxedVoid](#ifboxedvoid)<br> boxed class to store validated null payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.IfBoxedBoolean](#ifboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.IfBoxedNumber](#ifboxednumber)<br> boxed class to store validated Number payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.IfBoxedString](#ifboxedstring)<br> boxed class to store validated String payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.IfBoxedList](#ifboxedlist)<br> boxed class to store validated List payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.IfBoxedMap](#ifboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.If](#if)<br> schema class |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxed](#elseboxed)<br> sealed interface for validated payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxedVoid](#elseboxedvoid)<br> boxed class to store validated null payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxedBoolean](#elseboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxedNumber](#elseboxednumber)<br> boxed class to store validated Number payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxedString](#elseboxedstring)<br> boxed class to store validated String payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxedList](#elseboxedlist)<br> boxed class to store validated List payloads |
| record | [ValidateAgainstCorrectBranchThenVsElse.ElseBoxedMap](#elseboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ValidateAgainstCorrectBranchThenVsElse.Else](#else)<br> schema class |

## ValidateAgainstCorrectBranchThenVsElse1Boxed
public sealed interface ValidateAgainstCorrectBranchThenVsElse1Boxed<br>
permits<br>
[ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid),
[ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean),
[ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber),
[ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring),
[ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist),
[ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ValidateAgainstCorrectBranchThenVsElse1BoxedVoid
public record ValidateAgainstCorrectBranchThenVsElse1BoxedVoid<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean
public record ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedNumber
public record ValidateAgainstCorrectBranchThenVsElse1BoxedNumber<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedString
public record ValidateAgainstCorrectBranchThenVsElse1BoxedString<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedList
public record ValidateAgainstCorrectBranchThenVsElse1BoxedList<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedMap
public record ValidateAgainstCorrectBranchThenVsElse1BoxedMap<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1
public static class ValidateAgainstCorrectBranchThenVsElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [If.class](#if) |
| Class<? extends JsonSchema> | then = [Then.class](#then) |
| Class<? extends JsonSchema> | elseSchema = [Else.class](#else) |

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
| [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ThenBoxed
public sealed interface ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

sealed interface that stores validated payloads using boxed classes

## ThenBoxedVoid
public record ThenBoxedVoid<br>
implements [ThenBoxed](#thenboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedBoolean
public record ThenBoxedBoolean<br>
implements [ThenBoxed](#thenboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedNumber
public record ThenBoxedNumber<br>
implements [ThenBoxed](#thenboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedString
public record ThenBoxedString<br>
implements [ThenBoxed](#thenboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedList
public record ThenBoxedList<br>
implements [ThenBoxed](#thenboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ThenBoxedMap
public record ThenBoxedMap<br>
implements [ThenBoxed](#thenboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| [ThenBoxed](#thenboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## IfBoxed
public sealed interface IfBoxed<br>
permits<br>
[IfBoxedVoid](#ifboxedvoid),
[IfBoxedBoolean](#ifboxedboolean),
[IfBoxedNumber](#ifboxednumber),
[IfBoxedString](#ifboxedstring),
[IfBoxedList](#ifboxedlist),
[IfBoxedMap](#ifboxedmap)

sealed interface that stores validated payloads using boxed classes

## IfBoxedVoid
public record IfBoxedVoid<br>
implements [IfBoxed](#ifboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedBoolean
public record IfBoxedBoolean<br>
implements [IfBoxed](#ifboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedNumber
public record IfBoxedNumber<br>
implements [IfBoxed](#ifboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedString
public record IfBoxedString<br>
implements [IfBoxed](#ifboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedList
public record IfBoxedList<br>
implements [IfBoxed](#ifboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IfBoxedMap
public record IfBoxedMap<br>
implements [IfBoxed](#ifboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## If
public static class If<br>
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
| [IfBoxedString](#ifboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [IfBoxedVoid](#ifboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [IfBoxedNumber](#ifboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IfBoxedBoolean](#ifboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [IfBoxedMap](#ifboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [IfBoxedList](#ifboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [IfBoxed](#ifboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ElseBoxed
public sealed interface ElseBoxed<br>
permits<br>
[ElseBoxedVoid](#elseboxedvoid),
[ElseBoxedBoolean](#elseboxedboolean),
[ElseBoxedNumber](#elseboxednumber),
[ElseBoxedString](#elseboxedstring),
[ElseBoxedList](#elseboxedlist),
[ElseBoxedMap](#elseboxedmap)

sealed interface that stores validated payloads using boxed classes

## ElseBoxedVoid
public record ElseBoxedVoid<br>
implements [ElseBoxed](#elseboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedBoolean
public record ElseBoxedBoolean<br>
implements [ElseBoxed](#elseboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedNumber
public record ElseBoxedNumber<br>
implements [ElseBoxed](#elseboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedString
public record ElseBoxedString<br>
implements [ElseBoxed](#elseboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedList
public record ElseBoxedList<br>
implements [ElseBoxed](#elseboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ElseBoxedMap
public record ElseBoxedMap<br>
implements [ElseBoxed](#elseboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Else
public static class Else<br>
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
| [ElseBoxedString](#elseboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ElseBoxedVoid](#elseboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ElseBoxedNumber](#elseboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ElseBoxedBoolean](#elseboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ElseBoxedMap](#elseboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ElseBoxedList](#elseboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [ElseBoxed](#elseboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
