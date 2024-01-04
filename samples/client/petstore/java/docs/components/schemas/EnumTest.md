# EnumTest
org.openapijsonschematools.client.components.schemas.EnumTest.java
public class EnumTest

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumTest.EnumTest1](#enumtest1)<br> schema class |
| static class | [EnumTest.EnumTestMapBuilder](#enumtestmapbuilder)<br> builder for Map payloads |
| static class | [EnumTest.EnumTestMap](#enumtestmap)<br> output class for Map payloads |
| static class | [EnumTest.EnumNumber](#enumnumber)<br> schema class |
| enum | [EnumTest.DoubleEnumNumberEnums](#doubleenumnumberenums)<br>Double enum |
| enum | [EnumTest.FloatEnumNumberEnums](#floatenumnumberenums)<br>Float enum |
| static class | [EnumTest.EnumInteger](#enuminteger)<br> schema class |
| enum | [EnumTest.IntegerEnumIntegerEnums](#integerenumintegerenums)<br>Integer enum |
| enum | [EnumTest.LongEnumIntegerEnums](#longenumintegerenums)<br>Long enum |
| enum | [EnumTest.FloatEnumIntegerEnums](#floatenumintegerenums)<br>Float enum |
| enum | [EnumTest.DoubleEnumIntegerEnums](#doubleenumintegerenums)<br>Double enum |
| static class | [EnumTest.EnumStringRequired](#enumstringrequired)<br> schema class |
| enum | [EnumTest.StringEnumStringRequiredEnums](#stringenumstringrequiredenums)<br>String enum |
| static class | [EnumTest.EnumString](#enumstring)<br> schema class |
| enum | [EnumTest.StringEnumStringEnums](#stringenumstringenums)<br>String enum |

## EnumTest1
public static class EnumTest1<br>
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
EnumTest.EnumTestMap validatedPayload =
    EnumTest.EnumTest1.validate(
    MapUtils.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "enum_string_required",
            "UPPER"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "enum_string",
            "UPPER"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "enum_integer",
            1
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "enum_number",
            3.14d
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_string", [EnumString.class](#enumstring))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_string_required", [EnumStringRequired.class](#enumstringrequired))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_integer", [EnumInteger.class](#enuminteger))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_number", [EnumNumber.class](#enumnumber))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("stringEnum", [StringEnum.StringEnum1.class](../../components/schemas/StringEnum.md#stringenum1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("IntegerEnum", [IntegerEnum.IntegerEnum1.class](../../components/schemas/IntegerEnum.md#integerenum1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("StringEnumWithDefaultValue", [StringEnumWithDefaultValue.StringEnumWithDefaultValue1.class](../../components/schemas/StringEnumWithDefaultValue.md#stringenumwithdefaultvalue1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("IntegerEnumWithDefaultValue", [IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1.class](../../components/schemas/IntegerEnumWithDefaultValue.md#integerenumwithdefaultvalue1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("IntegerEnumOneValue", [IntegerEnumOneValue.IntegerEnumOneValue1.class](../../components/schemas/IntegerEnumOneValue.md#integerenumonevalue1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"enum_string_required"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumTestMap](#enumtestmap) | validate([Map&lt;?, ?&gt;](#enumtestmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EnumTestMap0Builder
public class EnumTestMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumTestMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_string(String value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_string([StringEnumStringEnums](#stringenumstringenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_integer(int value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_integer(float value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_integer([IntegerEnumIntegerEnums](#integerenumintegerenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_integer([LongEnumIntegerEnums](#longenumintegerenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_integer([FloatEnumIntegerEnums](#floatenumintegerenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_integer([DoubleEnumIntegerEnums](#doubleenumintegerenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_number(int value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_number(float value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_number(long value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_number(double value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_number([DoubleEnumNumberEnums](#doubleenumnumberenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_number([FloatEnumNumberEnums](#floatenumnumberenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | stringEnum(Void value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | stringEnum(String value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | stringEnum([StringEnum.StringStringEnumEnums](../../components/schemas/StringEnum.md#stringstringenumenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | stringEnum([StringEnum.NullStringEnumEnums](../../components/schemas/StringEnum.md#nullstringenumenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum(int value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum(float value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum(long value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum(double value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum([IntegerEnum.IntegerIntegerEnumEnums](../../components/schemas/IntegerEnum.md#integerintegerenumenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum([IntegerEnum.LongIntegerEnumEnums](../../components/schemas/IntegerEnum.md#longintegerenumenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum([IntegerEnum.FloatIntegerEnumEnums](../../components/schemas/IntegerEnum.md#floatintegerenumenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnum([IntegerEnum.DoubleIntegerEnumEnums](../../components/schemas/IntegerEnum.md#doubleintegerenumenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | StringEnumWithDefaultValue(String value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | StringEnumWithDefaultValue([StringEnumWithDefaultValue.StringStringEnumWithDefaultValueEnums](../../components/schemas/StringEnumWithDefaultValue.md#stringstringenumwithdefaultvalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue(int value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue(float value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue(long value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue(double value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue([IntegerEnumWithDefaultValue.IntegerIntegerEnumWithDefaultValueEnums](../../components/schemas/IntegerEnumWithDefaultValue.md#integerintegerenumwithdefaultvalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue([IntegerEnumWithDefaultValue.LongIntegerEnumWithDefaultValueEnums](../../components/schemas/IntegerEnumWithDefaultValue.md#longintegerenumwithdefaultvalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue([IntegerEnumWithDefaultValue.FloatIntegerEnumWithDefaultValueEnums](../../components/schemas/IntegerEnumWithDefaultValue.md#floatintegerenumwithdefaultvalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumWithDefaultValue([IntegerEnumWithDefaultValue.DoubleIntegerEnumWithDefaultValueEnums](../../components/schemas/IntegerEnumWithDefaultValue.md#doubleintegerenumwithdefaultvalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue(int value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue(float value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue(long value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue(double value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue([IntegerEnumOneValue.IntegerIntegerEnumOneValueEnums](../../components/schemas/IntegerEnumOneValue.md#integerintegerenumonevalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue([IntegerEnumOneValue.LongIntegerEnumOneValueEnums](../../components/schemas/IntegerEnumOneValue.md#longintegerenumonevalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue([IntegerEnumOneValue.FloatIntegerEnumOneValueEnums](../../components/schemas/IntegerEnumOneValue.md#floatintegerenumonevalueenums) value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | IntegerEnumOneValue([IntegerEnumOneValue.DoubleIntegerEnumOneValueEnums](../../components/schemas/IntegerEnumOneValue.md#doubleintegerenumonevalueenums) value) |
## EnumTestMapBuilder
public class EnumTestMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

## Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumTestMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_string_required(String value) |
| [EnumTestMap0Builder](#enumtestmap0builder) | enum_string_required([StringEnumStringRequiredEnums](#stringenumstringrequiredenums) value) |

## EnumTestMap
public static class EnumTestMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumTestMap](#enumtestmap) | of([Map<String, ? extends @Nullable Object>](#enumtestmapbuilder) arg, SchemaConfiguration configuration) |
| String | enum_string_required()<br> must be one of ["UPPER", "lower", ""] |
| String | enum_string()<br>[optional] must be one of ["UPPER", "lower", ""] |
| Number | enum_integer()<br>[optional] must be one of [1, -1] value must be a 32 bit integer |
| Number | enum_number()<br>[optional] must be one of [1.1, -1.2] value must be a 64 bit float |
| @Nullable String | stringEnum()<br>[optional] |
| Number | IntegerEnum()<br>[optional] |
| String | StringEnumWithDefaultValue()<br>[optional] |
| Number | IntegerEnumWithDefaultValue()<br>[optional] |
| Number | IntegerEnumOneValue()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## EnumNumber
public static class EnumNumber<br>
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

// double validation
double validatedPayload = EnumTest.EnumNumber.validate(
    3.14d,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "double"; |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;1.1,<br>&nbsp;&nbsp;&nbsp;&nbsp;-1.2<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| double | validate(double arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## DoubleEnumNumberEnums
public enum DoubleEnumNumberEnums<br>
extends `Enum<DoubleEnumNumberEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1_PT_1 | value = 1.1d |
| NEGATIVE_1_PT_2 | value = -1.2d |

## FloatEnumNumberEnums
public enum FloatEnumNumberEnums<br>
extends `Enum<FloatEnumNumberEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1_PT_1 | value = 1.1f |
| NEGATIVE_1_PT_2 | value = -1.2f |

## EnumInteger
public static class EnumInteger<br>
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

// int validation
int validatedPayload = EnumTest.EnumInteger.validate(
    1,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int32"; |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;1,<br>&nbsp;&nbsp;&nbsp;&nbsp;-1<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| int | validate(int arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerEnumIntegerEnums
public enum IntegerEnumIntegerEnums<br>
extends `Enum<IntegerEnumIntegerEnums>`

A class that stores Integer enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1 |
| NEGATIVE_1 | value = -1 |

## LongEnumIntegerEnums
public enum LongEnumIntegerEnums<br>
extends `Enum<LongEnumIntegerEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1L |
| NEGATIVE_1 | value = -1L |

## FloatEnumIntegerEnums
public enum FloatEnumIntegerEnums<br>
extends `Enum<FloatEnumIntegerEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0f |
| NEGATIVE_1 | value = -1.0f |

## DoubleEnumIntegerEnums
public enum DoubleEnumIntegerEnums<br>
extends `Enum<DoubleEnumIntegerEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0d |
| NEGATIVE_1 | value = -1.0d |

## EnumStringRequired
public static class EnumStringRequired<br>
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

// String validation
String validatedPayload = EnumTest.EnumStringRequired.validate(
    "UPPER",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"UPPER",<br>&nbsp;&nbsp;&nbsp;&nbsp;"lower",<br>&nbsp;&nbsp;&nbsp;&nbsp;""<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringEnumStringRequiredEnums](#stringenumstringrequiredenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringEnumStringRequiredEnums
public enum StringEnumStringRequiredEnums<br>
extends `Enum<StringEnumStringRequiredEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| UPPER | value = "UPPER" |
| LOWER | value = "lower" |
| EMPTY | value = "" |

## EnumString
public static class EnumString<br>
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

// String validation
String validatedPayload = EnumTest.EnumString.validate(
    "UPPER",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"UPPER",<br>&nbsp;&nbsp;&nbsp;&nbsp;"lower",<br>&nbsp;&nbsp;&nbsp;&nbsp;""<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringEnumStringEnums](#stringenumstringenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringEnumStringEnums
public enum StringEnumStringEnums<br>
extends `Enum<StringEnumStringEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| UPPER | value = "UPPER" |
| LOWER | value = "lower" |
| EMPTY | value = "" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
