# Application~1xWwwFormUrlencodedSchema
public class Application~1xWwwFormUrlencodedSchema

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
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1Boxed](#application~1xwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchema1](#application~1xwwwformurlencodedschema1)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringBoxed](#application~1xwwwformurlencodedenumformstringboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringBoxedString](#application~1xwwwformurlencodedenumformstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormString](#application~1xwwwformurlencodedenumformstring)<br> schema class |
| enum | [Application~1xWwwFormUrlencodedSchema.StringApplication~1xWwwFormUrlencodedEnumFormStringEnums](#stringapplication~1xwwwformurlencodedenumformstringenums)<br>String enum |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArrayBoxed](#application~1xwwwformurlencodedenumformstringarrayboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArrayBoxedList](#application~1xwwwformurlencodedenumformstringarrayboxedlist)<br> boxed class to store validated List payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArray](#application~1xwwwformurlencodedenumformstringarray)<br> schema class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder](#application~1xwwwformurlencodedenumformstringarraylistbuilder)<br> builder for List payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArrayList](#application~1xwwwformurlencodedenumformstringarraylist)<br> output class for List payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedItemsBoxed](#application~1xwwwformurlencodeditemsboxed)<br> abstract sealed validated payload class |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedItemsBoxedString](#application~1xwwwformurlencodeditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedItems](#application~1xwwwformurlencodeditems)<br> schema class |
| enum | [Application~1xWwwFormUrlencodedSchema.StringApplication~1xWwwFormUrlencodedItemsEnums](#stringapplication~1xwwwformurlencodeditemsenums)<br>String enum |

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string_array", [Application~1xWwwFormUrlencodedEnumFormStringArray.class](#application~1xwwwformurlencodedenumformstringarray))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string", [Application~1xWwwFormUrlencodedEnumFormString.class](#application~1xwwwformurlencodedenumformstring)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedSchema1BoxedMap](#application~1xwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | enum_form_string_array(List<String> value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | enum_form_string(String value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | enum_form_string([StringApplication~1xWwwFormUrlencodedEnumFormStringEnums](#stringapplication~1xwwwformurlencodedenumformstringenums) value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Void value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, boolean value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, String value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, int value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, float value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, long value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, double value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [Application~1xWwwFormUrlencodedSchemaMapBuilder](#application~1xwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Application~1xWwwFormUrlencodedSchemaMap
public static class Application~1xWwwFormUrlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1xWwwFormUrlencodedSchemaMap](#application~1xwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#application~1xwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedEnumFormStringArrayList](#application~1xwwwformurlencodedenumformstringarraylist) | enum_form_string_array()<br>[optional] |
| String | enum_form_string()<br>[optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## Application~1xWwwFormUrlencodedEnumFormStringBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedEnumFormStringBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedEnumFormStringBoxedString](#application~1xwwwformurlencodedenumformstringboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedEnumFormStringBoxedString
public static final class Application~1xWwwFormUrlencodedEnumFormStringBoxedString<br>
extends [Application~1xWwwFormUrlencodedEnumFormStringBoxed](#application~1xwwwformurlencodedenumformstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedEnumFormStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedEnumFormString
public static class Application~1xWwwFormUrlencodedEnumFormString<br>
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
String validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormString.validate(
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
| String | validate([StringApplication~1xWwwFormUrlencodedEnumFormStringEnums](#stringapplication~1xwwwformurlencodedenumformstringenums) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedEnumFormStringBoxedString](#application~1xwwwformurlencodedenumformstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringApplication~1xWwwFormUrlencodedEnumFormStringEnums
public enum StringApplication~1xWwwFormUrlencodedEnumFormStringEnums<br>
extends `Enum<StringApplication~1xWwwFormUrlencodedEnumFormStringEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| _ABC | value = "_abc" |
| HYPHEN_MINUS_EFG | value = "-efg" |
| LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS | value = "(xyz)" |

## Application~1xWwwFormUrlencodedEnumFormStringArrayBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedEnumFormStringArrayBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedEnumFormStringArrayBoxedList](#application~1xwwwformurlencodedenumformstringarrayboxedlist)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedEnumFormStringArrayBoxedList
public static final class Application~1xWwwFormUrlencodedEnumFormStringArrayBoxedList<br>
extends [Application~1xWwwFormUrlencodedEnumFormStringArrayBoxed](#application~1xwwwformurlencodedenumformstringarrayboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedEnumFormStringArrayBoxedList([Application~1xWwwFormUrlencodedEnumFormStringArrayList](#application~1xwwwformurlencodedenumformstringarraylist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedEnumFormStringArrayList](#application~1xwwwformurlencodedenumformstringarraylist) | data<br>validated payload |

## Application~1xWwwFormUrlencodedEnumFormStringArray
public static class Application~1xWwwFormUrlencodedEnumFormStringArray<br>
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
Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArrayList validatedPayload =
    Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArray.validate(
    new Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder()
        .add(">")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Application~1xWwwFormUrlencodedItems.class](#application~1xwwwformurlencodeditems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Application~1xWwwFormUrlencodedEnumFormStringArrayList](#application~1xwwwformurlencodedenumformstringarraylist) | validate([List<?>](#application~1xwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedEnumFormStringArrayBoxedList](#application~1xwwwformurlencodedenumformstringarrayboxedlist) | validateAndBox([List<?>](#application~1xwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder
public class Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder()<br>Creates an empty list |
| Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder | add(String item) |
| Application~1xWwwFormUrlencodedEnumFormStringArrayListBuilder | add([StringApplication~1xWwwFormUrlencodedItemsEnums](#stringapplication~1xwwwformurlencodeditemsenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## Application~1xWwwFormUrlencodedEnumFormStringArrayList
public class Application~1xWwwFormUrlencodedEnumFormStringArrayList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Application~1xWwwFormUrlencodedEnumFormStringArrayList](#application~1xwwwformurlencodedenumformstringarraylist) | of([List<String>](#application~1xwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |

## Application~1xWwwFormUrlencodedItemsBoxed
public static abstract sealed class Application~1xWwwFormUrlencodedItemsBoxed<br>
permits<br>
[Application~1xWwwFormUrlencodedItemsBoxedString](#application~1xwwwformurlencodeditemsboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xWwwFormUrlencodedItemsBoxedString
public static final class Application~1xWwwFormUrlencodedItemsBoxedString<br>
extends [Application~1xWwwFormUrlencodedItemsBoxed](#application~1xwwwformurlencodeditemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xWwwFormUrlencodedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xWwwFormUrlencodedItems
public static class Application~1xWwwFormUrlencodedItems<br>
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
String validatedPayload = Application~1xWwwFormUrlencodedSchema.Application~1xWwwFormUrlencodedItems.validate(
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
| String | validate([StringApplication~1xWwwFormUrlencodedItemsEnums](#stringapplication~1xwwwformurlencodeditemsenums) arg, SchemaConfiguration configuration) |
| [Application~1xWwwFormUrlencodedItemsBoxedString](#application~1xwwwformurlencodeditemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringApplication~1xWwwFormUrlencodedItemsEnums
public enum StringApplication~1xWwwFormUrlencodedItemsEnums<br>
extends `Enum<StringApplication~1xWwwFormUrlencodedItemsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| GREATER_THAN_SIGN | value = ">" |
| DOLLAR_SIGN | value = "$" |
