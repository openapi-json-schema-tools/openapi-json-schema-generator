# QueryParameters
public class QueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [QueryParameters.QueryParameters1Boxed](#queryparameters1boxed)<br> sealed interface for validated payloads |
| record | [QueryParameters.QueryParameters1BoxedMap](#queryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [QueryParameters.QueryParameters1](#queryparameters1)<br> schema class |
| static class | [QueryParameters.QueryParametersMapBuilder](#queryparametersmapbuilder)<br> builder for Map payloads |
| static class | [QueryParameters.QueryParametersMap](#queryparametersmap)<br> output class for Map payloads |
| sealed interface | [QueryParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [QueryParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [QueryParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [QueryParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [QueryParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [QueryParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [QueryParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [QueryParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## QueryParameters1Boxed
public sealed interface QueryParameters1Boxed<br>
permits<br>
[QueryParameters1BoxedMap](#queryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## QueryParameters1BoxedMap
public record QueryParameters1BoxedMap<br>
implements [QueryParameters1Boxed](#queryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParameters1BoxedMap([QueryParametersMap](#queryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## QueryParameters1
public static class QueryParameters1<br>
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
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.QueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
QueryParameters.QueryParametersMap validatedPayload =
    QueryParameters.QueryParameters1.validate(
    new QueryParameters.QueryParametersMapBuilder()
        .context(
            Arrays.asList(
                "a"
            )
        )
        .http(
            Arrays.asList(
                "a"
            )
        )
        .ioutil(
            Arrays.asList(
                "a"
            )
        )
        .pipe(
            Arrays.asList(
                "a"
            )
        )
        .refParam("a")

        .url(
            Arrays.asList(
                "a"
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("refParam", [StringWithValidation.StringWithValidation1.class](../../../components/schemas/StringWithValidation.md#stringwithvalidation1)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ioutil", [Schema1.Schema11.class](../../../paths/faketestqueryparamters/put/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("context", [Schema4.Schema41.class](../../../paths/faketestqueryparamters/put/parameters/parameter4/Schema4.md#schema41)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("http", [Schema2.Schema21.class](../../../paths/faketestqueryparamters/put/parameters/parameter2/Schema2.md#schema21)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("pipe", [Schema0.Schema01.class](../../../paths/faketestqueryparamters/put/parameters/parameter0/Schema0.md#schema01)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("url", [Schema3.Schema31.class](../../../paths/faketestqueryparamters/put/parameters/parameter3/Schema3.md#schema31))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"context",<br>&nbsp;&nbsp;&nbsp;&nbsp;"http",<br>&nbsp;&nbsp;&nbsp;&nbsp;"ioutil",<br>&nbsp;&nbsp;&nbsp;&nbsp;"pipe",<br>&nbsp;&nbsp;&nbsp;&nbsp;"refParam",<br>&nbsp;&nbsp;&nbsp;&nbsp;"url"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | validate([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [QueryParameters1BoxedMap](#queryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [QueryParameters1Boxed](#queryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QueryParametersMap000000Builder
public class QueryParametersMap000000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## QueryParametersMap000001Builder
public class QueryParametersMap000001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000000Builder](#queryparametersmap000000builder) | url(List<String> value) |

## QueryParametersMap000010Builder
public class QueryParametersMap000010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000000Builder](#queryparametersmap000000builder) | refParam(String value) |

## QueryParametersMap000011Builder
public class QueryParametersMap000011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000001Builder](#queryparametersmap000001builder) | refParam(String value) |
| [QueryParametersMap000010Builder](#queryparametersmap000010builder) | url(List<String> value) |

## QueryParametersMap000100Builder
public class QueryParametersMap000100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000000Builder](#queryparametersmap000000builder) | pipe(List<String> value) |

## QueryParametersMap000101Builder
public class QueryParametersMap000101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000001Builder](#queryparametersmap000001builder) | pipe(List<String> value) |
| [QueryParametersMap000100Builder](#queryparametersmap000100builder) | url(List<String> value) |

## QueryParametersMap000110Builder
public class QueryParametersMap000110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000010Builder](#queryparametersmap000010builder) | pipe(List<String> value) |
| [QueryParametersMap000100Builder](#queryparametersmap000100builder) | refParam(String value) |

## QueryParametersMap000111Builder
public class QueryParametersMap000111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap000111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000011Builder](#queryparametersmap000011builder) | pipe(List<String> value) |
| [QueryParametersMap000101Builder](#queryparametersmap000101builder) | refParam(String value) |
| [QueryParametersMap000110Builder](#queryparametersmap000110builder) | url(List<String> value) |

## QueryParametersMap001000Builder
public class QueryParametersMap001000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000000Builder](#queryparametersmap000000builder) | ioutil(List<String> value) |

## QueryParametersMap001001Builder
public class QueryParametersMap001001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000001Builder](#queryparametersmap000001builder) | ioutil(List<String> value) |
| [QueryParametersMap001000Builder](#queryparametersmap001000builder) | url(List<String> value) |

## QueryParametersMap001010Builder
public class QueryParametersMap001010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000010Builder](#queryparametersmap000010builder) | ioutil(List<String> value) |
| [QueryParametersMap001000Builder](#queryparametersmap001000builder) | refParam(String value) |

## QueryParametersMap001011Builder
public class QueryParametersMap001011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000011Builder](#queryparametersmap000011builder) | ioutil(List<String> value) |
| [QueryParametersMap001001Builder](#queryparametersmap001001builder) | refParam(String value) |
| [QueryParametersMap001010Builder](#queryparametersmap001010builder) | url(List<String> value) |

## QueryParametersMap001100Builder
public class QueryParametersMap001100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000100Builder](#queryparametersmap000100builder) | ioutil(List<String> value) |
| [QueryParametersMap001000Builder](#queryparametersmap001000builder) | pipe(List<String> value) |

## QueryParametersMap001101Builder
public class QueryParametersMap001101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000101Builder](#queryparametersmap000101builder) | ioutil(List<String> value) |
| [QueryParametersMap001001Builder](#queryparametersmap001001builder) | pipe(List<String> value) |
| [QueryParametersMap001100Builder](#queryparametersmap001100builder) | url(List<String> value) |

## QueryParametersMap001110Builder
public class QueryParametersMap001110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000110Builder](#queryparametersmap000110builder) | ioutil(List<String> value) |
| [QueryParametersMap001010Builder](#queryparametersmap001010builder) | pipe(List<String> value) |
| [QueryParametersMap001100Builder](#queryparametersmap001100builder) | refParam(String value) |

## QueryParametersMap001111Builder
public class QueryParametersMap001111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap001111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000111Builder](#queryparametersmap000111builder) | ioutil(List<String> value) |
| [QueryParametersMap001011Builder](#queryparametersmap001011builder) | pipe(List<String> value) |
| [QueryParametersMap001101Builder](#queryparametersmap001101builder) | refParam(String value) |
| [QueryParametersMap001110Builder](#queryparametersmap001110builder) | url(List<String> value) |

## QueryParametersMap010000Builder
public class QueryParametersMap010000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000000Builder](#queryparametersmap000000builder) | http(List<String> value) |

## QueryParametersMap010001Builder
public class QueryParametersMap010001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000001Builder](#queryparametersmap000001builder) | http(List<String> value) |
| [QueryParametersMap010000Builder](#queryparametersmap010000builder) | url(List<String> value) |

## QueryParametersMap010010Builder
public class QueryParametersMap010010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000010Builder](#queryparametersmap000010builder) | http(List<String> value) |
| [QueryParametersMap010000Builder](#queryparametersmap010000builder) | refParam(String value) |

## QueryParametersMap010011Builder
public class QueryParametersMap010011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000011Builder](#queryparametersmap000011builder) | http(List<String> value) |
| [QueryParametersMap010001Builder](#queryparametersmap010001builder) | refParam(String value) |
| [QueryParametersMap010010Builder](#queryparametersmap010010builder) | url(List<String> value) |

## QueryParametersMap010100Builder
public class QueryParametersMap010100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000100Builder](#queryparametersmap000100builder) | http(List<String> value) |
| [QueryParametersMap010000Builder](#queryparametersmap010000builder) | pipe(List<String> value) |

## QueryParametersMap010101Builder
public class QueryParametersMap010101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000101Builder](#queryparametersmap000101builder) | http(List<String> value) |
| [QueryParametersMap010001Builder](#queryparametersmap010001builder) | pipe(List<String> value) |
| [QueryParametersMap010100Builder](#queryparametersmap010100builder) | url(List<String> value) |

## QueryParametersMap010110Builder
public class QueryParametersMap010110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000110Builder](#queryparametersmap000110builder) | http(List<String> value) |
| [QueryParametersMap010010Builder](#queryparametersmap010010builder) | pipe(List<String> value) |
| [QueryParametersMap010100Builder](#queryparametersmap010100builder) | refParam(String value) |

## QueryParametersMap010111Builder
public class QueryParametersMap010111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap010111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000111Builder](#queryparametersmap000111builder) | http(List<String> value) |
| [QueryParametersMap010011Builder](#queryparametersmap010011builder) | pipe(List<String> value) |
| [QueryParametersMap010101Builder](#queryparametersmap010101builder) | refParam(String value) |
| [QueryParametersMap010110Builder](#queryparametersmap010110builder) | url(List<String> value) |

## QueryParametersMap011000Builder
public class QueryParametersMap011000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001000Builder](#queryparametersmap001000builder) | http(List<String> value) |
| [QueryParametersMap010000Builder](#queryparametersmap010000builder) | ioutil(List<String> value) |

## QueryParametersMap011001Builder
public class QueryParametersMap011001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001001Builder](#queryparametersmap001001builder) | http(List<String> value) |
| [QueryParametersMap010001Builder](#queryparametersmap010001builder) | ioutil(List<String> value) |
| [QueryParametersMap011000Builder](#queryparametersmap011000builder) | url(List<String> value) |

## QueryParametersMap011010Builder
public class QueryParametersMap011010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001010Builder](#queryparametersmap001010builder) | http(List<String> value) |
| [QueryParametersMap010010Builder](#queryparametersmap010010builder) | ioutil(List<String> value) |
| [QueryParametersMap011000Builder](#queryparametersmap011000builder) | refParam(String value) |

## QueryParametersMap011011Builder
public class QueryParametersMap011011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001011Builder](#queryparametersmap001011builder) | http(List<String> value) |
| [QueryParametersMap010011Builder](#queryparametersmap010011builder) | ioutil(List<String> value) |
| [QueryParametersMap011001Builder](#queryparametersmap011001builder) | refParam(String value) |
| [QueryParametersMap011010Builder](#queryparametersmap011010builder) | url(List<String> value) |

## QueryParametersMap011100Builder
public class QueryParametersMap011100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001100Builder](#queryparametersmap001100builder) | http(List<String> value) |
| [QueryParametersMap010100Builder](#queryparametersmap010100builder) | ioutil(List<String> value) |
| [QueryParametersMap011000Builder](#queryparametersmap011000builder) | pipe(List<String> value) |

## QueryParametersMap011101Builder
public class QueryParametersMap011101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001101Builder](#queryparametersmap001101builder) | http(List<String> value) |
| [QueryParametersMap010101Builder](#queryparametersmap010101builder) | ioutil(List<String> value) |
| [QueryParametersMap011001Builder](#queryparametersmap011001builder) | pipe(List<String> value) |
| [QueryParametersMap011100Builder](#queryparametersmap011100builder) | url(List<String> value) |

## QueryParametersMap011110Builder
public class QueryParametersMap011110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001110Builder](#queryparametersmap001110builder) | http(List<String> value) |
| [QueryParametersMap010110Builder](#queryparametersmap010110builder) | ioutil(List<String> value) |
| [QueryParametersMap011010Builder](#queryparametersmap011010builder) | pipe(List<String> value) |
| [QueryParametersMap011100Builder](#queryparametersmap011100builder) | refParam(String value) |

## QueryParametersMap011111Builder
public class QueryParametersMap011111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap011111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001111Builder](#queryparametersmap001111builder) | http(List<String> value) |
| [QueryParametersMap010111Builder](#queryparametersmap010111builder) | ioutil(List<String> value) |
| [QueryParametersMap011011Builder](#queryparametersmap011011builder) | pipe(List<String> value) |
| [QueryParametersMap011101Builder](#queryparametersmap011101builder) | refParam(String value) |
| [QueryParametersMap011110Builder](#queryparametersmap011110builder) | url(List<String> value) |

## QueryParametersMap100000Builder
public class QueryParametersMap100000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000000Builder](#queryparametersmap000000builder) | context(List<String> value) |

## QueryParametersMap100001Builder
public class QueryParametersMap100001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000001Builder](#queryparametersmap000001builder) | context(List<String> value) |
| [QueryParametersMap100000Builder](#queryparametersmap100000builder) | url(List<String> value) |

## QueryParametersMap100010Builder
public class QueryParametersMap100010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000010Builder](#queryparametersmap000010builder) | context(List<String> value) |
| [QueryParametersMap100000Builder](#queryparametersmap100000builder) | refParam(String value) |

## QueryParametersMap100011Builder
public class QueryParametersMap100011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000011Builder](#queryparametersmap000011builder) | context(List<String> value) |
| [QueryParametersMap100001Builder](#queryparametersmap100001builder) | refParam(String value) |
| [QueryParametersMap100010Builder](#queryparametersmap100010builder) | url(List<String> value) |

## QueryParametersMap100100Builder
public class QueryParametersMap100100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000100Builder](#queryparametersmap000100builder) | context(List<String> value) |
| [QueryParametersMap100000Builder](#queryparametersmap100000builder) | pipe(List<String> value) |

## QueryParametersMap100101Builder
public class QueryParametersMap100101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000101Builder](#queryparametersmap000101builder) | context(List<String> value) |
| [QueryParametersMap100001Builder](#queryparametersmap100001builder) | pipe(List<String> value) |
| [QueryParametersMap100100Builder](#queryparametersmap100100builder) | url(List<String> value) |

## QueryParametersMap100110Builder
public class QueryParametersMap100110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000110Builder](#queryparametersmap000110builder) | context(List<String> value) |
| [QueryParametersMap100010Builder](#queryparametersmap100010builder) | pipe(List<String> value) |
| [QueryParametersMap100100Builder](#queryparametersmap100100builder) | refParam(String value) |

## QueryParametersMap100111Builder
public class QueryParametersMap100111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap100111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap000111Builder](#queryparametersmap000111builder) | context(List<String> value) |
| [QueryParametersMap100011Builder](#queryparametersmap100011builder) | pipe(List<String> value) |
| [QueryParametersMap100101Builder](#queryparametersmap100101builder) | refParam(String value) |
| [QueryParametersMap100110Builder](#queryparametersmap100110builder) | url(List<String> value) |

## QueryParametersMap101000Builder
public class QueryParametersMap101000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001000Builder](#queryparametersmap001000builder) | context(List<String> value) |
| [QueryParametersMap100000Builder](#queryparametersmap100000builder) | ioutil(List<String> value) |

## QueryParametersMap101001Builder
public class QueryParametersMap101001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001001Builder](#queryparametersmap001001builder) | context(List<String> value) |
| [QueryParametersMap100001Builder](#queryparametersmap100001builder) | ioutil(List<String> value) |
| [QueryParametersMap101000Builder](#queryparametersmap101000builder) | url(List<String> value) |

## QueryParametersMap101010Builder
public class QueryParametersMap101010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001010Builder](#queryparametersmap001010builder) | context(List<String> value) |
| [QueryParametersMap100010Builder](#queryparametersmap100010builder) | ioutil(List<String> value) |
| [QueryParametersMap101000Builder](#queryparametersmap101000builder) | refParam(String value) |

## QueryParametersMap101011Builder
public class QueryParametersMap101011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001011Builder](#queryparametersmap001011builder) | context(List<String> value) |
| [QueryParametersMap100011Builder](#queryparametersmap100011builder) | ioutil(List<String> value) |
| [QueryParametersMap101001Builder](#queryparametersmap101001builder) | refParam(String value) |
| [QueryParametersMap101010Builder](#queryparametersmap101010builder) | url(List<String> value) |

## QueryParametersMap101100Builder
public class QueryParametersMap101100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001100Builder](#queryparametersmap001100builder) | context(List<String> value) |
| [QueryParametersMap100100Builder](#queryparametersmap100100builder) | ioutil(List<String> value) |
| [QueryParametersMap101000Builder](#queryparametersmap101000builder) | pipe(List<String> value) |

## QueryParametersMap101101Builder
public class QueryParametersMap101101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001101Builder](#queryparametersmap001101builder) | context(List<String> value) |
| [QueryParametersMap100101Builder](#queryparametersmap100101builder) | ioutil(List<String> value) |
| [QueryParametersMap101001Builder](#queryparametersmap101001builder) | pipe(List<String> value) |
| [QueryParametersMap101100Builder](#queryparametersmap101100builder) | url(List<String> value) |

## QueryParametersMap101110Builder
public class QueryParametersMap101110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001110Builder](#queryparametersmap001110builder) | context(List<String> value) |
| [QueryParametersMap100110Builder](#queryparametersmap100110builder) | ioutil(List<String> value) |
| [QueryParametersMap101010Builder](#queryparametersmap101010builder) | pipe(List<String> value) |
| [QueryParametersMap101100Builder](#queryparametersmap101100builder) | refParam(String value) |

## QueryParametersMap101111Builder
public class QueryParametersMap101111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap101111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap001111Builder](#queryparametersmap001111builder) | context(List<String> value) |
| [QueryParametersMap100111Builder](#queryparametersmap100111builder) | ioutil(List<String> value) |
| [QueryParametersMap101011Builder](#queryparametersmap101011builder) | pipe(List<String> value) |
| [QueryParametersMap101101Builder](#queryparametersmap101101builder) | refParam(String value) |
| [QueryParametersMap101110Builder](#queryparametersmap101110builder) | url(List<String> value) |

## QueryParametersMap110000Builder
public class QueryParametersMap110000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010000Builder](#queryparametersmap010000builder) | context(List<String> value) |
| [QueryParametersMap100000Builder](#queryparametersmap100000builder) | http(List<String> value) |

## QueryParametersMap110001Builder
public class QueryParametersMap110001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010001Builder](#queryparametersmap010001builder) | context(List<String> value) |
| [QueryParametersMap100001Builder](#queryparametersmap100001builder) | http(List<String> value) |
| [QueryParametersMap110000Builder](#queryparametersmap110000builder) | url(List<String> value) |

## QueryParametersMap110010Builder
public class QueryParametersMap110010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010010Builder](#queryparametersmap010010builder) | context(List<String> value) |
| [QueryParametersMap100010Builder](#queryparametersmap100010builder) | http(List<String> value) |
| [QueryParametersMap110000Builder](#queryparametersmap110000builder) | refParam(String value) |

## QueryParametersMap110011Builder
public class QueryParametersMap110011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010011Builder](#queryparametersmap010011builder) | context(List<String> value) |
| [QueryParametersMap100011Builder](#queryparametersmap100011builder) | http(List<String> value) |
| [QueryParametersMap110001Builder](#queryparametersmap110001builder) | refParam(String value) |
| [QueryParametersMap110010Builder](#queryparametersmap110010builder) | url(List<String> value) |

## QueryParametersMap110100Builder
public class QueryParametersMap110100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010100Builder](#queryparametersmap010100builder) | context(List<String> value) |
| [QueryParametersMap100100Builder](#queryparametersmap100100builder) | http(List<String> value) |
| [QueryParametersMap110000Builder](#queryparametersmap110000builder) | pipe(List<String> value) |

## QueryParametersMap110101Builder
public class QueryParametersMap110101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010101Builder](#queryparametersmap010101builder) | context(List<String> value) |
| [QueryParametersMap100101Builder](#queryparametersmap100101builder) | http(List<String> value) |
| [QueryParametersMap110001Builder](#queryparametersmap110001builder) | pipe(List<String> value) |
| [QueryParametersMap110100Builder](#queryparametersmap110100builder) | url(List<String> value) |

## QueryParametersMap110110Builder
public class QueryParametersMap110110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010110Builder](#queryparametersmap010110builder) | context(List<String> value) |
| [QueryParametersMap100110Builder](#queryparametersmap100110builder) | http(List<String> value) |
| [QueryParametersMap110010Builder](#queryparametersmap110010builder) | pipe(List<String> value) |
| [QueryParametersMap110100Builder](#queryparametersmap110100builder) | refParam(String value) |

## QueryParametersMap110111Builder
public class QueryParametersMap110111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap110111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap010111Builder](#queryparametersmap010111builder) | context(List<String> value) |
| [QueryParametersMap100111Builder](#queryparametersmap100111builder) | http(List<String> value) |
| [QueryParametersMap110011Builder](#queryparametersmap110011builder) | pipe(List<String> value) |
| [QueryParametersMap110101Builder](#queryparametersmap110101builder) | refParam(String value) |
| [QueryParametersMap110110Builder](#queryparametersmap110110builder) | url(List<String> value) |

## QueryParametersMap111000Builder
public class QueryParametersMap111000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011000Builder](#queryparametersmap011000builder) | context(List<String> value) |
| [QueryParametersMap101000Builder](#queryparametersmap101000builder) | http(List<String> value) |
| [QueryParametersMap110000Builder](#queryparametersmap110000builder) | ioutil(List<String> value) |

## QueryParametersMap111001Builder
public class QueryParametersMap111001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011001Builder](#queryparametersmap011001builder) | context(List<String> value) |
| [QueryParametersMap101001Builder](#queryparametersmap101001builder) | http(List<String> value) |
| [QueryParametersMap110001Builder](#queryparametersmap110001builder) | ioutil(List<String> value) |
| [QueryParametersMap111000Builder](#queryparametersmap111000builder) | url(List<String> value) |

## QueryParametersMap111010Builder
public class QueryParametersMap111010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011010Builder](#queryparametersmap011010builder) | context(List<String> value) |
| [QueryParametersMap101010Builder](#queryparametersmap101010builder) | http(List<String> value) |
| [QueryParametersMap110010Builder](#queryparametersmap110010builder) | ioutil(List<String> value) |
| [QueryParametersMap111000Builder](#queryparametersmap111000builder) | refParam(String value) |

## QueryParametersMap111011Builder
public class QueryParametersMap111011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011011Builder](#queryparametersmap011011builder) | context(List<String> value) |
| [QueryParametersMap101011Builder](#queryparametersmap101011builder) | http(List<String> value) |
| [QueryParametersMap110011Builder](#queryparametersmap110011builder) | ioutil(List<String> value) |
| [QueryParametersMap111001Builder](#queryparametersmap111001builder) | refParam(String value) |
| [QueryParametersMap111010Builder](#queryparametersmap111010builder) | url(List<String> value) |

## QueryParametersMap111100Builder
public class QueryParametersMap111100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011100Builder](#queryparametersmap011100builder) | context(List<String> value) |
| [QueryParametersMap101100Builder](#queryparametersmap101100builder) | http(List<String> value) |
| [QueryParametersMap110100Builder](#queryparametersmap110100builder) | ioutil(List<String> value) |
| [QueryParametersMap111000Builder](#queryparametersmap111000builder) | pipe(List<String> value) |

## QueryParametersMap111101Builder
public class QueryParametersMap111101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011101Builder](#queryparametersmap011101builder) | context(List<String> value) |
| [QueryParametersMap101101Builder](#queryparametersmap101101builder) | http(List<String> value) |
| [QueryParametersMap110101Builder](#queryparametersmap110101builder) | ioutil(List<String> value) |
| [QueryParametersMap111001Builder](#queryparametersmap111001builder) | pipe(List<String> value) |
| [QueryParametersMap111100Builder](#queryparametersmap111100builder) | url(List<String> value) |

## QueryParametersMap111110Builder
public class QueryParametersMap111110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap111110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011110Builder](#queryparametersmap011110builder) | context(List<String> value) |
| [QueryParametersMap101110Builder](#queryparametersmap101110builder) | http(List<String> value) |
| [QueryParametersMap110110Builder](#queryparametersmap110110builder) | ioutil(List<String> value) |
| [QueryParametersMap111010Builder](#queryparametersmap111010builder) | pipe(List<String> value) |
| [QueryParametersMap111100Builder](#queryparametersmap111100builder) | refParam(String value) |

## QueryParametersMapBuilder
public class QueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap011111Builder](#queryparametersmap011111builder) | context(List<String> value) |
| [QueryParametersMap101111Builder](#queryparametersmap101111builder) | http(List<String> value) |
| [QueryParametersMap110111Builder](#queryparametersmap110111builder) | ioutil(List<String> value) |
| [QueryParametersMap111011Builder](#queryparametersmap111011builder) | pipe(List<String> value) |
| [QueryParametersMap111101Builder](#queryparametersmap111101builder) | refParam(String value) |
| [QueryParametersMap111110Builder](#queryparametersmap111110builder) | url(List<String> value) |

## QueryParametersMap
public static class QueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QueryParametersMap](#queryparametersmap) | of([Map<String, ? extends @Nullable Object>](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema4.SchemaList4](../../../paths/faketestqueryparamters/put/parameters/parameter4/Schema4.md#schemalist4) | context()<br> |
| [Schema2.SchemaList2](../../../paths/faketestqueryparamters/put/parameters/parameter2/Schema2.md#schemalist2) | http()<br> |
| [Schema1.SchemaList1](../../../paths/faketestqueryparamters/put/parameters/parameter1/Schema1.md#schemalist1) | ioutil()<br> |
| [Schema0.SchemaList0](../../../paths/faketestqueryparamters/put/parameters/parameter0/Schema0.md#schemalist0) | pipe()<br> |
| String | refParam()<br> |
| [Schema3.SchemaList3](../../../paths/faketestqueryparamters/put/parameters/parameter3/Schema3.md#schemalist3) | url()<br> |

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
| AdditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
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
