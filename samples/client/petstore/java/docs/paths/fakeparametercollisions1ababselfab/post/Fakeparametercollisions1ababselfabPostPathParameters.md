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
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.PathParametersMapBuilder](#pathparametersmapbuilder)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.PathParametersMap](#pathparametersmap)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostPathParameters.AdditionalProperties](#additionalproperties)<br> schema class |

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
| Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap([PathParametersMap](#pathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap](#pathparametersmap) | data()<br>validated payload |
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
Fakeparametercollisions1ababselfabPostPathParameters.PathParametersMap validatedPayload =
    Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1.validate(
    new Fakeparametercollisions1ababselfabPostPathParameters.PathParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap](#pathparametersmap) | validate([Map&lt;?, ?&gt;](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostPathParameters1BoxedMap](#fakeparametercollisions1ababselfabpostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostPathParameters1Boxed](#fakeparametercollisions1ababselfabpostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PathParametersMap00000Builder
public class PathParametersMap00000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## PathParametersMap00001Builder
public class PathParametersMap00001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00000Builder](#pathparametersmap00000builder) | self(String value) |

## PathParametersMap00010Builder
public class PathParametersMap00010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00000Builder](#pathparametersmap00000builder) | aB(String value) |

## PathParametersMap00011Builder
public class PathParametersMap00011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00001Builder](#pathparametersmap00001builder) | aB(String value) |
| [PathParametersMap00010Builder](#pathparametersmap00010builder) | self(String value) |

## PathParametersMap00100Builder
public class PathParametersMap00100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00000Builder](#pathparametersmap00000builder) | Ab(String value) |

## PathParametersMap00101Builder
public class PathParametersMap00101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00001Builder](#pathparametersmap00001builder) | Ab(String value) |
| [PathParametersMap00100Builder](#pathparametersmap00100builder) | self(String value) |

## PathParametersMap00110Builder
public class PathParametersMap00110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00010Builder](#pathparametersmap00010builder) | Ab(String value) |
| [PathParametersMap00100Builder](#pathparametersmap00100builder) | aB(String value) |

## PathParametersMap00111Builder
public class PathParametersMap00111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap00111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00011Builder](#pathparametersmap00011builder) | Ab(String value) |
| [PathParametersMap00101Builder](#pathparametersmap00101builder) | aB(String value) |
| [PathParametersMap00110Builder](#pathparametersmap00110builder) | self(String value) |

## PathParametersMap01000Builder
public class PathParametersMap01000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00000Builder](#pathparametersmap00000builder) | aHyphenMinusB(String value) |

## PathParametersMap01001Builder
public class PathParametersMap01001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00001Builder](#pathparametersmap00001builder) | aHyphenMinusB(String value) |
| [PathParametersMap01000Builder](#pathparametersmap01000builder) | self(String value) |

## PathParametersMap01010Builder
public class PathParametersMap01010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00010Builder](#pathparametersmap00010builder) | aHyphenMinusB(String value) |
| [PathParametersMap01000Builder](#pathparametersmap01000builder) | aB(String value) |

## PathParametersMap01011Builder
public class PathParametersMap01011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00011Builder](#pathparametersmap00011builder) | aHyphenMinusB(String value) |
| [PathParametersMap01001Builder](#pathparametersmap01001builder) | aB(String value) |
| [PathParametersMap01010Builder](#pathparametersmap01010builder) | self(String value) |

## PathParametersMap01100Builder
public class PathParametersMap01100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00100Builder](#pathparametersmap00100builder) | aHyphenMinusB(String value) |
| [PathParametersMap01000Builder](#pathparametersmap01000builder) | Ab(String value) |

## PathParametersMap01101Builder
public class PathParametersMap01101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00101Builder](#pathparametersmap00101builder) | aHyphenMinusB(String value) |
| [PathParametersMap01001Builder](#pathparametersmap01001builder) | Ab(String value) |
| [PathParametersMap01100Builder](#pathparametersmap01100builder) | self(String value) |

## PathParametersMap01110Builder
public class PathParametersMap01110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00110Builder](#pathparametersmap00110builder) | aHyphenMinusB(String value) |
| [PathParametersMap01010Builder](#pathparametersmap01010builder) | Ab(String value) |
| [PathParametersMap01100Builder](#pathparametersmap01100builder) | aB(String value) |

## PathParametersMap01111Builder
public class PathParametersMap01111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap01111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00111Builder](#pathparametersmap00111builder) | aHyphenMinusB(String value) |
| [PathParametersMap01011Builder](#pathparametersmap01011builder) | Ab(String value) |
| [PathParametersMap01101Builder](#pathparametersmap01101builder) | aB(String value) |
| [PathParametersMap01110Builder](#pathparametersmap01110builder) | self(String value) |

## PathParametersMap10000Builder
public class PathParametersMap10000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00000Builder](#pathparametersmap00000builder) | positive1(String value) |

## PathParametersMap10001Builder
public class PathParametersMap10001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00001Builder](#pathparametersmap00001builder) | positive1(String value) |
| [PathParametersMap10000Builder](#pathparametersmap10000builder) | self(String value) |

## PathParametersMap10010Builder
public class PathParametersMap10010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00010Builder](#pathparametersmap00010builder) | positive1(String value) |
| [PathParametersMap10000Builder](#pathparametersmap10000builder) | aB(String value) |

## PathParametersMap10011Builder
public class PathParametersMap10011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00011Builder](#pathparametersmap00011builder) | positive1(String value) |
| [PathParametersMap10001Builder](#pathparametersmap10001builder) | aB(String value) |
| [PathParametersMap10010Builder](#pathparametersmap10010builder) | self(String value) |

## PathParametersMap10100Builder
public class PathParametersMap10100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00100Builder](#pathparametersmap00100builder) | positive1(String value) |
| [PathParametersMap10000Builder](#pathparametersmap10000builder) | Ab(String value) |

## PathParametersMap10101Builder
public class PathParametersMap10101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00101Builder](#pathparametersmap00101builder) | positive1(String value) |
| [PathParametersMap10001Builder](#pathparametersmap10001builder) | Ab(String value) |
| [PathParametersMap10100Builder](#pathparametersmap10100builder) | self(String value) |

## PathParametersMap10110Builder
public class PathParametersMap10110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00110Builder](#pathparametersmap00110builder) | positive1(String value) |
| [PathParametersMap10010Builder](#pathparametersmap10010builder) | Ab(String value) |
| [PathParametersMap10100Builder](#pathparametersmap10100builder) | aB(String value) |

## PathParametersMap10111Builder
public class PathParametersMap10111Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap10111Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap00111Builder](#pathparametersmap00111builder) | positive1(String value) |
| [PathParametersMap10011Builder](#pathparametersmap10011builder) | Ab(String value) |
| [PathParametersMap10101Builder](#pathparametersmap10101builder) | aB(String value) |
| [PathParametersMap10110Builder](#pathparametersmap10110builder) | self(String value) |

## PathParametersMap11000Builder
public class PathParametersMap11000Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11000Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01000Builder](#pathparametersmap01000builder) | positive1(String value) |
| [PathParametersMap10000Builder](#pathparametersmap10000builder) | aHyphenMinusB(String value) |

## PathParametersMap11001Builder
public class PathParametersMap11001Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11001Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01001Builder](#pathparametersmap01001builder) | positive1(String value) |
| [PathParametersMap10001Builder](#pathparametersmap10001builder) | aHyphenMinusB(String value) |
| [PathParametersMap11000Builder](#pathparametersmap11000builder) | self(String value) |

## PathParametersMap11010Builder
public class PathParametersMap11010Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11010Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01010Builder](#pathparametersmap01010builder) | positive1(String value) |
| [PathParametersMap10010Builder](#pathparametersmap10010builder) | aHyphenMinusB(String value) |
| [PathParametersMap11000Builder](#pathparametersmap11000builder) | aB(String value) |

## PathParametersMap11011Builder
public class PathParametersMap11011Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11011Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01011Builder](#pathparametersmap01011builder) | positive1(String value) |
| [PathParametersMap10011Builder](#pathparametersmap10011builder) | aHyphenMinusB(String value) |
| [PathParametersMap11001Builder](#pathparametersmap11001builder) | aB(String value) |
| [PathParametersMap11010Builder](#pathparametersmap11010builder) | self(String value) |

## PathParametersMap11100Builder
public class PathParametersMap11100Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11100Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01100Builder](#pathparametersmap01100builder) | positive1(String value) |
| [PathParametersMap10100Builder](#pathparametersmap10100builder) | aHyphenMinusB(String value) |
| [PathParametersMap11000Builder](#pathparametersmap11000builder) | Ab(String value) |

## PathParametersMap11101Builder
public class PathParametersMap11101Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11101Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01101Builder](#pathparametersmap01101builder) | positive1(String value) |
| [PathParametersMap10101Builder](#pathparametersmap10101builder) | aHyphenMinusB(String value) |
| [PathParametersMap11001Builder](#pathparametersmap11001builder) | Ab(String value) |
| [PathParametersMap11100Builder](#pathparametersmap11100builder) | self(String value) |

## PathParametersMap11110Builder
public class PathParametersMap11110Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMap11110Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01110Builder](#pathparametersmap01110builder) | positive1(String value) |
| [PathParametersMap10110Builder](#pathparametersmap10110builder) | aHyphenMinusB(String value) |
| [PathParametersMap11010Builder](#pathparametersmap11010builder) | Ab(String value) |
| [PathParametersMap11100Builder](#pathparametersmap11100builder) | aB(String value) |

## PathParametersMapBuilder
public class PathParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PathParametersMap01111Builder](#pathparametersmap01111builder) | positive1(String value) |
| [PathParametersMap10111Builder](#pathparametersmap10111builder) | aHyphenMinusB(String value) |
| [PathParametersMap11011Builder](#pathparametersmap11011builder) | Ab(String value) |
| [PathParametersMap11101Builder](#pathparametersmap11101builder) | aB(String value) |
| [PathParametersMap11110Builder](#pathparametersmap11110builder) | self(String value) |

## PathParametersMap
public static class PathParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PathParametersMap](#pathparametersmap) | of([Map<String, ? extends @Nullable Object>](#pathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | Ab()<br> |
| String | aB()<br> |
| String | self()<br> |
| @Nullable Object | get(String key)<br>This schema has invalid Java names so this method must be used when you access instance["1"], instance["A-B"],  |

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
