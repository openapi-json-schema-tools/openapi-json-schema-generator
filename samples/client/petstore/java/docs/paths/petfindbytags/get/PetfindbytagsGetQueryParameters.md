# PetfindbytagsGetQueryParameters
public class PetfindbytagsGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1Boxed](#petfindbytagsgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1BoxedMap](#petfindbytagsgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1](#petfindbytagsgetqueryparameters1)<br> schema class |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParametersMapBuilder](#petfindbytagsgetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParametersMap](#petfindbytagsgetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxedVoid](#petfindbytagsgetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxedBoolean](#petfindbytagsgetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxedNumber](#petfindbytagsgetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxedString](#petfindbytagsgetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxedList](#petfindbytagsgetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalPropertiesBoxedMap](#petfindbytagsgetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbytagsGetQueryParameters.PetfindbytagsGetadditionalProperties](#petfindbytagsgetadditionalproperties)<br> schema class |

## PetfindbytagsGetQueryParameters1Boxed
public sealed interface PetfindbytagsGetQueryParameters1Boxed<br>
permits<br>
[PetfindbytagsGetQueryParameters1BoxedMap](#petfindbytagsgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbytagsGetQueryParameters1BoxedMap
public record PetfindbytagsGetQueryParameters1BoxedMap<br>
implements [PetfindbytagsGetQueryParameters1Boxed](#petfindbytagsgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParameters1BoxedMap([PetfindbytagsGetQueryParametersMap](#petfindbytagsgetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetQueryParametersMap](#petfindbytagsgetqueryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetQueryParameters1
public static class PetfindbytagsGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParametersMap validatedPayload =
    PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1.validate(
    new PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParametersMapBuilder()
        .tags(
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("tags", [Schema0.Schema01.class](../../../paths/petfindbytags/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"tags"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [PetfindbytagsGetadditionalProperties.class](#petfindbytagsgetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetQueryParametersMap](#petfindbytagsgetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#petfindbytagsgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetfindbytagsGetQueryParameters1BoxedMap](#petfindbytagsgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#petfindbytagsgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetfindbytagsGetQueryParameters1Boxed](#petfindbytagsgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PetfindbytagsGetQueryParametersMap0Builder
public class PetfindbytagsGetQueryParametersMap0Builder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParametersMap0Builder(Map<String, List<String>> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, List<String>> | build()<br>Returns map input that should be used with Schema.validate |

## PetfindbytagsGetQueryParametersMapBuilder
public class PetfindbytagsGetQueryParametersMapBuilder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetQueryParametersMap0Builder](#petfindbytagsgetqueryparametersmap0builder) | tags(List<String> value) |

## PetfindbytagsGetQueryParametersMap
public static class PetfindbytagsGetQueryParametersMap<br>
extends FrozenMap<String, Schema0.SchemaList0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PetfindbytagsGetQueryParametersMap](#petfindbytagsgetqueryparametersmap) | of([Map<String, List<String>>](#petfindbytagsgetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaList0](../../../paths/petfindbytags/get/parameters/parameter0/Schema0.md#schemalist0) | tags()<br> |

## PetfindbytagsGetadditionalPropertiesBoxed
public sealed interface PetfindbytagsGetadditionalPropertiesBoxed<br>
permits<br>
[PetfindbytagsGetadditionalPropertiesBoxedVoid](#petfindbytagsgetadditionalpropertiesboxedvoid),
[PetfindbytagsGetadditionalPropertiesBoxedBoolean](#petfindbytagsgetadditionalpropertiesboxedboolean),
[PetfindbytagsGetadditionalPropertiesBoxedNumber](#petfindbytagsgetadditionalpropertiesboxednumber),
[PetfindbytagsGetadditionalPropertiesBoxedString](#petfindbytagsgetadditionalpropertiesboxedstring),
[PetfindbytagsGetadditionalPropertiesBoxedList](#petfindbytagsgetadditionalpropertiesboxedlist),
[PetfindbytagsGetadditionalPropertiesBoxedMap](#petfindbytagsgetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbytagsGetadditionalPropertiesBoxedVoid
public record PetfindbytagsGetadditionalPropertiesBoxedVoid<br>
implements [PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetadditionalPropertiesBoxedBoolean
public record PetfindbytagsGetadditionalPropertiesBoxedBoolean<br>
implements [PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetadditionalPropertiesBoxedNumber
public record PetfindbytagsGetadditionalPropertiesBoxedNumber<br>
implements [PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetadditionalPropertiesBoxedString
public record PetfindbytagsGetadditionalPropertiesBoxedString<br>
implements [PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetadditionalPropertiesBoxedList
public record PetfindbytagsGetadditionalPropertiesBoxedList<br>
implements [PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetadditionalPropertiesBoxedMap
public record PetfindbytagsGetadditionalPropertiesBoxedMap<br>
implements [PetfindbytagsGetadditionalPropertiesBoxed](#petfindbytagsgetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbytagsGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbytagsGetadditionalProperties
public static class PetfindbytagsGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
