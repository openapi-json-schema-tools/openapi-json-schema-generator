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
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters13](#faketestqueryparamtersputqueryparameters13)<br> builder for Map payloads |
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters14](#faketestqueryparamtersputqueryparameters14)<br> output class for Map payloads |
| sealed interface | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)<br> sealed interface for validated payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9BoxedVoid](#faketestqueryparamtersputqueryparameters9boxedvoid)<br> boxed class to store validated null payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9BoxedBoolean](#faketestqueryparamtersputqueryparameters9boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9BoxedNumber](#faketestqueryparamtersputqueryparameters9boxednumber)<br> boxed class to store validated Number payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9BoxedString](#faketestqueryparamtersputqueryparameters9boxedstring)<br> boxed class to store validated String payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9BoxedList](#faketestqueryparamtersputqueryparameters9boxedlist)<br> boxed class to store validated List payloads |
| record | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9BoxedMap](#faketestqueryparamtersputqueryparameters9boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters9](#faketestqueryparamtersputqueryparameters9)<br> schema class |

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
| FaketestqueryparamtersPutQueryParameters1BoxedMap([FaketestqueryparamtersPutQueryParameters14](#faketestqueryparamtersputqueryparameters14) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters14](#faketestqueryparamtersputqueryparameters14) | data()<br>validated payload |
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
FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters14 validatedPayload =
    FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters1.validate(
    new FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters13()
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
| Class<? extends JsonSchema> | additionalProperties = [FaketestqueryparamtersPutQueryParameters9.class](#faketestqueryparamtersputqueryparameters9) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters14](#faketestqueryparamtersputqueryparameters14) | validate([Map&lt;?, ?&gt;](#faketestqueryparamtersputqueryparameters13) arg, SchemaConfiguration configuration) |
| [FaketestqueryparamtersPutQueryParameters1BoxedMap](#faketestqueryparamtersputqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#faketestqueryparamtersputqueryparameters13) arg, SchemaConfiguration configuration) |
| [FaketestqueryparamtersPutQueryParameters1Boxed](#faketestqueryparamtersputqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FaketestqueryparamtersPutQueryParameters15
public class FaketestqueryparamtersPutQueryParameters15<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters15(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## FaketestqueryparamtersPutQueryParameters16
public class FaketestqueryparamtersPutQueryParameters16<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters16(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters15](#faketestqueryparamtersputqueryparameters15) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters17
public class FaketestqueryparamtersPutQueryParameters17<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters17(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters15](#faketestqueryparamtersputqueryparameters15) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters18
public class FaketestqueryparamtersPutQueryParameters18<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters18(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters16](#faketestqueryparamtersputqueryparameters16) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters17](#faketestqueryparamtersputqueryparameters17) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters19
public class FaketestqueryparamtersPutQueryParameters19<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters19(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters15](#faketestqueryparamtersputqueryparameters15) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters20
public class FaketestqueryparamtersPutQueryParameters20<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters20(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters16](#faketestqueryparamtersputqueryparameters16) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters19](#faketestqueryparamtersputqueryparameters19) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters21
public class FaketestqueryparamtersPutQueryParameters21<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters21(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters17](#faketestqueryparamtersputqueryparameters17) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters19](#faketestqueryparamtersputqueryparameters19) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters22
public class FaketestqueryparamtersPutQueryParameters22<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters22(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters18](#faketestqueryparamtersputqueryparameters18) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters20](#faketestqueryparamtersputqueryparameters20) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters21](#faketestqueryparamtersputqueryparameters21) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters23
public class FaketestqueryparamtersPutQueryParameters23<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters23(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters15](#faketestqueryparamtersputqueryparameters15) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParameters24
public class FaketestqueryparamtersPutQueryParameters24<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters24(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters16](#faketestqueryparamtersputqueryparameters16) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters23](#faketestqueryparamtersputqueryparameters23) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters25
public class FaketestqueryparamtersPutQueryParameters25<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters25(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters17](#faketestqueryparamtersputqueryparameters17) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters23](#faketestqueryparamtersputqueryparameters23) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters26
public class FaketestqueryparamtersPutQueryParameters26<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters26(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters18](#faketestqueryparamtersputqueryparameters18) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters24](#faketestqueryparamtersputqueryparameters24) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters25](#faketestqueryparamtersputqueryparameters25) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters27
public class FaketestqueryparamtersPutQueryParameters27<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters27(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters19](#faketestqueryparamtersputqueryparameters19) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters23](#faketestqueryparamtersputqueryparameters23) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters28
public class FaketestqueryparamtersPutQueryParameters28<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters28(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters20](#faketestqueryparamtersputqueryparameters20) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters24](#faketestqueryparamtersputqueryparameters24) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters27](#faketestqueryparamtersputqueryparameters27) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters29
public class FaketestqueryparamtersPutQueryParameters29<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters29(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters21](#faketestqueryparamtersputqueryparameters21) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters25](#faketestqueryparamtersputqueryparameters25) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters27](#faketestqueryparamtersputqueryparameters27) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters30
public class FaketestqueryparamtersPutQueryParameters30<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters30(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters22](#faketestqueryparamtersputqueryparameters22) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters26](#faketestqueryparamtersputqueryparameters26) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters28](#faketestqueryparamtersputqueryparameters28) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters29](#faketestqueryparamtersputqueryparameters29) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters31
public class FaketestqueryparamtersPutQueryParameters31<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters31(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters15](#faketestqueryparamtersputqueryparameters15) | http(List<String> value) |

## FaketestqueryparamtersPutQueryParameters32
public class FaketestqueryparamtersPutQueryParameters32<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters32(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters16](#faketestqueryparamtersputqueryparameters16) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters31](#faketestqueryparamtersputqueryparameters31) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters33
public class FaketestqueryparamtersPutQueryParameters33<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters33(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters17](#faketestqueryparamtersputqueryparameters17) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters31](#faketestqueryparamtersputqueryparameters31) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters34
public class FaketestqueryparamtersPutQueryParameters34<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters34(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters18](#faketestqueryparamtersputqueryparameters18) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters32](#faketestqueryparamtersputqueryparameters32) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters33](#faketestqueryparamtersputqueryparameters33) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters35
public class FaketestqueryparamtersPutQueryParameters35<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters35(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters19](#faketestqueryparamtersputqueryparameters19) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters31](#faketestqueryparamtersputqueryparameters31) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters36
public class FaketestqueryparamtersPutQueryParameters36<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters36(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters20](#faketestqueryparamtersputqueryparameters20) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters32](#faketestqueryparamtersputqueryparameters32) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters35](#faketestqueryparamtersputqueryparameters35) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters37
public class FaketestqueryparamtersPutQueryParameters37<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters37(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters21](#faketestqueryparamtersputqueryparameters21) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters33](#faketestqueryparamtersputqueryparameters33) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters35](#faketestqueryparamtersputqueryparameters35) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters38
public class FaketestqueryparamtersPutQueryParameters38<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters38(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters22](#faketestqueryparamtersputqueryparameters22) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters34](#faketestqueryparamtersputqueryparameters34) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters36](#faketestqueryparamtersputqueryparameters36) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters37](#faketestqueryparamtersputqueryparameters37) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters39
public class FaketestqueryparamtersPutQueryParameters39<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters39(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters23](#faketestqueryparamtersputqueryparameters23) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters31](#faketestqueryparamtersputqueryparameters31) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParameters40
public class FaketestqueryparamtersPutQueryParameters40<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters40(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters24](#faketestqueryparamtersputqueryparameters24) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters32](#faketestqueryparamtersputqueryparameters32) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters39](#faketestqueryparamtersputqueryparameters39) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters41
public class FaketestqueryparamtersPutQueryParameters41<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters41(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters25](#faketestqueryparamtersputqueryparameters25) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters33](#faketestqueryparamtersputqueryparameters33) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters39](#faketestqueryparamtersputqueryparameters39) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters42
public class FaketestqueryparamtersPutQueryParameters42<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters42(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters26](#faketestqueryparamtersputqueryparameters26) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters34](#faketestqueryparamtersputqueryparameters34) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters40](#faketestqueryparamtersputqueryparameters40) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters41](#faketestqueryparamtersputqueryparameters41) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters43
public class FaketestqueryparamtersPutQueryParameters43<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters43(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters27](#faketestqueryparamtersputqueryparameters27) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters35](#faketestqueryparamtersputqueryparameters35) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters39](#faketestqueryparamtersputqueryparameters39) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters44
public class FaketestqueryparamtersPutQueryParameters44<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters44(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters28](#faketestqueryparamtersputqueryparameters28) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters36](#faketestqueryparamtersputqueryparameters36) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters40](#faketestqueryparamtersputqueryparameters40) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters43](#faketestqueryparamtersputqueryparameters43) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters45
public class FaketestqueryparamtersPutQueryParameters45<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters45(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters29](#faketestqueryparamtersputqueryparameters29) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters37](#faketestqueryparamtersputqueryparameters37) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters41](#faketestqueryparamtersputqueryparameters41) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters43](#faketestqueryparamtersputqueryparameters43) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters46
public class FaketestqueryparamtersPutQueryParameters46<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters46(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters30](#faketestqueryparamtersputqueryparameters30) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters38](#faketestqueryparamtersputqueryparameters38) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters42](#faketestqueryparamtersputqueryparameters42) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters44](#faketestqueryparamtersputqueryparameters44) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters45](#faketestqueryparamtersputqueryparameters45) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters47
public class FaketestqueryparamtersPutQueryParameters47<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters47(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters15](#faketestqueryparamtersputqueryparameters15) | context(List<String> value) |

## FaketestqueryparamtersPutQueryParameters48
public class FaketestqueryparamtersPutQueryParameters48<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters48(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters16](#faketestqueryparamtersputqueryparameters16) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters47](#faketestqueryparamtersputqueryparameters47) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters49
public class FaketestqueryparamtersPutQueryParameters49<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters49(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters17](#faketestqueryparamtersputqueryparameters17) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters47](#faketestqueryparamtersputqueryparameters47) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters50
public class FaketestqueryparamtersPutQueryParameters50<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters50(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters18](#faketestqueryparamtersputqueryparameters18) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters48](#faketestqueryparamtersputqueryparameters48) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters49](#faketestqueryparamtersputqueryparameters49) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters51
public class FaketestqueryparamtersPutQueryParameters51<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters51(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters19](#faketestqueryparamtersputqueryparameters19) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters47](#faketestqueryparamtersputqueryparameters47) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters52
public class FaketestqueryparamtersPutQueryParameters52<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters52(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters20](#faketestqueryparamtersputqueryparameters20) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters48](#faketestqueryparamtersputqueryparameters48) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters51](#faketestqueryparamtersputqueryparameters51) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters53
public class FaketestqueryparamtersPutQueryParameters53<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters53(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters21](#faketestqueryparamtersputqueryparameters21) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters49](#faketestqueryparamtersputqueryparameters49) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters51](#faketestqueryparamtersputqueryparameters51) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters54
public class FaketestqueryparamtersPutQueryParameters54<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters54(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters22](#faketestqueryparamtersputqueryparameters22) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters50](#faketestqueryparamtersputqueryparameters50) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters52](#faketestqueryparamtersputqueryparameters52) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters53](#faketestqueryparamtersputqueryparameters53) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters55
public class FaketestqueryparamtersPutQueryParameters55<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters55(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters23](#faketestqueryparamtersputqueryparameters23) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters47](#faketestqueryparamtersputqueryparameters47) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParameters56
public class FaketestqueryparamtersPutQueryParameters56<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters56(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters24](#faketestqueryparamtersputqueryparameters24) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters48](#faketestqueryparamtersputqueryparameters48) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters55](#faketestqueryparamtersputqueryparameters55) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters57
public class FaketestqueryparamtersPutQueryParameters57<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters57(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters25](#faketestqueryparamtersputqueryparameters25) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters49](#faketestqueryparamtersputqueryparameters49) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters55](#faketestqueryparamtersputqueryparameters55) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters58
public class FaketestqueryparamtersPutQueryParameters58<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters58(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters26](#faketestqueryparamtersputqueryparameters26) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters50](#faketestqueryparamtersputqueryparameters50) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters56](#faketestqueryparamtersputqueryparameters56) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters57](#faketestqueryparamtersputqueryparameters57) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters59
public class FaketestqueryparamtersPutQueryParameters59<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters59(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters27](#faketestqueryparamtersputqueryparameters27) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters51](#faketestqueryparamtersputqueryparameters51) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters55](#faketestqueryparamtersputqueryparameters55) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters60
public class FaketestqueryparamtersPutQueryParameters60<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters60(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters28](#faketestqueryparamtersputqueryparameters28) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters52](#faketestqueryparamtersputqueryparameters52) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters56](#faketestqueryparamtersputqueryparameters56) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters59](#faketestqueryparamtersputqueryparameters59) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters61
public class FaketestqueryparamtersPutQueryParameters61<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters61(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters29](#faketestqueryparamtersputqueryparameters29) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters53](#faketestqueryparamtersputqueryparameters53) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters57](#faketestqueryparamtersputqueryparameters57) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters59](#faketestqueryparamtersputqueryparameters59) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters62
public class FaketestqueryparamtersPutQueryParameters62<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters62(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters30](#faketestqueryparamtersputqueryparameters30) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters54](#faketestqueryparamtersputqueryparameters54) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters58](#faketestqueryparamtersputqueryparameters58) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters60](#faketestqueryparamtersputqueryparameters60) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters61](#faketestqueryparamtersputqueryparameters61) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters63
public class FaketestqueryparamtersPutQueryParameters63<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters63(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters31](#faketestqueryparamtersputqueryparameters31) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters47](#faketestqueryparamtersputqueryparameters47) | http(List<String> value) |

## FaketestqueryparamtersPutQueryParameters64
public class FaketestqueryparamtersPutQueryParameters64<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters64(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters32](#faketestqueryparamtersputqueryparameters32) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters48](#faketestqueryparamtersputqueryparameters48) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters63](#faketestqueryparamtersputqueryparameters63) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters65
public class FaketestqueryparamtersPutQueryParameters65<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters65(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters33](#faketestqueryparamtersputqueryparameters33) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters49](#faketestqueryparamtersputqueryparameters49) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters63](#faketestqueryparamtersputqueryparameters63) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters66
public class FaketestqueryparamtersPutQueryParameters66<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters66(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters34](#faketestqueryparamtersputqueryparameters34) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters50](#faketestqueryparamtersputqueryparameters50) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters64](#faketestqueryparamtersputqueryparameters64) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters65](#faketestqueryparamtersputqueryparameters65) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters67
public class FaketestqueryparamtersPutQueryParameters67<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters67(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters35](#faketestqueryparamtersputqueryparameters35) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters51](#faketestqueryparamtersputqueryparameters51) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters63](#faketestqueryparamtersputqueryparameters63) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters68
public class FaketestqueryparamtersPutQueryParameters68<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters68(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters36](#faketestqueryparamtersputqueryparameters36) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters52](#faketestqueryparamtersputqueryparameters52) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters64](#faketestqueryparamtersputqueryparameters64) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters67](#faketestqueryparamtersputqueryparameters67) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters69
public class FaketestqueryparamtersPutQueryParameters69<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters69(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters37](#faketestqueryparamtersputqueryparameters37) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters53](#faketestqueryparamtersputqueryparameters53) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters65](#faketestqueryparamtersputqueryparameters65) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters67](#faketestqueryparamtersputqueryparameters67) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters70
public class FaketestqueryparamtersPutQueryParameters70<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters70(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters38](#faketestqueryparamtersputqueryparameters38) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters54](#faketestqueryparamtersputqueryparameters54) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters66](#faketestqueryparamtersputqueryparameters66) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters68](#faketestqueryparamtersputqueryparameters68) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters69](#faketestqueryparamtersputqueryparameters69) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters71
public class FaketestqueryparamtersPutQueryParameters71<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters71(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters39](#faketestqueryparamtersputqueryparameters39) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters55](#faketestqueryparamtersputqueryparameters55) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters63](#faketestqueryparamtersputqueryparameters63) | ioutil(List<String> value) |

## FaketestqueryparamtersPutQueryParameters72
public class FaketestqueryparamtersPutQueryParameters72<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters72(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters40](#faketestqueryparamtersputqueryparameters40) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters56](#faketestqueryparamtersputqueryparameters56) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters64](#faketestqueryparamtersputqueryparameters64) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters71](#faketestqueryparamtersputqueryparameters71) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters73
public class FaketestqueryparamtersPutQueryParameters73<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters73(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters41](#faketestqueryparamtersputqueryparameters41) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters57](#faketestqueryparamtersputqueryparameters57) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters65](#faketestqueryparamtersputqueryparameters65) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters71](#faketestqueryparamtersputqueryparameters71) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters74
public class FaketestqueryparamtersPutQueryParameters74<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters74(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters42](#faketestqueryparamtersputqueryparameters42) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters58](#faketestqueryparamtersputqueryparameters58) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters66](#faketestqueryparamtersputqueryparameters66) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters72](#faketestqueryparamtersputqueryparameters72) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters73](#faketestqueryparamtersputqueryparameters73) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters75
public class FaketestqueryparamtersPutQueryParameters75<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters75(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters43](#faketestqueryparamtersputqueryparameters43) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters59](#faketestqueryparamtersputqueryparameters59) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters67](#faketestqueryparamtersputqueryparameters67) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters71](#faketestqueryparamtersputqueryparameters71) | pipe(List<String> value) |

## FaketestqueryparamtersPutQueryParameters76
public class FaketestqueryparamtersPutQueryParameters76<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters76(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters44](#faketestqueryparamtersputqueryparameters44) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters60](#faketestqueryparamtersputqueryparameters60) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters68](#faketestqueryparamtersputqueryparameters68) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters72](#faketestqueryparamtersputqueryparameters72) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters75](#faketestqueryparamtersputqueryparameters75) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters77
public class FaketestqueryparamtersPutQueryParameters77<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters77(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters45](#faketestqueryparamtersputqueryparameters45) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters61](#faketestqueryparamtersputqueryparameters61) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters69](#faketestqueryparamtersputqueryparameters69) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters73](#faketestqueryparamtersputqueryparameters73) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters75](#faketestqueryparamtersputqueryparameters75) | refParam(String value) |

## FaketestqueryparamtersPutQueryParameters13
public class FaketestqueryparamtersPutQueryParameters13<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters13()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutQueryParameters46](#faketestqueryparamtersputqueryparameters46) | context(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters62](#faketestqueryparamtersputqueryparameters62) | http(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters70](#faketestqueryparamtersputqueryparameters70) | ioutil(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters74](#faketestqueryparamtersputqueryparameters74) | pipe(List<String> value) |
| [FaketestqueryparamtersPutQueryParameters76](#faketestqueryparamtersputqueryparameters76) | refParam(String value) |
| [FaketestqueryparamtersPutQueryParameters77](#faketestqueryparamtersputqueryparameters77) | url(List<String> value) |

## FaketestqueryparamtersPutQueryParameters14
public static class FaketestqueryparamtersPutQueryParameters14<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FaketestqueryparamtersPutQueryParameters14](#faketestqueryparamtersputqueryparameters14) | of([Map<String, ? extends @Nullable Object>](#faketestqueryparamtersputqueryparameters13) arg, SchemaConfiguration configuration) |
| [Schema4.SchemaList4](../../../paths/faketestqueryparamters/put/parameters/parameter4/Schema4.md#schemalist4) | context()<br> |
| [Schema2.SchemaList2](../../../paths/faketestqueryparamters/put/parameters/parameter2/Schema2.md#schemalist2) | http()<br> |
| [Schema1.SchemaList1](../../../paths/faketestqueryparamters/put/parameters/parameter1/Schema1.md#schemalist1) | ioutil()<br> |
| [Schema0.SchemaList0](../../../paths/faketestqueryparamters/put/parameters/parameter0/Schema0.md#schemalist0) | pipe()<br> |
| String | refParam()<br> |
| [Schema3.SchemaList3](../../../paths/faketestqueryparamters/put/parameters/parameter3/Schema3.md#schemalist3) | url()<br> |

## FaketestqueryparamtersPutQueryParameters9Boxed
public sealed interface FaketestqueryparamtersPutQueryParameters9Boxed<br>
permits<br>
[FaketestqueryparamtersPutQueryParameters9BoxedVoid](#faketestqueryparamtersputqueryparameters9boxedvoid),
[FaketestqueryparamtersPutQueryParameters9BoxedBoolean](#faketestqueryparamtersputqueryparameters9boxedboolean),
[FaketestqueryparamtersPutQueryParameters9BoxedNumber](#faketestqueryparamtersputqueryparameters9boxednumber),
[FaketestqueryparamtersPutQueryParameters9BoxedString](#faketestqueryparamtersputqueryparameters9boxedstring),
[FaketestqueryparamtersPutQueryParameters9BoxedList](#faketestqueryparamtersputqueryparameters9boxedlist),
[FaketestqueryparamtersPutQueryParameters9BoxedMap](#faketestqueryparamtersputqueryparameters9boxedmap)

sealed interface that stores validated payloads using boxed classes

## FaketestqueryparamtersPutQueryParameters9BoxedVoid
public record FaketestqueryparamtersPutQueryParameters9BoxedVoid<br>
implements [FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters9BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters9BoxedBoolean
public record FaketestqueryparamtersPutQueryParameters9BoxedBoolean<br>
implements [FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters9BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters9BoxedNumber
public record FaketestqueryparamtersPutQueryParameters9BoxedNumber<br>
implements [FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters9BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters9BoxedString
public record FaketestqueryparamtersPutQueryParameters9BoxedString<br>
implements [FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters9BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters9BoxedList
public record FaketestqueryparamtersPutQueryParameters9BoxedList<br>
implements [FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters9BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters9BoxedMap
public record FaketestqueryparamtersPutQueryParameters9BoxedMap<br>
implements [FaketestqueryparamtersPutQueryParameters9Boxed](#faketestqueryparamtersputqueryparameters9boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FaketestqueryparamtersPutQueryParameters9BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FaketestqueryparamtersPutQueryParameters9
public static class FaketestqueryparamtersPutQueryParameters9<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
