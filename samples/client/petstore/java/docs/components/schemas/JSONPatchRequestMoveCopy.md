# JSONPatchRequestMoveCopy
org.openapijsonschematools.client.components.schemas.JSONPatchRequestMoveCopy.java
public class JSONPatchRequestMoveCopy

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1Boxed](#jsonpatchrequestmovecopy1boxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1](#jsonpatchrequestmovecopy1)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMapBuilder](#jsonpatchrequestmovecopymapbuilder)<br> builder for Map payloads |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap)<br> output class for Map payloads |
| static class | [JSONPatchRequestMoveCopy.OpBoxed](#opboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestMoveCopy.Op](#op)<br> schema class |
| enum | [JSONPatchRequestMoveCopy.StringOpEnums](#stringopenums)<br>String enum |
| static class | [JSONPatchRequestMoveCopy.PathBoxed](#pathboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestMoveCopy.Path](#path)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.FromBoxed](#fromboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestMoveCopy.From](#from)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestMoveCopy.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestMoveCopy1Boxed
public static abstract sealed class JSONPatchRequestMoveCopy1Boxed<br>
permits<br>
[JSONPatchRequestMoveCopy1BoxedMap](#jsonpatchrequestmovecopy1boxedmap)

A sealed class that stores validated payloads using boxed classes

## JSONPatchRequestMoveCopy1
public static class JSONPatchRequestMoveCopy1<br>
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
JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMap validatedPayload =
    JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1.validate(
    new JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMapBuilder()
        .from("a")

        .op("move")

        .path("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("from", [From.class](#from))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("path", [Path.class](#path))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("op", [Op.class](#op)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"from",<br>&nbsp;&nbsp;&nbsp;&nbsp;"op",<br>&nbsp;&nbsp;&nbsp;&nbsp;"path"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap) | validate([Map&lt;?, ?&gt;](#jsonpatchrequestmovecopymapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## JSONPatchRequestMoveCopyMap000Builder
public class JSONPatchRequestMoveCopyMap000Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap000Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## JSONPatchRequestMoveCopyMap001Builder
public class JSONPatchRequestMoveCopyMap001Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap001Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap000Builder](#jsonpatchrequestmovecopymap000builder) | path(String value) |

## JSONPatchRequestMoveCopyMap010Builder
public class JSONPatchRequestMoveCopyMap010Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap010Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap000Builder](#jsonpatchrequestmovecopymap000builder) | op(String value) |
| [JSONPatchRequestMoveCopyMap000Builder](#jsonpatchrequestmovecopymap000builder) | op([StringOpEnums](#stringopenums) value) |

## JSONPatchRequestMoveCopyMap011Builder
public class JSONPatchRequestMoveCopyMap011Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap011Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap001Builder](#jsonpatchrequestmovecopymap001builder) | op(String value) |
| [JSONPatchRequestMoveCopyMap001Builder](#jsonpatchrequestmovecopymap001builder) | op([StringOpEnums](#stringopenums) value) |
| [JSONPatchRequestMoveCopyMap010Builder](#jsonpatchrequestmovecopymap010builder) | path(String value) |

## JSONPatchRequestMoveCopyMap100Builder
public class JSONPatchRequestMoveCopyMap100Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap100Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap000Builder](#jsonpatchrequestmovecopymap000builder) | from(String value) |

## JSONPatchRequestMoveCopyMap101Builder
public class JSONPatchRequestMoveCopyMap101Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap101Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap001Builder](#jsonpatchrequestmovecopymap001builder) | from(String value) |
| [JSONPatchRequestMoveCopyMap100Builder](#jsonpatchrequestmovecopymap100builder) | path(String value) |

## JSONPatchRequestMoveCopyMap110Builder
public class JSONPatchRequestMoveCopyMap110Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMap110Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap010Builder](#jsonpatchrequestmovecopymap010builder) | from(String value) |
| [JSONPatchRequestMoveCopyMap100Builder](#jsonpatchrequestmovecopymap100builder) | op(String value) |
| [JSONPatchRequestMoveCopyMap100Builder](#jsonpatchrequestmovecopymap100builder) | op([StringOpEnums](#stringopenums) value) |

## JSONPatchRequestMoveCopyMapBuilder
public class JSONPatchRequestMoveCopyMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopyMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap011Builder](#jsonpatchrequestmovecopymap011builder) | from(String value) |
| [JSONPatchRequestMoveCopyMap101Builder](#jsonpatchrequestmovecopymap101builder) | op(String value) |
| [JSONPatchRequestMoveCopyMap101Builder](#jsonpatchrequestmovecopymap101builder) | op([StringOpEnums](#stringopenums) value) |
| [JSONPatchRequestMoveCopyMap110Builder](#jsonpatchrequestmovecopymap110builder) | path(String value) |

## JSONPatchRequestMoveCopyMap
public static class JSONPatchRequestMoveCopyMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap) | of([Map<String, String>](#jsonpatchrequestmovecopymapbuilder) arg, SchemaConfiguration configuration) |
| String | from()<br> |
| String | op()<br> must be one of ["move", "copy"] |
| String | path()<br> |

## OpBoxed
public static abstract sealed class OpBoxed<br>
permits<br>
[OpBoxedString](#opboxedstring)

A sealed class that stores validated payloads using boxed classes

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
String validatedPayload = JSONPatchRequestMoveCopy.Op.validate(
    "move",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"move",<br>&nbsp;&nbsp;&nbsp;&nbsp;"copy"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| String | validate([StringOpEnums](#stringopenums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringOpEnums
public enum StringOpEnums<br>
extends `Enum<StringOpEnums>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| MOVE | value = "move" |
| COPY | value = "copy" |

## PathBoxed
public static abstract sealed class PathBoxed<br>
permits<br>
[PathBoxedString](#pathboxedstring)

A sealed class that stores validated payloads using boxed classes

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

## FromBoxed
public static abstract sealed class FromBoxed<br>
permits<br>
[FromBoxedString](#fromboxedstring)

A sealed class that stores validated payloads using boxed classes

## From
public static class From<br>
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

A sealed class that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public static final class AdditionalPropertiesBoxedVoid<br>
extends AdditionalPropertiesBoxed

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
extends AdditionalPropertiesBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
