# Application~1xWwwFormUrlencodedSchema
public class Application~1xWwwFormUrlencodedSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1Boxed](#application~1xwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1](#application~1xwwwformurlencodedschema1)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedCallbackBoxed](#application~1xwwwformurlencodedcallbackboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedCallbackBoxedString](#application~1xwwwformurlencodedcallbackboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedCallback](#application~1xwwwformurlencodedcallback)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPasswordBoxed](#application~1xwwwformurlencodedpasswordboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPasswordBoxedString](#application~1xwwwformurlencodedpasswordboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPassword](#application~1xwwwformurlencodedpassword)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDateTimeBoxed](#application~1xwwwformurlencodeddatetimeboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDateTimeBoxedString](#application~1xwwwformurlencodeddatetimeboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDateTime](#application~1xwwwformurlencodeddatetime)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDateBoxed](#application~1xwwwformurlencodeddateboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDateBoxedString](#application~1xwwwformurlencodeddateboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDate](#application~1xwwwformurlencodeddate)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedBinaryBoxed](#application~1xwwwformurlencodedbinaryboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedBinary](#application~1xwwwformurlencodedbinary)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedByteBoxed](#application~1xwwwformurlencodedbyteboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedByteBoxedString](#application~1xwwwformurlencodedbyteboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedByte](#application~1xwwwformurlencodedbyte)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxed](#application~1xwwwformurlencodedpatternwithoutdelimiterboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxedString](#application~1xwwwformurlencodedpatternwithoutdelimiterboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPatternWithoutDelimiter](#application~1xwwwformurlencodedpatternwithoutdelimiter)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedStringBoxed](#application~1xwwwformurlencodedstringboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedStringBoxedString](#application~1xwwwformurlencodedstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedString](#application~1xwwwformurlencodedstring)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDoubleBoxed](#application~1xwwwformurlencodeddoubleboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDoubleBoxedNumber](#application~1xwwwformurlencodeddoubleboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDouble](#application~1xwwwformurlencodeddouble)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedFloatBoxed](#application~1xwwwformurlencodedfloatboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedFloatBoxedNumber](#application~1xwwwformurlencodedfloatboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedFloat](#application~1xwwwformurlencodedfloat)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedNumberBoxed](#application~1xwwwformurlencodednumberboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedNumberBoxedNumber](#application~1xwwwformurlencodednumberboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedNumber](#application~1xwwwformurlencodednumber)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt64Boxed](#application~1xwwwformurlencodedint64boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt64BoxedNumber](#application~1xwwwformurlencodedint64boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt64](#application~1xwwwformurlencodedint64)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt32Boxed](#application~1xwwwformurlencodedint32boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt32BoxedNumber](#application~1xwwwformurlencodedint32boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt32](#application~1xwwwformurlencodedint32)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedIntegerBoxed](#application~1xwwwformurlencodedintegerboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedIntegerBoxedNumber](#application~1xwwwformurlencodedintegerboxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInteger](#application~1xwwwformurlencodedinteger)<br> schema class |

## Application~1xWwwFormUrlencodedSchema1Boxed
public static abstract sealed class Application~1xWwwFormUrlencodedSchema1Boxed<br>
permits<br>
[Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedSchema1BoxedMap
public static final class Application~1xWwwFormUrlencodedSchema1BoxedMap<br>
extends [Application~1xWwwFormUrlencodedSchema1Boxed](#application~1xwwwformurlencodedschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchema1BoxedMap([Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | data<br>validated payload |

## Application~1xWwwFormUrlencodedSchema1
public static class Application~1xWwwFormUrlencodedSchema1<br>
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
Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMap validatedPayload =
    Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1.validate(
    new Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMapBuilder()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [Application~1xWwwFormUrlencodedInteger.class](#application~1xwwwformurlencodedinteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Application~1xWwwFormUrlencodedInt32.class](#application~1xwwwformurlencodedint32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Application~1xWwwFormUrlencodedInt64.class](#application~1xwwwformurlencodedint64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [Application~1xWwwFormUrlencodedNumber.class](#application~1xwwwformurlencodednumber))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [Application~1xWwwFormUrlencodedFloat.class](#application~1xwwwformurlencodedfloat))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [Application~1xWwwFormUrlencodedDouble.class](#application~1xwwwformurlencodeddouble))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [Application~1xWwwFormUrlencodedString.class](#application~1xwwwformurlencodedstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_without_delimiter", [Application~1xWwwFormUrlencodedPatternWithoutDelimiter.class](#application~1xwwwformurlencodedpatternwithoutdelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [Application~1xWwwFormUrlencodedByte.class](#application~1xwwwformurlencodedbyte))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Application~1xWwwFormUrlencodedBinary.class](#application~1xwwwformurlencodedbinary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Application~1xWwwFormUrlencodedDate.class](#application~1xwwwformurlencodeddate))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [Application~1xWwwFormUrlencodedDateTime.class](#application~1xwwwformurlencodeddatetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Application~1xWwwFormUrlencodedPassword.class](#application~1xwwwformurlencodedpassword))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("callback", [Application~1xWwwFormUrlencodedCallback.class](#application~1xwwwformurlencodedcallback)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double",<br>&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;"pattern_without_delimiter"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedSchemaMap0000Builder
public class Application~1xWwwFormUrlencodedSchemaMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setInteger(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setInteger(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setInteger(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setInteger(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | int32(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | int32(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | int64(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | int64(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | int64(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | int64(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setFloat(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setFloat(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setFloat(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setFloat(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setString(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | binary(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | date(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | dateTime(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | password(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | callback(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, Void value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, boolean value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, String value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, List<?> value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | additionalProperty(String key, Map<String, ?> value) |

## Application~1xWwwFormUrlencodedSchemaMap0001Builder
public class Application~1xWwwFormUrlencodedSchemaMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap0010Builder
public class Application~1xWwwFormUrlencodedSchemaMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setNumber(double value) |

## Application~1xWwwFormUrlencodedSchemaMap0011Builder
public class Application~1xWwwFormUrlencodedSchemaMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setNumber(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0010Builder](#application~1xwwwformurlencodedschemamap0010builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap0100Builder
public class Application~1xWwwFormUrlencodedSchemaMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setDouble(double value) |

## Application~1xWwwFormUrlencodedSchemaMap0101Builder
public class Application~1xWwwFormUrlencodedSchemaMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setDouble(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0100Builder](#application~1xwwwformurlencodedschemamap0100builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap0110Builder
public class Application~1xWwwFormUrlencodedSchemaMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0010Builder](#application~1xwwwformurlencodedschemamap0010builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0010Builder](#application~1xwwwformurlencodedschemamap0010builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0010Builder](#application~1xwwwformurlencodedschemamap0010builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0010Builder](#application~1xwwwformurlencodedschemamap0010builder) | setDouble(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0100Builder](#application~1xwwwformurlencodedschemamap0100builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0100Builder](#application~1xwwwformurlencodedschemamap0100builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0100Builder](#application~1xwwwformurlencodedschemamap0100builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0100Builder](#application~1xwwwformurlencodedschemamap0100builder) | setNumber(double value) |

## Application~1xWwwFormUrlencodedSchemaMap0111Builder
public class Application~1xWwwFormUrlencodedSchemaMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0011Builder](#application~1xwwwformurlencodedschemamap0011builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0011Builder](#application~1xwwwformurlencodedschemamap0011builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0011Builder](#application~1xwwwformurlencodedschemamap0011builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0011Builder](#application~1xwwwformurlencodedschemamap0011builder) | setDouble(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0101Builder](#application~1xwwwformurlencodedschemamap0101builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap0101Builder](#application~1xwwwformurlencodedschemamap0101builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap0101Builder](#application~1xwwwformurlencodedschemamap0101builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap0101Builder](#application~1xwwwformurlencodedschemamap0101builder) | setNumber(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap0110Builder](#application~1xwwwformurlencodedschemamap0110builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap1000Builder
public class Application~1xWwwFormUrlencodedSchemaMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0000Builder](#application~1xwwwformurlencodedschemamap0000builder) | setByte(String value) |

## Application~1xWwwFormUrlencodedSchemaMap1001Builder
public class Application~1xWwwFormUrlencodedSchemaMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0001Builder](#application~1xwwwformurlencodedschemamap0001builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap1010Builder
public class Application~1xWwwFormUrlencodedSchemaMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0010Builder](#application~1xwwwformurlencodedschemamap0010builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setNumber(double value) |

## Application~1xWwwFormUrlencodedSchemaMap1011Builder
public class Application~1xWwwFormUrlencodedSchemaMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0011Builder](#application~1xwwwformurlencodedschemamap0011builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setNumber(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap1010Builder](#application~1xwwwformurlencodedschemamap1010builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap1100Builder
public class Application~1xWwwFormUrlencodedSchemaMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0100Builder](#application~1xwwwformurlencodedschemamap0100builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1000Builder](#application~1xwwwformurlencodedschemamap1000builder) | setDouble(double value) |

## Application~1xWwwFormUrlencodedSchemaMap1101Builder
public class Application~1xWwwFormUrlencodedSchemaMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0101Builder](#application~1xwwwformurlencodedschemamap0101builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1001Builder](#application~1xwwwformurlencodedschemamap1001builder) | setDouble(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap1100Builder](#application~1xwwwformurlencodedschemamap1100builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap1110Builder
public class Application~1xWwwFormUrlencodedSchemaMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0110Builder](#application~1xwwwformurlencodedschemamap0110builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1010Builder](#application~1xwwwformurlencodedschemamap1010builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1010Builder](#application~1xwwwformurlencodedschemamap1010builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1010Builder](#application~1xwwwformurlencodedschemamap1010builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1010Builder](#application~1xwwwformurlencodedschemamap1010builder) | setDouble(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap1100Builder](#application~1xwwwformurlencodedschemamap1100builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1100Builder](#application~1xwwwformurlencodedschemamap1100builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1100Builder](#application~1xwwwformurlencodedschemamap1100builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1100Builder](#application~1xwwwformurlencodedschemamap1100builder) | setNumber(double value) |

## Application~1xWwwFormUrlencodedSchemaMapBuilder
public class Application~1xWwwFormUrlencodedSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap0111Builder](#application~1xwwwformurlencodedschemamap0111builder) | setByte(String value) |
| [Application~1xWwwFormUrlencodedSchemaMap1011Builder](#application~1xwwwformurlencodedschemamap1011builder) | setDouble(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1011Builder](#application~1xwwwformurlencodedschemamap1011builder) | setDouble(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1011Builder](#application~1xwwwformurlencodedschemamap1011builder) | setDouble(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1011Builder](#application~1xwwwformurlencodedschemamap1011builder) | setDouble(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap1101Builder](#application~1xwwwformurlencodedschemamap1101builder) | setNumber(int value) |
| [Application~1xWwwFormUrlencodedSchemaMap1101Builder](#application~1xwwwformurlencodedschemamap1101builder) | setNumber(float value) |
| [Application~1xWwwFormUrlencodedSchemaMap1101Builder](#application~1xwwwformurlencodedschemamap1101builder) | setNumber(long value) |
| [Application~1xWwwFormUrlencodedSchemaMap1101Builder](#application~1xwwwformurlencodedschemamap1101builder) | setNumber(double value) |
| [Application~1xWwwFormUrlencodedSchemaMap1110Builder](#application~1xwwwformurlencodedschemamap1110builder) | pattern_without_delimiter(String value) |

## Application~1xWwwFormUrlencodedSchemaMap
public static class Application~1xWwwFormUrlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
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

## Application~1xWwwFormUrlencodedCallbackBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedCallbackBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedCallbackBoxedString](#application~1xwwwformurlencodedcallbackboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedCallbackBoxedString
public static final class Application~1xWwwFormUrlencodedCallbackBoxedString<br>
extends [Application~1xWwwFormUrlencodedCallbackBoxed](#application~1xwwwformurlencodedcallbackboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedCallbackBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedCallback
public static class Application~1xWwwFormUrlencodedCallback<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application~1xWwwFormUrlencodedPasswordBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedPasswordBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedPasswordBoxedString](#application~1xwwwformurlencodedpasswordboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedPasswordBoxedString
public static final class Application~1xWwwFormUrlencodedPasswordBoxedString<br>
extends [Application~1xWwwFormUrlencodedPasswordBoxed](#application~1xwwwformurlencodedpasswordboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedPasswordBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedPassword
public static class Application~1xWwwFormUrlencodedPassword<br>
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
String validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPassword.validate(
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
| [Application~1xWwwFormUrlencodedPasswordBoxedString](#application~1xwwwformurlencodedpasswordboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedDateTimeBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedDateTimeBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedDateTimeBoxedString](#application~1xwwwformurlencodeddatetimeboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedDateTimeBoxedString
public static final class Application~1xWwwFormUrlencodedDateTimeBoxedString<br>
extends [Application~1xWwwFormUrlencodedDateTimeBoxed](#application~1xwwwformurlencodeddatetimeboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedDateTimeBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedDateTime
public static class Application~1xWwwFormUrlencodedDateTime<br>
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
String validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDateTime.validate(
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
| [Application~1xWwwFormUrlencodedDateTimeBoxedString](#application~1xwwwformurlencodeddatetimeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedDateBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedDateBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedDateBoxedString](#application~1xwwwformurlencodeddateboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedDateBoxedString
public static final class Application~1xWwwFormUrlencodedDateBoxedString<br>
extends [Application~1xWwwFormUrlencodedDateBoxed](#application~1xwwwformurlencodeddateboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedDateBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedDate
public static class Application~1xWwwFormUrlencodedDate<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application~1xWwwFormUrlencodedBinaryBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedBinaryBoxed<br>
permits<br>

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedBinary
public static class Application~1xWwwFormUrlencodedBinary<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

## Application~1xWwwFormUrlencodedByteBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedByteBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedByteBoxedString](#application~1xwwwformurlencodedbyteboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedByteBoxedString
public static final class Application~1xWwwFormUrlencodedByteBoxedString<br>
extends [Application~1xWwwFormUrlencodedByteBoxed](#application~1xwwwformurlencodedbyteboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedByteBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedByte
public static class Application~1xWwwFormUrlencodedByte<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

## Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxedString](#application~1xwwwformurlencodedpatternwithoutdelimiterboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxedString
public static final class Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxedString<br>
extends [Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxed](#application~1xwwwformurlencodedpatternwithoutdelimiterboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedPatternWithoutDelimiter
public static class Application~1xWwwFormUrlencodedPatternWithoutDelimiter<br>
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
String validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedPatternWithoutDelimiter.validate(
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
| [Application~1xWwwFormUrlencodedPatternWithoutDelimiterBoxedString](#application~1xwwwformurlencodedpatternwithoutdelimiterboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedStringBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedStringBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedStringBoxedString](#application~1xwwwformurlencodedstringboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedStringBoxedString
public static final class Application~1xWwwFormUrlencodedStringBoxedString<br>
extends [Application~1xWwwFormUrlencodedStringBoxed](#application~1xwwwformurlencodedstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedString
public static class Application~1xWwwFormUrlencodedString<br>
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
String validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedString.validate(
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
| [Application~1xWwwFormUrlencodedStringBoxedString](#application~1xwwwformurlencodedstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedDoubleBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedDoubleBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedDoubleBoxedNumber](#application~1xwwwformurlencodeddoubleboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedDoubleBoxedNumber
public static final class Application~1xWwwFormUrlencodedDoubleBoxedNumber<br>
extends [Application~1xWwwFormUrlencodedDoubleBoxed](#application~1xwwwformurlencodeddoubleboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedDoubleBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xWwwFormUrlencodedDouble
public static class Application~1xWwwFormUrlencodedDouble<br>
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
double validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedDouble.validate(
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
| [Application~1xWwwFormUrlencodedDoubleBoxedNumber](#application~1xwwwformurlencodeddoubleboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedFloatBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedFloatBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedFloatBoxedNumber](#application~1xwwwformurlencodedfloatboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedFloatBoxedNumber
public static final class Application~1xWwwFormUrlencodedFloatBoxedNumber<br>
extends [Application~1xWwwFormUrlencodedFloatBoxed](#application~1xwwwformurlencodedfloatboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedFloatBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xWwwFormUrlencodedFloat
public static class Application~1xWwwFormUrlencodedFloat<br>
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
float validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedFloat.validate(
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
| [Application~1xWwwFormUrlencodedFloatBoxedNumber](#application~1xwwwformurlencodedfloatboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedNumberBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedNumberBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedNumberBoxedNumber](#application~1xwwwformurlencodednumberboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedNumberBoxedNumber
public static final class Application~1xWwwFormUrlencodedNumberBoxedNumber<br>
extends [Application~1xWwwFormUrlencodedNumberBoxed](#application~1xwwwformurlencodednumberboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedNumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xWwwFormUrlencodedNumber
public static class Application~1xWwwFormUrlencodedNumber<br>
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
int validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedNumber.validate(
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
| [Application~1xWwwFormUrlencodedNumberBoxedNumber](#application~1xwwwformurlencodednumberboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedInt64Boxed
public static abstract sealed class Application~1xWwwFormUrlencodedInt64Boxed<br>
permits<br>
[Application~1xWwwFormUrlencodedInt64BoxedNumber](#application~1xwwwformurlencodedint64boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedInt64BoxedNumber
public static final class Application~1xWwwFormUrlencodedInt64BoxedNumber<br>
extends [Application~1xWwwFormUrlencodedInt64Boxed](#application~1xwwwformurlencodedint64boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedInt64BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xWwwFormUrlencodedInt64
public static class Application~1xWwwFormUrlencodedInt64<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Application~1xWwwFormUrlencodedInt32Boxed
public static abstract sealed class Application~1xWwwFormUrlencodedInt32Boxed<br>
permits<br>
[Application~1xWwwFormUrlencodedInt32BoxedNumber](#application~1xwwwformurlencodedint32boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedInt32BoxedNumber
public static final class Application~1xWwwFormUrlencodedInt32BoxedNumber<br>
extends [Application~1xWwwFormUrlencodedInt32Boxed](#application~1xwwwformurlencodedint32boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedInt32BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xWwwFormUrlencodedInt32
public static class Application~1xWwwFormUrlencodedInt32<br>
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
int validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInt32.validate(
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
| [Application~1xWwwFormUrlencodedInt32BoxedNumber](#application~1xwwwformurlencodedint32boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedIntegerBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedIntegerBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedIntegerBoxedNumber](#application~1xwwwformurlencodedintegerboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedIntegerBoxedNumber
public static final class Application~1xWwwFormUrlencodedIntegerBoxedNumber<br>
extends [Application~1xWwwFormUrlencodedIntegerBoxed](#application~1xwwwformurlencodedintegerboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedIntegerBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xWwwFormUrlencodedInteger
public static class Application~1xWwwFormUrlencodedInteger<br>
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
int validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedInteger.validate(
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
| [Application~1xWwwFormUrlencodedIntegerBoxedNumber](#application~1xwwwformurlencodedintegerboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |