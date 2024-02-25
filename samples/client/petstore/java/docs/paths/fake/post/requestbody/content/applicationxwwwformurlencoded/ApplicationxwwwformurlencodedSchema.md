# ApplicationxwwwformurlencodedSchema
public class ApplicationxwwwformurlencodedSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1](#applicationxwwwformurlencodedschema1)<br> schema class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap)<br> output class for Map payloads |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedCallbackBoxed](#applicationxwwwformurlencodedcallbackboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedCallbackBoxedString](#applicationxwwwformurlencodedcallbackboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedCallback](#applicationxwwwformurlencodedcallback)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPasswordBoxed](#applicationxwwwformurlencodedpasswordboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPasswordBoxedString](#applicationxwwwformurlencodedpasswordboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPassword](#applicationxwwwformurlencodedpassword)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDateTimeBoxed](#applicationxwwwformurlencodeddatetimeboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDateTimeBoxedString](#applicationxwwwformurlencodeddatetimeboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDateTime](#applicationxwwwformurlencodeddatetime)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDateBoxed](#applicationxwwwformurlencodeddateboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDateBoxedString](#applicationxwwwformurlencodeddateboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDate](#applicationxwwwformurlencodeddate)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedBinaryBoxed](#applicationxwwwformurlencodedbinaryboxed)<br> sealed interface for validated payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedBinary](#applicationxwwwformurlencodedbinary)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedByteBoxed](#applicationxwwwformurlencodedbyteboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedByteBoxedString](#applicationxwwwformurlencodedbyteboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedByte](#applicationxwwwformurlencodedbyte)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed](#applicationxwwwformurlencodedpatternwithoutdelimiterboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString](#applicationxwwwformurlencodedpatternwithoutdelimiterboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPatternWithoutDelimiter](#applicationxwwwformurlencodedpatternwithoutdelimiter)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedStringBoxed](#applicationxwwwformurlencodedstringboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedStringBoxedString](#applicationxwwwformurlencodedstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedString](#applicationxwwwformurlencodedstring)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDoubleBoxed](#applicationxwwwformurlencodeddoubleboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDoubleBoxedNumber](#applicationxwwwformurlencodeddoubleboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDouble](#applicationxwwwformurlencodeddouble)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedFloatBoxed](#applicationxwwwformurlencodedfloatboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedFloatBoxedNumber](#applicationxwwwformurlencodedfloatboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedFloat](#applicationxwwwformurlencodedfloat)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedNumberBoxed](#applicationxwwwformurlencodednumberboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedNumberBoxedNumber](#applicationxwwwformurlencodednumberboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedNumber](#applicationxwwwformurlencodednumber)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt64Boxed](#applicationxwwwformurlencodedint64boxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt64BoxedNumber](#applicationxwwwformurlencodedint64boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt64](#applicationxwwwformurlencodedint64)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt32Boxed](#applicationxwwwformurlencodedint32boxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt32BoxedNumber](#applicationxwwwformurlencodedint32boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt32](#applicationxwwwformurlencodedint32)<br> schema class |
| sealed interface | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedIntegerBoxed](#applicationxwwwformurlencodedintegerboxed)<br> sealed interface for validated payloads |
| record | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedIntegerBoxedNumber](#applicationxwwwformurlencodedintegerboxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInteger](#applicationxwwwformurlencodedinteger)<br> schema class |

## ApplicationxwwwformurlencodedSchema1Boxed
public sealed interface ApplicationxwwwformurlencodedSchema1Boxed<br>
permits<br>
[ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedSchema1BoxedMap
public record ApplicationxwwwformurlencodedSchema1BoxedMap<br>
implements [ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchema1BoxedMap([ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedSchema1
public static class ApplicationxwwwformurlencodedSchema1<br>
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
ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMap validatedPayload =
    ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1.validate(
    new ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMapBuilder()
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [ApplicationxwwwformurlencodedInteger.class](#applicationxwwwformurlencodedinteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [ApplicationxwwwformurlencodedInt32.class](#applicationxwwwformurlencodedint32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [ApplicationxwwwformurlencodedInt64.class](#applicationxwwwformurlencodedint64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [ApplicationxwwwformurlencodedNumber.class](#applicationxwwwformurlencodednumber))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [ApplicationxwwwformurlencodedFloat.class](#applicationxwwwformurlencodedfloat))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [ApplicationxwwwformurlencodedDouble.class](#applicationxwwwformurlencodeddouble))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [ApplicationxwwwformurlencodedString.class](#applicationxwwwformurlencodedstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_without_delimiter", [ApplicationxwwwformurlencodedPatternWithoutDelimiter.class](#applicationxwwwformurlencodedpatternwithoutdelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [ApplicationxwwwformurlencodedByte.class](#applicationxwwwformurlencodedbyte))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [ApplicationxwwwformurlencodedBinary.class](#applicationxwwwformurlencodedbinary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [ApplicationxwwwformurlencodedDate.class](#applicationxwwwformurlencodeddate))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [ApplicationxwwwformurlencodedDateTime.class](#applicationxwwwformurlencodeddatetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [ApplicationxwwwformurlencodedPassword.class](#applicationxwwwformurlencodedpassword))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("callback", [ApplicationxwwwformurlencodedCallback.class](#applicationxwwwformurlencodedcallback)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double",<br>&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;"pattern_without_delimiter"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedSchemaMap0000Builder
public class ApplicationxwwwformurlencodedSchemaMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setInteger(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setInteger(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setInteger(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setInteger(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | int32(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | int32(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | int64(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | int64(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | int64(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | int64(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setFloat(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setFloat(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setFloat(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setFloat(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setString(String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | binary(String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | date(String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | dateTime(String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | password(String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | callback(String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, Void value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, boolean value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, String value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, long value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, double value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, List<?> value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | additionalProperty(String key, Map<String, ?> value) |

## ApplicationxwwwformurlencodedSchemaMap0001Builder
public class ApplicationxwwwformurlencodedSchemaMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap0010Builder
public class ApplicationxwwwformurlencodedSchemaMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setNumber(double value) |

## ApplicationxwwwformurlencodedSchemaMap0011Builder
public class ApplicationxwwwformurlencodedSchemaMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setNumber(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0010Builder](#applicationxwwwformurlencodedschemamap0010builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap0100Builder
public class ApplicationxwwwformurlencodedSchemaMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setDouble(double value) |

## ApplicationxwwwformurlencodedSchemaMap0101Builder
public class ApplicationxwwwformurlencodedSchemaMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setDouble(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0100Builder](#applicationxwwwformurlencodedschemamap0100builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap0110Builder
public class ApplicationxwwwformurlencodedSchemaMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0010Builder](#applicationxwwwformurlencodedschemamap0010builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0010Builder](#applicationxwwwformurlencodedschemamap0010builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0010Builder](#applicationxwwwformurlencodedschemamap0010builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0010Builder](#applicationxwwwformurlencodedschemamap0010builder) | setDouble(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0100Builder](#applicationxwwwformurlencodedschemamap0100builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0100Builder](#applicationxwwwformurlencodedschemamap0100builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0100Builder](#applicationxwwwformurlencodedschemamap0100builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0100Builder](#applicationxwwwformurlencodedschemamap0100builder) | setNumber(double value) |

## ApplicationxwwwformurlencodedSchemaMap0111Builder
public class ApplicationxwwwformurlencodedSchemaMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0011Builder](#applicationxwwwformurlencodedschemamap0011builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0011Builder](#applicationxwwwformurlencodedschemamap0011builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0011Builder](#applicationxwwwformurlencodedschemamap0011builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0011Builder](#applicationxwwwformurlencodedschemamap0011builder) | setDouble(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0101Builder](#applicationxwwwformurlencodedschemamap0101builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap0101Builder](#applicationxwwwformurlencodedschemamap0101builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap0101Builder](#applicationxwwwformurlencodedschemamap0101builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap0101Builder](#applicationxwwwformurlencodedschemamap0101builder) | setNumber(double value) |
| [ApplicationxwwwformurlencodedSchemaMap0110Builder](#applicationxwwwformurlencodedschemamap0110builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap1000Builder
public class ApplicationxwwwformurlencodedSchemaMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0000Builder](#applicationxwwwformurlencodedschemamap0000builder) | setByte(String value) |

## ApplicationxwwwformurlencodedSchemaMap1001Builder
public class ApplicationxwwwformurlencodedSchemaMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0001Builder](#applicationxwwwformurlencodedschemamap0001builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap1010Builder
public class ApplicationxwwwformurlencodedSchemaMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0010Builder](#applicationxwwwformurlencodedschemamap0010builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setNumber(double value) |

## ApplicationxwwwformurlencodedSchemaMap1011Builder
public class ApplicationxwwwformurlencodedSchemaMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0011Builder](#applicationxwwwformurlencodedschemamap0011builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setNumber(double value) |
| [ApplicationxwwwformurlencodedSchemaMap1010Builder](#applicationxwwwformurlencodedschemamap1010builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap1100Builder
public class ApplicationxwwwformurlencodedSchemaMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0100Builder](#applicationxwwwformurlencodedschemamap0100builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1000Builder](#applicationxwwwformurlencodedschemamap1000builder) | setDouble(double value) |

## ApplicationxwwwformurlencodedSchemaMap1101Builder
public class ApplicationxwwwformurlencodedSchemaMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0101Builder](#applicationxwwwformurlencodedschemamap0101builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1001Builder](#applicationxwwwformurlencodedschemamap1001builder) | setDouble(double value) |
| [ApplicationxwwwformurlencodedSchemaMap1100Builder](#applicationxwwwformurlencodedschemamap1100builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap1110Builder
public class ApplicationxwwwformurlencodedSchemaMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0110Builder](#applicationxwwwformurlencodedschemamap0110builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1010Builder](#applicationxwwwformurlencodedschemamap1010builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1010Builder](#applicationxwwwformurlencodedschemamap1010builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1010Builder](#applicationxwwwformurlencodedschemamap1010builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1010Builder](#applicationxwwwformurlencodedschemamap1010builder) | setDouble(double value) |
| [ApplicationxwwwformurlencodedSchemaMap1100Builder](#applicationxwwwformurlencodedschemamap1100builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1100Builder](#applicationxwwwformurlencodedschemamap1100builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1100Builder](#applicationxwwwformurlencodedschemamap1100builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1100Builder](#applicationxwwwformurlencodedschemamap1100builder) | setNumber(double value) |

## ApplicationxwwwformurlencodedSchemaMapBuilder
public class ApplicationxwwwformurlencodedSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap0111Builder](#applicationxwwwformurlencodedschemamap0111builder) | setByte(String value) |
| [ApplicationxwwwformurlencodedSchemaMap1011Builder](#applicationxwwwformurlencodedschemamap1011builder) | setDouble(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1011Builder](#applicationxwwwformurlencodedschemamap1011builder) | setDouble(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1011Builder](#applicationxwwwformurlencodedschemamap1011builder) | setDouble(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1011Builder](#applicationxwwwformurlencodedschemamap1011builder) | setDouble(double value) |
| [ApplicationxwwwformurlencodedSchemaMap1101Builder](#applicationxwwwformurlencodedschemamap1101builder) | setNumber(int value) |
| [ApplicationxwwwformurlencodedSchemaMap1101Builder](#applicationxwwwformurlencodedschemamap1101builder) | setNumber(float value) |
| [ApplicationxwwwformurlencodedSchemaMap1101Builder](#applicationxwwwformurlencodedschemamap1101builder) | setNumber(long value) |
| [ApplicationxwwwformurlencodedSchemaMap1101Builder](#applicationxwwwformurlencodedschemamap1101builder) | setNumber(double value) |
| [ApplicationxwwwformurlencodedSchemaMap1110Builder](#applicationxwwwformurlencodedschemamap1110builder) | pattern_without_delimiter(String value) |

## ApplicationxwwwformurlencodedSchemaMap
public static class ApplicationxwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
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

## ApplicationxwwwformurlencodedCallbackBoxed
public sealed interface ApplicationxwwwformurlencodedCallbackBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedCallbackBoxedString](#applicationxwwwformurlencodedcallbackboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedCallbackBoxedString
public record ApplicationxwwwformurlencodedCallbackBoxedString<br>
implements [ApplicationxwwwformurlencodedCallbackBoxed](#applicationxwwwformurlencodedcallbackboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedCallbackBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedCallback
public static class ApplicationxwwwformurlencodedCallback<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ApplicationxwwwformurlencodedPasswordBoxed
public sealed interface ApplicationxwwwformurlencodedPasswordBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedPasswordBoxedString](#applicationxwwwformurlencodedpasswordboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedPasswordBoxedString
public record ApplicationxwwwformurlencodedPasswordBoxedString<br>
implements [ApplicationxwwwformurlencodedPasswordBoxed](#applicationxwwwformurlencodedpasswordboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedPasswordBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedPassword
public static class ApplicationxwwwformurlencodedPassword<br>
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
String validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPassword.validate(
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
| [ApplicationxwwwformurlencodedPasswordBoxedString](#applicationxwwwformurlencodedpasswordboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedPasswordBoxed](#applicationxwwwformurlencodedpasswordboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedDateTimeBoxed
public sealed interface ApplicationxwwwformurlencodedDateTimeBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedDateTimeBoxedString](#applicationxwwwformurlencodeddatetimeboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedDateTimeBoxedString
public record ApplicationxwwwformurlencodedDateTimeBoxedString<br>
implements [ApplicationxwwwformurlencodedDateTimeBoxed](#applicationxwwwformurlencodeddatetimeboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedDateTimeBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedDateTime
public static class ApplicationxwwwformurlencodedDateTime<br>
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
String validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDateTime.validate(
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
| [ApplicationxwwwformurlencodedDateTimeBoxedString](#applicationxwwwformurlencodeddatetimeboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedDateTimeBoxed](#applicationxwwwformurlencodeddatetimeboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedDateBoxed
public sealed interface ApplicationxwwwformurlencodedDateBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedDateBoxedString](#applicationxwwwformurlencodeddateboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedDateBoxedString
public record ApplicationxwwwformurlencodedDateBoxedString<br>
implements [ApplicationxwwwformurlencodedDateBoxed](#applicationxwwwformurlencodeddateboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedDateBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedDate
public static class ApplicationxwwwformurlencodedDate<br>
extends DateJsonSchema.DateJsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema.DateJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ApplicationxwwwformurlencodedBinaryBoxed
public sealed interface ApplicationxwwwformurlencodedBinaryBoxed<br>
permits<br>

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedBinary
public static class ApplicationxwwwformurlencodedBinary<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

## ApplicationxwwwformurlencodedByteBoxed
public sealed interface ApplicationxwwwformurlencodedByteBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedByteBoxedString](#applicationxwwwformurlencodedbyteboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedByteBoxedString
public record ApplicationxwwwformurlencodedByteBoxedString<br>
implements [ApplicationxwwwformurlencodedByteBoxed](#applicationxwwwformurlencodedbyteboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedByteBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedByte
public static class ApplicationxwwwformurlencodedByte<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
None

## ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed
public sealed interface ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString](#applicationxwwwformurlencodedpatternwithoutdelimiterboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString
public record ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString<br>
implements [ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed](#applicationxwwwformurlencodedpatternwithoutdelimiterboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedPatternWithoutDelimiter
public static class ApplicationxwwwformurlencodedPatternWithoutDelimiter<br>
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
String validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedPatternWithoutDelimiter.validate(
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
| [ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxedString](#applicationxwwwformurlencodedpatternwithoutdelimiterboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedPatternWithoutDelimiterBoxed](#applicationxwwwformurlencodedpatternwithoutdelimiterboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedStringBoxed
public sealed interface ApplicationxwwwformurlencodedStringBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedStringBoxedString](#applicationxwwwformurlencodedstringboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedStringBoxedString
public record ApplicationxwwwformurlencodedStringBoxedString<br>
implements [ApplicationxwwwformurlencodedStringBoxed](#applicationxwwwformurlencodedstringboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedStringBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedString
public static class ApplicationxwwwformurlencodedString<br>
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
String validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedString.validate(
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
| [ApplicationxwwwformurlencodedStringBoxedString](#applicationxwwwformurlencodedstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedStringBoxed](#applicationxwwwformurlencodedstringboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedDoubleBoxed
public sealed interface ApplicationxwwwformurlencodedDoubleBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedDoubleBoxedNumber](#applicationxwwwformurlencodeddoubleboxednumber)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedDoubleBoxedNumber
public record ApplicationxwwwformurlencodedDoubleBoxedNumber<br>
implements [ApplicationxwwwformurlencodedDoubleBoxed](#applicationxwwwformurlencodeddoubleboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedDoubleBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedDouble
public static class ApplicationxwwwformurlencodedDouble<br>
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
double validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedDouble.validate(
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
| [ApplicationxwwwformurlencodedDoubleBoxedNumber](#applicationxwwwformurlencodeddoubleboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedDoubleBoxed](#applicationxwwwformurlencodeddoubleboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedFloatBoxed
public sealed interface ApplicationxwwwformurlencodedFloatBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedFloatBoxedNumber](#applicationxwwwformurlencodedfloatboxednumber)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedFloatBoxedNumber
public record ApplicationxwwwformurlencodedFloatBoxedNumber<br>
implements [ApplicationxwwwformurlencodedFloatBoxed](#applicationxwwwformurlencodedfloatboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedFloatBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedFloat
public static class ApplicationxwwwformurlencodedFloat<br>
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
float validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedFloat.validate(
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
| [ApplicationxwwwformurlencodedFloatBoxedNumber](#applicationxwwwformurlencodedfloatboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedFloatBoxed](#applicationxwwwformurlencodedfloatboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedNumberBoxed
public sealed interface ApplicationxwwwformurlencodedNumberBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedNumberBoxedNumber](#applicationxwwwformurlencodednumberboxednumber)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedNumberBoxedNumber
public record ApplicationxwwwformurlencodedNumberBoxedNumber<br>
implements [ApplicationxwwwformurlencodedNumberBoxed](#applicationxwwwformurlencodednumberboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedNumberBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedNumber
public static class ApplicationxwwwformurlencodedNumber<br>
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
int validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedNumber.validate(
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
| [ApplicationxwwwformurlencodedNumberBoxedNumber](#applicationxwwwformurlencodednumberboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedNumberBoxed](#applicationxwwwformurlencodednumberboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedInt64Boxed
public sealed interface ApplicationxwwwformurlencodedInt64Boxed<br>
permits<br>
[ApplicationxwwwformurlencodedInt64BoxedNumber](#applicationxwwwformurlencodedint64boxednumber)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedInt64BoxedNumber
public record ApplicationxwwwformurlencodedInt64BoxedNumber<br>
implements [ApplicationxwwwformurlencodedInt64Boxed](#applicationxwwwformurlencodedint64boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedInt64BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedInt64
public static class ApplicationxwwwformurlencodedInt64<br>
extends Int64JsonSchema.Int64JsonSchema1

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema.Int64JsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## ApplicationxwwwformurlencodedInt32Boxed
public sealed interface ApplicationxwwwformurlencodedInt32Boxed<br>
permits<br>
[ApplicationxwwwformurlencodedInt32BoxedNumber](#applicationxwwwformurlencodedint32boxednumber)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedInt32BoxedNumber
public record ApplicationxwwwformurlencodedInt32BoxedNumber<br>
implements [ApplicationxwwwformurlencodedInt32Boxed](#applicationxwwwformurlencodedint32boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedInt32BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedInt32
public static class ApplicationxwwwformurlencodedInt32<br>
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
int validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInt32.validate(
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
| [ApplicationxwwwformurlencodedInt32BoxedNumber](#applicationxwwwformurlencodedint32boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedInt32Boxed](#applicationxwwwformurlencodedint32boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedIntegerBoxed
public sealed interface ApplicationxwwwformurlencodedIntegerBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedIntegerBoxedNumber](#applicationxwwwformurlencodedintegerboxednumber)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedIntegerBoxedNumber
public record ApplicationxwwwformurlencodedIntegerBoxedNumber<br>
implements [ApplicationxwwwformurlencodedIntegerBoxed](#applicationxwwwformurlencodedintegerboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedIntegerBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ApplicationxwwwformurlencodedInteger
public static class ApplicationxwwwformurlencodedInteger<br>
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
int validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedInteger.validate(
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
| [ApplicationxwwwformurlencodedIntegerBoxedNumber](#applicationxwwwformurlencodedintegerboxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedIntegerBoxed](#applicationxwwwformurlencodedintegerboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
