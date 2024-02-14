# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedMap](#schemaschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |
| static class | [SchemaSchema.SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder)<br> builder for Map payloads |
| static class | [SchemaSchema.SchemaMapSchemaMap](#schemamapschemamap)<br> output class for Map payloads |
| static class | [SchemaSchema.EnumformstringEnumFormStringBoxed](#enumformstringenumformstringboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.EnumformstringEnumFormStringBoxedString](#enumformstringenumformstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.EnumformstringEnumFormString](#enumformstringenumformstring)<br> schema class |
| enum | [SchemaSchema.StringEnumformstringEnumsEnumFormStringEnums](#stringenumformstringenumsenumformstringenums)<br>String enum |
| static class | [SchemaSchema.EnumformstringarrayEnumFormStringArrayBoxed](#enumformstringarrayenumformstringarrayboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.EnumformstringarrayEnumFormStringArrayBoxedList](#enumformstringarrayenumformstringarrayboxedlist)<br> boxed class to store validated List payloads |
| static class | [SchemaSchema.EnumformstringarrayEnumFormStringArray](#enumformstringarrayenumformstringarray)<br> schema class |
| static class | [SchemaSchema.EnumformstringarrayListBuilderEnumFormStringArrayListBuilder](#enumformstringarraylistbuilderenumformstringarraylistbuilder)<br> builder for List payloads |
| static class | [SchemaSchema.EnumformstringarrayListEnumFormStringArrayList](#enumformstringarraylistenumformstringarraylist)<br> output class for List payloads |
| static class | [SchemaSchema.ItemsItemsBoxed](#itemsitemsboxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.ItemsItemsBoxedString](#itemsitemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.ItemsItems](#itemsitems)<br> schema class |
| enum | [SchemaSchema.StringItemsEnumsItemsEnums](#stringitemsenumsitemsenums)<br>String enum |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedMap](#schemaschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedMap
public static final class SchemaSchema1BoxedMap<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedMap([SchemaMapSchemaMap](#schemamapschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
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
SchemaSchema.SchemaMapSchemaMap validatedPayload =
    SchemaSchema.SchemaSchema1.validate(
    new SchemaSchema.SchemaMapBuilderSchemaMapBuilder()
        .enum_form_string_array(
            Arrays.asList(
                ">"
            )
        )
        .enum_form_string("_abc")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string_array", [EnumformstringarrayEnumFormStringArray.class](#enumformstringarrayenumformstringarray))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string", [EnumformstringEnumFormString.class](#enumformstringenumformstring)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMapSchemaMap](#schemamapschemamap) | validate([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SchemaSchema1BoxedMap](#schemaschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilderSchemaMapBuilder
public class SchemaMapBuilderSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilderSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | enum_form_string_array(List<String> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | enum_form_string(String value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | enum_form_string([StringEnumformstringEnumsEnumFormStringEnums](#stringenumformstringenumsenumformstringenums) value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, Void value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, boolean value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, String value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, int value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, float value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, long value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, double value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [SchemaMapBuilderSchemaMapBuilder](#schemamapbuilderschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMapSchemaMap
public static class SchemaMapSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMapSchemaMap](#schemamapschemamap) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilderschemamapbuilder) arg, SchemaConfiguration configuration) |
| [EnumformstringarrayListEnumFormStringArrayList](#enumformstringarraylistenumformstringarraylist) | enum_form_string_array()<br>[optional] |
| String | enum_form_string()<br>[optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## EnumformstringEnumFormStringBoxed
public static abstract sealed class EnumformstringEnumFormStringBoxed<br>
permits<br>
[EnumformstringEnumFormStringBoxedString](#enumformstringenumformstringboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## EnumformstringEnumFormStringBoxedString
public static final class EnumformstringEnumFormStringBoxedString<br>
extends [EnumformstringEnumFormStringBoxed](#enumformstringenumformstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumformstringEnumFormStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## EnumformstringEnumFormString
public static class EnumformstringEnumFormString<br>
extends JsonSchema

A schema class that validates payloads

## Description
Form parameter enum test (string)

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
String validatedPayload = SchemaSchema.EnumformstringEnumFormString.validate(
    "_abc",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"_abc",<br>&nbsp;&nbsp;&nbsp;&nbsp;"-efg",<br>&nbsp;&nbsp;&nbsp;&nbsp;"(xyz)"<br>)<br> |
| @Nullable Object | defaultValue = "-efg" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringEnumformstringEnumsEnumFormStringEnums](#stringenumformstringenumsenumformstringenums) arg, SchemaConfiguration configuration) |
| [EnumformstringEnumFormStringBoxedString](#enumformstringenumformstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringEnumformstringEnumsEnumFormStringEnums
public enum StringEnumformstringEnumsEnumFormStringEnums<br>
extends `Enum<StringEnumformstringEnumsEnumFormStringEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| _ABC | value = "_abc" |
| HYPHEN_MINUS_EFG | value = "-efg" |
| LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS | value = "(xyz)" |

## EnumformstringarrayEnumFormStringArrayBoxed
public static abstract sealed class EnumformstringarrayEnumFormStringArrayBoxed<br>
permits<br>
[EnumformstringarrayEnumFormStringArrayBoxedList](#enumformstringarrayenumformstringarrayboxedlist)

abstract sealed class that stores validated payloads using boxed classes

## EnumformstringarrayEnumFormStringArrayBoxedList
public static final class EnumformstringarrayEnumFormStringArrayBoxedList<br>
extends [EnumformstringarrayEnumFormStringArrayBoxed](#enumformstringarrayenumformstringarrayboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumformstringarrayEnumFormStringArrayBoxedList([EnumformstringarrayListEnumFormStringArrayList](#enumformstringarraylistenumformstringarraylist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [EnumformstringarrayListEnumFormStringArrayList](#enumformstringarraylistenumformstringarraylist) | data<br>validated payload |

## EnumformstringarrayEnumFormStringArray
public static class EnumformstringarrayEnumFormStringArray<br>
extends JsonSchema

A schema class that validates payloads

## Description
Form parameter enum test (string array)

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
SchemaSchema.EnumformstringarrayListEnumFormStringArrayList validatedPayload =
    SchemaSchema.EnumformstringarrayEnumFormStringArray.validate(
    new SchemaSchema.EnumformstringarrayListBuilderEnumFormStringArrayListBuilder()
        .add(">")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [ItemsItems.class](#itemsitems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [EnumformstringarrayListEnumFormStringArrayList](#enumformstringarraylistenumformstringarraylist) | validate([List<?>](#enumformstringarraylistbuilderenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| [EnumformstringarrayEnumFormStringArrayBoxedList](#enumformstringarrayenumformstringarrayboxedlist) | validateAndBox([List<?>](#enumformstringarraylistbuilderenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## EnumformstringarrayListBuilderEnumFormStringArrayListBuilder
public class EnumformstringarrayListBuilderEnumFormStringArrayListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumformstringarrayListBuilderEnumFormStringArrayListBuilder()<br>Creates an empty list |
| EnumformstringarrayListBuilderEnumFormStringArrayListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| EnumformstringarrayListBuilderEnumFormStringArrayListBuilder | add(String item) |
| EnumformstringarrayListBuilderEnumFormStringArrayListBuilder | add([StringItemsEnumsItemsEnums](#stringitemsenumsitemsenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## EnumformstringarrayListEnumFormStringArrayList
public class EnumformstringarrayListEnumFormStringArrayList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [EnumformstringarrayListEnumFormStringArrayList](#enumformstringarraylistenumformstringarraylist) | of([List<String>](#enumformstringarraylistbuilderenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |

## ItemsItemsBoxed
public static abstract sealed class ItemsItemsBoxed<br>
permits<br>
[ItemsItemsBoxedString](#itemsitemsboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## ItemsItemsBoxedString
public static final class ItemsItemsBoxedString<br>
extends [ItemsItemsBoxed](#itemsitemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ItemsItems
public static class ItemsItems<br>
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
String validatedPayload = SchemaSchema.ItemsItems.validate(
    ">",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;">",<br>&nbsp;&nbsp;&nbsp;&nbsp;"$"<br>)<br> |
| @Nullable Object | defaultValue = "$" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringItemsEnumsItemsEnums](#stringitemsenumsitemsenums) arg, SchemaConfiguration configuration) |
| [ItemsItemsBoxedString](#itemsitemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringItemsEnumsItemsEnums
public enum StringItemsEnumsItemsEnums<br>
extends `Enum<StringItemsEnumsItemsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| GREATER_THAN_SIGN | value = ">" |
| DOLLAR_SIGN | value = "$" |
