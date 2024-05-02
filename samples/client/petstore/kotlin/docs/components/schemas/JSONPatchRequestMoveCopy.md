# JSONPatchRequestMoveCopy
org.openapijsonschematools.client.components.schemas.JSONPatchRequestMoveCopy.java
public class JSONPatchRequestMoveCopy<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1Boxed](#jsonpatchrequestmovecopy1boxed)<br> sealed interface for validated payloads |
| record | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1BoxedMap](#jsonpatchrequestmovecopy1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopy1](#jsonpatchrequestmovecopy1)<br> schema class |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMapBuilder](#jsonpatchrequestmovecopymapbuilder)<br> builder for Map payloads |
| static class | [JSONPatchRequestMoveCopy.JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap)<br> output class for Map payloads |
| sealed interface | [JSONPatchRequestMoveCopy.OpBoxed](#opboxed)<br> sealed interface for validated payloads |
| record | [JSONPatchRequestMoveCopy.OpBoxedString](#opboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestMoveCopy.Op](#op)<br> schema class |
| enum | [JSONPatchRequestMoveCopy.StringOpEnums](#stringopenums)<br>String enum |
| sealed interface | [JSONPatchRequestMoveCopy.PathBoxed](#pathboxed)<br> sealed interface for validated payloads |
| record | [JSONPatchRequestMoveCopy.PathBoxedString](#pathboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestMoveCopy.Path](#path)<br> schema class |
| sealed interface | [JSONPatchRequestMoveCopy.FromBoxed](#fromboxed)<br> sealed interface for validated payloads |
| record | [JSONPatchRequestMoveCopy.FromBoxedString](#fromboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestMoveCopy.From](#from)<br> schema class |
| sealed interface | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [JSONPatchRequestMoveCopy.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestMoveCopy.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestMoveCopy1Boxed
public sealed interface JSONPatchRequestMoveCopy1Boxed<br>
permits<br>
[JSONPatchRequestMoveCopy1BoxedMap](#jsonpatchrequestmovecopy1boxedmap)

sealed interface that stores validated payloads using boxed classes

## JSONPatchRequestMoveCopy1BoxedMap
public record JSONPatchRequestMoveCopy1BoxedMap<br>
implements [JSONPatchRequestMoveCopy1Boxed](#jsonpatchrequestmovecopy1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestMoveCopy1BoxedMap([JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestMoveCopyMap](#jsonpatchrequestmovecopymap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.JSONPatchRequestMoveCopy;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [JSONPatchRequestMoveCopy1BoxedMap](#jsonpatchrequestmovecopy1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#jsonpatchrequestmovecopymapbuilder) arg, SchemaConfiguration configuration) |
| [JSONPatchRequestMoveCopy1Boxed](#jsonpatchrequestmovecopy1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface OpBoxed<br>
permits<br>
[OpBoxedString](#opboxedstring)

sealed interface that stores validated payloads using boxed classes

## OpBoxedString
public record OpBoxedString<br>
implements [OpBoxed](#opboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| OpBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.JSONPatchRequestMoveCopy;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [OpBoxedString](#opboxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [OpBoxed](#opboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
public sealed interface PathBoxed<br>
permits<br>
[PathBoxedString](#pathboxedstring)

sealed interface that stores validated payloads using boxed classes

## PathBoxedString
public record PathBoxedString<br>
implements [PathBoxed](#pathboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public sealed interface FromBoxed<br>
permits<br>
[FromBoxedString](#fromboxedstring)

sealed interface that stores validated payloads using boxed classes

## FromBoxedString
public record FromBoxedString<br>
implements [FromBoxed](#fromboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FromBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
public sealed interface AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesBoxedVoid
public record AdditionalPropertiesBoxedVoid<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedBoolean
public record AdditionalPropertiesBoxedBoolean<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedNumber
public record AdditionalPropertiesBoxedNumber<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedString
public record AdditionalPropertiesBoxedString<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedList
public record AdditionalPropertiesBoxedList<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesBoxedMap
public record AdditionalPropertiesBoxedMap<br>
implements [AdditionalPropertiesBoxed](#additionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
