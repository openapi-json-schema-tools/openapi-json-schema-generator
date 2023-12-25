# EnumArrays
org.openapijsonschematools.client.components.schemas.EnumArrays.java
public class EnumArrays

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumArrays.EnumArrays1](#enumarrays1)<br> schema class |
| static class | [EnumArrays.EnumArraysMapInput](#enumarraysmapinput)<br> builder for Map payloads |
| static class | [EnumArrays.EnumArraysMap](#enumarraysmap)<br> output class for Map payloads |
| static class | [EnumArrays.ArrayEnum](#arrayenum)<br> schema class |
| static class | [EnumArrays.ArrayEnumListInput](#arrayenumlistinput)<br> builder for List payloads |
| static class | [EnumArrays.ArrayEnumList](#arrayenumlist)<br> output class for List payloads |
| static class | [EnumArrays.Items](#items)<br> schema class |
| enum | [EnumArrays.StringItemsEnums](#stringitemsenums)<br>String enum |
| static class | [EnumArrays.JustSymbol](#justsymbol)<br> schema class |
| enum | [EnumArrays.StringJustSymbolEnums](#stringjustsymbolenums)<br>String enum |

## EnumArrays1
public static class EnumArrays1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
EnumArrays.EnumArraysMap validatedPayload =
    EnumArrays.EnumArrays1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "just_symbol",
            ">="
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "array_enum",
            Arrays.asList(
                "fish"
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("just_symbol", [JustSymbol.class](#justsymbol))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_enum", [ArrayEnum.class](#arrayenum)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumArraysMap](#enumarraysmap) | validate([Map<?, ?>](#enumarraysmapinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EnumArraysMapInput
public class EnumArraysMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **just_symbol** | String |  | [optional] must be one of [">=", "$"] |
| **array_enum** | List<String> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## EnumArraysMap
public static class EnumArraysMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumArraysMap](#enumarraysmap) | of([Map<String, ? extends @Nullable Object>](#enumarraysmapinput) arg, SchemaConfiguration configuration) |
| String | just_symbol()<br>[optional] must be one of [">=", "$"] |
| [ArrayEnumList](#arrayenumlist) | array_enum()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayEnum
public static class ArrayEnum<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
EnumArrays.ArrayEnumList validatedPayload =
    EnumArrays.ArrayEnum.validate(
    Arrays.asList(
        "fish"
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items.class](#items)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayEnumList](#arrayenumlist) | validate([List<?>](#arrayenumlistinput) arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayEnumListInput
public class ArrayEnumListInput<br>
builder for `List<String>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
String |  | must be one of ["fish", "crab"]

## ArrayEnumList
public class ArrayEnumList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayEnumList](#arrayenumlist) | of([List<String>](#arrayenumlistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = EnumArrays.Items.validate(
    "fish",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fish",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"crab"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringItemsEnums
public enum StringItemsEnums<br>
extends `Enum<StringItemsEnums>`

A class that stores String enum values

## JustSymbol
public static class JustSymbol<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = EnumArrays.JustSymbol.validate(
    ">=",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">=",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"$"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StringJustSymbolEnums
public enum StringJustSymbolEnums<br>
extends `Enum<StringJustSymbolEnums>`

A class that stores String enum values

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
