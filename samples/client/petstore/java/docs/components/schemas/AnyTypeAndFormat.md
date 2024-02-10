# AnyTypeAndFormat
org.openapijsonschematools.client.components.schemas.AnyTypeAndFormat.java
public class AnyTypeAndFormat

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [AnyTypeAndFormat.AnyTypeAndFormat1Boxed](#anytypeandformat1boxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.AnyTypeAndFormat1](#anytypeandformat1)<br> schema class |
| static class | [AnyTypeAndFormat.AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder)<br> builder for Map payloads |
| static class | [AnyTypeAndFormat.AnyTypeAndFormatMap](#anytypeandformatmap)<br> output class for Map payloads |
| static class | [AnyTypeAndFormat.FloatSchemaBoxed](#floatschemaboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.FloatSchema](#floatschema)<br> schema class |
| static class | [AnyTypeAndFormat.DoubleSchemaBoxed](#doubleschemaboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.DoubleSchema](#doubleschema)<br> schema class |
| static class | [AnyTypeAndFormat.Int64Boxed](#int64boxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.Int64](#int64)<br> schema class |
| static class | [AnyTypeAndFormat.Int32Boxed](#int32boxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.Int32](#int32)<br> schema class |
| static class | [AnyTypeAndFormat.BinaryBoxed](#binaryboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.Binary](#binary)<br> schema class |
| static class | [AnyTypeAndFormat.NumberSchemaBoxed](#numberschemaboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.NumberSchema](#numberschema)<br> schema class |
| static class | [AnyTypeAndFormat.DatetimeBoxed](#datetimeboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.Datetime](#datetime)<br> schema class |
| static class | [AnyTypeAndFormat.DateBoxed](#dateboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.Date](#date)<br> schema class |
| static class | [AnyTypeAndFormat.UuidSchemaBoxed](#uuidschemaboxed)<br> sealed validated payload class |
| static class | [AnyTypeAndFormat.UuidSchema](#uuidschema)<br> schema class |

## AnyTypeAndFormat1Boxed
public static abstract sealed class AnyTypeAndFormat1Boxed<br>
permits<br>
[AnyTypeAndFormat1BoxedMap](#anytypeandformat1boxedmap)

A sealed class that stores validated payloads using boxed classes

## AnyTypeAndFormat1
public static class AnyTypeAndFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
AnyTypeAndFormat.AnyTypeAndFormatMap validatedPayload =
    AnyTypeAndFormat.AnyTypeAndFormat1.validate(
    new AnyTypeAndFormat.AnyTypeAndFormatMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuid", [UuidSchema.class](#uuidschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date-time", [Datetime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberSchema.class](#numberschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleSchema.class](#doubleschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatSchema.class](#floatschema)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnyTypeAndFormatMap](#anytypeandformatmap) | validate([Map&lt;?, ?&gt;](#anytypeandformatmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## AnyTypeAndFormatMapBuilder
public class AnyTypeAndFormatMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeAndFormatMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDateHyphenMinusTime(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## AnyTypeAndFormatMap
public static class AnyTypeAndFormatMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AnyTypeAndFormatMap](#anytypeandformatmap) | of([Map<String, ? extends @Nullable Object>](#anytypeandformatmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| @Nullable Object | binary()<br>[optional] |
| @Nullable Object | int32()<br>[optional] value must be a 32 bit integer |
| @Nullable Object | int64()<br>[optional] value must be a 64 bit integer |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["uuid"], instance["date-time"], instance["number"], instance["double"], instance["float"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FloatSchemaBoxed
public static abstract sealed class FloatSchemaBoxed<br>
permits<br>
[FloatSchemaBoxedVoid](#floatschemaboxedvoid),
[FloatSchemaBoxedBoolean](#floatschemaboxedboolean),
[FloatSchemaBoxedNumber](#floatschemaboxednumber),
[FloatSchemaBoxedString](#floatschemaboxedstring),
[FloatSchemaBoxedList](#floatschemaboxedlist),
[FloatSchemaBoxedMap](#floatschemaboxedmap)

A sealed class that stores validated payloads using boxed classes

## FloatSchemaBoxedVoid
public static final class FloatSchemaBoxedVoid<br>
extends FloatSchemaBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## FloatSchemaBoxedBoolean
public static final class FloatSchemaBoxedBoolean<br>
extends FloatSchemaBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## FloatSchemaBoxedString
public static final class FloatSchemaBoxedString<br>
extends FloatSchemaBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## FloatSchema
public static class FloatSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "float"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DoubleSchemaBoxed
public static abstract sealed class DoubleSchemaBoxed<br>
permits<br>
[DoubleSchemaBoxedVoid](#doubleschemaboxedvoid),
[DoubleSchemaBoxedBoolean](#doubleschemaboxedboolean),
[DoubleSchemaBoxedNumber](#doubleschemaboxednumber),
[DoubleSchemaBoxedString](#doubleschemaboxedstring),
[DoubleSchemaBoxedList](#doubleschemaboxedlist),
[DoubleSchemaBoxedMap](#doubleschemaboxedmap)

A sealed class that stores validated payloads using boxed classes

## DoubleSchemaBoxedVoid
public static final class DoubleSchemaBoxedVoid<br>
extends DoubleSchemaBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DoubleSchemaBoxedBoolean
public static final class DoubleSchemaBoxedBoolean<br>
extends DoubleSchemaBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DoubleSchemaBoxedString
public static final class DoubleSchemaBoxedString<br>
extends DoubleSchemaBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## DoubleSchema
public static class DoubleSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "double"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Int64Boxed
public static abstract sealed class Int64Boxed<br>
permits<br>
[Int64BoxedVoid](#int64boxedvoid),
[Int64BoxedBoolean](#int64boxedboolean),
[Int64BoxedNumber](#int64boxednumber),
[Int64BoxedString](#int64boxedstring),
[Int64BoxedList](#int64boxedlist),
[Int64BoxedMap](#int64boxedmap)

A sealed class that stores validated payloads using boxed classes

## Int64BoxedVoid
public static final class Int64BoxedVoid<br>
extends Int64Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Int64BoxedBoolean
public static final class Int64BoxedBoolean<br>
extends Int64Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Int64BoxedString
public static final class Int64BoxedString<br>
extends Int64Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Int64
public static class Int64<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "int64"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Int32Boxed
public static abstract sealed class Int32Boxed<br>
permits<br>
[Int32BoxedVoid](#int32boxedvoid),
[Int32BoxedBoolean](#int32boxedboolean),
[Int32BoxedNumber](#int32boxednumber),
[Int32BoxedString](#int32boxedstring),
[Int32BoxedList](#int32boxedlist),
[Int32BoxedMap](#int32boxedmap)

A sealed class that stores validated payloads using boxed classes

## Int32BoxedVoid
public static final class Int32BoxedVoid<br>
extends Int32Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Int32BoxedBoolean
public static final class Int32BoxedBoolean<br>
extends Int32Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Int32BoxedString
public static final class Int32BoxedString<br>
extends Int32Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Int32
public static class Int32<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "int32"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BinaryBoxed
public static abstract sealed class BinaryBoxed<br>
permits<br>
[BinaryBoxedVoid](#binaryboxedvoid),
[BinaryBoxedBoolean](#binaryboxedboolean),
[BinaryBoxedNumber](#binaryboxednumber),
[BinaryBoxedString](#binaryboxedstring),
[BinaryBoxedList](#binaryboxedlist),
[BinaryBoxedMap](#binaryboxedmap)

A sealed class that stores validated payloads using boxed classes

## BinaryBoxedVoid
public static final class BinaryBoxedVoid<br>
extends BinaryBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## BinaryBoxedBoolean
public static final class BinaryBoxedBoolean<br>
extends BinaryBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## BinaryBoxedString
public static final class BinaryBoxedString<br>
extends BinaryBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Binary
public static class Binary<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "binary"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NumberSchemaBoxed
public static abstract sealed class NumberSchemaBoxed<br>
permits<br>
[NumberSchemaBoxedVoid](#numberschemaboxedvoid),
[NumberSchemaBoxedBoolean](#numberschemaboxedboolean),
[NumberSchemaBoxedNumber](#numberschemaboxednumber),
[NumberSchemaBoxedString](#numberschemaboxedstring),
[NumberSchemaBoxedList](#numberschemaboxedlist),
[NumberSchemaBoxedMap](#numberschemaboxedmap)

A sealed class that stores validated payloads using boxed classes

## NumberSchemaBoxedVoid
public static final class NumberSchemaBoxedVoid<br>
extends NumberSchemaBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NumberSchemaBoxedBoolean
public static final class NumberSchemaBoxedBoolean<br>
extends NumberSchemaBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## NumberSchemaBoxedString
public static final class NumberSchemaBoxedString<br>
extends NumberSchemaBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## NumberSchema
public static class NumberSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "number"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DatetimeBoxed
public static abstract sealed class DatetimeBoxed<br>
permits<br>
[DatetimeBoxedVoid](#datetimeboxedvoid),
[DatetimeBoxedBoolean](#datetimeboxedboolean),
[DatetimeBoxedNumber](#datetimeboxednumber),
[DatetimeBoxedString](#datetimeboxedstring),
[DatetimeBoxedList](#datetimeboxedlist),
[DatetimeBoxedMap](#datetimeboxedmap)

A sealed class that stores validated payloads using boxed classes

## DatetimeBoxedVoid
public static final class DatetimeBoxedVoid<br>
extends DatetimeBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DatetimeBoxedBoolean
public static final class DatetimeBoxedBoolean<br>
extends DatetimeBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DatetimeBoxedString
public static final class DatetimeBoxedString<br>
extends DatetimeBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Datetime
public static class Datetime<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "date-time"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DateBoxed
public static abstract sealed class DateBoxed<br>
permits<br>
[DateBoxedVoid](#dateboxedvoid),
[DateBoxedBoolean](#dateboxedboolean),
[DateBoxedNumber](#dateboxednumber),
[DateBoxedString](#dateboxedstring),
[DateBoxedList](#dateboxedlist),
[DateBoxedMap](#dateboxedmap)

A sealed class that stores validated payloads using boxed classes

## DateBoxedVoid
public static final class DateBoxedVoid<br>
extends DateBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## DateBoxedBoolean
public static final class DateBoxedBoolean<br>
extends DateBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## DateBoxedString
public static final class DateBoxedString<br>
extends DateBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Date
public static class Date<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "date"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UuidSchemaBoxed
public static abstract sealed class UuidSchemaBoxed<br>
permits<br>
[UuidSchemaBoxedVoid](#uuidschemaboxedvoid),
[UuidSchemaBoxedBoolean](#uuidschemaboxedboolean),
[UuidSchemaBoxedNumber](#uuidschemaboxednumber),
[UuidSchemaBoxedString](#uuidschemaboxedstring),
[UuidSchemaBoxedList](#uuidschemaboxedlist),
[UuidSchemaBoxedMap](#uuidschemaboxedmap)

A sealed class that stores validated payloads using boxed classes

## UuidSchemaBoxedVoid
public static final class UuidSchemaBoxedVoid<br>
extends UuidSchemaBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## UuidSchemaBoxedBoolean
public static final class UuidSchemaBoxedBoolean<br>
extends UuidSchemaBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## UuidSchemaBoxedString
public static final class UuidSchemaBoxedString<br>
extends UuidSchemaBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UuidSchema
public static class UuidSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uuid"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
