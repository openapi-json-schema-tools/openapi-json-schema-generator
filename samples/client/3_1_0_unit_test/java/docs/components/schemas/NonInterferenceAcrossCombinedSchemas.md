# NonInterferenceAcrossCombinedSchemas
org.openapijsonschematools.client.components.schemas.NonInterferenceAcrossCombinedSchemas.java
public class NonInterferenceAcrossCombinedSchemas<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1](#noninterferenceacrosscombinedschemas1)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.Schema2Boxed](#schema2boxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedVoid](#schema2boxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedBoolean](#schema2boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedNumber](#schema2boxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedString](#schema2boxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedList](#schema2boxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedMap](#schema2boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2](#schema2)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.ElseBoxed](#elseboxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ElseBoxedVoid](#elseboxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ElseBoxedBoolean](#elseboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ElseBoxedNumber](#elseboxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ElseBoxedString](#elseboxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ElseBoxedList](#elseboxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ElseBoxedMap](#elseboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Else](#else)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1](#schema1)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Then](#then)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0](#schema0)<br> schema class |
| sealed interface | [NonInterferenceAcrossCombinedSchemas.IfBoxed](#ifboxed)<br> sealed interface for validated payloads |
| record | [NonInterferenceAcrossCombinedSchemas.IfBoxedVoid](#ifboxedvoid)<br> boxed class to store validated null payloads |
| record | [NonInterferenceAcrossCombinedSchemas.IfBoxedBoolean](#ifboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NonInterferenceAcrossCombinedSchemas.IfBoxedNumber](#ifboxednumber)<br> boxed class to store validated Number payloads |
| record | [NonInterferenceAcrossCombinedSchemas.IfBoxedString](#ifboxedstring)<br> boxed class to store validated String payloads |
| record | [NonInterferenceAcrossCombinedSchemas.IfBoxedList](#ifboxedlist)<br> boxed class to store validated List payloads |
| record | [NonInterferenceAcrossCombinedSchemas.IfBoxedMap](#ifboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.If](#if)<br> schema class |

## NonInterferenceAcrossCombinedSchemas1Boxed
public sealed interface NonInterferenceAcrossCombinedSchemas1Boxed<br>
permits<br>
[NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid),
[NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean),
[NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber),
[NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring),
[NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist),
[NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NonInterferenceAcrossCombinedSchemas1BoxedVoid
public record NonInterferenceAcrossCombinedSchemas1BoxedVoid<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedBoolean
public record NonInterferenceAcrossCombinedSchemas1BoxedBoolean<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedNumber
public record NonInterferenceAcrossCombinedSchemas1BoxedNumber<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedString
public record NonInterferenceAcrossCombinedSchemas1BoxedString<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedList
public record NonInterferenceAcrossCombinedSchemas1BoxedList<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedMap
public record NonInterferenceAcrossCombinedSchemas1BoxedMap<br>
implements [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1
public static class NonInterferenceAcrossCombinedSchemas1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema2.class](#schema2)<br>;)<br> |

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
| [NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema2Boxed
public sealed interface Schema2Boxed<br>
permits<br>
[Schema2BoxedVoid](#schema2boxedvoid),
[Schema2BoxedBoolean](#schema2boxedboolean),
[Schema2BoxedNumber](#schema2boxednumber),
[Schema2BoxedString](#schema2boxedstring),
[Schema2BoxedList](#schema2boxedlist),
[Schema2BoxedMap](#schema2boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema2BoxedVoid
public record Schema2BoxedVoid<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2BoxedBoolean
public record Schema2BoxedBoolean<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2BoxedNumber
public record Schema2BoxedNumber<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2BoxedString
public record Schema2BoxedString<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2BoxedList
public record Schema2BoxedList<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2BoxedMap
public record Schema2BoxedMap<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2
public static class Schema2<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [Schema2BoxedString](#schema2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema2BoxedVoid](#schema2boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema2BoxedNumber](#schema2boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema2BoxedBoolean](#schema2boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema2BoxedMap](#schema2boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema2BoxedList](#schema2boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema2Boxed](#schema2boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
public record Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedBoolean
public record Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedNumber
public record Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedString
public record Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedList
public record Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | then = [Then.class](#then) |

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
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
public record Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedBoolean
public record Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedNumber
public record Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedString
public record Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedList
public record Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0BoxedMap
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [If.class](#if) |

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
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
