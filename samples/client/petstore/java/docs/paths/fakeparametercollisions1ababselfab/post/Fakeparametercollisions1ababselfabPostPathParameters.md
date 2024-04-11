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
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMapBuilder](#fakeparametercollisions1ababselfabpostpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMap](#fakeparametercollisions1ababselfabpostpathparametersmap)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostadditionalProperties](#fakeparametercollisions1ababselfabpostadditionalproperties)<br> schema class |

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
| Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap([Fakeparametercollisions1ababselfabPostPathParametersMap](#fakeparametercollisions1ababselfabpostpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap](#fakeparametercollisions1ababselfabpostpathparametersmap) | data()<br>validated payload |
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
Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMap validatedPayload =
    Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1.validate(
    new Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [Fakeparametercollisions1ababselfabPostadditionalProperties.class](#fakeparametercollisions1ababselfabpostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap](#fakeparametercollisions1ababselfabpostpathparametersmap) | validate([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakeparametercollisions1ababselfabpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostPathParameters1Boxed](#fakeparametercollisions1ababselfabpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00000builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00000builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00001builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00010builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00000builder) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00001builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00100builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00010builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00100builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00011builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00101builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00110builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00000builder) | aHyphenMinusB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00001builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01000builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00010builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01000builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00011builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01001builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01010builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00100builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01000builder) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00101builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01001builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01100builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00110builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01010builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01100builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00111builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01011builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01101builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01110builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00000builder) | positive1(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00001builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10000builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00010builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10000builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00011builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10001builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10010builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00100builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10000builder) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00101builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10001builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10100builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00110builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10010builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10100builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap00111Builder](#fakeparametercollisions1ababselfabpostpathparametersmap00111builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10011builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10101builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10110builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01000builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10000builder) | aHyphenMinusB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01001builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10001builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11000builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01010builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10010builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11000builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01011builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10011builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11001builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11010builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01100builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10100builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11000Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11000builder) | Ab(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01101builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10101builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11001Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11001builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11100builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder
public class Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01110builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10110builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11010Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11010builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11100Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11100builder) | aB(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMapBuilder
public class Fakeparametercollisions1ababselfabPostPathParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostPathParametersMap01111Builder](#fakeparametercollisions1ababselfabpostpathparametersmap01111builder) | positive1(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap10111Builder](#fakeparametercollisions1ababselfabpostpathparametersmap10111builder) | aHyphenMinusB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11011Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11011builder) | Ab(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11101Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11101builder) | aB(String value) |
| [Fakeparametercollisions1ababselfabPostPathParametersMap11110Builder](#fakeparametercollisions1ababselfabpostpathparametersmap11110builder) | self(String value) |

## Fakeparametercollisions1ababselfabPostPathParametersMap
public static class Fakeparametercollisions1ababselfabPostPathParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [Fakeparametercollisions1ababselfabPostPathParametersMap](#fakeparametercollisions1ababselfabpostpathparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakeparametercollisions1ababselfabpostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | Ab()<br> |
| String | aB()<br> |
| String | self()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed
public sealed interface Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedvoid),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedboolean),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxednumber),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedstring),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedlist),
[Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap
public record Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxed](#fakeparametercollisions1ababselfabpostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostadditionalProperties
public static class Fakeparametercollisions1ababselfabPostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
