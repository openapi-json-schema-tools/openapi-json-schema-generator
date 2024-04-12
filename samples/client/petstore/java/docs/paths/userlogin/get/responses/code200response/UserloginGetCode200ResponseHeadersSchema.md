# UserloginGetCode200ResponseHeadersSchema
public class UserloginGetCode200ResponseHeadersSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchema1Boxed](#userlogingetcode200responseheadersschema1boxed)<br> sealed interface for validated payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchema1BoxedMap](#userlogingetcode200responseheadersschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchema1](#userlogingetcode200responseheadersschema1)<br> schema class |
| static class | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMapBuilder](#userlogingetcode200responseheadersschemamapbuilder)<br> builder for Map payloads |
| static class | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap](#userlogingetcode200responseheadersschemamap)<br> output class for Map payloads |
| sealed interface | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxedVoid](#userlogingetcode200responseadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxedBoolean](#userlogingetcode200responseadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxedNumber](#userlogingetcode200responseadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxedString](#userlogingetcode200responseadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxedList](#userlogingetcode200responseadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalPropertiesBoxedMap](#userlogingetcode200responseadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseAdditionalProperties](#userlogingetcode200responseadditionalproperties)<br> schema class |

## UserloginGetCode200ResponseHeadersSchema1Boxed
public sealed interface UserloginGetCode200ResponseHeadersSchema1Boxed<br>
permits<br>
[UserloginGetCode200ResponseHeadersSchema1BoxedMap](#userlogingetcode200responseheadersschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UserloginGetCode200ResponseHeadersSchema1BoxedMap
public record UserloginGetCode200ResponseHeadersSchema1BoxedMap<br>
implements [UserloginGetCode200ResponseHeadersSchema1Boxed](#userlogingetcode200responseheadersschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchema1BoxedMap([UserloginGetCode200ResponseHeadersSchemaMap](#userlogingetcode200responseheadersschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap](#userlogingetcode200responseheadersschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseHeadersSchema1
public static class UserloginGetCode200ResponseHeadersSchema1<br>
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
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.UserloginGetCode200ResponseHeadersSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap validatedPayload =
    UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchema1.validate(
    new UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMapBuilder()
        .xHyphenMinusRateHyphenMinusLimit(1)

        .int32(1)

        .refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader("a")

        .xHyphenMinusExpiresHyphenMinusAfter("1970-01-01T00:00:00.00Z")

        .numberHeader("3.14")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("X-Rate-Limit", [XRateLimitSchema.XRateLimitSchema1.class](../../../../../paths/userlogin/get/responses/code200response/headers/xratelimit/content/applicationjson/XRateLimitSchema.md#xratelimitschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class](../../../../../components/headers/int32jsoncontenttypeheader/content/applicationjson/Int32JsonContentTypeHeaderSchema.md#int32jsoncontenttypeheaderschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("X-Expires-After", [XExpiresAfterSchema.XExpiresAfterSchema1.class](../../../../../paths/userlogin/get/responses/code200response/headers/xexpiresafter/XExpiresAfterSchema.md#xexpiresafterschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ref-content-schema-header", [StringWithValidation.StringWithValidation1.class](../../../../../components/schemas/StringWithValidation.md#stringwithvalidation1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("numberHeader", [NumberHeaderSchema.NumberHeaderSchema1.class](../../../../../components/headers/numberheader/NumberHeaderSchema.md#numberheaderschema1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"X-Rate-Limit",<br>&nbsp;&nbsp;&nbsp;&nbsp;"int32",<br>&nbsp;&nbsp;&nbsp;&nbsp;"ref-content-schema-header"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [UserloginGetCode200ResponseAdditionalProperties.class](#userlogingetcode200responseadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap](#userlogingetcode200responseheadersschemamap) | validate([Map&lt;?, ?&gt;](#userlogingetcode200responseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [UserloginGetCode200ResponseHeadersSchema1BoxedMap](#userlogingetcode200responseheadersschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#userlogingetcode200responseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [UserloginGetCode200ResponseHeadersSchema1Boxed](#userlogingetcode200responseheadersschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## UserloginGetCode200ResponseHeadersSchemaMap000Builder
public class UserloginGetCode200ResponseHeadersSchemaMap000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | xHyphenMinusExpiresHyphenMinusAfter(String value) |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | numberHeader(String value) |

## UserloginGetCode200ResponseHeadersSchemaMap001Builder
public class UserloginGetCode200ResponseHeadersSchemaMap001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## UserloginGetCode200ResponseHeadersSchemaMap010Builder
public class UserloginGetCode200ResponseHeadersSchemaMap010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | int32(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | int32(float value) |

## UserloginGetCode200ResponseHeadersSchemaMap011Builder
public class UserloginGetCode200ResponseHeadersSchemaMap011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap001Builder](#userlogingetcode200responseheadersschemamap001builder) | int32(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap001Builder](#userlogingetcode200responseheadersschemamap001builder) | int32(float value) |
| [UserloginGetCode200ResponseHeadersSchemaMap010Builder](#userlogingetcode200responseheadersschemamap010builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## UserloginGetCode200ResponseHeadersSchemaMap100Builder
public class UserloginGetCode200ResponseHeadersSchemaMap100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | xHyphenMinusRateHyphenMinusLimit(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap000Builder](#userlogingetcode200responseheadersschemamap000builder) | xHyphenMinusRateHyphenMinusLimit(float value) |

## UserloginGetCode200ResponseHeadersSchemaMap101Builder
public class UserloginGetCode200ResponseHeadersSchemaMap101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap001Builder](#userlogingetcode200responseheadersschemamap001builder) | xHyphenMinusRateHyphenMinusLimit(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap001Builder](#userlogingetcode200responseheadersschemamap001builder) | xHyphenMinusRateHyphenMinusLimit(float value) |
| [UserloginGetCode200ResponseHeadersSchemaMap100Builder](#userlogingetcode200responseheadersschemamap100builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## UserloginGetCode200ResponseHeadersSchemaMap110Builder
public class UserloginGetCode200ResponseHeadersSchemaMap110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMap110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap010Builder](#userlogingetcode200responseheadersschemamap010builder) | xHyphenMinusRateHyphenMinusLimit(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap010Builder](#userlogingetcode200responseheadersschemamap010builder) | xHyphenMinusRateHyphenMinusLimit(float value) |
| [UserloginGetCode200ResponseHeadersSchemaMap100Builder](#userlogingetcode200responseheadersschemamap100builder) | int32(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap100Builder](#userlogingetcode200responseheadersschemamap100builder) | int32(float value) |

## UserloginGetCode200ResponseHeadersSchemaMapBuilder
public class UserloginGetCode200ResponseHeadersSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseHeadersSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetCode200ResponseHeadersSchemaMap011Builder](#userlogingetcode200responseheadersschemamap011builder) | xHyphenMinusRateHyphenMinusLimit(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap011Builder](#userlogingetcode200responseheadersschemamap011builder) | xHyphenMinusRateHyphenMinusLimit(float value) |
| [UserloginGetCode200ResponseHeadersSchemaMap101Builder](#userlogingetcode200responseheadersschemamap101builder) | int32(int value) |
| [UserloginGetCode200ResponseHeadersSchemaMap101Builder](#userlogingetcode200responseheadersschemamap101builder) | int32(float value) |
| [UserloginGetCode200ResponseHeadersSchemaMap110Builder](#userlogingetcode200responseheadersschemamap110builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## UserloginGetCode200ResponseHeadersSchemaMap
public static class UserloginGetCode200ResponseHeadersSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UserloginGetCode200ResponseHeadersSchemaMap](#userlogingetcode200responseheadersschemamap) | of([Map<String, ? extends @Nullable Object>](#userlogingetcode200responseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | int32()<br> |
| String | numberHeader()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["X-Rate-Limit"], instance["ref-content-schema-header"], instance["X-Expires-After"],  |

## UserloginGetCode200ResponseAdditionalPropertiesBoxed
public sealed interface UserloginGetCode200ResponseAdditionalPropertiesBoxed<br>
permits<br>
[UserloginGetCode200ResponseAdditionalPropertiesBoxedVoid](#userlogingetcode200responseadditionalpropertiesboxedvoid),
[UserloginGetCode200ResponseAdditionalPropertiesBoxedBoolean](#userlogingetcode200responseadditionalpropertiesboxedboolean),
[UserloginGetCode200ResponseAdditionalPropertiesBoxedNumber](#userlogingetcode200responseadditionalpropertiesboxednumber),
[UserloginGetCode200ResponseAdditionalPropertiesBoxedString](#userlogingetcode200responseadditionalpropertiesboxedstring),
[UserloginGetCode200ResponseAdditionalPropertiesBoxedList](#userlogingetcode200responseadditionalpropertiesboxedlist),
[UserloginGetCode200ResponseAdditionalPropertiesBoxedMap](#userlogingetcode200responseadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## UserloginGetCode200ResponseAdditionalPropertiesBoxedVoid
public record UserloginGetCode200ResponseAdditionalPropertiesBoxedVoid<br>
implements [UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseAdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseAdditionalPropertiesBoxedBoolean
public record UserloginGetCode200ResponseAdditionalPropertiesBoxedBoolean<br>
implements [UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseAdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseAdditionalPropertiesBoxedNumber
public record UserloginGetCode200ResponseAdditionalPropertiesBoxedNumber<br>
implements [UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseAdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseAdditionalPropertiesBoxedString
public record UserloginGetCode200ResponseAdditionalPropertiesBoxedString<br>
implements [UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseAdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseAdditionalPropertiesBoxedList
public record UserloginGetCode200ResponseAdditionalPropertiesBoxedList<br>
implements [UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseAdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseAdditionalPropertiesBoxedMap
public record UserloginGetCode200ResponseAdditionalPropertiesBoxedMap<br>
implements [UserloginGetCode200ResponseAdditionalPropertiesBoxed](#userlogingetcode200responseadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UserloginGetCode200ResponseAdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## UserloginGetCode200ResponseAdditionalProperties
public static class UserloginGetCode200ResponseAdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
