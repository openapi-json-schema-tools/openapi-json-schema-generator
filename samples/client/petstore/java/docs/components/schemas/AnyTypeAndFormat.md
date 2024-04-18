# AnyTypeAndFormat
org.openapijsonschematools.client.components.schemas.AnyTypeAndFormat.java
public class AnyTypeAndFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AnyTypeAndFormat.AnyTypeAndFormat1Boxed](#anytypeandformat1boxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.AnyTypeAndFormat1BoxedMap](#anytypeandformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.AnyTypeAndFormat1](#anytypeandformat1)<br> schema class |
| static class | [AnyTypeAndFormat.AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder)<br> builder for Map payloads |
| static class | [AnyTypeAndFormat.AnyTypeAndFormatMap](#anytypeandformatmap)<br> output class for Map payloads |
| sealed interface | [AnyTypeAndFormat.FloatBoxed](#floatboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.FloatBoxedVoid](#floatboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.FloatBoxedBoolean](#floatboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.FloatBoxedNumber](#floatboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.FloatBoxedString](#floatboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.FloatBoxedList](#floatboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.FloatBoxedMap](#floatboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Float](#float)<br> schema class |
| sealed interface | [AnyTypeAndFormat.DoubleBoxed](#doubleboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.DoubleBoxedVoid](#doubleboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.DoubleBoxedBoolean](#doubleboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.DoubleBoxedNumber](#doubleboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.DoubleBoxedString](#doubleboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.DoubleBoxedList](#doubleboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.DoubleBoxedMap](#doubleboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Double](#double)<br> schema class |
| sealed interface | [AnyTypeAndFormat.Int64Boxed](#int64boxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.Int64BoxedVoid](#int64boxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.Int64BoxedBoolean](#int64boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.Int64BoxedNumber](#int64boxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.Int64BoxedString](#int64boxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.Int64BoxedList](#int64boxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.Int64BoxedMap](#int64boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Int64](#int64)<br> schema class |
| sealed interface | [AnyTypeAndFormat.Int32Boxed](#int32boxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.Int32BoxedVoid](#int32boxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.Int32BoxedBoolean](#int32boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.Int32BoxedNumber](#int32boxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.Int32BoxedString](#int32boxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.Int32BoxedList](#int32boxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.Int32BoxedMap](#int32boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Int32](#int32)<br> schema class |
| sealed interface | [AnyTypeAndFormat.BinaryBoxed](#binaryboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.BinaryBoxedVoid](#binaryboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.BinaryBoxedBoolean](#binaryboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.BinaryBoxedNumber](#binaryboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.BinaryBoxedString](#binaryboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.BinaryBoxedList](#binaryboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.BinaryBoxedMap](#binaryboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Binary](#binary)<br> schema class |
| sealed interface | [AnyTypeAndFormat.NumberBoxed](#numberboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.NumberBoxedVoid](#numberboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.NumberBoxedBoolean](#numberboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.NumberBoxedNumber](#numberboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.NumberBoxedString](#numberboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.NumberBoxedList](#numberboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.NumberBoxedMap](#numberboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Number](#number)<br> schema class |
| sealed interface | [AnyTypeAndFormat.DatetimeBoxed](#datetimeboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.DatetimeBoxedVoid](#datetimeboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.DatetimeBoxedBoolean](#datetimeboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.DatetimeBoxedNumber](#datetimeboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.DatetimeBoxedString](#datetimeboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.DatetimeBoxedList](#datetimeboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.DatetimeBoxedMap](#datetimeboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Datetime](#datetime)<br> schema class |
| sealed interface | [AnyTypeAndFormat.DateBoxed](#dateboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.DateBoxedVoid](#dateboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.DateBoxedBoolean](#dateboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.DateBoxedNumber](#dateboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.DateBoxedString](#dateboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.DateBoxedList](#dateboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.DateBoxedMap](#dateboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Date](#date)<br> schema class |
| sealed interface | [AnyTypeAndFormat.UuidBoxed](#uuidboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.UuidBoxedVoid](#uuidboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.UuidBoxedBoolean](#uuidboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.UuidBoxedNumber](#uuidboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.UuidBoxedString](#uuidboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.UuidBoxedList](#uuidboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.UuidBoxedMap](#uuidboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.Uuid](#uuid)<br> schema class |

## AnyTypeAndFormat1Boxed
public sealed interface AnyTypeAndFormat1Boxed<br>
permits<br>
[AnyTypeAndFormat1BoxedMap](#anytypeandformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AnyTypeAndFormat1BoxedMap
public record AnyTypeAndFormat1BoxedMap<br>
implements [AnyTypeAndFormat1Boxed](#anytypeandformat1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyTypeAndFormat1BoxedMap([AnyTypeAndFormatMap](#anytypeandformatmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnyTypeAndFormatMap](#anytypeandformatmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.AnyTypeAndFormat;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuid", [Uuid.class](#uuid))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date-time", [Datetime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [Number.class](#number))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [Double.class](#double))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [Float.class](#float)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnyTypeAndFormatMap](#anytypeandformatmap) | validate([Map&lt;?, ?&gt;](#anytypeandformatmapbuilder) arg, SchemaConfiguration configuration) |
| [AnyTypeAndFormat1BoxedMap](#anytypeandformat1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#anytypeandformatmapbuilder) arg, SchemaConfiguration configuration) |
| [AnyTypeAndFormat1Boxed](#anytypeandformat1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | uuid(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | number(Map<String, ?> value) |
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
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | double(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(Void value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | float(Map<String, ?> value) |
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
| @Nullable Object | uuid()<br>[optional] value must be a uuid |
| @Nullable Object | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| @Nullable Object | number()<br>[optional] value must be int or float numeric |
| @Nullable Object | binary()<br>[optional] |
| @Nullable Object | int32()<br>[optional] value must be a 32 bit integer |
| @Nullable Object | int64()<br>[optional] value must be a 64 bit integer |
| @Nullable Object | double()<br>[optional] value must be a 64 bit float |
| @Nullable Object | float()<br>[optional] value must be a 32 bit float |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["date-time"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## FloatBoxed
public sealed interface FloatBoxed<br>
permits<br>
[FloatBoxedVoid](#floatboxedvoid),
[FloatBoxedBoolean](#floatboxedboolean),
[FloatBoxedNumber](#floatboxednumber),
[FloatBoxedString](#floatboxedstring),
[FloatBoxedList](#floatboxedlist),
[FloatBoxedMap](#floatboxedmap)

sealed interface that stores validated payloads using boxed classes

## FloatBoxedVoid
public record FloatBoxedVoid<br>
implements [FloatBoxed](#floatboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatBoxedBoolean
public record FloatBoxedBoolean<br>
implements [FloatBoxed](#floatboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatBoxedNumber
public record FloatBoxedNumber<br>
implements [FloatBoxed](#floatboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatBoxedString
public record FloatBoxedString<br>
implements [FloatBoxed](#floatboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatBoxedList
public record FloatBoxedList<br>
implements [FloatBoxed](#floatboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatBoxedMap
public record FloatBoxedMap<br>
implements [FloatBoxed](#floatboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Float
public static class Float<br>
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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [FloatBoxedString](#floatboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FloatBoxedVoid](#floatboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [FloatBoxedNumber](#floatboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FloatBoxedBoolean](#floatboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [FloatBoxedMap](#floatboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [FloatBoxedList](#floatboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [FloatBoxed](#floatboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## DoubleBoxed
public sealed interface DoubleBoxed<br>
permits<br>
[DoubleBoxedVoid](#doubleboxedvoid),
[DoubleBoxedBoolean](#doubleboxedboolean),
[DoubleBoxedNumber](#doubleboxednumber),
[DoubleBoxedString](#doubleboxedstring),
[DoubleBoxedList](#doubleboxedlist),
[DoubleBoxedMap](#doubleboxedmap)

sealed interface that stores validated payloads using boxed classes

## DoubleBoxedVoid
public record DoubleBoxedVoid<br>
implements [DoubleBoxed](#doubleboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleBoxedBoolean
public record DoubleBoxedBoolean<br>
implements [DoubleBoxed](#doubleboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleBoxedNumber
public record DoubleBoxedNumber<br>
implements [DoubleBoxed](#doubleboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleBoxedString
public record DoubleBoxedString<br>
implements [DoubleBoxed](#doubleboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleBoxedList
public record DoubleBoxedList<br>
implements [DoubleBoxed](#doubleboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleBoxedMap
public record DoubleBoxedMap<br>
implements [DoubleBoxed](#doubleboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Double
public static class Double<br>
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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DoubleBoxedString](#doubleboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DoubleBoxedVoid](#doubleboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DoubleBoxedNumber](#doubleboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DoubleBoxedBoolean](#doubleboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DoubleBoxedMap](#doubleboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DoubleBoxedList](#doubleboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DoubleBoxed](#doubleboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Int64Boxed
public sealed interface Int64Boxed<br>
permits<br>
[Int64BoxedVoid](#int64boxedvoid),
[Int64BoxedBoolean](#int64boxedboolean),
[Int64BoxedNumber](#int64boxednumber),
[Int64BoxedString](#int64boxedstring),
[Int64BoxedList](#int64boxedlist),
[Int64BoxedMap](#int64boxedmap)

sealed interface that stores validated payloads using boxed classes

## Int64BoxedVoid
public record Int64BoxedVoid<br>
implements [Int64Boxed](#int64boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int64BoxedBoolean
public record Int64BoxedBoolean<br>
implements [Int64Boxed](#int64boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int64BoxedNumber
public record Int64BoxedNumber<br>
implements [Int64Boxed](#int64boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int64BoxedString
public record Int64BoxedString<br>
implements [Int64Boxed](#int64boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int64BoxedList
public record Int64BoxedList<br>
implements [Int64Boxed](#int64boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int64BoxedMap
public record Int64BoxedMap<br>
implements [Int64Boxed](#int64boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int64BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Int64BoxedString](#int64boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Int64BoxedVoid](#int64boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Int64BoxedNumber](#int64boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Int64BoxedBoolean](#int64boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Int64BoxedMap](#int64boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Int64BoxedList](#int64boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Int64Boxed](#int64boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Int32Boxed
public sealed interface Int32Boxed<br>
permits<br>
[Int32BoxedVoid](#int32boxedvoid),
[Int32BoxedBoolean](#int32boxedboolean),
[Int32BoxedNumber](#int32boxednumber),
[Int32BoxedString](#int32boxedstring),
[Int32BoxedList](#int32boxedlist),
[Int32BoxedMap](#int32boxedmap)

sealed interface that stores validated payloads using boxed classes

## Int32BoxedVoid
public record Int32BoxedVoid<br>
implements [Int32Boxed](#int32boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int32BoxedBoolean
public record Int32BoxedBoolean<br>
implements [Int32Boxed](#int32boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int32BoxedNumber
public record Int32BoxedNumber<br>
implements [Int32Boxed](#int32boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int32BoxedString
public record Int32BoxedString<br>
implements [Int32Boxed](#int32boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int32BoxedList
public record Int32BoxedList<br>
implements [Int32Boxed](#int32boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Int32BoxedMap
public record Int32BoxedMap<br>
implements [Int32Boxed](#int32boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Int32BoxedString](#int32boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Int32BoxedVoid](#int32boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [Int32BoxedNumber](#int32boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [Int32BoxedBoolean](#int32boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [Int32BoxedMap](#int32boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [Int32BoxedList](#int32boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [Int32Boxed](#int32boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## BinaryBoxed
public sealed interface BinaryBoxed<br>
permits<br>
[BinaryBoxedVoid](#binaryboxedvoid),
[BinaryBoxedBoolean](#binaryboxedboolean),
[BinaryBoxedNumber](#binaryboxednumber),
[BinaryBoxedString](#binaryboxedstring),
[BinaryBoxedList](#binaryboxedlist),
[BinaryBoxedMap](#binaryboxedmap)

sealed interface that stores validated payloads using boxed classes

## BinaryBoxedVoid
public record BinaryBoxedVoid<br>
implements [BinaryBoxed](#binaryboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BinaryBoxedBoolean
public record BinaryBoxedBoolean<br>
implements [BinaryBoxed](#binaryboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BinaryBoxedNumber
public record BinaryBoxedNumber<br>
implements [BinaryBoxed](#binaryboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BinaryBoxedString
public record BinaryBoxedString<br>
implements [BinaryBoxed](#binaryboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BinaryBoxedList
public record BinaryBoxedList<br>
implements [BinaryBoxed](#binaryboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BinaryBoxedMap
public record BinaryBoxedMap<br>
implements [BinaryBoxed](#binaryboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BinaryBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [BinaryBoxedString](#binaryboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [BinaryBoxedVoid](#binaryboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [BinaryBoxedNumber](#binaryboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [BinaryBoxedBoolean](#binaryboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [BinaryBoxedMap](#binaryboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [BinaryBoxedList](#binaryboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [BinaryBoxed](#binaryboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NumberBoxed
public sealed interface NumberBoxed<br>
permits<br>
[NumberBoxedVoid](#numberboxedvoid),
[NumberBoxedBoolean](#numberboxedboolean),
[NumberBoxedNumber](#numberboxednumber),
[NumberBoxedString](#numberboxedstring),
[NumberBoxedList](#numberboxedlist),
[NumberBoxedMap](#numberboxedmap)

sealed interface that stores validated payloads using boxed classes

## NumberBoxedVoid
public record NumberBoxedVoid<br>
implements [NumberBoxed](#numberboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberBoxedBoolean
public record NumberBoxedBoolean<br>
implements [NumberBoxed](#numberboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberBoxedNumber
public record NumberBoxedNumber<br>
implements [NumberBoxed](#numberboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberBoxedString
public record NumberBoxedString<br>
implements [NumberBoxed](#numberboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberBoxedList
public record NumberBoxedList<br>
implements [NumberBoxed](#numberboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberBoxedMap
public record NumberBoxedMap<br>
implements [NumberBoxed](#numberboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Number
public static class Number<br>
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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [NumberBoxedString](#numberboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NumberBoxedVoid](#numberboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [NumberBoxedNumber](#numberboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NumberBoxedBoolean](#numberboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NumberBoxedMap](#numberboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NumberBoxedList](#numberboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [NumberBoxed](#numberboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## DatetimeBoxed
public sealed interface DatetimeBoxed<br>
permits<br>
[DatetimeBoxedVoid](#datetimeboxedvoid),
[DatetimeBoxedBoolean](#datetimeboxedboolean),
[DatetimeBoxedNumber](#datetimeboxednumber),
[DatetimeBoxedString](#datetimeboxedstring),
[DatetimeBoxedList](#datetimeboxedlist),
[DatetimeBoxedMap](#datetimeboxedmap)

sealed interface that stores validated payloads using boxed classes

## DatetimeBoxedVoid
public record DatetimeBoxedVoid<br>
implements [DatetimeBoxed](#datetimeboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DatetimeBoxedBoolean
public record DatetimeBoxedBoolean<br>
implements [DatetimeBoxed](#datetimeboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DatetimeBoxedNumber
public record DatetimeBoxedNumber<br>
implements [DatetimeBoxed](#datetimeboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DatetimeBoxedString
public record DatetimeBoxedString<br>
implements [DatetimeBoxed](#datetimeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DatetimeBoxedList
public record DatetimeBoxedList<br>
implements [DatetimeBoxed](#datetimeboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DatetimeBoxedMap
public record DatetimeBoxedMap<br>
implements [DatetimeBoxed](#datetimeboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DatetimeBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DatetimeBoxedString](#datetimeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DatetimeBoxedVoid](#datetimeboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DatetimeBoxedNumber](#datetimeboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DatetimeBoxedBoolean](#datetimeboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DatetimeBoxedMap](#datetimeboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DatetimeBoxedList](#datetimeboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DatetimeBoxed](#datetimeboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## DateBoxed
public sealed interface DateBoxed<br>
permits<br>
[DateBoxedVoid](#dateboxedvoid),
[DateBoxedBoolean](#dateboxedboolean),
[DateBoxedNumber](#dateboxednumber),
[DateBoxedString](#dateboxedstring),
[DateBoxedList](#dateboxedlist),
[DateBoxedMap](#dateboxedmap)

sealed interface that stores validated payloads using boxed classes

## DateBoxedVoid
public record DateBoxedVoid<br>
implements [DateBoxed](#dateboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateBoxedBoolean
public record DateBoxedBoolean<br>
implements [DateBoxed](#dateboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateBoxedNumber
public record DateBoxedNumber<br>
implements [DateBoxed](#dateboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateBoxedString
public record DateBoxedString<br>
implements [DateBoxed](#dateboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateBoxedList
public record DateBoxedList<br>
implements [DateBoxed](#dateboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateBoxedMap
public record DateBoxedMap<br>
implements [DateBoxed](#dateboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DateBoxedString](#dateboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateBoxedVoid](#dateboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [DateBoxedNumber](#dateboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DateBoxedBoolean](#dateboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DateBoxedMap](#dateboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DateBoxedList](#dateboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DateBoxed](#dateboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UuidBoxed
public sealed interface UuidBoxed<br>
permits<br>
[UuidBoxedVoid](#uuidboxedvoid),
[UuidBoxedBoolean](#uuidboxedboolean),
[UuidBoxedNumber](#uuidboxednumber),
[UuidBoxedString](#uuidboxedstring),
[UuidBoxedList](#uuidboxedlist),
[UuidBoxedMap](#uuidboxedmap)

sealed interface that stores validated payloads using boxed classes

## UuidBoxedVoid
public record UuidBoxedVoid<br>
implements [UuidBoxed](#uuidboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidBoxedBoolean
public record UuidBoxedBoolean<br>
implements [UuidBoxed](#uuidboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidBoxedNumber
public record UuidBoxedNumber<br>
implements [UuidBoxed](#uuidboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidBoxedString
public record UuidBoxedString<br>
implements [UuidBoxed](#uuidboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidBoxedList
public record UuidBoxedList<br>
implements [UuidBoxed](#uuidboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidBoxedMap
public record UuidBoxedMap<br>
implements [UuidBoxed](#uuidboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Uuid
public static class Uuid<br>
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
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [UuidBoxedString](#uuidboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UuidBoxedVoid](#uuidboxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [UuidBoxedNumber](#uuidboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UuidBoxedBoolean](#uuidboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UuidBoxedMap](#uuidboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UuidBoxedList](#uuidboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UuidBoxed](#uuidboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
