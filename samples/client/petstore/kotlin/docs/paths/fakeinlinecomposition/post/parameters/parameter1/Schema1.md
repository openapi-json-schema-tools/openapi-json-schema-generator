# Schema1
public class Schema1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema1.Schema11Boxed](#schema11boxed)<br> sealed interface for validated payloads |
| record | [Schema1.Schema11BoxedMap](#schema11boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema1.Schema11](#schema11)<br> schema class |
| static class | [Schema1.SchemaMapBuilder1](#schemamapbuilder1)<br> builder for Map payloads |
| static class | [Schema1.SchemaMap1](#schemamap1)<br> output class for Map payloads |
| sealed interface | [Schema1.SomeProp1Boxed](#someprop1boxed)<br> sealed interface for validated payloads |
| record | [Schema1.SomeProp1BoxedVoid](#someprop1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Schema1.SomeProp1BoxedBoolean](#someprop1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Schema1.SomeProp1BoxedNumber](#someprop1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Schema1.SomeProp1BoxedString](#someprop1boxedstring)<br> boxed class to store validated String payloads |
| record | [Schema1.SomeProp1BoxedList](#someprop1boxedlist)<br> boxed class to store validated List payloads |
| record | [Schema1.SomeProp1BoxedMap](#someprop1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Schema1.SomeProp1](#someprop1)<br> schema class |
| sealed interface | [Schema1.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [Schema1.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema1.Schema01](#schema01)<br> schema class |

## Schema11Boxed
public sealed interface Schema11Boxed<br>
permits<br>
[Schema11BoxedMap](#schema11boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema11BoxedMap
public record Schema11BoxedMap<br>
implements [Schema11Boxed](#schema11boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedMap([SchemaMap1](#schemamap1) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SchemaMap1](#schemamap1) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [Schema11Boxed](#schema11boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(Nothing? value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(boolean value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(String value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(int value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(float value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(long value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(double value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(List<?> value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | someProp(Map<String, ?> value) |
| [SchemaMapBuilder1](#schemamapbuilder1) | additionalProperty(String key, Nothing? value) |
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
public sealed interface SomeProp1Boxed<br>
permits<br>
[SomeProp1BoxedVoid](#someprop1boxedvoid),
[SomeProp1BoxedBoolean](#someprop1boxedboolean),
[SomeProp1BoxedNumber](#someprop1boxednumber),
[SomeProp1BoxedString](#someprop1boxedstring),
[SomeProp1BoxedList](#someprop1boxedlist),
[SomeProp1BoxedMap](#someprop1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SomeProp1BoxedVoid
public record SomeProp1BoxedVoid<br>
implements [SomeProp1Boxed](#someprop1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeProp1BoxedBoolean
public record SomeProp1BoxedBoolean<br>
implements [SomeProp1Boxed](#someprop1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeProp1BoxedNumber
public record SomeProp1BoxedNumber<br>
implements [SomeProp1Boxed](#someprop1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeProp1BoxedString
public record SomeProp1BoxedString<br>
implements [SomeProp1Boxed](#someprop1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeProp1BoxedList
public record SomeProp1BoxedList<br>
implements [SomeProp1Boxed](#someprop1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeProp1BoxedMap
public record SomeProp1BoxedMap<br>
implements [SomeProp1Boxed](#someprop1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeProp1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
| Nothing? | validate(Nothing? arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| Number | validate(Number arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<@Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedString](#someprop1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedVoid](#someprop1boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedNumber](#someprop1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedBoolean](#someprop1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedMap](#someprop1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [SomeProp1BoxedList](#someprop1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [SomeProp1Boxed](#someprop1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema01Boxed
public sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedString](#schema01boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedString
public record Schema01BoxedString<br>
implements [Schema01Boxed](#schema01boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.parameters.parameter1.Schema1;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

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
| [Schema01Boxed](#schema01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
