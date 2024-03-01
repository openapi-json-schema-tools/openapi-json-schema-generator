# Code200ResponseHeadersSchema
public class Code200ResponseHeadersSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Code200ResponseHeadersSchema.Code200ResponseHeadersSchema1Boxed](#code200responseheadersschema1boxed)<br> sealed interface for validated payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseHeadersSchema1BoxedMap](#code200responseheadersschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Code200ResponseHeadersSchema.Code200ResponseHeadersSchema1](#code200responseheadersschema1)<br> schema class |
| static class | [Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMapBuilder](#code200responseheadersschemamapbuilder)<br> builder for Map payloads |
| static class | [Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMap](#code200responseheadersschemamap)<br> output class for Map payloads |
| sealed interface | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxedVoid](#code200responseadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxedBoolean](#code200responseadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxedNumber](#code200responseadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxedString](#code200responseadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxedList](#code200responseadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [Code200ResponseHeadersSchema.Code200ResponseAdditionalPropertiesBoxedMap](#code200responseadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Code200ResponseHeadersSchema.Code200ResponseAdditionalProperties](#code200responseadditionalproperties)<br> schema class |

## Code200ResponseHeadersSchema1Boxed
public sealed interface Code200ResponseHeadersSchema1Boxed<br>
permits<br>
[Code200ResponseHeadersSchema1BoxedMap](#code200responseheadersschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Code200ResponseHeadersSchema1BoxedMap
public record Code200ResponseHeadersSchema1BoxedMap<br>
implements [Code200ResponseHeadersSchema1Boxed](#code200responseheadersschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchema1BoxedMap([Code200ResponseHeadersSchemaMap](#code200responseheadersschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap](#code200responseheadersschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseHeadersSchema1
public static class Code200ResponseHeadersSchema1<br>
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
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.Code200ResponseHeadersSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMap validatedPayload =
    Code200ResponseHeadersSchema.Code200ResponseHeadersSchema1.validate(
    new Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMapBuilder()
        .setXHyphenMinusRateHyphenMinusLimit(1)

        .int32(1)

        .setRefHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader("a")

        .setXHyphenMinusExpiresHyphenMinusAfter("1970-01-01T00:00:00.00Z")

        .numberHeader("3.14")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("X-Rate-Limit", [XRateLimitSchema.XRateLimitSchema1.class](../../../../../../paths/userlogin/get/responses/code200response/headers/xratelimit/content/applicationjson/XRateLimitSchema.md#xratelimitschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class](../../../../../../components/headers/int32jsoncontenttypeheader/content/applicationjson/Int32JsonContentTypeHeaderSchema.md#int32jsoncontenttypeheaderschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("X-Expires-After", [XExpiresAfterSchema.XExpiresAfterSchema1.class](../../../../../../paths/userlogin/get/responses/code200response/headers/xexpiresafter/XExpiresAfterSchema.md#xexpiresafterschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ref-content-schema-header", [StringWithValidation.StringWithValidation1.class](../../../../../../components/schemas/StringWithValidation.md#stringwithvalidation1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("numberHeader", [NumberHeaderSchema.NumberHeaderSchema1.class](../../../../../../components/headers/numberheader/NumberHeaderSchema.md#numberheaderschema1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"X-Rate-Limit",<br>&nbsp;&nbsp;&nbsp;&nbsp;"int32",<br>&nbsp;&nbsp;&nbsp;&nbsp;"ref-content-schema-header"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Code200ResponseAdditionalProperties.class](#code200responseadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap](#code200responseheadersschemamap) | validate([Map&lt;?, ?&gt;](#code200responseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Code200ResponseHeadersSchema1BoxedMap](#code200responseheadersschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#code200responseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [Code200ResponseHeadersSchema1Boxed](#code200responseheadersschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Code200ResponseHeadersSchemaMap000Builder
public class Code200ResponseHeadersSchemaMap000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | setXHyphenMinusExpiresHyphenMinusAfter(String value) |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | numberHeader(String value) |

## Code200ResponseHeadersSchemaMap001Builder
public class Code200ResponseHeadersSchemaMap001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | setRefHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## Code200ResponseHeadersSchemaMap010Builder
public class Code200ResponseHeadersSchemaMap010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | int32(int value) |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | int32(float value) |

## Code200ResponseHeadersSchemaMap011Builder
public class Code200ResponseHeadersSchemaMap011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap001Builder](#code200responseheadersschemamap001builder) | int32(int value) |
| [Code200ResponseHeadersSchemaMap001Builder](#code200responseheadersschemamap001builder) | int32(float value) |
| [Code200ResponseHeadersSchemaMap010Builder](#code200responseheadersschemamap010builder) | setRefHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## Code200ResponseHeadersSchemaMap100Builder
public class Code200ResponseHeadersSchemaMap100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | setXHyphenMinusRateHyphenMinusLimit(int value) |
| [Code200ResponseHeadersSchemaMap000Builder](#code200responseheadersschemamap000builder) | setXHyphenMinusRateHyphenMinusLimit(float value) |

## Code200ResponseHeadersSchemaMap101Builder
public class Code200ResponseHeadersSchemaMap101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap001Builder](#code200responseheadersschemamap001builder) | setXHyphenMinusRateHyphenMinusLimit(int value) |
| [Code200ResponseHeadersSchemaMap001Builder](#code200responseheadersschemamap001builder) | setXHyphenMinusRateHyphenMinusLimit(float value) |
| [Code200ResponseHeadersSchemaMap100Builder](#code200responseheadersschemamap100builder) | setRefHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## Code200ResponseHeadersSchemaMap110Builder
public class Code200ResponseHeadersSchemaMap110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMap110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap010Builder](#code200responseheadersschemamap010builder) | setXHyphenMinusRateHyphenMinusLimit(int value) |
| [Code200ResponseHeadersSchemaMap010Builder](#code200responseheadersschemamap010builder) | setXHyphenMinusRateHyphenMinusLimit(float value) |
| [Code200ResponseHeadersSchemaMap100Builder](#code200responseheadersschemamap100builder) | int32(int value) |
| [Code200ResponseHeadersSchemaMap100Builder](#code200responseheadersschemamap100builder) | int32(float value) |

## Code200ResponseHeadersSchemaMapBuilder
public class Code200ResponseHeadersSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseHeadersSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Code200ResponseHeadersSchemaMap011Builder](#code200responseheadersschemamap011builder) | setXHyphenMinusRateHyphenMinusLimit(int value) |
| [Code200ResponseHeadersSchemaMap011Builder](#code200responseheadersschemamap011builder) | setXHyphenMinusRateHyphenMinusLimit(float value) |
| [Code200ResponseHeadersSchemaMap101Builder](#code200responseheadersschemamap101builder) | int32(int value) |
| [Code200ResponseHeadersSchemaMap101Builder](#code200responseheadersschemamap101builder) | int32(float value) |
| [Code200ResponseHeadersSchemaMap110Builder](#code200responseheadersschemamap110builder) | setRefHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## Code200ResponseHeadersSchemaMap
public static class Code200ResponseHeadersSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Code200ResponseHeadersSchemaMap](#code200responseheadersschemamap) | of([Map<String, ? extends @Nullable Object>](#code200responseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | int32()<br> |
| String | numberHeader()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["X-Rate-Limit"], instance["ref-content-schema-header"], instance["X-Expires-After"],  |

## Code200ResponseAdditionalPropertiesBoxed
public sealed interface Code200ResponseAdditionalPropertiesBoxed<br>
permits<br>
[Code200ResponseAdditionalPropertiesBoxedVoid](#code200responseadditionalpropertiesboxedvoid),
[Code200ResponseAdditionalPropertiesBoxedBoolean](#code200responseadditionalpropertiesboxedboolean),
[Code200ResponseAdditionalPropertiesBoxedNumber](#code200responseadditionalpropertiesboxednumber),
[Code200ResponseAdditionalPropertiesBoxedString](#code200responseadditionalpropertiesboxedstring),
[Code200ResponseAdditionalPropertiesBoxedList](#code200responseadditionalpropertiesboxedlist),
[Code200ResponseAdditionalPropertiesBoxedMap](#code200responseadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## Code200ResponseAdditionalPropertiesBoxedVoid
public record Code200ResponseAdditionalPropertiesBoxedVoid<br>
implements [Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseAdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseAdditionalPropertiesBoxedBoolean
public record Code200ResponseAdditionalPropertiesBoxedBoolean<br>
implements [Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseAdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseAdditionalPropertiesBoxedNumber
public record Code200ResponseAdditionalPropertiesBoxedNumber<br>
implements [Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseAdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseAdditionalPropertiesBoxedString
public record Code200ResponseAdditionalPropertiesBoxedString<br>
implements [Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseAdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseAdditionalPropertiesBoxedList
public record Code200ResponseAdditionalPropertiesBoxedList<br>
implements [Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseAdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseAdditionalPropertiesBoxedMap
public record Code200ResponseAdditionalPropertiesBoxedMap<br>
implements [Code200ResponseAdditionalPropertiesBoxed](#code200responseadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200ResponseAdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Code200ResponseAdditionalProperties
public static class Code200ResponseAdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
