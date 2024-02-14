# Application1xwwwformurlencodedSchema
public class Application1xwwwformurlencodedSchema

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
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1Boxed](#application1xwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchema1](#application1xwwwformurlencodedschema1)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringBoxed](#application1xwwwformurlencodedenumformstringboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringBoxedString](#application1xwwwformurlencodedenumformstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormString](#application1xwwwformurlencodedenumformstring)<br> schema class |
| enum | [Application1xwwwformurlencodedSchema.StringApplication1xwwwformurlencodedEnumFormStringEnums](#stringapplication1xwwwformurlencodedenumformstringenums)<br>String enum |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArrayBoxed](#application1xwwwformurlencodedenumformstringarrayboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArrayBoxedList](#application1xwwwformurlencodedenumformstringarrayboxedlist)<br> boxed class to store validated List payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArray](#application1xwwwformurlencodedenumformstringarray)<br> schema class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArrayListBuilder](#application1xwwwformurlencodedenumformstringarraylistbuilder)<br> builder for List payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArrayList](#application1xwwwformurlencodedenumformstringarraylist)<br> output class for List payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedItemsBoxed](#application1xwwwformurlencodeditemsboxed)<br> abstract sealed validated payload class |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedItemsBoxedString](#application1xwwwformurlencodeditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedItems](#application1xwwwformurlencodeditems)<br> schema class |
| enum | [Application1xwwwformurlencodedSchema.StringApplication1xwwwformurlencodedItemsEnums](#stringapplication1xwwwformurlencodeditemsenums)<br>String enum |

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string_array", [Application1xwwwformurlencodedEnumFormStringArray.class](#application1xwwwformurlencodedenumformstringarray))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string", [Application1xwwwformurlencodedEnumFormString.class](#application1xwwwformurlencodedenumformstring)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedSchema1BoxedMap](#application1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | enum_form_string_array(List<String> value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | enum_form_string(String value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | enum_form_string([StringApplication1xwwwformurlencodedEnumFormStringEnums](#stringapplication1xwwwformurlencodedenumformstringenums) value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Void value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, String value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, int value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, float value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, long value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, double value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Application1xwwwformurlencodedSchemaMapBuilder](#application1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Application1xwwwformurlencodedSchemaMap
public static class Application1xwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1xwwwformurlencodedSchemaMap](#application1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedEnumFormStringArrayList](#application1xwwwformurlencodedenumformstringarraylist) | enum_form_string_array()<br>[optional] |
| String | enum_form_string()<br>[optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application1xwwwformurlencodedEnumFormStringBoxed
public static abstract sealed class Application1xwwwformurlencodedEnumFormStringBoxed<br>
permits<br>
[Application1xwwwformurlencodedEnumFormStringBoxedString](#application1xwwwformurlencodedenumformstringboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedEnumFormStringBoxedString
public static final class Application1xwwwformurlencodedEnumFormStringBoxedString<br>
extends [Application1xwwwformurlencodedEnumFormStringBoxed](#application1xwwwformurlencodedenumformstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedEnumFormStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedEnumFormString
public static class Application1xwwwformurlencodedEnumFormString<br>
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
String validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormString.validate(
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
| String | validate([StringApplication1xwwwformurlencodedEnumFormStringEnums](#stringapplication1xwwwformurlencodedenumformstringenums) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedEnumFormStringBoxedString](#application1xwwwformurlencodedenumformstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringApplication1xwwwformurlencodedEnumFormStringEnums
public enum StringApplication1xwwwformurlencodedEnumFormStringEnums<br>
extends `Enum<StringApplication1xwwwformurlencodedEnumFormStringEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| _ABC | value = "_abc" |
| HYPHEN_MINUS_EFG | value = "-efg" |
| LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS | value = "(xyz)" |

## Application1xwwwformurlencodedEnumFormStringArrayBoxed
public static abstract sealed class Application1xwwwformurlencodedEnumFormStringArrayBoxed<br>
permits<br>
[Application1xwwwformurlencodedEnumFormStringArrayBoxedList](#application1xwwwformurlencodedenumformstringarrayboxedlist)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedEnumFormStringArrayBoxedList
public static final class Application1xwwwformurlencodedEnumFormStringArrayBoxedList<br>
extends [Application1xwwwformurlencodedEnumFormStringArrayBoxed](#application1xwwwformurlencodedenumformstringarrayboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedEnumFormStringArrayBoxedList([Application1xwwwformurlencodedEnumFormStringArrayList](#application1xwwwformurlencodedenumformstringarraylist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedEnumFormStringArrayList](#application1xwwwformurlencodedenumformstringarraylist) | data<br>validated payload |

## Application1xwwwformurlencodedEnumFormStringArray
public static class Application1xwwwformurlencodedEnumFormStringArray<br>
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
Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArrayList validatedPayload =
    Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArray.validate(
    new Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedEnumFormStringArrayListBuilder()
        .add(">")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Application1xwwwformurlencodedItems.class](#application1xwwwformurlencodeditems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application1xwwwformurlencodedEnumFormStringArrayList](#application1xwwwformurlencodedenumformstringarraylist) | validate([List<?>](#application1xwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedEnumFormStringArrayBoxedList](#application1xwwwformurlencodedenumformstringarrayboxedlist) | validateAndBox([List<?>](#application1xwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application1xwwwformurlencodedEnumFormStringArrayListBuilder
public class Application1xwwwformurlencodedEnumFormStringArrayListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedEnumFormStringArrayListBuilder()<br>Creates an empty list |
| Application1xwwwformurlencodedEnumFormStringArrayListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Application1xwwwformurlencodedEnumFormStringArrayListBuilder | add(String item) |
| Application1xwwwformurlencodedEnumFormStringArrayListBuilder | add([StringApplication1xwwwformurlencodedItemsEnums](#stringapplication1xwwwformurlencodeditemsenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## Application1xwwwformurlencodedEnumFormStringArrayList
public class Application1xwwwformurlencodedEnumFormStringArrayList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application1xwwwformurlencodedEnumFormStringArrayList](#application1xwwwformurlencodedenumformstringarraylist) | of([List<String>](#application1xwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |

## Application1xwwwformurlencodedItemsBoxed
public static abstract sealed class Application1xwwwformurlencodedItemsBoxed<br>
permits<br>
[Application1xwwwformurlencodedItemsBoxedString](#application1xwwwformurlencodeditemsboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application1xwwwformurlencodedItemsBoxedString
public static final class Application1xwwwformurlencodedItemsBoxedString<br>
extends [Application1xwwwformurlencodedItemsBoxed](#application1xwwwformurlencodeditemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xwwwformurlencodedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xwwwformurlencodedItems
public static class Application1xwwwformurlencodedItems<br>
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
String validatedPayload = Application1xwwwformurlencodedSchema.Application1xwwwformurlencodedItems.validate(
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
| String | validate([StringApplication1xwwwformurlencodedItemsEnums](#stringapplication1xwwwformurlencodeditemsenums) arg, SchemaConfiguration configuration) |
| [Application1xwwwformurlencodedItemsBoxedString](#application1xwwwformurlencodeditemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringApplication1xwwwformurlencodedItemsEnums
public enum StringApplication1xwwwformurlencodedItemsEnums<br>
extends `Enum<StringApplication1xwwwformurlencodedItemsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| GREATER_THAN_SIGN | value = ">" |
| DOLLAR_SIGN | value = "$" |
