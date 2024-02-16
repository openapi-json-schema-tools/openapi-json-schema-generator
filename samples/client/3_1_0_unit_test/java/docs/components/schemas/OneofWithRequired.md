# OneofWithRequired
org.openapijsonschematools.client.components.schemas.OneofWithRequired.java
public class OneofWithRequired<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [OneofWithRequired.OneofWithRequired1Boxed](#oneofwithrequired1boxed)<br> abstract sealed validated payload class |
| static class | [OneofWithRequired.OneofWithRequired1BoxedMap](#oneofwithrequired1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithRequired.OneofWithRequired1](#oneofwithrequired1)<br> schema class |
| static class | [OneofWithRequired.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [OneofWithRequired.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [OneofWithRequired.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [OneofWithRequired.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [OneofWithRequired.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [OneofWithRequired.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [OneofWithRequired.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithRequired.Schema1](#schema1)<br> schema class |
| static class | [OneofWithRequired.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [OneofWithRequired.Schema1Map](#schema1map)<br> output class for Map payloads |
| static class | [OneofWithRequired.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [OneofWithRequired.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [OneofWithRequired.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [OneofWithRequired.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [OneofWithRequired.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [OneofWithRequired.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| static class | [OneofWithRequired.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [OneofWithRequired.Schema0](#schema0)<br> schema class |
| static class | [OneofWithRequired.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [OneofWithRequired.Schema0Map](#schema0map)<br> output class for Map payloads |

## OneofWithRequired1Boxed
public static abstract sealed class OneofWithRequired1Boxed<br>
permits<br>
[OneofWithRequired1BoxedMap](#oneofwithrequired1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## OneofWithRequired1BoxedMap
public static final class OneofWithRequired1BoxedMap<br>
extends [OneofWithRequired1Boxed](#oneofwithrequired1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OneofWithRequired1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## OneofWithRequired1
public static class OneofWithRequired1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| List<Class<? extends JsonSchema>> | oneOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [OneofWithRequired1BoxedMap](#oneofwithrequired1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
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
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"baz",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

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
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Map00Builder
public class Schema1Map00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1Map00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, Void value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, boolean value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, String value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, int value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, float value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, long value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, double value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, List<?> value) |
| [Schema1Map00Builder](#schema1map00builder) | additionalProperty(String key, Map<String, ?> value) |

## Schema1Map01Builder
public class Schema1Map01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1Map01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map00Builder](#schema1map00builder) | foo(Void value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(boolean value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(String value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(int value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(float value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(long value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(double value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(List<?> value) |
| [Schema1Map00Builder](#schema1map00builder) | foo(Map<String, ?> value) |

## Schema1Map10Builder
public class Schema1Map10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1Map10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map00Builder](#schema1map00builder) | baz(Void value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(boolean value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(String value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(int value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(float value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(long value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(double value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(List<?> value) |
| [Schema1Map00Builder](#schema1map00builder) | baz(Map<String, ?> value) |

## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map01Builder](#schema1map01builder) | baz(Void value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(boolean value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(String value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(int value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(float value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(long value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(double value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(List<?> value) |
| [Schema1Map01Builder](#schema1map01builder) | baz(Map<String, ?> value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(Void value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(boolean value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(String value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(int value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(float value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(long value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(double value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(List<?> value) |
| [Schema1Map10Builder](#schema1map10builder) | foo(Map<String, ?> value) |

## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | baz()<br> |
| @Nullable Object | foo()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
| Schema0BoxedMap([Schema0Map](#schema0map) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Schema0Map](#schema0map) | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"bar",<br>&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>)<br> |

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
| [Schema0Map](#schema0map) | validate([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Map00Builder
public class Schema0Map00Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0Map00Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, Void value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, boolean value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, String value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, int value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, float value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, long value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, double value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, List<?> value) |
| [Schema0Map00Builder](#schema0map00builder) | additionalProperty(String key, Map<String, ?> value) |

## Schema0Map01Builder
public class Schema0Map01Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0Map01Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map00Builder](#schema0map00builder) | foo(Void value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(boolean value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(String value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(int value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(float value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(long value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(double value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(List<?> value) |
| [Schema0Map00Builder](#schema0map00builder) | foo(Map<String, ?> value) |

## Schema0Map10Builder
public class Schema0Map10Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0Map10Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map00Builder](#schema0map00builder) | bar(Void value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(boolean value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(String value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(int value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(float value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(long value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(double value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(List<?> value) |
| [Schema0Map00Builder](#schema0map00builder) | bar(Map<String, ?> value) |

## Schema0MapBuilder
public class Schema0MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map01Builder](#schema0map01builder) | bar(Void value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(boolean value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(String value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(int value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(float value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(long value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(double value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(List<?> value) |
| [Schema0Map01Builder](#schema0map01builder) | bar(Map<String, ?> value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(Void value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(boolean value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(String value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(int value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(float value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(long value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(double value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(List<?> value) |
| [Schema0Map10Builder](#schema0map10builder) | foo(Map<String, ?> value) |

## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | bar()<br> |
| @Nullable Object | foo()<br> |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
