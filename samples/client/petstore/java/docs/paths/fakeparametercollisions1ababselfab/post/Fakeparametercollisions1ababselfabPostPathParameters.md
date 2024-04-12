# Fakeparametercollisions1ababselfabPostPathParameters
public class Fakeparametercollisions1ababselfabPostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1Boxed](#fakeparametercollisions1ababselfabpostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1](#fakeparametercollisions1ababselfabpostpathparameters1)<br> schema class |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters12](#fakeparametercollisions1ababselfabpostpathparameters12)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters13](#fakeparametercollisions1ababselfabpostpathparameters13)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8BoxedVoid](#fakeparametercollisions1ababselfabpostpathparameters8boxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8BoxedBoolean](#fakeparametercollisions1ababselfabpostpathparameters8boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8BoxedNumber](#fakeparametercollisions1ababselfabpostpathparameters8boxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8BoxedString](#fakeparametercollisions1ababselfabpostpathparameters8boxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8BoxedList](#fakeparametercollisions1ababselfabpostpathparameters8boxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters8boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters8](#fakeparametercollisions1ababselfabpostpathparameters8)<br> schema class |

## Fakeparametercollisions1ababselfabPostPathParameters1Boxed
public sealed interface Fakeparametercollisions1ababselfabPostPathParameters1Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap
public record Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters1Boxed](#fakeparametercollisions1ababselfabpostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap([Fakeparametercollisions1ababselfabPostPathParameters13](#fakeparametercollisions1ababselfabpostpathparameters13) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters13](#fakeparametercollisions1ababselfabpostpathparameters13) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters1
public static class Fakeparametercollisions1ababselfabPostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters13 validatedPayload =
    Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1.validate(
    new Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters12()
        .positive1("a")

        .aHyphenMinusB("a")

        .Ab("a")

        .aB("a")

        .self("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("1", [Schema9.Schema91.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter9/Schema9.md#schema91)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("aB", [Schema10.Schema101.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter10/Schema10.md#schema101)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("Ab", [Schema11.Schema111.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter11/Schema11.md#schema111)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("A-B", [Schema13.Schema131.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter13/Schema13.md#schema131)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("self", [Schema12.Schema121.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter12/Schema12.md#schema121))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"1",<br>&nbsp;&nbsp;&nbsp;&nbsp;"A-B",<br>&nbsp;&nbsp;&nbsp;&nbsp;"Ab",<br>&nbsp;&nbsp;&nbsp;&nbsp;"aB",<br>&nbsp;&nbsp;&nbsp;&nbsp;"self"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [Fakeparametercollisions1ababselfabPostPathParameters8.class](#fakeparametercollisions1ababselfabpostpathparameters8) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters13](#fakeparametercollisions1ababselfabpostpathparameters13) | validate([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostpathparameters12) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostpathparameters12) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostPathParameters1Boxed](#fakeparametercollisions1ababselfabpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Fakeparametercollisions1ababselfabPostPathParameters14
public class Fakeparametercollisions1ababselfabPostPathParameters14<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters14(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## Fakeparametercollisions1ababselfabPostPathParameters15
public class Fakeparametercollisions1ababselfabPostPathParameters15<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters15(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters14](#fakeparametercollisions1ababselfabpostpathparameters14) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters16
public class Fakeparametercollisions1ababselfabPostPathParameters16<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters16(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters14](#fakeparametercollisions1ababselfabpostpathparameters14) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters17
public class Fakeparametercollisions1ababselfabPostPathParameters17<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters17(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters15](#fakeparametercollisions1ababselfabpostpathparameters15) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters16](#fakeparametercollisions1ababselfabpostpathparameters16) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters18
public class Fakeparametercollisions1ababselfabPostPathParameters18<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters18(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters14](#fakeparametercollisions1ababselfabpostpathparameters14) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters19
public class Fakeparametercollisions1ababselfabPostPathParameters19<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters19(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters15](#fakeparametercollisions1ababselfabpostpathparameters15) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters18](#fakeparametercollisions1ababselfabpostpathparameters18) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters20
public class Fakeparametercollisions1ababselfabPostPathParameters20<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters20(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters16](#fakeparametercollisions1ababselfabpostpathparameters16) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters18](#fakeparametercollisions1ababselfabpostpathparameters18) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters21
public class Fakeparametercollisions1ababselfabPostPathParameters21<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters21(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters17](#fakeparametercollisions1ababselfabpostpathparameters17) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters19](#fakeparametercollisions1ababselfabpostpathparameters19) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters20](#fakeparametercollisions1ababselfabpostpathparameters20) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters22
public class Fakeparametercollisions1ababselfabPostPathParameters22<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters22(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters14](#fakeparametercollisions1ababselfabpostpathparameters14) | aHyphenMinusB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters23
public class Fakeparametercollisions1ababselfabPostPathParameters23<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters23(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters15](#fakeparametercollisions1ababselfabpostpathparameters15) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters22](#fakeparametercollisions1ababselfabpostpathparameters22) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters24
public class Fakeparametercollisions1ababselfabPostPathParameters24<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters24(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters16](#fakeparametercollisions1ababselfabpostpathparameters16) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters22](#fakeparametercollisions1ababselfabpostpathparameters22) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters25
public class Fakeparametercollisions1ababselfabPostPathParameters25<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters25(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters17](#fakeparametercollisions1ababselfabpostpathparameters17) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters23](#fakeparametercollisions1ababselfabpostpathparameters23) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters24](#fakeparametercollisions1ababselfabpostpathparameters24) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters26
public class Fakeparametercollisions1ababselfabPostPathParameters26<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters26(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters18](#fakeparametercollisions1ababselfabpostpathparameters18) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters22](#fakeparametercollisions1ababselfabpostpathparameters22) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters27
public class Fakeparametercollisions1ababselfabPostPathParameters27<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters27(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters19](#fakeparametercollisions1ababselfabpostpathparameters19) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters23](#fakeparametercollisions1ababselfabpostpathparameters23) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters26](#fakeparametercollisions1ababselfabpostpathparameters26) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters28
public class Fakeparametercollisions1ababselfabPostPathParameters28<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters28(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters20](#fakeparametercollisions1ababselfabpostpathparameters20) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters24](#fakeparametercollisions1ababselfabpostpathparameters24) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters26](#fakeparametercollisions1ababselfabpostpathparameters26) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters29
public class Fakeparametercollisions1ababselfabPostPathParameters29<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters29(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters21](#fakeparametercollisions1ababselfabpostpathparameters21) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters25](#fakeparametercollisions1ababselfabpostpathparameters25) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters27](#fakeparametercollisions1ababselfabpostpathparameters27) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters28](#fakeparametercollisions1ababselfabpostpathparameters28) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters30
public class Fakeparametercollisions1ababselfabPostPathParameters30<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters30(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters14](#fakeparametercollisions1ababselfabpostpathparameters14) | positive1(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters31
public class Fakeparametercollisions1ababselfabPostPathParameters31<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters31(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters15](#fakeparametercollisions1ababselfabpostpathparameters15) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters30](#fakeparametercollisions1ababselfabpostpathparameters30) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters32
public class Fakeparametercollisions1ababselfabPostPathParameters32<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters32(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters16](#fakeparametercollisions1ababselfabpostpathparameters16) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters30](#fakeparametercollisions1ababselfabpostpathparameters30) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters33
public class Fakeparametercollisions1ababselfabPostPathParameters33<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters33(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters17](#fakeparametercollisions1ababselfabpostpathparameters17) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters31](#fakeparametercollisions1ababselfabpostpathparameters31) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters32](#fakeparametercollisions1ababselfabpostpathparameters32) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters34
public class Fakeparametercollisions1ababselfabPostPathParameters34<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters34(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters18](#fakeparametercollisions1ababselfabpostpathparameters18) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters30](#fakeparametercollisions1ababselfabpostpathparameters30) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters35
public class Fakeparametercollisions1ababselfabPostPathParameters35<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters35(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters19](#fakeparametercollisions1ababselfabpostpathparameters19) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters31](#fakeparametercollisions1ababselfabpostpathparameters31) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters34](#fakeparametercollisions1ababselfabpostpathparameters34) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters36
public class Fakeparametercollisions1ababselfabPostPathParameters36<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters36(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters20](#fakeparametercollisions1ababselfabpostpathparameters20) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters32](#fakeparametercollisions1ababselfabpostpathparameters32) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters34](#fakeparametercollisions1ababselfabpostpathparameters34) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters37
public class Fakeparametercollisions1ababselfabPostPathParameters37<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters37(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters21](#fakeparametercollisions1ababselfabpostpathparameters21) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters33](#fakeparametercollisions1ababselfabpostpathparameters33) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters35](#fakeparametercollisions1ababselfabpostpathparameters35) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters36](#fakeparametercollisions1ababselfabpostpathparameters36) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters38
public class Fakeparametercollisions1ababselfabPostPathParameters38<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters38(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters22](#fakeparametercollisions1ababselfabpostpathparameters22) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters30](#fakeparametercollisions1ababselfabpostpathparameters30) | aHyphenMinusB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters39
public class Fakeparametercollisions1ababselfabPostPathParameters39<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters39(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters23](#fakeparametercollisions1ababselfabpostpathparameters23) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters31](#fakeparametercollisions1ababselfabpostpathparameters31) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters38](#fakeparametercollisions1ababselfabpostpathparameters38) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters40
public class Fakeparametercollisions1ababselfabPostPathParameters40<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters40(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters24](#fakeparametercollisions1ababselfabpostpathparameters24) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters32](#fakeparametercollisions1ababselfabpostpathparameters32) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters38](#fakeparametercollisions1ababselfabpostpathparameters38) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters41
public class Fakeparametercollisions1ababselfabPostPathParameters41<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters41(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters25](#fakeparametercollisions1ababselfabpostpathparameters25) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters33](#fakeparametercollisions1ababselfabpostpathparameters33) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters39](#fakeparametercollisions1ababselfabpostpathparameters39) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters40](#fakeparametercollisions1ababselfabpostpathparameters40) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters42
public class Fakeparametercollisions1ababselfabPostPathParameters42<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters42(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters26](#fakeparametercollisions1ababselfabpostpathparameters26) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters34](#fakeparametercollisions1ababselfabpostpathparameters34) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters38](#fakeparametercollisions1ababselfabpostpathparameters38) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters43
public class Fakeparametercollisions1ababselfabPostPathParameters43<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters43(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters27](#fakeparametercollisions1ababselfabpostpathparameters27) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters35](#fakeparametercollisions1ababselfabpostpathparameters35) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters39](#fakeparametercollisions1ababselfabpostpathparameters39) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters42](#fakeparametercollisions1ababselfabpostpathparameters42) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters44
public class Fakeparametercollisions1ababselfabPostPathParameters44<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters44(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters28](#fakeparametercollisions1ababselfabpostpathparameters28) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters36](#fakeparametercollisions1ababselfabpostpathparameters36) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters40](#fakeparametercollisions1ababselfabpostpathparameters40) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters42](#fakeparametercollisions1ababselfabpostpathparameters42) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters12
public class Fakeparametercollisions1ababselfabPostPathParameters12<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters12()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters29](#fakeparametercollisions1ababselfabpostpathparameters29) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters37](#fakeparametercollisions1ababselfabpostpathparameters37) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters41](#fakeparametercollisions1ababselfabpostpathparameters41) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters43](#fakeparametercollisions1ababselfabpostpathparameters43) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParameters44](#fakeparametercollisions1ababselfabpostpathparameters44) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParameters13
public static class Fakeparametercollisions1ababselfabPostPathParameters13<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Fakeparametercollisions1ababselfabPostPathParameters13](#fakeparametercollisions1ababselfabpostpathparameters13) | of([Map<String, ? extends @Nullable Object>](#fakeparametercollisions1ababselfabpostpathparameters12) arg, SchemaConfiguration configuration) |
| String | Ab()<br> |
| String | aB()<br> |
| String | self()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

## Fakeparametercollisions1ababselfabPostPathParameters8Boxed
public sealed interface Fakeparametercollisions1ababselfabPostPathParameters8Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostPathParameters8BoxedVoid](#fakeparametercollisions1ababselfabpostpathparameters8boxedvoid),
[Fakeparametercollisions1ababselfabPostPathParameters8BoxedBoolean](#fakeparametercollisions1ababselfabpostpathparameters8boxedboolean),
[Fakeparametercollisions1ababselfabPostPathParameters8BoxedNumber](#fakeparametercollisions1ababselfabpostpathparameters8boxednumber),
[Fakeparametercollisions1ababselfabPostPathParameters8BoxedString](#fakeparametercollisions1ababselfabpostpathparameters8boxedstring),
[Fakeparametercollisions1ababselfabPostPathParameters8BoxedList](#fakeparametercollisions1ababselfabpostpathparameters8boxedlist),
[Fakeparametercollisions1ababselfabPostPathParameters8BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters8boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostPathParameters8BoxedVoid
public record Fakeparametercollisions1ababselfabPostPathParameters8BoxedVoid<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters8BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters8BoxedBoolean
public record Fakeparametercollisions1ababselfabPostPathParameters8BoxedBoolean<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters8BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters8BoxedNumber
public record Fakeparametercollisions1ababselfabPostPathParameters8BoxedNumber<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters8BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters8BoxedString
public record Fakeparametercollisions1ababselfabPostPathParameters8BoxedString<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters8BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters8BoxedList
public record Fakeparametercollisions1ababselfabPostPathParameters8BoxedList<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters8BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters8BoxedMap
public record Fakeparametercollisions1ababselfabPostPathParameters8BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostPathParameters8Boxed](#fakeparametercollisions1ababselfabpostpathparameters8boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParameters8BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostPathParameters8
public static class Fakeparametercollisions1ababselfabPostPathParameters8<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
