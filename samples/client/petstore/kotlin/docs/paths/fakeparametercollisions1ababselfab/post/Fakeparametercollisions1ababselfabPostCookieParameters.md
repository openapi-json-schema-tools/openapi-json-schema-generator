# Fakeparametercollisions1ababselfabPostCookieParameters
public class Fakeparametercollisions1ababselfabPostCookieParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Fakeparametercollisions1ababselfabPostCookieParameters.Fakeparametercollisions1ababselfabPostCookieParameters1Boxed](#fakeparametercollisions1ababselfabpostcookieparameters1boxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap](#fakeparametercollisions1ababselfabpostcookieparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostCookieParameters.Fakeparametercollisions1ababselfabPostCookieParameters1](#fakeparametercollisions1ababselfabpostcookieparameters1)<br> schema class |
| static class | [Fakeparametercollisions1ababselfabPostCookieParameters.CookieParametersMapBuilder](#cookieparametersmapbuilder)<br> builder for Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostCookieParameters.CookieParametersMap](#cookieparametersmap)<br> output class for Map payloads |
| sealed interface | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [Fakeparametercollisions1ababselfabPostCookieParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## Fakeparametercollisions1ababselfabPostCookieParameters1Boxed
public sealed interface Fakeparametercollisions1ababselfabPostCookieParameters1Boxed<br>
permits<br>
[Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap](#fakeparametercollisions1ababselfabpostcookieparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap
public record Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap<br>
implements [Fakeparametercollisions1ababselfabPostCookieParameters1Boxed](#fakeparametercollisions1ababselfabpostcookieparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap([CookieParametersMap](#cookieparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CookieParametersMap](#cookieparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Fakeparametercollisions1ababselfabPostCookieParameters1
public static class Fakeparametercollisions1ababselfabPostCookieParameters1<br>
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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostCookieParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
Fakeparametercollisions1ababselfabPostCookieParameters.CookieParametersMap validatedPayload =
    Fakeparametercollisions1ababselfabPostCookieParameters.Fakeparametercollisions1ababselfabPostCookieParameters1.validate(
    new Fakeparametercollisions1ababselfabPostCookieParameters.CookieParametersMapBuilder()
        .positive1("a")

        .aB("a")

        .Ab("a")

        .aHyphenMinusB("a")

        .self("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("1", [Schema14.Schema141.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter14/Schema14.md#schema141)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("aB", [Schema15.Schema151.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter15/Schema15.md#schema151)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("Ab", [Schema16.Schema161.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter16/Schema16.md#schema161)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("A-B", [Schema18.Schema181.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter18/Schema18.md#schema181)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("self", [Schema17.Schema171.class](../../../paths/fakeparametercollisions1ababselfab/post/parameters/parameter17/Schema17.md#schema171))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CookieParametersMap](#cookieparametersmap) | validate([Map&lt;?, ?&gt;](#cookieparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostCookieParameters1BoxedMap](#fakeparametercollisions1ababselfabpostcookieparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#cookieparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Fakeparametercollisions1ababselfabPostCookieParameters1Boxed](#fakeparametercollisions1ababselfabpostcookieparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## CookieParametersMapBuilder
public class CookieParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CookieParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [CookieParametersMapBuilder](#cookieparametersmapbuilder) | positive1(String value) |
| [CookieParametersMapBuilder](#cookieparametersmapbuilder) | aB(String value) |
| [CookieParametersMapBuilder](#cookieparametersmapbuilder) | Ab(String value) |
| [CookieParametersMapBuilder](#cookieparametersmapbuilder) | aHyphenMinusB(String value) |
| [CookieParametersMapBuilder](#cookieparametersmapbuilder) | self(String value) |

## CookieParametersMap
public static class CookieParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [CookieParametersMap](#cookieparametersmap) | of([Map<String, ? extends @Nullable Object>](#cookieparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | aB()<br>[optional] |
| String | Ab()<br>[optional] |
| String | self()<br>[optional] |
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
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
