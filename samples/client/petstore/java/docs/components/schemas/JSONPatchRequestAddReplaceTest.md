# JSONPatchRequestAddReplaceTest
org.openapijsonschematools.client.components.schemas.JSONPatchRequestAddReplaceTest.java
public class JSONPatchRequestAddReplaceTest

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
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1Boxed](#jsonpatchrequestaddreplacetest1boxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1BoxedMap](#jsonpatchrequestaddreplacetest1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1](#jsonpatchrequestaddreplacetest1)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTestMapBuilder](#jsonpatchrequestaddreplacetestmapbuilder)<br> builder for Map payloads |
| static class | [JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTestMap](#jsonpatchrequestaddreplacetestmap)<br> output class for Map payloads |
| static class | [JSONPatchRequestAddReplaceTest.OpBoxed](#opboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestAddReplaceTest.OpBoxedString](#opboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestAddReplaceTest.Op](#op)<br> schema class |
| enum | [JSONPatchRequestAddReplaceTest.StringOpEnums](#stringopenums)<br>String enum |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxed](#valueboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxedVoid](#valueboxedvoid)<br> boxed class to store validated null payloads |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxedBoolean](#valueboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxedNumber](#valueboxednumber)<br> boxed class to store validated Number payloads |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxedString](#valueboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxedList](#valueboxedlist)<br> boxed class to store validated List payloads |
| static class | [JSONPatchRequestAddReplaceTest.ValueBoxedMap](#valueboxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestAddReplaceTest.Value](#value)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.PathBoxed](#pathboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestAddReplaceTest.PathBoxedString](#pathboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestAddReplaceTest.Path](#path)<br> schema class |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [JSONPatchRequestAddReplaceTest.AdditionalProperties](#additionalproperties)<br> schema class |

## JSONPatchRequestAddReplaceTest1Boxed
public static abstract sealed class JSONPatchRequestAddReplaceTest1Boxed<br>
permits<br>
[JSONPatchRequestAddReplaceTest1BoxedMap](#jsonpatchrequestaddreplacetest1boxedmap)

A sealed class that stores validated payloads using boxed classes

## JSONPatchRequestAddReplaceTest1BoxedMap
public static final class JSONPatchRequestAddReplaceTest1BoxedMap<br>
extends JSONPatchRequestAddReplaceTest1Boxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTest1BoxedMap(JSONPatchRequestAddReplaceTestMap data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| JSONPatchRequestAddReplaceTestMap | data<br>validated payload |

## JSONPatchRequestAddReplaceTest1
public static class JSONPatchRequestAddReplaceTest1<br>
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
JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTestMap validatedPayload =
    JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTest1.validate(
    new JSONPatchRequestAddReplaceTest.JSONPatchRequestAddReplaceTestMapBuilder()
        .op("add")

        .path("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("path", [Path.class](#path))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("value", [Value.class](#value))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("op", [Op.class](#op)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"op",<br>&nbsp;&nbsp;&nbsp;&nbsp;"path",<br>&nbsp;&nbsp;&nbsp;&nbsp;"value"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap](#jsonpatchrequestaddreplacetestmap) | validate([Map&lt;?, ?&gt;](#jsonpatchrequestaddreplacetestmapbuilder) arg, SchemaConfiguration configuration) |
| [JSONPatchRequestAddReplaceTest1BoxedMap](#jsonpatchrequestaddreplacetest1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#jsonpatchrequestaddreplacetestmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## JSONPatchRequestAddReplaceTestMap000Builder
public class JSONPatchRequestAddReplaceTestMap000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## JSONPatchRequestAddReplaceTestMap001Builder
public class JSONPatchRequestAddReplaceTestMap001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(Void value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(boolean value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(String value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(int value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(float value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(long value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(double value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(List<?> value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | value(Map<String, ?> value) |

## JSONPatchRequestAddReplaceTestMap010Builder
public class JSONPatchRequestAddReplaceTestMap010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | path(String value) |

## JSONPatchRequestAddReplaceTestMap011Builder
public class JSONPatchRequestAddReplaceTestMap011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap001Builder](#jsonpatchrequestaddreplacetestmap001builder) | path(String value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(Void value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(boolean value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(String value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(int value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(float value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(long value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(double value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(List<?> value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | value(Map<String, ?> value) |

## JSONPatchRequestAddReplaceTestMap100Builder
public class JSONPatchRequestAddReplaceTestMap100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | op(String value) |
| [JSONPatchRequestAddReplaceTestMap000Builder](#jsonpatchrequestaddreplacetestmap000builder) | op([StringOpEnums](#stringopenums) value) |

## JSONPatchRequestAddReplaceTestMap101Builder
public class JSONPatchRequestAddReplaceTestMap101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap001Builder](#jsonpatchrequestaddreplacetestmap001builder) | op(String value) |
| [JSONPatchRequestAddReplaceTestMap001Builder](#jsonpatchrequestaddreplacetestmap001builder) | op([StringOpEnums](#stringopenums) value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(Void value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(boolean value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(String value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(int value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(float value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(long value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(double value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(List<?> value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | value(Map<String, ?> value) |

## JSONPatchRequestAddReplaceTestMap110Builder
public class JSONPatchRequestAddReplaceTestMap110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMap110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | op(String value) |
| [JSONPatchRequestAddReplaceTestMap010Builder](#jsonpatchrequestaddreplacetestmap010builder) | op([StringOpEnums](#stringopenums) value) |
| [JSONPatchRequestAddReplaceTestMap100Builder](#jsonpatchrequestaddreplacetestmap100builder) | path(String value) |

## JSONPatchRequestAddReplaceTestMapBuilder
public class JSONPatchRequestAddReplaceTestMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JSONPatchRequestAddReplaceTestMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [JSONPatchRequestAddReplaceTestMap011Builder](#jsonpatchrequestaddreplacetestmap011builder) | op(String value) |
| [JSONPatchRequestAddReplaceTestMap011Builder](#jsonpatchrequestaddreplacetestmap011builder) | op([StringOpEnums](#stringopenums) value) |
| [JSONPatchRequestAddReplaceTestMap101Builder](#jsonpatchrequestaddreplacetestmap101builder) | path(String value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(Void value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(boolean value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(String value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(int value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(float value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(long value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(double value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(List<?> value) |
| [JSONPatchRequestAddReplaceTestMap110Builder](#jsonpatchrequestaddreplacetestmap110builder) | value(Map<String, ?> value) |

## JSONPatchRequestAddReplaceTestMap
public static class JSONPatchRequestAddReplaceTestMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [JSONPatchRequestAddReplaceTestMap](#jsonpatchrequestaddreplacetestmap) | of([Map<String, ? extends @Nullable Object>](#jsonpatchrequestaddreplacetestmapbuilder) arg, SchemaConfiguration configuration) |
| String | op()<br> must be one of ["add", "replace", "test"] |
| String | path()<br> |
| @Nullable Object | value()<br> |

## OpBoxed
public static abstract sealed class OpBoxed<br>
permits<br>
[OpBoxedString](#opboxedstring)

A sealed class that stores validated payloads using boxed classes

## OpBoxedString
public static final class OpBoxedString<br>
extends OpBoxed

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
String validatedPayload = JSONPatchRequestAddReplaceTest.Op.validate(
    "add",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;"add",<br>&nbsp;&nbsp;&nbsp;&nbsp;"replace",<br>&nbsp;&nbsp;&nbsp;&nbsp;"test"<br>)<br> |

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
| ADD | value = "add" |
| REPLACE | value = "replace" |
| TEST | value = "test" |

## ValueBoxed
public static abstract sealed class ValueBoxed<br>
permits<br>
[ValueBoxedVoid](#valueboxedvoid),
[ValueBoxedBoolean](#valueboxedboolean),
[ValueBoxedNumber](#valueboxednumber),
[ValueBoxedString](#valueboxedstring),
[ValueBoxedList](#valueboxedlist),
[ValueBoxedMap](#valueboxedmap)

A sealed class that stores validated payloads using boxed classes

## ValueBoxedVoid
public static final class ValueBoxedVoid<br>
extends ValueBoxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValueBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ValueBoxedBoolean
public static final class ValueBoxedBoolean<br>
extends ValueBoxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValueBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ValueBoxedNumber
public static final class ValueBoxedNumber<br>
extends ValueBoxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValueBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ValueBoxedString
public static final class ValueBoxedString<br>
extends ValueBoxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValueBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ValueBoxedList
public static final class ValueBoxedList<br>
extends ValueBoxed

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValueBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ValueBoxedMap
public static final class ValueBoxedMap<br>
extends ValueBoxed

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValueBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Value
public static class Value<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

## Description
The value to add, replace or test.

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PathBoxed
public static abstract sealed class PathBoxed<br>
permits<br>
[PathBoxedString](#pathboxedstring)

A sealed class that stores validated payloads using boxed classes

## PathBoxedString
public static final class PathBoxedString<br>
extends PathBoxed

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

## AdditionalPropertiesBoxedNumber
public static final class AdditionalPropertiesBoxedNumber<br>
extends AdditionalPropertiesBoxed

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
extends AdditionalPropertiesBoxed

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
extends AdditionalPropertiesBoxed

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
extends AdditionalPropertiesBoxed

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
