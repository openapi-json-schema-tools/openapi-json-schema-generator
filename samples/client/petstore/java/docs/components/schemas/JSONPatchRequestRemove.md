# JSONPatchRequestRemove
org.openapijsonschematools.client.components.schemas.JSONPatchRequestRemove.java
public class JSONPatchRequestRemove

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemove1Boxed](#jsonpatchrequestremove1boxed)<br> abstract sealed validated payload class |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemove1BoxedMap](#jsonpatchrequestremove1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemove1](#jsonpatchrequestremove1)<br> schema class |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemoveMapBuilder](#jsonpatchrequestremovemapbuilder)<br> builder for Map payloads |
| static class | [JSONPatchRequestRemove.JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap)<br> output class for Map payloads |
| static class | [JSONPatchRequestRemove.OpBoxed](#opboxed)<br> abstract sealed validated payload class |
| static class | [JSONPatchRequestRemove.OpBoxedString](#opboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestRemove.Op](#op)<br> schema class |
| enum | [JSONPatchRequestRemove.StringOpEnums](#stringopenums)<br>String enum |
| static class | [JSONPatchRequestRemove.PathBoxed](#pathboxed)<br> abstract sealed validated payload class |
| static class | [JSONPatchRequestRemove.PathBoxedString](#pathboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestRemove.Path](#path)<br> schema class |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> abstract sealed validated payload class |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| static class | [JSONPatchRequestRemove.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestRemove.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestRemove1Boxed
public static abstract sealed class JSONPatchRequestRemove1Boxed<br>
permits<br>
[JSONPatchRequestRemove1BoxedMap](#jsonpatchrequestremove1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## JSONPatchRequestRemove1BoxedMap
public static final class JSONPatchRequestRemove1BoxedMap<br>
extends [JSONPatchRequestRemove1Boxed](#jsonpatchrequestremove1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestRemove1BoxedMap([JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap) | data<br>validated payload |

## JSONPatchRequestRemove1
public static class JSONPatchRequestRemove1<br>
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
JSONPatchRequestRemove.JSONPatchRequestRemoveMap validatedPayload =
    JSONPatchRequestRemove.JSONPatchRequestRemove1.validate(
    new JSONPatchRequestRemove.JSONPatchRequestRemoveMapBuilder()
        .op("remove")

        .path("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("path", [Path.class](#path))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("op", [Op.class](#op)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"op",<br>&nbsp;&nbsp;&nbsp;&nbsp;"path"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap) | validate([Map&lt;?, ?&gt;](#jsonpatchrequestremovemapbuilder) arg, SchemaConfiguration configuration) |
| [JSONPatchRequestRemove1BoxedMap](#jsonpatchrequestremove1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#jsonpatchrequestremovemapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## JSONPatchRequestRemoveMap00Builder
public class JSONPatchRequestRemoveMap00Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestRemoveMap00Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## JSONPatchRequestRemoveMap01Builder
public class JSONPatchRequestRemoveMap01Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestRemoveMap01Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestRemoveMap00Builder](#jsonpatchrequestremovemap00builder) | path(String value) |

## JSONPatchRequestRemoveMap10Builder
public class JSONPatchRequestRemoveMap10Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestRemoveMap10Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestRemoveMap00Builder](#jsonpatchrequestremovemap00builder) | op(String value) |
| [JSONPatchRequestRemoveMap00Builder](#jsonpatchrequestremovemap00builder) | op([StringOpEnums](#stringopenums) value) |

## JSONPatchRequestRemoveMapBuilder
public class JSONPatchRequestRemoveMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestRemoveMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestRemoveMap01Builder](#jsonpatchrequestremovemap01builder) | op(String value) |
| [JSONPatchRequestRemoveMap01Builder](#jsonpatchrequestremovemap01builder) | op([StringOpEnums](#stringopenums) value) |
| [JSONPatchRequestRemoveMap10Builder](#jsonpatchrequestremovemap10builder) | path(String value) |

## JSONPatchRequestRemoveMap
public static class JSONPatchRequestRemoveMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestRemoveMap](#jsonpatchrequestremovemap) | of([Map<String, String>](#jsonpatchrequestremovemapbuilder) arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["remove"] |
| String | path()<br> |

## OpBoxed
public static abstract sealed class OpBoxed<br>
permits<br>
[OpBoxedString](#opboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## OpBoxedString
public static final class OpBoxedString<br>
extends [OpBoxed](#opboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OpBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Op
public static class Op<br>
extends JsonSchema

A schema class that validates payloads

## Description
The operation to perform.

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
String validatedPayload = JSONPatchRequestRemove.Op.validate(
    "remove",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"remove"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringOpEnums](#stringopenums) arg, SchemaConfiguration configuration) |
| [OpBoxedString](#opboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringOpEnums
public enum StringOpEnums<br>
extends `Enum<StringOpEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| REMOVE | value = "remove" |

## PathBoxed
public static abstract sealed class PathBoxed<br>
permits<br>
[PathBoxedString](#pathboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## PathBoxedString
public static final class PathBoxedString<br>
extends [PathBoxed](#pathboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Path
public static class Path<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

## Description
A JSON Pointer path.

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

abstract sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public static final class AdditionalPropertiesBoxedBoolean<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalPropertiesBoxedNumber
public static final class AdditionalPropertiesBoxedNumber<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## AdditionalPropertiesBoxedString
public static final class AdditionalPropertiesBoxedString<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## AdditionalPropertiesBoxedList
public static final class AdditionalPropertiesBoxedList<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## AdditionalPropertiesBoxedMap
public static final class AdditionalPropertiesBoxedMap<br>
extends [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
