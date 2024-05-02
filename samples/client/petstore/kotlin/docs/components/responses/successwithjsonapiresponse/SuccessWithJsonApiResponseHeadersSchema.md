# SuccessWithJsonApiResponseHeadersSchema
public class SuccessWithJsonApiResponseHeadersSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchema1Boxed](#successwithjsonapiresponseheadersschema1boxed)<br> sealed interface for validated payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchema1BoxedMap](#successwithjsonapiresponseheadersschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchema1](#successwithjsonapiresponseheadersschema1)<br> schema class |
| static class | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMapBuilder](#successwithjsonapiresponseheadersschemamapbuilder)<br> builder for Map payloads |
| static class | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap](#successwithjsonapiresponseheadersschemamap)<br> output class for Map payloads |
| sealed interface | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxedVoid](#successwithjsonapiresponseadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxedBoolean](#successwithjsonapiresponseadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxedNumber](#successwithjsonapiresponseadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxedString](#successwithjsonapiresponseadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxedList](#successwithjsonapiresponseadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalPropertiesBoxedMap](#successwithjsonapiresponseadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseAdditionalProperties](#successwithjsonapiresponseadditionalproperties)<br> schema class |

## SuccessWithJsonApiResponseHeadersSchema1Boxed
public sealed interface SuccessWithJsonApiResponseHeadersSchema1Boxed<br>
permits<br>
[SuccessWithJsonApiResponseHeadersSchema1BoxedMap](#successwithjsonapiresponseheadersschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SuccessWithJsonApiResponseHeadersSchema1BoxedMap
public record SuccessWithJsonApiResponseHeadersSchema1BoxedMap<br>
implements [SuccessWithJsonApiResponseHeadersSchema1Boxed](#successwithjsonapiresponseheadersschema1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchema1BoxedMap([SuccessWithJsonApiResponseHeadersSchemaMap](#successwithjsonapiresponseheadersschemamap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap](#successwithjsonapiresponseheadersschemamap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseHeadersSchema1
public static class SuccessWithJsonApiResponseHeadersSchema1<br>
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
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.SuccessWithJsonApiResponseHeadersSchema;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap validatedPayload =
    SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchema1.validate(
    new SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMapBuilder()
        .int32(1)

        .refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader("a")

        .stringHeader("a")

        .numberHeader("3.14")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ref-schema-header", [StringWithValidation.StringWithValidation1.class](../../../components/schemas/StringWithValidation.md#stringwithvalidation1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("int32", [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1.class](../../../components/headers/int32jsoncontenttypeheader/content/applicationjson/Int32JsonContentTypeHeaderSchema.md#int32jsoncontenttypeheaderschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ref-content-schema-header", [StringWithValidation.StringWithValidation1.class](../../../components/schemas/StringWithValidation.md#stringwithvalidation1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("stringHeader", [StringHeaderSchema.StringHeaderSchema1.class](../../../components/headers/stringheader/StringHeaderSchema.md#stringheaderschema1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("numberHeader", [NumberHeaderSchema.NumberHeaderSchema1.class](../../../components/headers/numberheader/NumberHeaderSchema.md#numberheaderschema1))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"int32",<br>&nbsp;&nbsp;&nbsp;&nbsp;"ref-content-schema-header",<br>&nbsp;&nbsp;&nbsp;&nbsp;"ref-schema-header",<br>&nbsp;&nbsp;&nbsp;&nbsp;"stringHeader"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [SuccessWithJsonApiResponseAdditionalProperties.class](#successwithjsonapiresponseadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap](#successwithjsonapiresponseheadersschemamap) | validate([Map&lt;?, ?&gt;](#successwithjsonapiresponseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SuccessWithJsonApiResponseHeadersSchema1BoxedMap](#successwithjsonapiresponseheadersschema1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#successwithjsonapiresponseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| [SuccessWithJsonApiResponseHeadersSchema1Boxed](#successwithjsonapiresponseheadersschema1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## SuccessWithJsonApiResponseHeadersSchemaMap0000Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SuccessWithJsonApiResponseHeadersSchemaMap0000Builder](#successwithjsonapiresponseheadersschemamap0000builder) | numberHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0001Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0000Builder](#successwithjsonapiresponseheadersschemamap0000builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0010Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0000Builder](#successwithjsonapiresponseheadersschemamap0000builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0011Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0001Builder](#successwithjsonapiresponseheadersschemamap0001builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0010Builder](#successwithjsonapiresponseheadersschemamap0010builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0100Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0000Builder](#successwithjsonapiresponseheadersschemamap0000builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0101Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0001Builder](#successwithjsonapiresponseheadersschemamap0001builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0100Builder](#successwithjsonapiresponseheadersschemamap0100builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0110Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0010Builder](#successwithjsonapiresponseheadersschemamap0010builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0100Builder](#successwithjsonapiresponseheadersschemamap0100builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap0111Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap0111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap0111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0011Builder](#successwithjsonapiresponseheadersschemamap0011builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0101Builder](#successwithjsonapiresponseheadersschemamap0101builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0110Builder](#successwithjsonapiresponseheadersschemamap0110builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1000Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0000Builder](#successwithjsonapiresponseheadersschemamap0000builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0000Builder](#successwithjsonapiresponseheadersschemamap0000builder) | int32(float value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1001Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0001Builder](#successwithjsonapiresponseheadersschemamap0001builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0001Builder](#successwithjsonapiresponseheadersschemamap0001builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1000Builder](#successwithjsonapiresponseheadersschemamap1000builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1010Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0010Builder](#successwithjsonapiresponseheadersschemamap0010builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0010Builder](#successwithjsonapiresponseheadersschemamap0010builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1000Builder](#successwithjsonapiresponseheadersschemamap1000builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1011Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0011Builder](#successwithjsonapiresponseheadersschemamap0011builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0011Builder](#successwithjsonapiresponseheadersschemamap0011builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1001Builder](#successwithjsonapiresponseheadersschemamap1001builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1010Builder](#successwithjsonapiresponseheadersschemamap1010builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1100Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0100Builder](#successwithjsonapiresponseheadersschemamap0100builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0100Builder](#successwithjsonapiresponseheadersschemamap0100builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1000Builder](#successwithjsonapiresponseheadersschemamap1000builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1101Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0101Builder](#successwithjsonapiresponseheadersschemamap0101builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0101Builder](#successwithjsonapiresponseheadersschemamap0101builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1001Builder](#successwithjsonapiresponseheadersschemamap1001builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1100Builder](#successwithjsonapiresponseheadersschemamap1100builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap1110Builder
public class SuccessWithJsonApiResponseHeadersSchemaMap1110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMap1110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0110Builder](#successwithjsonapiresponseheadersschemamap0110builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0110Builder](#successwithjsonapiresponseheadersschemamap0110builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1010Builder](#successwithjsonapiresponseheadersschemamap1010builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1100Builder](#successwithjsonapiresponseheadersschemamap1100builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMapBuilder
public class SuccessWithJsonApiResponseHeadersSchemaMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseHeadersSchemaMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SuccessWithJsonApiResponseHeadersSchemaMap0111Builder](#successwithjsonapiresponseheadersschemamap0111builder) | int32(int value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap0111Builder](#successwithjsonapiresponseheadersschemamap0111builder) | int32(float value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1011Builder](#successwithjsonapiresponseheadersschemamap1011builder) | refHyphenMinusContentHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1101Builder](#successwithjsonapiresponseheadersschemamap1101builder) | refHyphenMinusSchemaHyphenMinusHeader(String value) |
| [SuccessWithJsonApiResponseHeadersSchemaMap1110Builder](#successwithjsonapiresponseheadersschemamap1110builder) | stringHeader(String value) |

## SuccessWithJsonApiResponseHeadersSchemaMap
public static class SuccessWithJsonApiResponseHeadersSchemaMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SuccessWithJsonApiResponseHeadersSchemaMap](#successwithjsonapiresponseheadersschemamap) | of([Map<String, ? extends @Nullable Object>](#successwithjsonapiresponseheadersschemamapbuilder) arg, SchemaConfiguration configuration) |
| Number | int32()<br> |
| String | stringHeader()<br> |
| String | numberHeader()<br>[optional] |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["ref-content-schema-header"], instance["ref-schema-header"],  |

## SuccessWithJsonApiResponseAdditionalPropertiesBoxed
public sealed interface SuccessWithJsonApiResponseAdditionalPropertiesBoxed<br>
permits<br>
[SuccessWithJsonApiResponseAdditionalPropertiesBoxedVoid](#successwithjsonapiresponseadditionalpropertiesboxedvoid),
[SuccessWithJsonApiResponseAdditionalPropertiesBoxedBoolean](#successwithjsonapiresponseadditionalpropertiesboxedboolean),
[SuccessWithJsonApiResponseAdditionalPropertiesBoxedNumber](#successwithjsonapiresponseadditionalpropertiesboxednumber),
[SuccessWithJsonApiResponseAdditionalPropertiesBoxedString](#successwithjsonapiresponseadditionalpropertiesboxedstring),
[SuccessWithJsonApiResponseAdditionalPropertiesBoxedList](#successwithjsonapiresponseadditionalpropertiesboxedlist),
[SuccessWithJsonApiResponseAdditionalPropertiesBoxedMap](#successwithjsonapiresponseadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## SuccessWithJsonApiResponseAdditionalPropertiesBoxedVoid
public record SuccessWithJsonApiResponseAdditionalPropertiesBoxedVoid<br>
implements [SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseAdditionalPropertiesBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseAdditionalPropertiesBoxedBoolean
public record SuccessWithJsonApiResponseAdditionalPropertiesBoxedBoolean<br>
implements [SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseAdditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseAdditionalPropertiesBoxedNumber
public record SuccessWithJsonApiResponseAdditionalPropertiesBoxedNumber<br>
implements [SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseAdditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseAdditionalPropertiesBoxedString
public record SuccessWithJsonApiResponseAdditionalPropertiesBoxedString<br>
implements [SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseAdditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseAdditionalPropertiesBoxedList
public record SuccessWithJsonApiResponseAdditionalPropertiesBoxedList<br>
implements [SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseAdditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseAdditionalPropertiesBoxedMap
public record SuccessWithJsonApiResponseAdditionalPropertiesBoxedMap<br>
implements [SuccessWithJsonApiResponseAdditionalPropertiesBoxed](#successwithjsonapiresponseadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SuccessWithJsonApiResponseAdditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SuccessWithJsonApiResponseAdditionalProperties
public static class SuccessWithJsonApiResponseAdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
