# FakequeryparamwithjsoncontenttypeGetQueryParameters
public class FakequeryparamwithjsoncontenttypeGetQueryParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1](#fakequeryparamwithjsoncontenttypegetqueryparameters1)<br> schema class |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.QueryParametersMapBuilder](#queryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.QueryParametersMap](#queryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed
public sealed interface FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed<br>
permits<br>
[FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap
public record FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap<br>
implements [FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap([QueryParametersMap](#queryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetQueryParameters1
public static class FakequeryparamwithjsoncontenttypeGetQueryParameters1<br>
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
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.FakequeryparamwithjsoncontenttypeGetQueryParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakequeryparamwithjsoncontenttypeGetQueryParameters.QueryParametersMap validatedPayload =
    FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1.validate(
    new FakequeryparamwithjsoncontenttypeGetQueryParameters.QueryParametersMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("someParam", [Schema0.Schema01.class](../../../paths/fakequeryparamwithjsoncontenttype/get/parameters/parameter0/content/applicationjson/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"someParam"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [QueryParametersMap](#queryparametersmap) | validate([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## QueryParametersMap0Builder
public class QueryParametersMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| QueryParametersMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

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
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(Nothing? value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(boolean value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(String value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(int value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(float value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(long value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(double value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(List<?> value) |
| [QueryParametersMap0Builder](#queryparametersmap0builder) | someParam(Map<String, ?> value) |

## QueryParametersMap
public static class QueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [QueryParametersMap](#queryparametersmap) | of([Map<String, ? extends @Nullable Object>](#queryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someParam()<br> |

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
