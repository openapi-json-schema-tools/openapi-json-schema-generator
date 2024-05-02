# PetfindbystatusGetQueryParameters
public class PetfindbystatusGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1](#petfindbystatusgetqueryparameters1)<br> schema class |
| static class | [PetfindbystatusGetQueryParameters.QueryParametersMapBuilder](#queryparametersmapbuilder)<br> builder for Map payloads |
| static class | [PetfindbystatusGetQueryParameters.QueryParametersMap](#queryparametersmap)<br> output class for Map payloads |
| sealed interface | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PetfindbystatusGetQueryParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PetfindbystatusGetQueryParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## PetfindbystatusGetQueryParameters1Boxed
public sealed interface PetfindbystatusGetQueryParameters1Boxed<br>
permits<br>
[PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PetfindbystatusGetQueryParameters1BoxedMap
public record PetfindbystatusGetQueryParameters1BoxedMap<br>
implements [PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetQueryParameters1BoxedMap([QueryParametersMap](#queryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PetfindbystatusGetQueryParameters1
public static class PetfindbystatusGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
PetfindbystatusGetQueryParameters.QueryParametersMap validatedPayload =
    PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1.validate(
    new PetfindbystatusGetQueryParameters.QueryParametersMapBuilder()
        .status(
            Arrays.asList(
                "available"
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("status", [Schema0.Schema01.class](../../../paths/petfindbystatus/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"status"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | validate([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetfindbystatusGetQueryParameters1BoxedMap](#petfindbystatusgetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [PetfindbystatusGetQueryParameters1Boxed](#petfindbystatusgetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QueryParametersMap0Builder
public class QueryParametersMap0Builder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap0Builder(Map<String, List<String>> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, List<String>> | build()<br>Returns map input that should be used with Schema.validate |

## QueryParametersMapBuilder
public class QueryParametersMapBuilder<br>
builder for `Map<String, List<String>>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | status(List<String> value) |

## QueryParametersMap
public static class QueryParametersMap<br>
extends FrozenMap<String, Schema0.SchemaList0>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QueryParametersMap](#queryparametersmap) | of([Map<String, List<String>>](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [Schema0.SchemaList0](../../../paths/petfindbystatus/get/parameters/parameter0/Schema0.md#schemalist0) | status()<br> |

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
