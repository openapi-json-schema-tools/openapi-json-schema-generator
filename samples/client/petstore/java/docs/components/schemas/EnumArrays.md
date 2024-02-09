# EnumArrays
org.openapijsonschematools.client.components.schemas.EnumArrays.java
public class EnumArrays

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumArrays.EnumArrays1Boxed](#enumarrays1boxed)<br> sealed validated payload class |
| static class | [EnumArrays.EnumArrays1](#enumarrays1)<br> schema class |
| static class | [EnumArrays.EnumArraysMapBuilder](#enumarraysmapbuilder)<br> builder for Map payloads |
| static class | [EnumArrays.EnumArraysMap](#enumarraysmap)<br> output class for Map payloads |
| static class | [EnumArrays.ArrayEnumBoxed](#arrayenumboxed)<br> sealed validated payload class |
| static class | [EnumArrays.ArrayEnum](#arrayenum)<br> schema class |
| static class | [EnumArrays.ArrayEnumListBuilder](#arrayenumlistbuilder)<br> builder for List payloads |
| static class | [EnumArrays.ArrayEnumList](#arrayenumlist)<br> output class for List payloads |
| static class | [EnumArrays.ItemsBoxed](#itemsboxed)<br> sealed validated payload class |
| static class | [EnumArrays.Items](#items)<br> schema class |
| enum | [EnumArrays.StringItemsEnums](#stringitemsenums)<br>String enum |
| static class | [EnumArrays.JustSymbolBoxed](#justsymbolboxed)<br> sealed validated payload class |
| static class | [EnumArrays.JustSymbol](#justsymbol)<br> schema class |
| enum | [EnumArrays.StringJustSymbolEnums](#stringjustsymbolenums)<br>String enum |

## EnumArrays1Boxed
public static abstract sealed class EnumArrays1Boxed<br>

## EnumArrays1
public static class EnumArrays1<br>
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
EnumArrays.EnumArraysMap validatedPayload =
    EnumArrays.EnumArrays1.validate(
    new EnumArrays.EnumArraysMapBuilder()
        .just_symbol(">=")

        .array_enum(
            Arrays.asList(
                "fish"
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("just_symbol", [JustSymbol.class](#justsymbol))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("array_enum", [ArrayEnum.class](#arrayenum)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumArraysMap](#enumarraysmap) | validate([Map&lt;?, ?&gt;](#enumarraysmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EnumArraysMapBuilder
public class EnumArraysMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumArraysMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | just_symbol(String value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | just_symbol([StringJustSymbolEnums](#stringjustsymbolenums) value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | array_enum(List<String> value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, Void value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, boolean value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, String value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, int value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, float value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, long value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, double value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, List<?> value) |
| [EnumArraysMapBuilder](#enumarraysmapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## EnumArraysMap
public static class EnumArraysMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumArraysMap](#enumarraysmap) | of([Map<String, ? extends @Nullable Object>](#enumarraysmapbuilder) arg, SchemaConfiguration configuration) |
| String | just_symbol()<br>[optional] must be one of [">=", "$"] |
| [ArrayEnumList](#arrayenumlist) | array_enum()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayEnumBoxed
public static abstract sealed class ArrayEnumBoxed<br>

## ArrayEnum
public static class ArrayEnum<br>
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

// List validation
EnumArrays.ArrayEnumList validatedPayload =
    EnumArrays.ArrayEnum.validate(
    new EnumArrays.ArrayEnumListBuilder()
        .add("fish")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayEnumList](#arrayenumlist) | validate([List<?>](#arrayenumlistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayEnumListBuilder
public class ArrayEnumListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayEnumListBuilder()<br>Creates an empty list |
| ArrayEnumListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ArrayEnumListBuilder | add(String item) |
| ArrayEnumListBuilder | add([StringItemsEnums](#stringitemsenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## ArrayEnumList
public class ArrayEnumList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayEnumList](#arrayenumlist) | of([List<String>](#arrayenumlistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public static abstract sealed class ItemsBoxed<br>

## Items
public static class Items<br>
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
String validatedPayload = EnumArrays.Items.validate(
    "fish",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"fish",<br>&nbsp;&nbsp;&nbsp;&nbsp;"crab"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringItemsEnums](#stringitemsenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringItemsEnums
public enum StringItemsEnums<br>
extends `Enum<StringItemsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| FISH | value = "fish" |
| CRAB | value = "crab" |

## JustSymbolBoxed
public static abstract sealed class JustSymbolBoxed<br>

## JustSymbol
public static class JustSymbol<br>
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
String validatedPayload = EnumArrays.JustSymbol.validate(
    ">=",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;">=",<br>&nbsp;&nbsp;&nbsp;&nbsp;"$"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringJustSymbolEnums](#stringjustsymbolenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringJustSymbolEnums
public enum StringJustSymbolEnums<br>
extends `Enum<StringJustSymbolEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| GREATER_THAN_SIGN_EQUALS_SIGN | value = ">=" |
| DOLLAR_SIGN | value = "$" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
