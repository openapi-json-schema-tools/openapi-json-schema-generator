# Schema
org.openapijsonschematools.client.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.Schema.java
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1](#schema1)<br> schema class |
| static class | [Schema.SchemaMapBuilder](#schemamapbuilder)<br> builder for Map payloads |
| static class | [Schema.SchemaMap](#schemamap)<br> output class for Map payloads |
| static class | [Schema.Callback](#callback)<br> schema class |
| static class | [Schema.Password](#password)<br> schema class |
| static class | [Schema.DateTime](#datetime)<br> schema class |
| static class | [Schema.Date](#date)<br> schema class |
| static class | [Schema.Binary](#binary)<br> schema class |
| static class | [Schema.ByteSchema](#byteschema)<br> schema class |
| static class | [Schema.PatternWithoutDelimiter](#patternwithoutdelimiter)<br> schema class |
| static class | [Schema.StringSchema](#stringschema)<br> schema class |
| static class | [Schema.DoubleSchema](#doubleschema)<br> schema class |
| static class | [Schema.FloatSchema](#floatschema)<br> schema class |
| static class | [Schema.NumberSchema](#numberschema)<br> schema class |
| static class | [Schema.Int64](#int64)<br> schema class |
| static class | [Schema.Int32](#int32)<br> schema class |
| static class | [Schema.IntegerSchema](#integerschema)<br> schema class |

## Schema1
public static class Schema1<br>
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
Schema.SchemaMap validatedPayload =
    Schema.Schema1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "byte",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "double",
            3.14d
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "number",
            1
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "pattern_without_delimiter",
            "AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "integer",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "int32",
            1
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "int64",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "float",
            3.14f
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "string",
            "A"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "binary",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "date",
            "2020-12-13"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "dateTime",
            "1970-01-01T00:00:00.00Z"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "password",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "callback",
            "a"
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("integer", [IntegerSchema.class](#integerschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32.class](#int32))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int64", [Int64.class](#int64))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("number", [NumberSchema.class](#numberschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("float", [FloatSchema.class](#floatschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("double", [DoubleSchema.class](#doubleschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("string", [StringSchema.class](#stringschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pattern_without_delimiter", [PatternWithoutDelimiter.class](#patternwithoutdelimiter))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("byte", [ByteSchema.class](#byteschema))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("binary", [Binary.class](#binary))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("date", [Date.class](#date))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("dateTime", [DateTime.class](#datetime))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("password", [Password.class](#password))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("callback", [Callback.class](#callback)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"byte",<br>&nbsp;&nbsp;&nbsp;&nbsp;"double",<br>&nbsp;&nbsp;&nbsp;&nbsp;"number",<br>&nbsp;&nbsp;&nbsp;&nbsp;"pattern_without_delimiter"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap](#schemamap) | validate([Map<?, ?>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMap0000Builder
public class SchemaMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMap0000Builder](#schemamap0000builder) | setInteger(int value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setInteger(float value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setInteger(long value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setInteger(double value) |
| [SchemaMap0000Builder](#schemamap0000builder) | int32(int value) |
| [SchemaMap0000Builder](#schemamap0000builder) | int32(float value) |
| [SchemaMap0000Builder](#schemamap0000builder) | int64(int value) |
| [SchemaMap0000Builder](#schemamap0000builder) | int64(float value) |
| [SchemaMap0000Builder](#schemamap0000builder) | int64(long value) |
| [SchemaMap0000Builder](#schemamap0000builder) | int64(double value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setFloat(int value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setFloat(float value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setFloat(long value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setFloat(double value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setString(String value) |
| [SchemaMap0000Builder](#schemamap0000builder) | binary(String value) |
| [SchemaMap0000Builder](#schemamap0000builder) | date(String value) |
| [SchemaMap0000Builder](#schemamap0000builder) | dateTime(String value) |
| [SchemaMap0000Builder](#schemamap0000builder) | password(String value) |
| [SchemaMap0000Builder](#schemamap0000builder) | callback(String value) |
## SchemaMap0001Builder
public class SchemaMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000Builder](#schemamap0000builder) | pattern_without_delimiter(String value) |
## SchemaMap0010Builder
public class SchemaMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000Builder](#schemamap0000builder) | setNumber(int value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setNumber(float value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setNumber(long value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setNumber(double value) |
## SchemaMap0011Builder
public class SchemaMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0001Builder](#schemamap0001builder) | setNumber(int value) |
| [SchemaMap0001Builder](#schemamap0001builder) | setNumber(float value) |
| [SchemaMap0001Builder](#schemamap0001builder) | setNumber(long value) |
| [SchemaMap0001Builder](#schemamap0001builder) | setNumber(double value) |
| [SchemaMap0010Builder](#schemamap0010builder) | pattern_without_delimiter(String value) |
## SchemaMap0100Builder
public class SchemaMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000Builder](#schemamap0000builder) | setDouble(int value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setDouble(float value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setDouble(long value) |
| [SchemaMap0000Builder](#schemamap0000builder) | setDouble(double value) |
## SchemaMap0101Builder
public class SchemaMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0001Builder](#schemamap0001builder) | setDouble(int value) |
| [SchemaMap0001Builder](#schemamap0001builder) | setDouble(float value) |
| [SchemaMap0001Builder](#schemamap0001builder) | setDouble(long value) |
| [SchemaMap0001Builder](#schemamap0001builder) | setDouble(double value) |
| [SchemaMap0100Builder](#schemamap0100builder) | pattern_without_delimiter(String value) |
## SchemaMap0110Builder
public class SchemaMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0010Builder](#schemamap0010builder) | setDouble(int value) |
| [SchemaMap0010Builder](#schemamap0010builder) | setDouble(float value) |
| [SchemaMap0010Builder](#schemamap0010builder) | setDouble(long value) |
| [SchemaMap0010Builder](#schemamap0010builder) | setDouble(double value) |
| [SchemaMap0100Builder](#schemamap0100builder) | setNumber(int value) |
| [SchemaMap0100Builder](#schemamap0100builder) | setNumber(float value) |
| [SchemaMap0100Builder](#schemamap0100builder) | setNumber(long value) |
| [SchemaMap0100Builder](#schemamap0100builder) | setNumber(double value) |
## SchemaMap0111Builder
public class SchemaMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0011Builder](#schemamap0011builder) | setDouble(int value) |
| [SchemaMap0011Builder](#schemamap0011builder) | setDouble(float value) |
| [SchemaMap0011Builder](#schemamap0011builder) | setDouble(long value) |
| [SchemaMap0011Builder](#schemamap0011builder) | setDouble(double value) |
| [SchemaMap0101Builder](#schemamap0101builder) | setNumber(int value) |
| [SchemaMap0101Builder](#schemamap0101builder) | setNumber(float value) |
| [SchemaMap0101Builder](#schemamap0101builder) | setNumber(long value) |
| [SchemaMap0101Builder](#schemamap0101builder) | setNumber(double value) |
| [SchemaMap0110Builder](#schemamap0110builder) | pattern_without_delimiter(String value) |
## SchemaMap1000Builder
public class SchemaMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0000Builder](#schemamap0000builder) | setByte(String value) |
## SchemaMap1001Builder
public class SchemaMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0001Builder](#schemamap0001builder) | setByte(String value) |
| [SchemaMap1000Builder](#schemamap1000builder) | pattern_without_delimiter(String value) |
## SchemaMap1010Builder
public class SchemaMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0010Builder](#schemamap0010builder) | setByte(String value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setNumber(int value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setNumber(float value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setNumber(long value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setNumber(double value) |
## SchemaMap1011Builder
public class SchemaMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0011Builder](#schemamap0011builder) | setByte(String value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setNumber(int value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setNumber(float value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setNumber(long value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setNumber(double value) |
| [SchemaMap1010Builder](#schemamap1010builder) | pattern_without_delimiter(String value) |
## SchemaMap1100Builder
public class SchemaMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0100Builder](#schemamap0100builder) | setByte(String value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setDouble(int value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setDouble(float value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setDouble(long value) |
| [SchemaMap1000Builder](#schemamap1000builder) | setDouble(double value) |
## SchemaMap1101Builder
public class SchemaMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0101Builder](#schemamap0101builder) | setByte(String value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setDouble(int value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setDouble(float value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setDouble(long value) |
| [SchemaMap1001Builder](#schemamap1001builder) | setDouble(double value) |
| [SchemaMap1100Builder](#schemamap1100builder) | pattern_without_delimiter(String value) |
## SchemaMap1110Builder
public class SchemaMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0110Builder](#schemamap0110builder) | setByte(String value) |
| [SchemaMap1010Builder](#schemamap1010builder) | setDouble(int value) |
| [SchemaMap1010Builder](#schemamap1010builder) | setDouble(float value) |
| [SchemaMap1010Builder](#schemamap1010builder) | setDouble(long value) |
| [SchemaMap1010Builder](#schemamap1010builder) | setDouble(double value) |
| [SchemaMap1100Builder](#schemamap1100builder) | setNumber(int value) |
| [SchemaMap1100Builder](#schemamap1100builder) | setNumber(float value) |
| [SchemaMap1100Builder](#schemamap1100builder) | setNumber(long value) |
| [SchemaMap1100Builder](#schemamap1100builder) | setNumber(double value) |
## SchemaMapBuilder
public class SchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap0111Builder](#schemamap0111builder) | setByte(String value) |
| [SchemaMap1011Builder](#schemamap1011builder) | setDouble(int value) |
| [SchemaMap1011Builder](#schemamap1011builder) | setDouble(float value) |
| [SchemaMap1011Builder](#schemamap1011builder) | setDouble(long value) |
| [SchemaMap1011Builder](#schemamap1011builder) | setDouble(double value) |
| [SchemaMap1101Builder](#schemamap1101builder) | setNumber(int value) |
| [SchemaMap1101Builder](#schemamap1101builder) | setNumber(float value) |
| [SchemaMap1101Builder](#schemamap1101builder) | setNumber(long value) |
| [SchemaMap1101Builder](#schemamap1101builder) | setNumber(double value) |
| [SchemaMap1110Builder](#schemamap1110builder) | pattern_without_delimiter(String value) |

## SchemaMap
public static class SchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap](#schemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilder) arg, SchemaConfiguration configuration) |
| String | pattern_without_delimiter()<br> |
| Number | int32()<br>[optional] value must be a 32 bit integer |
| Number | int64()<br>[optional] value must be a 64 bit integer |
| String | binary()<br>[optional] |
| String | date()<br>[optional] value must conform to RFC-3339 full-date YYYY-MM-DD |
| String | dateTime()<br>[optional] if omitted the server will use the default value of 2010-02-01T10:20:10.111110+01:00 value must conform to RFC-3339 date-time |
| String | password()<br>[optional] |
| String | callback()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["byte"], instance["double"], instance["number"], instance["integer"], instance["float"], instance["string"],  |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Callback
public static class Callback<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Password
public static class Password<br>
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
String validatedPayload = Schema.Password.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DateTime
public static class DateTime<br>
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
String validatedPayload = Schema.DateTime.validate(
    "1970-01-01T00:00:00.00Z",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Date
public static class Date<br>
extends DateJsonSchema

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.DateJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Binary
public static class Binary<br>
extends JsonSchema

A schema class that validates payloads

## Description
None

## ByteSchema
public static class ByteSchema<br>
extends StringJsonSchema

A schema class that validates payloads

## Description
None

## PatternWithoutDelimiter
public static class PatternWithoutDelimiter<br>
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
String validatedPayload = Schema.PatternWithoutDelimiter.validate(
    "AUR,rZ#UM/?R,Fp^l6$ARjbhJk C>",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"^[A-Z].*"<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringSchema
public static class StringSchema<br>
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
String validatedPayload = Schema.StringSchema.validate(
    "A",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Pattern | pattern =<br>&nbsp;&nbsp;&nbsp;&nbsp;"[a-z]",<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.CASE_INSENSITIVE<br>)))<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DoubleSchema
public static class DoubleSchema<br>
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
double validatedPayload = Schema.DoubleSchema.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## FloatSchema
public static class FloatSchema<br>
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
float validatedPayload = Schema.FloatSchema.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## NumberSchema
public static class NumberSchema<br>
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
int validatedPayload = Schema.NumberSchema.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Int64
public static class Int64<br>
extends Int64JsonSchema

A schema class that validates payloads

## Description
None

| Methods Inherited from class org.openapijsonschematools.client.schemas.Int64JsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## Int32
public static class Int32<br>
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
int validatedPayload = Schema.Int32.validate(
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
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerSchema
public static class IntegerSchema<br>
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

// long validation
long validatedPayload = Schema.IntegerSchema.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| Number | maximum = 100 |
| Number | minimum = 10 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |