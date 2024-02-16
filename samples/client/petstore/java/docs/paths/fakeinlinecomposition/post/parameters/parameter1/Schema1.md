# Schema1
public class Schema1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema1.Schema11Boxed](#schema11boxed)<br> abstract sealed validated payload class |
| static class | [Schema1.Schema11BoxedMap](#schema11boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema1.Schema11](#schema11)<br> schema class |
| static class | [Schema1.SchemaMapBuilder1](#schemamapbuilder1)<br> builder for Map payloads |
| static class | [Schema1.SchemaMap1](#schemamap1)<br> output class for Map payloads |
| static class | [Schema1.SomeProp1Boxed](#someprop1boxed)<br> abstract sealed validated payload class |
| static class | [Schema1.SomeProp1BoxedVoid](#someprop1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Schema1.SomeProp1BoxedBoolean](#someprop1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Schema1.SomeProp1BoxedNumber](#someprop1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Schema1.SomeProp1BoxedString](#someprop1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema1.SomeProp1BoxedList](#someprop1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Schema1.SomeProp1BoxedMap](#someprop1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema1.SomeProp1](#someprop1)<br> schema class |
| static class | [Schema1.Schema01Boxed](#schema01boxed)<br> abstract sealed validated payload class |
| static class | [Schema1.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema1.Schema01](#schema01)<br> schema class |

## Schema11Boxed
public static abstract sealed class Schema11Boxed<br>
permits<br>
[Schema11BoxedMap](#schema11boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Schema11BoxedMap
public static final class Schema11BoxedMap<br>
extends [Schema11Boxed](#schema11boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedMap([SchemaMap1](#schemamap1) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [SchemaMap1](#schemamap1) | data<br>validated payload |

## Schema11
public static class Schema11<br>
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
Schema1.SchemaMap1 validatedPayload =
    Schema1.Schema11.validate(
    new Schema1.SchemaMapBuilder1()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someProp", [SomeProp1.class](#someprop1)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap1](#schemamap1) | validate([Map&lt;?, ?&gt;](#schemamapbuilder1) arg, SchemaConfiguration configuration) |
| [Schema11BoxedMap](#schema11boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schemamapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SchemaMapBuilder1
public class SchemaMapBuilder1<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaMapBuilder1()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(Void value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(boolean value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(String value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(int value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(float value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(long value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(double value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(List<?> value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(Map<String, ?> value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, Void value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, boolean value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, String value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, int value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, float value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, long value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, double value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, List<?> value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, Map<String, ?> value) |

## SchemaMap1
public static class SchemaMap1<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SchemaMap1](#schemamap1) | of([Map<String, ? extends @Nullable Object>](#schemamapbuilder1) arg, SchemaConfiguration configuration) |
| @Nullable Object | someProp()<br>[optional] |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## SomeProp1Boxed
public static abstract sealed class SomeProp1Boxed<br>
permits<br>
[SomeProp1BoxedVoid](#someprop1boxedvoid),
[SomeProp1BoxedBoolean](#someprop1boxedboolean),
[SomeProp1BoxedNumber](#someprop1boxednumber),
[SomeProp1BoxedString](#someprop1boxedstring),
[SomeProp1BoxedList](#someprop1boxedlist),
[SomeProp1BoxedMap](#someprop1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SomeProp1BoxedVoid
public static final class SomeProp1BoxedVoid<br>
extends [SomeProp1Boxed](#someprop1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## SomeProp1BoxedBoolean
public static final class SomeProp1BoxedBoolean<br>
extends [SomeProp1Boxed](#someprop1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## SomeProp1BoxedNumber
public static final class SomeProp1BoxedNumber<br>
extends [SomeProp1Boxed](#someprop1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## SomeProp1BoxedString
public static final class SomeProp1BoxedString<br>
extends [SomeProp1Boxed](#someprop1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## SomeProp1BoxedList
public static final class SomeProp1BoxedList<br>
extends [SomeProp1Boxed](#someprop1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## SomeProp1BoxedMap
public static final class SomeProp1BoxedMap<br>
extends [SomeProp1Boxed](#someprop1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## SomeProp1
public static class SomeProp1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01.class](#schema01)<br>;)<br> |

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
| [SomeProp1BoxedString](#someprop1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedVoid](#someprop1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedNumber](#someprop1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedBoolean](#someprop1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedMap](#someprop1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedList](#someprop1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>
permits<br>
[Schema01BoxedString](#schema01boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema01BoxedString
public static final class Schema01BoxedString<br>
extends [Schema01Boxed](#schema01boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema01
public static class Schema01<br>
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
String validatedPayload = Schema1.Schema01.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | minLength = 1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [Schema01BoxedString](#schema01boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |