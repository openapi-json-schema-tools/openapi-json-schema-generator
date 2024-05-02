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
| sealed interface | [AnyTypeAndFormat.FloatSchemaBoxed](#floatschemaboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.FloatSchemaBoxedVoid](#floatschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.FloatSchemaBoxedBoolean](#floatschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.FloatSchemaBoxedNumber](#floatschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.FloatSchemaBoxedString](#floatschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.FloatSchemaBoxedList](#floatschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.FloatSchemaBoxedMap](#floatschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.FloatSchema](#floatschema)<br> schema class |
| sealed interface | [AnyTypeAndFormat.DoubleSchemaBoxed](#doubleschemaboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.DoubleSchemaBoxedVoid](#doubleschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.DoubleSchemaBoxedBoolean](#doubleschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.DoubleSchemaBoxedNumber](#doubleschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.DoubleSchemaBoxedString](#doubleschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.DoubleSchemaBoxedList](#doubleschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.DoubleSchemaBoxedMap](#doubleschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.DoubleSchema](#doubleschema)<br> schema class |
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
| sealed interface | [AnyTypeAndFormat.NumberSchemaBoxed](#numberschemaboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.NumberSchemaBoxedVoid](#numberschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.NumberSchemaBoxedBoolean](#numberschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.NumberSchemaBoxedNumber](#numberschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.NumberSchemaBoxedString](#numberschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.NumberSchemaBoxedList](#numberschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.NumberSchemaBoxedMap](#numberschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.NumberSchema](#numberschema)<br> schema class |
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
| sealed interface | [AnyTypeAndFormat.UuidSchemaBoxed](#uuidschemaboxed)<br> sealed interface for validated payloads |
| record | [AnyTypeAndFormat.UuidSchemaBoxedVoid](#uuidschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyTypeAndFormat.UuidSchemaBoxedBoolean](#uuidschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyTypeAndFormat.UuidSchemaBoxedNumber](#uuidschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyTypeAndFormat.UuidSchemaBoxedString](#uuidschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [AnyTypeAndFormat.UuidSchemaBoxedList](#uuidschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [AnyTypeAndFormat.UuidSchemaBoxedMap](#uuidschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyTypeAndFormat.UuidSchema](#uuidschema)<br> schema class |

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("uuid", [UuidSchema.class](#uuidschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date-time", [Datetime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberSchema.class](#numberschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleSchema.class](#doubleschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatSchema.class](#floatschema)))<br>)<br> |

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
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setUuid(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | date(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | dateHyphenMinusTime(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setNumber(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | binary(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int32(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | int64(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setDouble(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(Nothing? value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(boolean value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(String value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(int value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(float value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(long value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(double value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(List<?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | setFloat(Map<String, ?> value) |
| [AnyTypeAndFormatMapBuilder](#anytypeandformatmapbuilder) | additionalProperty(String key, Nothing? value) |
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
public sealed interface FloatSchemaBoxed<br>
permits<br>
[FloatSchemaBoxedVoid](#floatschemaboxedvoid),
[FloatSchemaBoxedBoolean](#floatschemaboxedboolean),
[FloatSchemaBoxedNumber](#floatschemaboxednumber),
[FloatSchemaBoxedString](#floatschemaboxedstring),
[FloatSchemaBoxedList](#floatschemaboxedlist),
[FloatSchemaBoxedMap](#floatschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## FloatSchemaBoxedVoid
public record FloatSchemaBoxedVoid<br>
implements [FloatSchemaBoxed](#floatschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatSchemaBoxedBoolean
public record FloatSchemaBoxedBoolean<br>
implements [FloatSchemaBoxed](#floatschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatSchemaBoxedNumber
public record FloatSchemaBoxedNumber<br>
implements [FloatSchemaBoxed](#floatschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatSchemaBoxedString
public record FloatSchemaBoxedString<br>
implements [FloatSchemaBoxed](#floatschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatSchemaBoxedList
public record FloatSchemaBoxedList<br>
implements [FloatSchemaBoxed](#floatschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FloatSchemaBoxedMap
public record FloatSchemaBoxedMap<br>
implements [FloatSchemaBoxed](#floatschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxedString](#floatschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxedVoid](#floatschemaboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxedNumber](#floatschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxedBoolean](#floatschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxedMap](#floatschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxedList](#floatschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [FloatSchemaBoxed](#floatschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## DoubleSchemaBoxed
public sealed interface DoubleSchemaBoxed<br>
permits<br>
[DoubleSchemaBoxedVoid](#doubleschemaboxedvoid),
[DoubleSchemaBoxedBoolean](#doubleschemaboxedboolean),
[DoubleSchemaBoxedNumber](#doubleschemaboxednumber),
[DoubleSchemaBoxedString](#doubleschemaboxedstring),
[DoubleSchemaBoxedList](#doubleschemaboxedlist),
[DoubleSchemaBoxedMap](#doubleschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## DoubleSchemaBoxedVoid
public record DoubleSchemaBoxedVoid<br>
implements [DoubleSchemaBoxed](#doubleschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleSchemaBoxedBoolean
public record DoubleSchemaBoxedBoolean<br>
implements [DoubleSchemaBoxed](#doubleschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleSchemaBoxedNumber
public record DoubleSchemaBoxedNumber<br>
implements [DoubleSchemaBoxed](#doubleschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleSchemaBoxedString
public record DoubleSchemaBoxedString<br>
implements [DoubleSchemaBoxed](#doubleschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleSchemaBoxedList
public record DoubleSchemaBoxedList<br>
implements [DoubleSchemaBoxed](#doubleschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DoubleSchemaBoxedMap
public record DoubleSchemaBoxedMap<br>
implements [DoubleSchemaBoxed](#doubleschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DoubleSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxedString](#doubleschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxedVoid](#doubleschemaboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxedNumber](#doubleschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxedBoolean](#doubleschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxedMap](#doubleschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxedList](#doubleschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DoubleSchemaBoxed](#doubleschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Int64BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Int64BoxedString](#int64boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Int64BoxedVoid](#int64boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
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
| Int32BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [Int32BoxedString](#int32boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [Int32BoxedVoid](#int32boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
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
| BinaryBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [BinaryBoxedString](#binaryboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [BinaryBoxedVoid](#binaryboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [BinaryBoxedNumber](#binaryboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [BinaryBoxedBoolean](#binaryboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [BinaryBoxedMap](#binaryboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [BinaryBoxedList](#binaryboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [BinaryBoxed](#binaryboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## NumberSchemaBoxed
public sealed interface NumberSchemaBoxed<br>
permits<br>
[NumberSchemaBoxedVoid](#numberschemaboxedvoid),
[NumberSchemaBoxedBoolean](#numberschemaboxedboolean),
[NumberSchemaBoxedNumber](#numberschemaboxednumber),
[NumberSchemaBoxedString](#numberschemaboxedstring),
[NumberSchemaBoxedList](#numberschemaboxedlist),
[NumberSchemaBoxedMap](#numberschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## NumberSchemaBoxedVoid
public record NumberSchemaBoxedVoid<br>
implements [NumberSchemaBoxed](#numberschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberSchemaBoxedBoolean
public record NumberSchemaBoxedBoolean<br>
implements [NumberSchemaBoxed](#numberschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberSchemaBoxedNumber
public record NumberSchemaBoxedNumber<br>
implements [NumberSchemaBoxed](#numberschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberSchemaBoxedString
public record NumberSchemaBoxedString<br>
implements [NumberSchemaBoxed](#numberschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberSchemaBoxedList
public record NumberSchemaBoxedList<br>
implements [NumberSchemaBoxed](#numberschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberSchemaBoxedMap
public record NumberSchemaBoxedMap<br>
implements [NumberSchemaBoxed](#numberschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxedString](#numberschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxedVoid](#numberschemaboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxedNumber](#numberschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxedBoolean](#numberschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxedMap](#numberschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxedList](#numberschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [NumberSchemaBoxed](#numberschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| DatetimeBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DatetimeBoxedString](#datetimeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DatetimeBoxedVoid](#datetimeboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
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
| DateBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [DateBoxedString](#dateboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateBoxedVoid](#dateboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [DateBoxedNumber](#dateboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [DateBoxedBoolean](#dateboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [DateBoxedMap](#dateboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [DateBoxedList](#dateboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [DateBoxed](#dateboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UuidSchemaBoxed
public sealed interface UuidSchemaBoxed<br>
permits<br>
[UuidSchemaBoxedVoid](#uuidschemaboxedvoid),
[UuidSchemaBoxedBoolean](#uuidschemaboxedboolean),
[UuidSchemaBoxedNumber](#uuidschemaboxednumber),
[UuidSchemaBoxedString](#uuidschemaboxedstring),
[UuidSchemaBoxedList](#uuidschemaboxedlist),
[UuidSchemaBoxedMap](#uuidschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## UuidSchemaBoxedVoid
public record UuidSchemaBoxedVoid<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidSchemaBoxedBoolean
public record UuidSchemaBoxedBoolean<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidSchemaBoxedNumber
public record UuidSchemaBoxedNumber<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidSchemaBoxedString
public record UuidSchemaBoxedString<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidSchemaBoxedList
public record UuidSchemaBoxedList<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UuidSchemaBoxedMap
public record UuidSchemaBoxedMap<br>
implements [UuidSchemaBoxed](#uuidschemaboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidSchemaBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxedString](#uuidschemaboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxedVoid](#uuidschemaboxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxedNumber](#uuidschemaboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxedBoolean](#uuidschemaboxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxedMap](#uuidschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxedList](#uuidschemaboxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [UuidSchemaBoxed](#uuidschemaboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
