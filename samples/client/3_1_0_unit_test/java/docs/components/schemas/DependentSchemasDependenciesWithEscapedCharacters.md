# DependentSchemasDependenciesWithEscapedCharacters
org.openapijsonschematools.client.components.schemas.DependentSchemasDependenciesWithEscapedCharacters.java
public class DependentSchemasDependenciesWithEscapedCharacters

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid](#dependentschemasdependencieswithescapedcharacters1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean](#dependentschemasdependencieswithescapedcharacters1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber](#dependentschemasdependencieswithescapedcharacters1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedString](#dependentschemasdependencieswithescapedcharacters1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedList](#dependentschemasdependencieswithescapedcharacters1boxedlist)<br> boxed class to store validated List payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1BoxedMap](#dependentschemasdependencieswithescapedcharacters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.DependentSchemasDependenciesWithEscapedCharacters1](#dependentschemasdependencieswithescapedcharacters1)<br> schema class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxed](#foobarboxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedVoid](#foobarboxedvoid)<br> boxed class to store validated null payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedBoolean](#foobarboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedNumber](#foobarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedString](#foobarboxedstring)<br> boxed class to store validated String payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedList](#foobarboxedlist)<br> boxed class to store validated List payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarBoxedMap](#foobarboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.Foobar](#foobar)<br> schema class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarMapBuilder](#foobarmapbuilder)<br> builder for Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FoobarMap](#foobarmap)<br> output class for Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxed](#footbarboxed)<br> abstract sealed validated payload class |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedVoid](#footbarboxedvoid)<br> boxed class to store validated null payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedBoolean](#footbarboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedNumber](#footbarboxednumber)<br> boxed class to store validated Number payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedString](#footbarboxedstring)<br> boxed class to store validated String payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedList](#footbarboxedlist)<br> boxed class to store validated List payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.FootbarBoxedMap](#footbarboxedmap)<br> boxed class to store validated Map payloads |
| static class | [DependentSchemasDependenciesWithEscapedCharacters.Footbar](#footbar)<br> schema class |

## DependentSchemasDependenciesWithEscapedCharacters1Boxed
public static abstract sealed class DependentSchemasDependenciesWithEscapedCharacters1Boxed<br>
permits<br>
[DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid](#dependentschemasdependencieswithescapedcharacters1boxedvoid),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean](#dependentschemasdependencieswithescapedcharacters1boxedboolean),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber](#dependentschemasdependencieswithescapedcharacters1boxednumber),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedString](#dependentschemasdependencieswithescapedcharacters1boxedstring),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedList](#dependentschemasdependencieswithescapedcharacters1boxedlist),
[DependentSchemasDependenciesWithEscapedCharacters1BoxedMap](#dependentschemasdependencieswithescapedcharacters1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid
public static final class DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid<br>
extends [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean
public static final class DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean<br>
extends [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber
public static final class DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber<br>
extends [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedString
public static final class DependentSchemasDependenciesWithEscapedCharacters1BoxedString<br>
extends [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedList
public static final class DependentSchemasDependenciesWithEscapedCharacters1BoxedList<br>
extends [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1BoxedMap
public static final class DependentSchemasDependenciesWithEscapedCharacters1BoxedMap<br>
extends [DependentSchemasDependenciesWithEscapedCharacters1Boxed](#dependentschemasdependencieswithescapedcharacters1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DependentSchemasDependenciesWithEscapedCharacters1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## DependentSchemasDependenciesWithEscapedCharacters1
public static class DependentSchemasDependenciesWithEscapedCharacters1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Class<? extends JsonSchema>> | dependentSchemas = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo\tbar", [Footbar.class](#footbar))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("foo'bar", [Foobar.class](#foobar)))<br>)<br> |

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
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedString](#dependentschemasdependencieswithescapedcharacters1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedVoid](#dependentschemasdependencieswithescapedcharacters1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedNumber](#dependentschemasdependencieswithescapedcharacters1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedBoolean](#dependentschemasdependencieswithescapedcharacters1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedMap](#dependentschemasdependencieswithescapedcharacters1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DependentSchemasDependenciesWithEscapedCharacters1BoxedList](#dependentschemasdependencieswithescapedcharacters1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FoobarBoxed
public static abstract sealed class FoobarBoxed<br>
permits<br>
[FoobarBoxedVoid](#foobarboxedvoid),
[FoobarBoxedBoolean](#foobarboxedboolean),
[FoobarBoxedNumber](#foobarboxednumber),
[FoobarBoxedString](#foobarboxedstring),
[FoobarBoxedList](#foobarboxedlist),
[FoobarBoxedMap](#foobarboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## FoobarBoxedVoid
public static final class FoobarBoxedVoid<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## FoobarBoxedBoolean
public static final class FoobarBoxedBoolean<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## FoobarBoxedNumber
public static final class FoobarBoxedNumber<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## FoobarBoxedString
public static final class FoobarBoxedString<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## FoobarBoxedList
public static final class FoobarBoxedList<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## FoobarBoxedMap
public static final class FoobarBoxedMap<br>
extends [FoobarBoxed](#foobarboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarBoxedMap([FoobarMap](#foobarmap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [FoobarMap](#foobarmap) | data<br>validated payload |

## Foobar
public static class Foobar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo\"bar"<br>)<br> |

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
| [FoobarMap](#foobarmap) | validate([Map&lt;?, ?&gt;](#foobarmapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [FoobarBoxedString](#foobarboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FoobarBoxedVoid](#foobarboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [FoobarBoxedNumber](#foobarboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FoobarBoxedBoolean](#foobarboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [FoobarBoxedMap](#foobarboxedmap) | validateAndBox([Map&lt;?, ?&gt;](#foobarmapbuilder) arg, SchemaConfiguration configuration) |
| [FoobarBoxedList](#foobarboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FoobarMap0Builder
public class FoobarMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, Void value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, boolean value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, String value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, int value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, float value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, long value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, double value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, List<?> value) |
| [FoobarMap0Builder](#foobarmap0builder) | additionalProperty(String key, Map<String, ?> value) |

## FoobarMapBuilder
public class FoobarMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FoobarMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(Void value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(boolean value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(String value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(int value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(float value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(long value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(double value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(List<?> value) |
| [FoobarMap0Builder](#foobarmap0builder) | setFooReverseSolidusQuotationMarkBar(Map<String, ?> value) |

## FoobarMap
public static class FoobarMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FoobarMap](#foobarmap) | of([Map<String, ? extends @Nullable Object>](#foobarmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["foo\&quot;bar"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FootbarBoxed
public static abstract sealed class FootbarBoxed<br>
permits<br>
[FootbarBoxedVoid](#footbarboxedvoid),
[FootbarBoxedBoolean](#footbarboxedboolean),
[FootbarBoxedNumber](#footbarboxednumber),
[FootbarBoxedString](#footbarboxedstring),
[FootbarBoxedList](#footbarboxedlist),
[FootbarBoxedMap](#footbarboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## FootbarBoxedVoid
public static final class FootbarBoxedVoid<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## FootbarBoxedBoolean
public static final class FootbarBoxedBoolean<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## FootbarBoxedNumber
public static final class FootbarBoxedNumber<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## FootbarBoxedString
public static final class FootbarBoxedString<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## FootbarBoxedList
public static final class FootbarBoxedList<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## FootbarBoxedMap
public static final class FootbarBoxedMap<br>
extends [FootbarBoxed](#footbarboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FootbarBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Footbar
public static class Footbar<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minProperties = 4 |

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
| [FootbarBoxedString](#footbarboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FootbarBoxedVoid](#footbarboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [FootbarBoxedNumber](#footbarboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FootbarBoxedBoolean](#footbarboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [FootbarBoxedMap](#footbarboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [FootbarBoxedList](#footbarboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
