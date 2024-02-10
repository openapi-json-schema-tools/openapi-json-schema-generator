# NonInterferenceAcrossCombinedSchemas
org.openapijsonschematools.client.components.schemas.NonInterferenceAcrossCombinedSchemas.java
public class NonInterferenceAcrossCombinedSchemas

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.NonInterferenceAcrossCombinedSchemas1](#noninterferenceacrosscombinedschemas1)<br> schema class |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2Boxed](#schema2boxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedVoid](#schema2boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedBoolean](#schema2boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedNumber](#schema2boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedString](#schema2boxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedList](#schema2boxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2BoxedMap](#schema2boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema2](#schema2)<br> schema class |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxed](#elseschemaboxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ElseSchema](#elseschema)<br> schema class |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema1](#schema1)<br> schema class |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxed](#thenboxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Then](#then)<br> schema class |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.Schema0](#schema0)<br> schema class |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxed](#ifschemaboxed)<br> abstract sealed validated payload class |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [NonInterferenceAcrossCombinedSchemas.IfSchema](#ifschema)<br> schema class |

## NonInterferenceAcrossCombinedSchemas1Boxed
public static abstract sealed class NonInterferenceAcrossCombinedSchemas1Boxed<br>
permits<br>
[NonInterferenceAcrossCombinedSchemas1BoxedVoid](#noninterferenceacrosscombinedschemas1boxedvoid),
[NonInterferenceAcrossCombinedSchemas1BoxedBoolean](#noninterferenceacrosscombinedschemas1boxedboolean),
[NonInterferenceAcrossCombinedSchemas1BoxedNumber](#noninterferenceacrosscombinedschemas1boxednumber),
[NonInterferenceAcrossCombinedSchemas1BoxedString](#noninterferenceacrosscombinedschemas1boxedstring),
[NonInterferenceAcrossCombinedSchemas1BoxedList](#noninterferenceacrosscombinedschemas1boxedlist),
[NonInterferenceAcrossCombinedSchemas1BoxedMap](#noninterferenceacrosscombinedschemas1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## NonInterferenceAcrossCombinedSchemas1BoxedVoid
public static final class NonInterferenceAcrossCombinedSchemas1BoxedVoid<br>
extends [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedBoolean
public static final class NonInterferenceAcrossCombinedSchemas1BoxedBoolean<br>
extends [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedNumber
public static final class NonInterferenceAcrossCombinedSchemas1BoxedNumber<br>
extends [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedString
public static final class NonInterferenceAcrossCombinedSchemas1BoxedString<br>
extends [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedList
public static final class NonInterferenceAcrossCombinedSchemas1BoxedList<br>
extends [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## NonInterferenceAcrossCombinedSchemas1BoxedMap
public static final class NonInterferenceAcrossCombinedSchemas1BoxedMap<br>
extends [NonInterferenceAcrossCombinedSchemas1Boxed](#noninterferenceacrosscombinedschemas1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NonInterferenceAcrossCombinedSchemas1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema2Boxed
public static abstract sealed class Schema2Boxed<br>
permits<br>
[Schema2BoxedVoid](#schema2boxedvoid),
[Schema2BoxedBoolean](#schema2boxedboolean),
[Schema2BoxedNumber](#schema2boxednumber),
[Schema2BoxedString](#schema2boxedstring),
[Schema2BoxedList](#schema2boxedlist),
[Schema2BoxedMap](#schema2boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema2BoxedVoid
public static final class Schema2BoxedVoid<br>
extends [Schema2Boxed](#schema2boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema2BoxedBoolean
public static final class Schema2BoxedBoolean<br>
extends [Schema2Boxed](#schema2boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema2BoxedNumber
public static final class Schema2BoxedNumber<br>
extends [Schema2Boxed](#schema2boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema2BoxedString
public static final class Schema2BoxedString<br>
extends [Schema2Boxed](#schema2boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema2BoxedList
public static final class Schema2BoxedList<br>
extends [Schema2Boxed](#schema2boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema2BoxedMap
public static final class Schema2BoxedMap<br>
extends [Schema2Boxed](#schema2boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema2
public static class Schema2<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [Schema2BoxedString](#schema2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema2BoxedVoid](#schema2boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema2BoxedNumber](#schema2boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema2BoxedBoolean](#schema2boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema2BoxedMap](#schema2boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Schema2BoxedList](#schema2boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
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
## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedVoid
public static final class Schema1BoxedVoid<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema1BoxedBoolean
public static final class Schema1BoxedBoolean<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema1BoxedNumber
public static final class Schema1BoxedNumber<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema1BoxedString
public static final class Schema1BoxedString<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1BoxedList
public static final class Schema1BoxedList<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

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
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedVoid
public static final class Schema0BoxedVoid<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Schema0BoxedBoolean
public static final class Schema0BoxedBoolean<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Schema0BoxedNumber
public static final class Schema0BoxedNumber<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0BoxedList
public static final class Schema0BoxedList<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Schema0BoxedMap
public static final class Schema0BoxedMap<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema.class](#ifschema) |

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
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
