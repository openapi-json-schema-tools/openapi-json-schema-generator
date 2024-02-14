# Application1xwwwformurlencodedSchema
public class Application1xwwwformurlencodedSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1Boxed](#application1xwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1](#application1xwwwformurlencodedschema1)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedCallbackBoxed](#application1xwwwformurlencodedcallbackboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedCallbackBoxedString](#application1xwwwformurlencodedcallbackboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedCallback](#application1xwwwformurlencodedcallback)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPasswordBoxed](#application1xwwwformurlencodedpasswordboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPasswordBoxedString](#application1xwwwformurlencodedpasswordboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPassword](#application1xwwwformurlencodedpassword)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDateTimeBoxed](#application1xwwwformurlencodeddatetimeboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDateTimeBoxedString](#application1xwwwformurlencodeddatetimeboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDateTime](#application1xwwwformurlencodeddatetime)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDateBoxed](#application1xwwwformurlencodeddateboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDateBoxedString](#application1xwwwformurlencodeddateboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDate](#application1xwwwformurlencodeddate)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedBinaryBoxed](#application1xwwwformurlencodedbinaryboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedBinary](#application1xwwwformurlencodedbinary)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedByteBoxed](#application1xwwwformurlencodedbyteboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedByteBoxedString](#application1xwwwformurlencodedbyteboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedByte](#application1xwwwformurlencodedbyte)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPatternWithoutDelimiterBoxed](#application1xwwwformurlencodedpatternwithoutdelimiterboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPatternWithoutDelimiterBoxedString](#application1xwwwformurlencodedpatternwithoutdelimiterboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPatternWithoutDelimiter](#application1xwwwformurlencodedpatternwithoutdelimiter)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedStringBoxed](#application1xwwwformurlencodedstringboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedStringBoxedString](#application1xwwwformurlencodedstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedString](#application1xwwwformurlencodedstring)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDoubleBoxed](#application1xwwwformurlencodeddoubleboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDoubleBoxedNumber](#application1xwwwformurlencodeddoubleboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDouble](#application1xwwwformurlencodeddouble)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedFloatBoxed](#application1xwwwformurlencodedfloatboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedFloatBoxedNumber](#application1xwwwformurlencodedfloatboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedFloat](#application1xwwwformurlencodedfloat)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedNumberBoxed](#application1xwwwformurlencodednumberboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedNumberBoxedNumber](#application1xwwwformurlencodednumberboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedNumber](#application1xwwwformurlencodednumber)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt64Boxed](#application1xwwwformurlencodedint64boxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt64BoxedNumber](#application1xwwwformurlencodedint64boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt64](#application1xwwwformurlencodedint64)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt32Boxed](#application1xwwwformurlencodedint32boxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt32BoxedNumber](#application1xwwwformurlencodedint32boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt32](#application1xwwwformurlencodedint32)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedIntegerBoxed](#application1xwwwformurlencodedintegerboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedIntegerBoxedNumber](#application1xwwwformurlencodedintegerboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInteger](#application1xwwwformurlencodedinteger)<br> schema class |

## Application1xwwwformurlencodedSchema1Boxed
public static abstract sealed class Application1xwwwformurlencodedSchema1Boxed<br>
permits<br>
[Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedSchema1BoxedMap
public static final class Application1xwwwformurlencodedSchema1BoxedMap<br>
extends [Application1xwwwformurlencodedSchema1Boxed](#application1xwwwformurlencodedschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchema1BoxedMap([Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | data<br>validated payload |

## Application1xwwwformurlencodedSchema1
public static class Application1xwwwformurlencodedSchema1<br>
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
Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMap validatedPayload =
    Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1.validate(
    new Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMapBuilder()
        .setByte("a")

        .setDouble(3.14d)

        .setNumber(1)

        .pattern_without_delimiter("AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>")

        .setInteger(1)

        .int32(1)

        .int64(1L)

        .setFloat(3.14f)

        .setString("A")

        .binary("a")

        .date("2020-12-13")

        .dateTime("1970-01-01T00:00:00.00Z")

        .password("a")

        .callback("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [Application1xwwwformurlencodedInteger.class](#application1xwwwformurlencodedinteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Application1xwwwformurlencodedInt32.class](#application1xwwwformurlencodedint32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Application1xwwwformurlencodedInt64.class](#application1xwwwformurlencodedint64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [Application1xwwwformurlencodedNumber.class](#application1xwwwformurlencodednumber))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [Application1xwwwformurlencodedFloat.class](#application1xwwwformurlencodedfloat))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [Application1xwwwformurlencodedDouble.class](#application1xwwwformurlencodeddouble))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [Application1xwwwformurlencodedString.class](#application1xwwwformurlencodedstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_without_delimiter", [Application1xwwwformurlencodedPatternWithoutDelimiter.class](#application1xwwwformurlencodedpatternwithoutdelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [Application1xwwwformurlencodedByte.class](#application1xwwwformurlencodedbyte))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Application1xwwwformurlencodedBinary.class](#application1xwwwformurlencodedbinary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Application1xwwwformurlencodedDate.class](#application1xwwwformurlencodeddate))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [Application1xwwwformurlencodedDateTime.class](#application1xwwwformurlencodeddatetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Application1xwwwformurlencodedPassword.class](#application1xwwwformurlencodedpassword))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("callback", [Application1xwwwformurlencodedCallback.class](#application1xwwwformurlencodedcallback)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double",<br>&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;"pattern_without_delimiter"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedSchemaMap0000Builder
public class Application1xwwwformurlencodedSchemaMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setInteger(int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setInteger(float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setInteger(long value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setInteger(double value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | int32(int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | int32(float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | int64(int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | int64(float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | int64(long value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | int64(double value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setFloat(int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setFloat(float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setFloat(long value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setFloat(double value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setString(String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | binary(String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | date(String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | dateTime(String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | password(String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | callback(String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, Void value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, boolean value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, String value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, long value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, double value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, List<?> value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, Map<String, ?> value) |

## Application1xwwwformurlencodedSchemaMap0001Builder
public class Application1xwwwformurlencodedSchemaMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap0010Builder
public class Application1xwwwformurlencodedSchemaMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setNumber(double value) |

## Application1xwwwformurlencodedSchemaMap0011Builder
public class Application1xwwwformurlencodedSchemaMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setNumber(double value) |
| [Application1xwwwformurlencodedSchemaMap0010Builder](#application1xwwwformurlencodedschemamap0010builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap0100Builder
public class Application1xwwwformurlencodedSchemaMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setDouble(double value) |

## Application1xwwwformurlencodedSchemaMap0101Builder
public class Application1xwwwformurlencodedSchemaMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setDouble(double value) |
| [Application1xwwwformurlencodedSchemaMap0100Builder](#application1xwwwformurlencodedschemamap0100builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap0110Builder
public class Application1xwwwformurlencodedSchemaMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0010Builder](#application1xwwwformurlencodedschemamap0010builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap0010Builder](#application1xwwwformurlencodedschemamap0010builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap0010Builder](#application1xwwwformurlencodedschemamap0010builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap0010Builder](#application1xwwwformurlencodedschemamap0010builder) | setDouble(double value) |
| [Application1xwwwformurlencodedSchemaMap0100Builder](#application1xwwwformurlencodedschemamap0100builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap0100Builder](#application1xwwwformurlencodedschemamap0100builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap0100Builder](#application1xwwwformurlencodedschemamap0100builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap0100Builder](#application1xwwwformurlencodedschemamap0100builder) | setNumber(double value) |

## Application1xwwwformurlencodedSchemaMap0111Builder
public class Application1xwwwformurlencodedSchemaMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0011Builder](#application1xwwwformurlencodedschemamap0011builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap0011Builder](#application1xwwwformurlencodedschemamap0011builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap0011Builder](#application1xwwwformurlencodedschemamap0011builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap0011Builder](#application1xwwwformurlencodedschemamap0011builder) | setDouble(double value) |
| [Application1xwwwformurlencodedSchemaMap0101Builder](#application1xwwwformurlencodedschemamap0101builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap0101Builder](#application1xwwwformurlencodedschemamap0101builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap0101Builder](#application1xwwwformurlencodedschemamap0101builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap0101Builder](#application1xwwwformurlencodedschemamap0101builder) | setNumber(double value) |
| [Application1xwwwformurlencodedSchemaMap0110Builder](#application1xwwwformurlencodedschemamap0110builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap1000Builder
public class Application1xwwwformurlencodedSchemaMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0000Builder](#application1xwwwformurlencodedschemamap0000builder) | setByte(String value) |

## Application1xwwwformurlencodedSchemaMap1001Builder
public class Application1xwwwformurlencodedSchemaMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0001Builder](#application1xwwwformurlencodedschemamap0001builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap1010Builder
public class Application1xwwwformurlencodedSchemaMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0010Builder](#application1xwwwformurlencodedschemamap0010builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setNumber(double value) |

## Application1xwwwformurlencodedSchemaMap1011Builder
public class Application1xwwwformurlencodedSchemaMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0011Builder](#application1xwwwformurlencodedschemamap0011builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setNumber(double value) |
| [Application1xwwwformurlencodedSchemaMap1010Builder](#application1xwwwformurlencodedschemamap1010builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap1100Builder
public class Application1xwwwformurlencodedSchemaMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0100Builder](#application1xwwwformurlencodedschemamap0100builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap1000Builder](#application1xwwwformurlencodedschemamap1000builder) | setDouble(double value) |

## Application1xwwwformurlencodedSchemaMap1101Builder
public class Application1xwwwformurlencodedSchemaMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0101Builder](#application1xwwwformurlencodedschemamap0101builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap1001Builder](#application1xwwwformurlencodedschemamap1001builder) | setDouble(double value) |
| [Application1xwwwformurlencodedSchemaMap1100Builder](#application1xwwwformurlencodedschemamap1100builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap1110Builder
public class Application1xwwwformurlencodedSchemaMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0110Builder](#application1xwwwformurlencodedschemamap0110builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1010Builder](#application1xwwwformurlencodedschemamap1010builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap1010Builder](#application1xwwwformurlencodedschemamap1010builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap1010Builder](#application1xwwwformurlencodedschemamap1010builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap1010Builder](#application1xwwwformurlencodedschemamap1010builder) | setDouble(double value) |
| [Application1xwwwformurlencodedSchemaMap1100Builder](#application1xwwwformurlencodedschemamap1100builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap1100Builder](#application1xwwwformurlencodedschemamap1100builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap1100Builder](#application1xwwwformurlencodedschemamap1100builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap1100Builder](#application1xwwwformurlencodedschemamap1100builder) | setNumber(double value) |

## Application1xwwwformurlencodedSchemaMapBuilder
public class Application1xwwwformurlencodedSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap0111Builder](#application1xwwwformurlencodedschemamap0111builder) | setByte(String value) |
| [Application1xwwwformurlencodedSchemaMap1011Builder](#application1xwwwformurlencodedschemamap1011builder) | setDouble(int value) |
| [Application1xwwwformurlencodedSchemaMap1011Builder](#application1xwwwformurlencodedschemamap1011builder) | setDouble(float value) |
| [Application1xwwwformurlencodedSchemaMap1011Builder](#application1xwwwformurlencodedschemamap1011builder) | setDouble(long value) |
| [Application1xwwwformurlencodedSchemaMap1011Builder](#application1xwwwformurlencodedschemamap1011builder) | setDouble(double value) |
| [Application1xwwwformurlencodedSchemaMap1101Builder](#application1xwwwformurlencodedschemamap1101builder) | setNumber(int value) |
| [Application1xwwwformurlencodedSchemaMap1101Builder](#application1xwwwformurlencodedschemamap1101builder) | setNumber(float value) |
| [Application1xwwwformurlencodedSchemaMap1101Builder](#application1xwwwformurlencodedschemamap1101builder) | setNumber(long value) |
| [Application1xwwwformurlencodedSchemaMap1101Builder](#application1xwwwformurlencodedschemamap1101builder) | setNumber(double value) |
| [Application1xwwwformurlencodedSchemaMap1110Builder](#application1xwwwformurlencodedschemamap1110builder) | pattern_without_delimiter(String value) |

## Application1xwwwformurlencodedSchemaMap
public static class Application1xwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| String | pattern_without_delimiter()<br> |
| Number | int32()<br>[optional] value must be a 32 bit integer |
| Number | int64()<br>[optional] value must be a 64 bit integer |
| String | binary()<br>[optional] |
| String | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | dateTime()<br>[optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| String | password()<br>[optional] |
| String | callback()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"],  |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application1xwwwformurlencodedCallbackBoxed
public static abstract sealed class Application1xwwwformurlencodedCallbackBoxed<br>
permits<br>
[Application1xwwwformurlencodedCallbackBoxedString](#application1xwwwformurlencodedcallbackboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedCallbackBoxedString
public static final class Application1xwwwformurlencodedCallbackBoxedString<br>
extends [Application1xwwwformurlencodedCallbackBoxed](#application1xwwwformurlencodedcallbackboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedCallbackBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedCallback
public static class Application1xwwwformurlencodedCallback<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application1xwwwformurlencodedPasswordBoxed
public static abstract sealed class Application1xwwwformurlencodedPasswordBoxed<br>
permits<br>
[Application1xwwwformurlencodedPasswordBoxedString](#application1xwwwformurlencodedpasswordboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedPasswordBoxedString
public static final class Application1xwwwformurlencodedPasswordBoxedString<br>
extends [Application1xwwwformurlencodedPasswordBoxed](#application1xwwwformurlencodedpasswordboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedPasswordBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedPassword
public static class Application1xwwwformurlencodedPassword<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// String validation
String validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPassword.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "password"; |
| Integer | maxLength = 64 |
| Integer | minLength = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedPasswordBoxedString](#application1xwwwformurlencodedpasswordboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedDateTimeBoxed
public static abstract sealed class Application1xwwwformurlencodedDateTimeBoxed<br>
permits<br>
[Application1xwwwformurlencodedDateTimeBoxedString](#application1xwwwformurlencodeddatetimeboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedDateTimeBoxedString
public static final class Application1xwwwformurlencodedDateTimeBoxedString<br>
extends [Application1xwwwformurlencodedDateTimeBoxed](#application1xwwwformurlencodeddatetimeboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedDateTimeBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedDateTime
public static class Application1xwwwformurlencodedDateTime<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// String validation
String validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDateTime.validate(
    "1970-01-01T00:00:00.00Z",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |
| @Nullable Object | defaultValue = "2010-02-01T10:20:10.111110+01:00" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedDateTimeBoxedString](#application1xwwwformurlencodeddatetimeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedDateBoxed
public static abstract sealed class Application1xwwwformurlencodedDateBoxed<br>
permits<br>
[Application1xwwwformurlencodedDateBoxedString](#application1xwwwformurlencodeddateboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedDateBoxedString
public static final class Application1xwwwformurlencodedDateBoxedString<br>
extends [Application1xwwwformurlencodedDateBoxed](#application1xwwwformurlencodeddateboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedDateBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedDate
public static class Application1xwwwformurlencodedDate<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application1xwwwformurlencodedBinaryBoxed
public static abstract sealed class Application1xwwwformurlencodedBinaryBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedBinary
public static class Application1xwwwformurlencodedBinary<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

## Application1xwwwformurlencodedByteBoxed
public static abstract sealed class Application1xwwwformurlencodedByteBoxed<br>
permits<br>
[Application1xwwwformurlencodedByteBoxedString](#application1xwwwformurlencodedbyteboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedByteBoxedString
public static final class Application1xwwwformurlencodedByteBoxedString<br>
extends [Application1xwwwformurlencodedByteBoxed](#application1xwwwformurlencodedbyteboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedByteBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedByte
public static class Application1xwwwformurlencodedByte<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

## Application1xwwwformurlencodedPatternWithoutDelimiterBoxed
public static abstract sealed class Application1xwwwformurlencodedPatternWithoutDelimiterBoxed<br>
permits<br>
[Application1xwwwformurlencodedPatternWithoutDelimiterBoxedString](#application1xwwwformurlencodedpatternwithoutdelimiterboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedPatternWithoutDelimiterBoxedString
public static final class Application1xwwwformurlencodedPatternWithoutDelimiterBoxedString<br>
extends [Application1xwwwformurlencodedPatternWithoutDelimiterBoxed](#application1xwwwformurlencodedpatternwithoutdelimiterboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedPatternWithoutDelimiterBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedPatternWithoutDelimiter
public static class Application1xwwwformurlencodedPatternWithoutDelimiter<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// String validation
String validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedPatternWithoutDelimiter.validate(
    "AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[A-Z].*"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedPatternWithoutDelimiterBoxedString](#application1xwwwformurlencodedpatternwithoutdelimiterboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedStringBoxed
public static abstract sealed class Application1xwwwformurlencodedStringBoxed<br>
permits<br>
[Application1xwwwformurlencodedStringBoxedString](#application1xwwwformurlencodedstringboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedStringBoxedString
public static final class Application1xwwwformurlencodedStringBoxedString<br>
extends [Application1xwwwformurlencodedStringBoxed](#application1xwwwformurlencodedstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedString
public static class Application1xwwwformurlencodedString<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// String validation
String validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedString.validate(
    "A",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"[a-z]",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedStringBoxedString](#application1xwwwformurlencodedstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedDoubleBoxed
public static abstract sealed class Application1xwwwformurlencodedDoubleBoxed<br>
permits<br>
[Application1xwwwformurlencodedDoubleBoxedNumber](#application1xwwwformurlencodeddoubleboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedDoubleBoxedNumber
public static final class Application1xwwwformurlencodedDoubleBoxedNumber<br>
extends [Application1xwwwformurlencodedDoubleBoxed](#application1xwwwformurlencodeddoubleboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedDoubleBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xwwwformurlencodedDouble
public static class Application1xwwwformurlencodedDouble<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// double validation
double validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedDouble.validate(
    3.14d,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "double"; |
| Number | maximum = 123.4 |
| Number | minimum = 67.8 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| double | validate(double arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedDoubleBoxedNumber](#application1xwwwformurlencodeddoubleboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedFloatBoxed
public static abstract sealed class Application1xwwwformurlencodedFloatBoxed<br>
permits<br>
[Application1xwwwformurlencodedFloatBoxedNumber](#application1xwwwformurlencodedfloatboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedFloatBoxedNumber
public static final class Application1xwwwformurlencodedFloatBoxedNumber<br>
extends [Application1xwwwformurlencodedFloatBoxed](#application1xwwwformurlencodedfloatboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedFloatBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xwwwformurlencodedFloat
public static class Application1xwwwformurlencodedFloat<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// float validation
float validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedFloat.validate(
    3.14f,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "float"; |
| Number | maximum = 987.6 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| float | validate(float arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedFloatBoxedNumber](#application1xwwwformurlencodedfloatboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedNumberBoxed
public static abstract sealed class Application1xwwwformurlencodedNumberBoxed<br>
permits<br>
[Application1xwwwformurlencodedNumberBoxedNumber](#application1xwwwformurlencodednumberboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedNumberBoxedNumber
public static final class Application1xwwwformurlencodedNumberBoxedNumber<br>
extends [Application1xwwwformurlencodedNumberBoxed](#application1xwwwformurlencodednumberboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedNumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xwwwformurlencodedNumber
public static class Application1xwwwformurlencodedNumber<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// int validation
int validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedNumber.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | maximum = 543.2 |
| Number | minimum = 32.1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedNumberBoxedNumber](#application1xwwwformurlencodednumberboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedInt64Boxed
public static abstract sealed class Application1xwwwformurlencodedInt64Boxed<br>
permits<br>
[Application1xwwwformurlencodedInt64BoxedNumber](#application1xwwwformurlencodedint64boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedInt64BoxedNumber
public static final class Application1xwwwformurlencodedInt64BoxedNumber<br>
extends [Application1xwwwformurlencodedInt64Boxed](#application1xwwwformurlencodedint64boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedInt64BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xwwwformurlencodedInt64
public static class Application1xwwwformurlencodedInt64<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application1xwwwformurlencodedInt32Boxed
public static abstract sealed class Application1xwwwformurlencodedInt32Boxed<br>
permits<br>
[Application1xwwwformurlencodedInt32BoxedNumber](#application1xwwwformurlencodedint32boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedInt32BoxedNumber
public static final class Application1xwwwformurlencodedInt32BoxedNumber<br>
extends [Application1xwwwformurlencodedInt32Boxed](#application1xwwwformurlencodedint32boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedInt32BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xwwwformurlencodedInt32
public static class Application1xwwwformurlencodedInt32<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// int validation
int validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInt32.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int32"; |
| Number | maximum = 200 |
| Number | minimum = 20 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| int | validate(int arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedInt32BoxedNumber](#application1xwwwformurlencodedint32boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedIntegerBoxed
public static abstract sealed class Application1xwwwformurlencodedIntegerBoxed<br>
permits<br>
[Application1xwwwformurlencodedIntegerBoxedNumber](#application1xwwwformurlencodedintegerboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedIntegerBoxedNumber
public static final class Application1xwwwformurlencodedIntegerBoxedNumber<br>
extends [Application1xwwwformurlencodedIntegerBoxed](#application1xwwwformurlencodedintegerboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedIntegerBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xwwwformurlencodedInteger
public static class Application1xwwwformurlencodedInteger<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

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

// int validation
int validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedInteger.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int"; |
| Number | maximum = 100 |
| Number | minimum = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedIntegerBoxedNumber](#application1xwwwformurlencodedintegerboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |