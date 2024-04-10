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
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder](#fakequeryparamwithjsoncontenttypegetqueryparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParametersMap](#fakequeryparamwithjsoncontenttypegetqueryparametersmap)<br> output class for Map payloads |
| sealed interface | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedVoid](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedBoolean](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedNumber](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedString](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedList](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedMap](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetadditionalProperties](#fakequeryparamwithjsoncontenttypegetadditionalproperties)<br> schema class |

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
| FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap([FakequeryparamwithjsoncontenttypeGetQueryParametersMap](#fakequeryparamwithjsoncontenttypegetqueryparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap](#fakequeryparamwithjsoncontenttypegetqueryparametersmap) | data()<br>validated payload |
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
FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParametersMap validatedPayload =
    FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1.validate(
    new FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder()
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
| Class<? extends JsonSchema> | additionalProperties = [FakequeryparamwithjsoncontenttypeGetadditionalProperties.class](#fakequeryparamwithjsoncontenttypegetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap](#fakequeryparamwithjsoncontenttypegetqueryparametersmap) | validate([Map&lt;?, ?&gt;](#fakequeryparamwithjsoncontenttypegetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters1BoxedMap](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakequeryparamwithjsoncontenttypegetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters1Boxed](#fakequeryparamwithjsoncontenttypegetqueryparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder
public class FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |

## FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder
public class FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetQueryParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(Void value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(boolean value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(String value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(int value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(float value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(long value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(double value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(List<?> value) |
| [FakequeryparamwithjsoncontenttypeGetQueryParametersMap0Builder](#fakequeryparamwithjsoncontenttypegetqueryparametersmap0builder) | someParam(Map<String, ?> value) |

## FakequeryparamwithjsoncontenttypeGetQueryParametersMap
public static class FakequeryparamwithjsoncontenttypeGetQueryParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakequeryparamwithjsoncontenttypeGetQueryParametersMap](#fakequeryparamwithjsoncontenttypegetqueryparametersmap) | of([Map<String, ? extends @Nullable Object>](#fakequeryparamwithjsoncontenttypegetqueryparametersmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | someParam()<br> |

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed
public sealed interface FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed<br>
permits<br>
[FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedVoid](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedvoid),
[FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedBoolean](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedboolean),
[FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedNumber](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxednumber),
[FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedString](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedstring),
[FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedList](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedlist),
[FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedMap](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedVoid
public record FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedVoid<br>
implements [FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedBoolean
public record FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedBoolean<br>
implements [FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedNumber
public record FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedNumber<br>
implements [FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedString
public record FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedString<br>
implements [FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedList
public record FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedList<br>
implements [FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedMap
public record FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedMap<br>
implements [FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxed](#fakequeryparamwithjsoncontenttypegetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakequeryparamwithjsoncontenttypeGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakequeryparamwithjsoncontenttypeGetadditionalProperties
public static class FakequeryparamwithjsoncontenttypeGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
