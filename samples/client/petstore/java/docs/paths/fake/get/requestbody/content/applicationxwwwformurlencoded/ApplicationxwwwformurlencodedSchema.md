# ApplicationxwwwformurlencodedSchema
public class ApplicationxwwwformurlencodedSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1](#applicationxwwwformurlencodedschema1)<br> schema class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder)<br> builder for Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap)<br> output class for Map payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringBoxed](#applicationxwwwformurlencodedenumformstringboxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringBoxedString](#applicationxwwwformurlencodedenumformstringboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormString](#applicationxwwwformurlencodedenumformstring)<br> schema class |
| enum | [ApplicationxwwwformurlencodedSchema.StringApplicationxwwwformurlencodedEnumFormStringEnums](#stringapplicationxwwwformurlencodedenumformstringenums)<br>String enum |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArrayBoxed](#applicationxwwwformurlencodedenumformstringarrayboxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList](#applicationxwwwformurlencodedenumformstringarrayboxedlist)<br> boxed class to store validated List payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArray](#applicationxwwwformurlencodedenumformstringarray)<br> schema class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder](#applicationxwwwformurlencodedenumformstringarraylistbuilder)<br> builder for List payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArrayList](#applicationxwwwformurlencodedenumformstringarraylist)<br> output class for List payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedItemsBoxed](#applicationxwwwformurlencodeditemsboxed)<br> abstract sealed validated payload class |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedItemsBoxedString](#applicationxwwwformurlencodeditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedItems](#applicationxwwwformurlencodeditems)<br> schema class |
| enum | [ApplicationxwwwformurlencodedSchema.StringApplicationxwwwformurlencodedItemsEnums](#stringapplicationxwwwformurlencodeditemsenums)<br>String enum |

## ApplicationxwwwformurlencodedSchema1Boxed
public sealed interface ApplicationxwwwformurlencodedSchema1Boxed<br>
permits<br>
[ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedSchema1BoxedMap
public static final class ApplicationxwwwformurlencodedSchema1BoxedMap<br>
implements [ApplicationxwwwformurlencodedSchema1Boxed](#applicationxwwwformurlencodedschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedSchema1BoxedMap([ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | data<br>validated payload |

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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string_array", [ApplicationxwwwformurlencodedEnumFormStringArray.class](#applicationxwwwformurlencodedenumformstringarray))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("enum_form_string", [ApplicationxwwwformurlencodedEnumFormString.class](#applicationxwwwformurlencodedenumformstring)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | validate([Map&lt;?, ?&gt;](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedSchema1BoxedMap](#applicationxwwwformurlencodedschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
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
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | enum_form_string_array(List<String> value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | enum_form_string(String value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | enum_form_string([StringApplicationxwwwformurlencodedEnumFormStringEnums](#stringapplicationxwwwformurlencodedenumformstringenums) value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Void value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, boolean value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, String value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, int value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, float value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, long value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, double value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, List<?> value) |
| [ApplicationxwwwformurlencodedSchemaMapBuilder](#applicationxwwwformurlencodedschemamapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## ApplicationxwwwformurlencodedSchemaMap
public static class ApplicationxwwwformurlencodedSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApplicationxwwwformurlencodedSchemaMap](#applicationxwwwformurlencodedschemamap) | of([Map<String, ? extends @Nullable Object>](#applicationxwwwformurlencodedschemamapbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedEnumFormStringArrayList](#applicationxwwwformurlencodedenumformstringarraylist) | enum_form_string_array()<br>[optional] |
| String | enum_form_string()<br>[optional] must be one of ["_abc", "-efg", "(xyz)"] if omitted the server will use the default value of -efg |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ApplicationxwwwformurlencodedEnumFormStringBoxed
public sealed interface ApplicationxwwwformurlencodedEnumFormStringBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedEnumFormStringBoxedString](#applicationxwwwformurlencodedenumformstringboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedEnumFormStringBoxedString
public static final class ApplicationxwwwformurlencodedEnumFormStringBoxedString<br>
implements [ApplicationxwwwformurlencodedEnumFormStringBoxed](#applicationxwwwformurlencodedenumformstringboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedEnumFormStringBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationxwwwformurlencodedEnumFormString
public static class ApplicationxwwwformurlencodedEnumFormString<br>
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
String validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormString.validate(
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
| String | validate([StringApplicationxwwwformurlencodedEnumFormStringEnums](#stringapplicationxwwwformurlencodedenumformstringenums) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedEnumFormStringBoxedString](#applicationxwwwformurlencodedenumformstringboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringApplicationxwwwformurlencodedEnumFormStringEnums
public enum StringApplicationxwwwformurlencodedEnumFormStringEnums<br>
extends `Enum<StringApplicationxwwwformurlencodedEnumFormStringEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| _ABC | value = "_abc" |
| HYPHEN_MINUS_EFG | value = "-efg" |
| LEFT_PARENTHESIS_XYZ_RIGHT_PARENTHESIS | value = "(xyz)" |

## ApplicationxwwwformurlencodedEnumFormStringArrayBoxed
public sealed interface ApplicationxwwwformurlencodedEnumFormStringArrayBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList](#applicationxwwwformurlencodedenumformstringarrayboxedlist)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList
public static final class ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList<br>
implements [ApplicationxwwwformurlencodedEnumFormStringArrayBoxed](#applicationxwwwformurlencodedenumformstringarrayboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList([ApplicationxwwwformurlencodedEnumFormStringArrayList](#applicationxwwwformurlencodedenumformstringarraylist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedEnumFormStringArrayList](#applicationxwwwformurlencodedenumformstringarraylist) | data<br>validated payload |

## ApplicationxwwwformurlencodedEnumFormStringArray
public static class ApplicationxwwwformurlencodedEnumFormStringArray<br>
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
ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArrayList validatedPayload =
    ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArray.validate(
    new ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder()
        .add(">")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [ApplicationxwwwformurlencodedItems.class](#applicationxwwwformurlencodeditems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedEnumFormStringArrayList](#applicationxwwwformurlencodedenumformstringarraylist) | validate([List<?>](#applicationxwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedEnumFormStringArrayBoxedList](#applicationxwwwformurlencodedenumformstringarrayboxedlist) | validateAndBox([List<?>](#applicationxwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder
public class ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder<br>
builder for `List<String>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder()<br>Creates an empty list |
| ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder(List<String> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder | add(String item) |
| ApplicationxwwwformurlencodedEnumFormStringArrayListBuilder | add([StringApplicationxwwwformurlencodedItemsEnums](#stringapplicationxwwwformurlencodeditemsenums) item) |
| List<String> | build()<br>Returns list input that should be used with Schema.validate |

## ApplicationxwwwformurlencodedEnumFormStringArrayList
public class ApplicationxwwwformurlencodedEnumFormStringArrayList<br>
extends `FrozenList<String>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ApplicationxwwwformurlencodedEnumFormStringArrayList](#applicationxwwwformurlencodedenumformstringarraylist) | of([List<String>](#applicationxwwwformurlencodedenumformstringarraylistbuilder) arg, SchemaConfiguration configuration) |

## ApplicationxwwwformurlencodedItemsBoxed
public sealed interface ApplicationxwwwformurlencodedItemsBoxed<br>
permits<br>
[ApplicationxwwwformurlencodedItemsBoxedString](#applicationxwwwformurlencodeditemsboxedstring)

sealed interface that stores validated payloads using boxed classes

## ApplicationxwwwformurlencodedItemsBoxedString
public static final class ApplicationxwwwformurlencodedItemsBoxedString<br>
implements [ApplicationxwwwformurlencodedItemsBoxed](#applicationxwwwformurlencodeditemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationxwwwformurlencodedItems
public static class ApplicationxwwwformurlencodedItems<br>
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
String validatedPayload = ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedItems.validate(
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
| String | validate([StringApplicationxwwwformurlencodedItemsEnums](#stringapplicationxwwwformurlencodeditemsenums) arg, SchemaConfiguration configuration) |
| [ApplicationxwwwformurlencodedItemsBoxedString](#applicationxwwwformurlencodeditemsboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringApplicationxwwwformurlencodedItemsEnums
public enum StringApplicationxwwwformurlencodedItemsEnums<br>
extends `Enum<StringApplicationxwwwformurlencodedItemsEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| GREATER_THAN_SIGN | value = ">" |
| DOLLAR_SIGN | value = "$" |
