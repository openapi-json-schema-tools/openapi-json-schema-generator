# FaketestqueryparamtersPutQueryParameters
public class FaketestqueryparamtersPutQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters1Boxed](#faketestqueryparamtersputqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters1BoxedMap](#faketestqueryparamtersputqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters1](#faketestqueryparamtersputqueryparameters1)<br> schema class |
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParametersMapBuilder](#faketestqueryparamtersputqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParametersMap](#faketestqueryparamtersputqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxedVoid](#faketestqueryparamtersputadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxedBoolean](#faketestqueryparamtersputadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxedNumber](#faketestqueryparamtersputadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxedString](#faketestqueryparamtersputadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxedList](#faketestqueryparamtersputadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalPropertiesBoxedMap](#faketestqueryparamtersputadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutadditionalProperties](#faketestqueryparamtersputadditionalproperties)<br> schema class |

## FaketestqueryparamtersPutQueryParameters1Boxed
public sealed interface FaketestqueryparamtersPutQueryParameters1Boxed<br>
permits<br>
[FaketestqueryparamtersPutQueryParameters1BoxedMap](#faketestqueryparamtersputqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FaketestqueryparamtersPutQueryParameters1BoxedMap
public record FaketestqueryparamtersPutQueryParameters1BoxedMap<br>
implements [FaketestqueryparamtersPutQueryParameters1Boxed](#faketestqueryparamtersputqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters1BoxedMap([FaketestqueryparamtersPutQueryParametersMap](#faketestqueryparamtersputqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap](#faketestqueryparamtersputqueryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters1
public static class FaketestqueryparamtersPutQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.FaketestqueryparamtersPutQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParametersMap validatedPayload =
    FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters1.validate(
    new FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FaketestqueryparamtersPutadditionalProperties.class](#faketestqueryparamtersputadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap](#faketestqueryparamtersputqueryparametersmap) | validate([Map&lt;?, ?&gt;](#faketestqueryparamtersputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FaketestqueryparamtersPutQueryParameters1BoxedMap](#faketestqueryparamtersputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#faketestqueryparamtersputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FaketestqueryparamtersPutQueryParameters1Boxed](#faketestqueryparamtersputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FaketestqueryparamtersPutQueryParametersMap000000Builder
public class FaketestqueryparamtersPutQueryParametersMap000000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## FaketestqueryparamtersPutQueryParametersMap000001Builder
public class FaketestqueryparamtersPutQueryParametersMap000001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000000Builder](#faketestqueryparamtersputqueryparametersmap000000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap000010Builder
public class FaketestqueryparamtersPutQueryParametersMap000010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000000Builder](#faketestqueryparamtersputqueryparametersmap000000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap000011Builder
public class FaketestqueryparamtersPutQueryParametersMap000011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000001Builder](#faketestqueryparamtersputqueryparametersmap000001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap000010Builder](#faketestqueryparamtersputqueryparametersmap000010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap000100Builder
public class FaketestqueryparamtersPutQueryParametersMap000100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000000Builder](#faketestqueryparamtersputqueryparametersmap000000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap000101Builder
public class FaketestqueryparamtersPutQueryParametersMap000101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000001Builder](#faketestqueryparamtersputqueryparametersmap000001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap000100Builder](#faketestqueryparamtersputqueryparametersmap000100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap000110Builder
public class FaketestqueryparamtersPutQueryParametersMap000110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000010Builder](#faketestqueryparamtersputqueryparametersmap000010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap000100Builder](#faketestqueryparamtersputqueryparametersmap000100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap000111Builder
public class FaketestqueryparamtersPutQueryParametersMap000111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap000111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000011Builder](#faketestqueryparamtersputqueryparametersmap000011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap000101Builder](#faketestqueryparamtersputqueryparametersmap000101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap000110Builder](#faketestqueryparamtersputqueryparametersmap000110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap001000Builder
public class FaketestqueryparamtersPutQueryParametersMap001000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000000Builder](#faketestqueryparamtersputqueryparametersmap000000builder) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap001001Builder
public class FaketestqueryparamtersPutQueryParametersMap001001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000001Builder](#faketestqueryparamtersputqueryparametersmap000001builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001000Builder](#faketestqueryparamtersputqueryparametersmap001000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap001010Builder
public class FaketestqueryparamtersPutQueryParametersMap001010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000010Builder](#faketestqueryparamtersputqueryparametersmap000010builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001000Builder](#faketestqueryparamtersputqueryparametersmap001000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap001011Builder
public class FaketestqueryparamtersPutQueryParametersMap001011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000011Builder](#faketestqueryparamtersputqueryparametersmap000011builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001001Builder](#faketestqueryparamtersputqueryparametersmap001001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap001010Builder](#faketestqueryparamtersputqueryparametersmap001010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap001100Builder
public class FaketestqueryparamtersPutQueryParametersMap001100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000100Builder](#faketestqueryparamtersputqueryparametersmap000100builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001000Builder](#faketestqueryparamtersputqueryparametersmap001000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap001101Builder
public class FaketestqueryparamtersPutQueryParametersMap001101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000101Builder](#faketestqueryparamtersputqueryparametersmap000101builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001001Builder](#faketestqueryparamtersputqueryparametersmap001001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001100Builder](#faketestqueryparamtersputqueryparametersmap001100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap001110Builder
public class FaketestqueryparamtersPutQueryParametersMap001110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000110Builder](#faketestqueryparamtersputqueryparametersmap000110builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001010Builder](#faketestqueryparamtersputqueryparametersmap001010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001100Builder](#faketestqueryparamtersputqueryparametersmap001100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap001111Builder
public class FaketestqueryparamtersPutQueryParametersMap001111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap001111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000111Builder](#faketestqueryparamtersputqueryparametersmap000111builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001011Builder](#faketestqueryparamtersputqueryparametersmap001011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap001101Builder](#faketestqueryparamtersputqueryparametersmap001101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap001110Builder](#faketestqueryparamtersputqueryparametersmap001110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap010000Builder
public class FaketestqueryparamtersPutQueryParametersMap010000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000000Builder](#faketestqueryparamtersputqueryparametersmap000000builder) | http(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap010001Builder
public class FaketestqueryparamtersPutQueryParametersMap010001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000001Builder](#faketestqueryparamtersputqueryparametersmap000001builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010000Builder](#faketestqueryparamtersputqueryparametersmap010000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap010010Builder
public class FaketestqueryparamtersPutQueryParametersMap010010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000010Builder](#faketestqueryparamtersputqueryparametersmap000010builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010000Builder](#faketestqueryparamtersputqueryparametersmap010000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap010011Builder
public class FaketestqueryparamtersPutQueryParametersMap010011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000011Builder](#faketestqueryparamtersputqueryparametersmap000011builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010001Builder](#faketestqueryparamtersputqueryparametersmap010001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap010010Builder](#faketestqueryparamtersputqueryparametersmap010010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap010100Builder
public class FaketestqueryparamtersPutQueryParametersMap010100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000100Builder](#faketestqueryparamtersputqueryparametersmap000100builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010000Builder](#faketestqueryparamtersputqueryparametersmap010000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap010101Builder
public class FaketestqueryparamtersPutQueryParametersMap010101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000101Builder](#faketestqueryparamtersputqueryparametersmap000101builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010001Builder](#faketestqueryparamtersputqueryparametersmap010001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010100Builder](#faketestqueryparamtersputqueryparametersmap010100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap010110Builder
public class FaketestqueryparamtersPutQueryParametersMap010110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000110Builder](#faketestqueryparamtersputqueryparametersmap000110builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010010Builder](#faketestqueryparamtersputqueryparametersmap010010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010100Builder](#faketestqueryparamtersputqueryparametersmap010100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap010111Builder
public class FaketestqueryparamtersPutQueryParametersMap010111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap010111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000111Builder](#faketestqueryparamtersputqueryparametersmap000111builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010011Builder](#faketestqueryparamtersputqueryparametersmap010011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010101Builder](#faketestqueryparamtersputqueryparametersmap010101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap010110Builder](#faketestqueryparamtersputqueryparametersmap010110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap011000Builder
public class FaketestqueryparamtersPutQueryParametersMap011000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001000Builder](#faketestqueryparamtersputqueryparametersmap001000builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010000Builder](#faketestqueryparamtersputqueryparametersmap010000builder) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap011001Builder
public class FaketestqueryparamtersPutQueryParametersMap011001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001001Builder](#faketestqueryparamtersputqueryparametersmap001001builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010001Builder](#faketestqueryparamtersputqueryparametersmap010001builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011000Builder](#faketestqueryparamtersputqueryparametersmap011000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap011010Builder
public class FaketestqueryparamtersPutQueryParametersMap011010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001010Builder](#faketestqueryparamtersputqueryparametersmap001010builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010010Builder](#faketestqueryparamtersputqueryparametersmap010010builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011000Builder](#faketestqueryparamtersputqueryparametersmap011000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap011011Builder
public class FaketestqueryparamtersPutQueryParametersMap011011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001011Builder](#faketestqueryparamtersputqueryparametersmap001011builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010011Builder](#faketestqueryparamtersputqueryparametersmap010011builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011001Builder](#faketestqueryparamtersputqueryparametersmap011001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap011010Builder](#faketestqueryparamtersputqueryparametersmap011010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap011100Builder
public class FaketestqueryparamtersPutQueryParametersMap011100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001100Builder](#faketestqueryparamtersputqueryparametersmap001100builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010100Builder](#faketestqueryparamtersputqueryparametersmap010100builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011000Builder](#faketestqueryparamtersputqueryparametersmap011000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap011101Builder
public class FaketestqueryparamtersPutQueryParametersMap011101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001101Builder](#faketestqueryparamtersputqueryparametersmap001101builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010101Builder](#faketestqueryparamtersputqueryparametersmap010101builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011001Builder](#faketestqueryparamtersputqueryparametersmap011001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011100Builder](#faketestqueryparamtersputqueryparametersmap011100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap011110Builder
public class FaketestqueryparamtersPutQueryParametersMap011110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001110Builder](#faketestqueryparamtersputqueryparametersmap001110builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010110Builder](#faketestqueryparamtersputqueryparametersmap010110builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011010Builder](#faketestqueryparamtersputqueryparametersmap011010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011100Builder](#faketestqueryparamtersputqueryparametersmap011100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap011111Builder
public class FaketestqueryparamtersPutQueryParametersMap011111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap011111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001111Builder](#faketestqueryparamtersputqueryparametersmap001111builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap010111Builder](#faketestqueryparamtersputqueryparametersmap010111builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011011Builder](#faketestqueryparamtersputqueryparametersmap011011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap011101Builder](#faketestqueryparamtersputqueryparametersmap011101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap011110Builder](#faketestqueryparamtersputqueryparametersmap011110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap100000Builder
public class FaketestqueryparamtersPutQueryParametersMap100000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000000Builder](#faketestqueryparamtersputqueryparametersmap000000builder) | context(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap100001Builder
public class FaketestqueryparamtersPutQueryParametersMap100001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000001Builder](#faketestqueryparamtersputqueryparametersmap000001builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100000Builder](#faketestqueryparamtersputqueryparametersmap100000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap100010Builder
public class FaketestqueryparamtersPutQueryParametersMap100010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000010Builder](#faketestqueryparamtersputqueryparametersmap000010builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100000Builder](#faketestqueryparamtersputqueryparametersmap100000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap100011Builder
public class FaketestqueryparamtersPutQueryParametersMap100011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000011Builder](#faketestqueryparamtersputqueryparametersmap000011builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100001Builder](#faketestqueryparamtersputqueryparametersmap100001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap100010Builder](#faketestqueryparamtersputqueryparametersmap100010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap100100Builder
public class FaketestqueryparamtersPutQueryParametersMap100100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000100Builder](#faketestqueryparamtersputqueryparametersmap000100builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100000Builder](#faketestqueryparamtersputqueryparametersmap100000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap100101Builder
public class FaketestqueryparamtersPutQueryParametersMap100101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000101Builder](#faketestqueryparamtersputqueryparametersmap000101builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100001Builder](#faketestqueryparamtersputqueryparametersmap100001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100100Builder](#faketestqueryparamtersputqueryparametersmap100100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap100110Builder
public class FaketestqueryparamtersPutQueryParametersMap100110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000110Builder](#faketestqueryparamtersputqueryparametersmap000110builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100010Builder](#faketestqueryparamtersputqueryparametersmap100010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100100Builder](#faketestqueryparamtersputqueryparametersmap100100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap100111Builder
public class FaketestqueryparamtersPutQueryParametersMap100111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap100111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap000111Builder](#faketestqueryparamtersputqueryparametersmap000111builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100011Builder](#faketestqueryparamtersputqueryparametersmap100011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100101Builder](#faketestqueryparamtersputqueryparametersmap100101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap100110Builder](#faketestqueryparamtersputqueryparametersmap100110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap101000Builder
public class FaketestqueryparamtersPutQueryParametersMap101000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001000Builder](#faketestqueryparamtersputqueryparametersmap001000builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100000Builder](#faketestqueryparamtersputqueryparametersmap100000builder) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap101001Builder
public class FaketestqueryparamtersPutQueryParametersMap101001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001001Builder](#faketestqueryparamtersputqueryparametersmap001001builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100001Builder](#faketestqueryparamtersputqueryparametersmap100001builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101000Builder](#faketestqueryparamtersputqueryparametersmap101000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap101010Builder
public class FaketestqueryparamtersPutQueryParametersMap101010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001010Builder](#faketestqueryparamtersputqueryparametersmap001010builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100010Builder](#faketestqueryparamtersputqueryparametersmap100010builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101000Builder](#faketestqueryparamtersputqueryparametersmap101000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap101011Builder
public class FaketestqueryparamtersPutQueryParametersMap101011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001011Builder](#faketestqueryparamtersputqueryparametersmap001011builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100011Builder](#faketestqueryparamtersputqueryparametersmap100011builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101001Builder](#faketestqueryparamtersputqueryparametersmap101001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap101010Builder](#faketestqueryparamtersputqueryparametersmap101010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap101100Builder
public class FaketestqueryparamtersPutQueryParametersMap101100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001100Builder](#faketestqueryparamtersputqueryparametersmap001100builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100100Builder](#faketestqueryparamtersputqueryparametersmap100100builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101000Builder](#faketestqueryparamtersputqueryparametersmap101000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap101101Builder
public class FaketestqueryparamtersPutQueryParametersMap101101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001101Builder](#faketestqueryparamtersputqueryparametersmap001101builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100101Builder](#faketestqueryparamtersputqueryparametersmap100101builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101001Builder](#faketestqueryparamtersputqueryparametersmap101001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101100Builder](#faketestqueryparamtersputqueryparametersmap101100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap101110Builder
public class FaketestqueryparamtersPutQueryParametersMap101110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001110Builder](#faketestqueryparamtersputqueryparametersmap001110builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100110Builder](#faketestqueryparamtersputqueryparametersmap100110builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101010Builder](#faketestqueryparamtersputqueryparametersmap101010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101100Builder](#faketestqueryparamtersputqueryparametersmap101100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap101111Builder
public class FaketestqueryparamtersPutQueryParametersMap101111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap101111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap001111Builder](#faketestqueryparamtersputqueryparametersmap001111builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100111Builder](#faketestqueryparamtersputqueryparametersmap100111builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101011Builder](#faketestqueryparamtersputqueryparametersmap101011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101101Builder](#faketestqueryparamtersputqueryparametersmap101101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap101110Builder](#faketestqueryparamtersputqueryparametersmap101110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap110000Builder
public class FaketestqueryparamtersPutQueryParametersMap110000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010000Builder](#faketestqueryparamtersputqueryparametersmap010000builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100000Builder](#faketestqueryparamtersputqueryparametersmap100000builder) | http(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap110001Builder
public class FaketestqueryparamtersPutQueryParametersMap110001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010001Builder](#faketestqueryparamtersputqueryparametersmap010001builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100001Builder](#faketestqueryparamtersputqueryparametersmap100001builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110000Builder](#faketestqueryparamtersputqueryparametersmap110000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap110010Builder
public class FaketestqueryparamtersPutQueryParametersMap110010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010010Builder](#faketestqueryparamtersputqueryparametersmap010010builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100010Builder](#faketestqueryparamtersputqueryparametersmap100010builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110000Builder](#faketestqueryparamtersputqueryparametersmap110000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap110011Builder
public class FaketestqueryparamtersPutQueryParametersMap110011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010011Builder](#faketestqueryparamtersputqueryparametersmap010011builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100011Builder](#faketestqueryparamtersputqueryparametersmap100011builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110001Builder](#faketestqueryparamtersputqueryparametersmap110001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap110010Builder](#faketestqueryparamtersputqueryparametersmap110010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap110100Builder
public class FaketestqueryparamtersPutQueryParametersMap110100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010100Builder](#faketestqueryparamtersputqueryparametersmap010100builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100100Builder](#faketestqueryparamtersputqueryparametersmap100100builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110000Builder](#faketestqueryparamtersputqueryparametersmap110000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap110101Builder
public class FaketestqueryparamtersPutQueryParametersMap110101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010101Builder](#faketestqueryparamtersputqueryparametersmap010101builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100101Builder](#faketestqueryparamtersputqueryparametersmap100101builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110001Builder](#faketestqueryparamtersputqueryparametersmap110001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110100Builder](#faketestqueryparamtersputqueryparametersmap110100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap110110Builder
public class FaketestqueryparamtersPutQueryParametersMap110110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010110Builder](#faketestqueryparamtersputqueryparametersmap010110builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100110Builder](#faketestqueryparamtersputqueryparametersmap100110builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110010Builder](#faketestqueryparamtersputqueryparametersmap110010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110100Builder](#faketestqueryparamtersputqueryparametersmap110100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap110111Builder
public class FaketestqueryparamtersPutQueryParametersMap110111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap110111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap010111Builder](#faketestqueryparamtersputqueryparametersmap010111builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap100111Builder](#faketestqueryparamtersputqueryparametersmap100111builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110011Builder](#faketestqueryparamtersputqueryparametersmap110011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110101Builder](#faketestqueryparamtersputqueryparametersmap110101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap110110Builder](#faketestqueryparamtersputqueryparametersmap110110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap111000Builder
public class FaketestqueryparamtersPutQueryParametersMap111000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011000Builder](#faketestqueryparamtersputqueryparametersmap011000builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101000Builder](#faketestqueryparamtersputqueryparametersmap101000builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110000Builder](#faketestqueryparamtersputqueryparametersmap110000builder) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap111001Builder
public class FaketestqueryparamtersPutQueryParametersMap111001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011001Builder](#faketestqueryparamtersputqueryparametersmap011001builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101001Builder](#faketestqueryparamtersputqueryparametersmap101001builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110001Builder](#faketestqueryparamtersputqueryparametersmap110001builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111000Builder](#faketestqueryparamtersputqueryparametersmap111000builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap111010Builder
public class FaketestqueryparamtersPutQueryParametersMap111010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011010Builder](#faketestqueryparamtersputqueryparametersmap011010builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101010Builder](#faketestqueryparamtersputqueryparametersmap101010builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110010Builder](#faketestqueryparamtersputqueryparametersmap110010builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111000Builder](#faketestqueryparamtersputqueryparametersmap111000builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMap111011Builder
public class FaketestqueryparamtersPutQueryParametersMap111011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011011Builder](#faketestqueryparamtersputqueryparametersmap011011builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101011Builder](#faketestqueryparamtersputqueryparametersmap101011builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110011Builder](#faketestqueryparamtersputqueryparametersmap110011builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111001Builder](#faketestqueryparamtersputqueryparametersmap111001builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap111010Builder](#faketestqueryparamtersputqueryparametersmap111010builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap111100Builder
public class FaketestqueryparamtersPutQueryParametersMap111100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011100Builder](#faketestqueryparamtersputqueryparametersmap011100builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101100Builder](#faketestqueryparamtersputqueryparametersmap101100builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110100Builder](#faketestqueryparamtersputqueryparametersmap110100builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111000Builder](#faketestqueryparamtersputqueryparametersmap111000builder) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap111101Builder
public class FaketestqueryparamtersPutQueryParametersMap111101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011101Builder](#faketestqueryparamtersputqueryparametersmap011101builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101101Builder](#faketestqueryparamtersputqueryparametersmap101101builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110101Builder](#faketestqueryparamtersputqueryparametersmap110101builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111001Builder](#faketestqueryparamtersputqueryparametersmap111001builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111100Builder](#faketestqueryparamtersputqueryparametersmap111100builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap111110Builder
public class FaketestqueryparamtersPutQueryParametersMap111110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMap111110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011110Builder](#faketestqueryparamtersputqueryparametersmap011110builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101110Builder](#faketestqueryparamtersputqueryparametersmap101110builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110110Builder](#faketestqueryparamtersputqueryparametersmap110110builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111010Builder](#faketestqueryparamtersputqueryparametersmap111010builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111100Builder](#faketestqueryparamtersputqueryparametersmap111100builder) | refParam(String value) |

## FaketestqueryparamtersPutQueryParametersMapBuilder
public class FaketestqueryparamtersPutQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParametersMap011111Builder](#faketestqueryparamtersputqueryparametersmap011111builder) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap101111Builder](#faketestqueryparamtersputqueryparametersmap101111builder) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap110111Builder](#faketestqueryparamtersputqueryparametersmap110111builder) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111011Builder](#faketestqueryparamtersputqueryparametersmap111011builder) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParametersMap111101Builder](#faketestqueryparamtersputqueryparametersmap111101builder) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParametersMap111110Builder](#faketestqueryparamtersputqueryparametersmap111110builder) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParametersMap
public static class FaketestqueryparamtersPutQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FaketestqueryparamtersPutQueryParametersMap](#faketestqueryparamtersputqueryparametersmap) | of([Map<String, ? extends @Nullable Object>](#faketestqueryparamtersputqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema4.SchemaList4](../../../paths/faketestqueryparamters/put/parameters/parameter4/Schema4.md#schemalist4) | context()<br> |
| [Schema2.SchemaList2](../../../paths/faketestqueryparamters/put/parameters/parameter2/Schema2.md#schemalist2) | http()<br> |
| [Schema1.SchemaList1](../../../paths/faketestqueryparamters/put/parameters/parameter1/Schema1.md#schemalist1) | ioutil()<br> |
| [Schema0.SchemaList0](../../../paths/faketestqueryparamters/put/parameters/parameter0/Schema0.md#schemalist0) | pipe()<br> |
| String | refParam()<br> |
| [Schema3.SchemaList3](../../../paths/faketestqueryparamters/put/parameters/parameter3/Schema3.md#schemalist3) | url()<br> |

## FaketestqueryparamtersPutadditionalPropertiesBoxed
public sealed interface FaketestqueryparamtersPutadditionalPropertiesBoxed<br>
permits<br>
[FaketestqueryparamtersPutadditionalPropertiesBoxedVoid](#faketestqueryparamtersputadditionalpropertiesboxedvoid),
[FaketestqueryparamtersPutadditionalPropertiesBoxedBoolean](#faketestqueryparamtersputadditionalpropertiesboxedboolean),
[FaketestqueryparamtersPutadditionalPropertiesBoxedNumber](#faketestqueryparamtersputadditionalpropertiesboxednumber),
[FaketestqueryparamtersPutadditionalPropertiesBoxedString](#faketestqueryparamtersputadditionalpropertiesboxedstring),
[FaketestqueryparamtersPutadditionalPropertiesBoxedList](#faketestqueryparamtersputadditionalpropertiesboxedlist),
[FaketestqueryparamtersPutadditionalPropertiesBoxedMap](#faketestqueryparamtersputadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FaketestqueryparamtersPutadditionalPropertiesBoxedVoid
public record FaketestqueryparamtersPutadditionalPropertiesBoxedVoid<br>
implements [FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutadditionalPropertiesBoxedBoolean
public record FaketestqueryparamtersPutadditionalPropertiesBoxedBoolean<br>
implements [FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutadditionalPropertiesBoxedNumber
public record FaketestqueryparamtersPutadditionalPropertiesBoxedNumber<br>
implements [FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutadditionalPropertiesBoxedString
public record FaketestqueryparamtersPutadditionalPropertiesBoxedString<br>
implements [FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutadditionalPropertiesBoxedList
public record FaketestqueryparamtersPutadditionalPropertiesBoxedList<br>
implements [FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutadditionalPropertiesBoxedMap
public record FaketestqueryparamtersPutadditionalPropertiesBoxedMap<br>
implements [FaketestqueryparamtersPutadditionalPropertiesBoxed](#faketestqueryparamtersputadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutadditionalProperties
public static class FaketestqueryparamtersPutadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
