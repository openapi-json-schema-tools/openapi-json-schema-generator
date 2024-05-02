# AdditionalPropertiesSchema
org.openapijsonschematools.client.components.schemas.AdditionalPropertiesSchema.java
public class AdditionalPropertiesSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalPropertiesSchema.AdditionalPropertiesSchema1Boxed](#additionalpropertiesschema1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesSchema1BoxedMap](#additionalpropertiesschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.AdditionalPropertiesSchema1](#additionalpropertiesschema1)<br> schema class |
| sealed interface | [AdditionalPropertiesSchema.Schema2Boxed](#schema2boxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.Schema2BoxedMap](#schema2boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.Schema2](#schema2)<br> schema class |
| static class | [AdditionalPropertiesSchema.Schema2MapBuilder](#schema2mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesSchema.Schema2Map](#schema2map)<br> output class for Map payloads |
| sealed interface | [AdditionalPropertiesSchema.AdditionalProperties2Boxed](#additionalproperties2boxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties2BoxedVoid](#additionalproperties2boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties2BoxedBoolean](#additionalproperties2boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties2BoxedNumber](#additionalproperties2boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties2BoxedString](#additionalproperties2boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties2BoxedList](#additionalproperties2boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties2BoxedMap](#additionalproperties2boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.AdditionalProperties2](#additionalproperties2)<br> schema class |
| sealed interface | [AdditionalPropertiesSchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.Schema1](#schema1)<br> schema class |
| static class | [AdditionalPropertiesSchema.Schema1MapBuilder](#schema1mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesSchema.Schema1Map](#schema1map)<br> output class for Map payloads |
| sealed interface | [AdditionalPropertiesSchema.AdditionalProperties1Boxed](#additionalproperties1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties1BoxedVoid](#additionalproperties1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties1BoxedBoolean](#additionalproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties1BoxedNumber](#additionalproperties1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties1BoxedString](#additionalproperties1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties1BoxedList](#additionalproperties1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalPropertiesSchema.AdditionalProperties1BoxedMap](#additionalproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.AdditionalProperties1](#additionalproperties1)<br> schema class |
| sealed interface | [AdditionalPropertiesSchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.Schema0](#schema0)<br> schema class |
| static class | [AdditionalPropertiesSchema.Schema0MapBuilder](#schema0mapbuilder)<br> builder for Map payloads |
| static class | [AdditionalPropertiesSchema.Schema0Map](#schema0map)<br> output class for Map payloads |
| sealed interface | [AdditionalPropertiesSchema.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalPropertiesSchema.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalPropertiesSchema.AdditionalProperties](#additionalproperties)<br> schema class |

## AdditionalPropertiesSchema1Boxed
public sealed interface AdditionalPropertiesSchema1Boxed<br>
permits<br>
[AdditionalPropertiesSchema1BoxedMap](#additionalpropertiesschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalPropertiesSchema1BoxedMap
public record AdditionalPropertiesSchema1BoxedMap<br>
implements [AdditionalPropertiesSchema1Boxed](#additionalpropertiesschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalPropertiesSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalPropertiesSchema1
public static class AdditionalPropertiesSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| List<Class<? extends JsonSchema>> | allOf = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1.class](#schema1),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema2.class](#schema2)<br>;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesSchema1BoxedMap](#additionalpropertiesschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalPropertiesSchema1Boxed](#additionalpropertiesschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema2Boxed
public sealed interface Schema2Boxed<br>
permits<br>
[Schema2BoxedMap](#schema2boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema2BoxedMap
public record Schema2BoxedMap<br>
implements [Schema2Boxed](#schema2boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2BoxedMap([Schema2Map](#schema2map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema2Map](#schema2map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema2
public static class Schema2<br>
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
import org.openapijsonschematools.client.components.schemas.AdditionalPropertiesSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
AdditionalPropertiesSchema.Schema2Map validatedPayload =
    AdditionalPropertiesSchema.Schema2.validate(
    new AdditionalPropertiesSchema.Schema2MapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties2.class](#additionalproperties2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema2Map](#schema2map) | validate([Map&lt;?, ?&gt;](#schema2mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema2BoxedMap](#schema2boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema2mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema2Boxed](#schema2boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema2MapBuilder
public class Schema2MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema2MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, Nothing? value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, boolean value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, String value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, int value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, float value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, long value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, double value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema2MapBuilder](#schema2mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema2Map
public static class Schema2Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema2Map](#schema2map) | of([Map<String, ? extends @Nullable Object>](#schema2mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties2Boxed
public sealed interface AdditionalProperties2Boxed<br>
permits<br>
[AdditionalProperties2BoxedVoid](#additionalproperties2boxedvoid),
[AdditionalProperties2BoxedBoolean](#additionalproperties2boxedboolean),
[AdditionalProperties2BoxedNumber](#additionalproperties2boxednumber),
[AdditionalProperties2BoxedString](#additionalproperties2boxedstring),
[AdditionalProperties2BoxedList](#additionalproperties2boxedlist),
[AdditionalProperties2BoxedMap](#additionalproperties2boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalProperties2BoxedVoid
public record AdditionalProperties2BoxedVoid<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties2BoxedBoolean
public record AdditionalProperties2BoxedBoolean<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties2BoxedNumber
public record AdditionalProperties2BoxedNumber<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties2BoxedString
public record AdditionalProperties2BoxedString<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties2BoxedList
public record AdditionalProperties2BoxedList<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties2BoxedMap
public record AdditionalProperties2BoxedMap<br>
implements [AdditionalProperties2Boxed](#additionalproperties2boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties2BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties2
public static class AdditionalProperties2<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxLength = 5 |

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
| [AdditionalProperties2BoxedString](#additionalproperties2boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalProperties2BoxedVoid](#additionalproperties2boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [AdditionalProperties2BoxedNumber](#additionalproperties2boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AdditionalProperties2BoxedBoolean](#additionalproperties2boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AdditionalProperties2BoxedMap](#additionalproperties2boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalProperties2BoxedList](#additionalproperties2boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalProperties2Boxed](#additionalproperties2boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema1Boxed
public sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedMap
public record Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap([Schema1Map](#schema1map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

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
import org.openapijsonschematools.client.components.schemas.AdditionalPropertiesSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
AdditionalPropertiesSchema.Schema1Map validatedPayload =
    AdditionalPropertiesSchema.Schema1.validate(
    new AdditionalPropertiesSchema.Schema1MapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties1.class](#additionalproperties1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema1Map](#schema1map) | validate([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema1mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
| [Schema1MapBuilder](#schema1mapbuilder) | additionalProperty(String key, Nothing? value) |
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
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## AdditionalProperties1Boxed
public sealed interface AdditionalProperties1Boxed<br>
permits<br>
[AdditionalProperties1BoxedVoid](#additionalproperties1boxedvoid),
[AdditionalProperties1BoxedBoolean](#additionalproperties1boxedboolean),
[AdditionalProperties1BoxedNumber](#additionalproperties1boxednumber),
[AdditionalProperties1BoxedString](#additionalproperties1boxedstring),
[AdditionalProperties1BoxedList](#additionalproperties1boxedlist),
[AdditionalProperties1BoxedMap](#additionalproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalProperties1BoxedVoid
public record AdditionalProperties1BoxedVoid<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1BoxedBoolean
public record AdditionalProperties1BoxedBoolean<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1BoxedNumber
public record AdditionalProperties1BoxedNumber<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1BoxedString
public record AdditionalProperties1BoxedString<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1BoxedList
public record AdditionalProperties1BoxedList<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1BoxedMap
public record AdditionalProperties1BoxedMap<br>
implements [AdditionalProperties1Boxed](#additionalproperties1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalProperties1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## AdditionalProperties1
public static class AdditionalProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minLength = 3 |

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
| [AdditionalProperties1BoxedString](#additionalproperties1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [AdditionalProperties1BoxedVoid](#additionalproperties1boxedvoid) | validateAndBox(Nothing? arg, SchemaConfiguration configuration) |
| [AdditionalProperties1BoxedNumber](#additionalproperties1boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [AdditionalProperties1BoxedBoolean](#additionalproperties1boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [AdditionalProperties1BoxedMap](#additionalproperties1boxedmap) | validateAndBox(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| [AdditionalProperties1BoxedList](#additionalproperties1boxedlist) | validateAndBox(List<?> arg, SchemaConfiguration configuration) |
| [AdditionalProperties1Boxed](#additionalproperties1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0Boxed
public sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedMap
public record Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap([Schema0Map](#schema0map) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map](#schema0map) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema0
public static class Schema0<br>
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
import org.openapijsonschematools.client.components.schemas.AdditionalPropertiesSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
AdditionalPropertiesSchema.Schema0Map validatedPayload =
    AdditionalPropertiesSchema.Schema0.validate(
    new AdditionalPropertiesSchema.Schema0MapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Schema0Map](#schema0map) | validate([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Schema0MapBuilder
public class Schema0MapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0MapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, Nothing? value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, boolean value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, String value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, int value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, float value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, long value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, double value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, List<?> value) |
| [Schema0MapBuilder](#schema0mapbuilder) | additionalProperty(String key, Map<String, ?> value) |

## Schema0Map
public static class Schema0Map<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Schema0Map](#schema0map) | of([Map<String, ? extends @Nullable Object>](#schema0mapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

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
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
