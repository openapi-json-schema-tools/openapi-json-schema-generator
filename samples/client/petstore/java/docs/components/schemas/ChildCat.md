# ChildCat
org.openapijsonschematools.client.components.schemas.ChildCat.java
public class ChildCat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ChildCat.ChildCat1Boxed](#childcat1boxed)<br> abstract sealed validated payload class |
| static class | [ChildCat.ChildCat1BoxedVoid](#childcat1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ChildCat.ChildCat1BoxedBoolean](#childcat1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ChildCat.ChildCat1BoxedNumber](#childcat1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ChildCat.ChildCat1BoxedString](#childcat1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ChildCat.ChildCat1BoxedList](#childcat1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ChildCat.ChildCat1BoxedMap](#childcat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ChildCat.ChildCat1](#childcat1)<br> schema class |
| static class | [ChildCat.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [ChildCat.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ChildCat.Schema1](#schema1)<br> schema class |
| static class | [ChildCat.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [ChildCat.Schema1Map](#schema1map)<br> output class for Map payloads |
| static class | [ChildCat.NameBoxed](#nameboxed)<br> abstract sealed validated payload class |
| static class | [ChildCat.NameBoxedString](#nameboxedstring)<br> boxed class to store validated String payloads |
| static class | [ChildCat.Name](#name)<br> schema class |

## ChildCat1Boxed
public sealed interface ChildCat1Boxed<br>
permits<br>
[ChildCat1BoxedVoid](#childcat1boxedvoid),
[ChildCat1BoxedBoolean](#childcat1boxedboolean),
[ChildCat1BoxedNumber](#childcat1boxednumber),
[ChildCat1BoxedString](#childcat1boxedstring),
[ChildCat1BoxedList](#childcat1boxedlist),
[ChildCat1BoxedMap](#childcat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ChildCat1BoxedVoid
public static final class ChildCat1BoxedVoid<br>
implements [ChildCat1Boxed](#childcat1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ChildCat1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ChildCat1BoxedBoolean
public static final class ChildCat1BoxedBoolean<br>
implements [ChildCat1Boxed](#childcat1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ChildCat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ChildCat1BoxedNumber
public static final class ChildCat1BoxedNumber<br>
implements [ChildCat1Boxed](#childcat1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ChildCat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ChildCat1BoxedString
public static final class ChildCat1BoxedString<br>
implements [ChildCat1Boxed](#childcat1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ChildCat1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ChildCat1BoxedList
public static final class ChildCat1BoxedList<br>
implements [ChildCat1Boxed](#childcat1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ChildCat1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ChildCat1BoxedMap
public static final class ChildCat1BoxedMap<br>
implements [ChildCat1Boxed](#childcat1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ChildCat1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ChildCat1
public static class ChildCat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[ParentPet.ParentPet1.class](../../components/schemas/ParentPet.md#parentpet1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [ChildCat1BoxedString](#childcat1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [ChildCat1BoxedVoid](#childcat1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [ChildCat1BoxedNumber](#childcat1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [ChildCat1BoxedBoolean](#childcat1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [ChildCat1BoxedMap](#childcat1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [ChildCat1BoxedList](#childcat1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedMap
public static final class Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data<br>validated payload |

## Schema1
public static class Schema1<br>
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
ChildCat.Schema1Map validatedPayload =
    ChildCat.Schema1.validate(
    new ChildCat.Schema1MapBuilder()
        .name("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("name", [Name.class](#name)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema1MapBuilder
public class Schema1MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema1MapBuilder](#schema1mapbuilder) | name(String value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Void value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, boolean value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, String value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, int value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, float value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, long value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, double value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema1Map
public static class Schema1Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema1Map](#schema1map) | of([Map<String, ? extends @Nullable Object>](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| String | name()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## NameBoxed
public sealed interface NameBoxed<br>
permits<br>
[NameBoxedString](#nameboxedstring)

sealed interface that stores validated payloads using boxed classes

## NameBoxedString
public static final class NameBoxedString<br>
implements [NameBoxed](#nameboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NameBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Name
public static class Name<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
