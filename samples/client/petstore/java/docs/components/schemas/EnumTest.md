# EnumTest
org.openapijsonschematools.components.schemas.EnumTest.java
public class EnumTest

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumTest.EnumTest1](#enumtest1)<br> schema class |
| static class | [EnumTest.EnumTestMap](#enumtestmap)<br> output class for Map payloads |
| static class | [EnumTest.EnumNumber](#enumnumber)<br> schema class |
| static class | [EnumTest.EnumInteger](#enuminteger)<br> schema class |
| static class | [EnumTest.EnumStringRequired](#enumstringrequired)<br> schema class |
| static class | [EnumTest.EnumString](#enumstring)<br> schema class |

## EnumTest1
public static class EnumTest1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_string", EnumString.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_string_required", EnumStringRequired.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_integer", EnumInteger.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_number", EnumNumber.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("stringEnum", StringEnum.StringEnum1.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("IntegerEnum", IntegerEnum.IntegerEnum1.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("StringEnumWithDefaultValue", StringEnumWithDefaultValue.StringEnumWithDefaultValue1.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("IntegerEnumWithDefaultValue", IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("IntegerEnumOneValue", IntegerEnumOneValue.IntegerEnumOneValue1.class)<br>&nbsp;&nbsp;&nbsp;&nbsp;))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("required", new RequiredValidator(Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"enum_string_required"<br>&nbsp;&nbsp;&nbsp;&nbsp;)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumTestMap](#enumtestmap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## EnumTestMap
public static class EnumTestMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumTestMap](#enumtestmap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | enum_string_required()<br> must be one of ["UPPER", "lower", ""] |
| String | enum_string()<br>[optional] must be one of ["UPPER", "lower", ""] |
| int | enum_integer()<br>[optional] must be one of [1, -1] value must be a 32 bit integer |
| double | enum_number()<br>[optional] must be one of [1.1, -1.2] value must be a 64 bit float |
| String | stringEnum()<br>[optional] |
| long | IntegerEnum()<br>[optional] |
| String | StringEnumWithDefaultValue()<br>[optional] |
| long | IntegerEnumWithDefaultValue()<br>[optional] |
| long | IntegerEnumOneValue()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **enum_string_required** | String |  | must be one of ["UPPER", "lower", ""] |
| **enum_string** | String |  | [optional] must be one of ["UPPER", "lower", ""] |
| **enum_integer** | int |  | [optional] must be one of [1, -1] value must be a 32 bit integer |
| **enum_number** | double |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float |
| **stringEnum** | String |  | [optional] |
| **IntegerEnum** | long |  | [optional] |
| **StringEnumWithDefaultValue** | String |  | [optional] |
| **IntegerEnumWithDefaultValue** | long |  | [optional] |
| **IntegerEnumOneValue** | long |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## EnumNumber
public static class EnumNumber<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("double"))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |

## EnumInteger
public static class EnumInteger<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("int32"))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static int | validate(int arg, SchemaConfiguration configuration) |

## EnumStringRequired
public static class EnumStringRequired<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

## EnumString
public static class EnumString<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
