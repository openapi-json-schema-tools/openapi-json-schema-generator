# StoreorderorderidGetPathParameters
public class StoreorderorderidGetPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1Boxed](#storeorderorderidgetpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1BoxedMap](#storeorderorderidgetpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1](#storeorderorderidgetpathparameters1)<br> schema class |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParametersMapBuilder](#storeorderorderidgetpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetPathParametersMap](#storeorderorderidgetpathparametersmap)<br> output class for Map payloads |
| sealed interface | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxedVoid](#storeorderorderidgetadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxedBoolean](#storeorderorderidgetadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxedNumber](#storeorderorderidgetadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxedString](#storeorderorderidgetadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxedList](#storeorderorderidgetadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalPropertiesBoxedMap](#storeorderorderidgetadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidGetPathParameters.StoreorderorderidGetadditionalProperties](#storeorderorderidgetadditionalproperties)<br> schema class |

## StoreorderorderidGetPathParameters1Boxed
public sealed interface StoreorderorderidGetPathParameters1Boxed<br>
permits<br>
[StoreorderorderidGetPathParameters1BoxedMap](#storeorderorderidgetpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidGetPathParameters1BoxedMap
public record StoreorderorderidGetPathParameters1BoxedMap<br>
implements [StoreorderorderidGetPathParameters1Boxed](#storeorderorderidgetpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParameters1BoxedMap([StoreorderorderidGetPathParametersMap](#storeorderorderidgetpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidGetPathParametersMap](#storeorderorderidgetpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetPathParameters1
public static class StoreorderorderidGetPathParameters1<br>
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
import org.openapijsonschematools.client.paths.storeorderorderid.get.StoreorderorderidGetPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
StoreorderorderidGetPathParameters.StoreorderorderidGetPathParametersMap validatedPayload =
    StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1.validate(
    new StoreorderorderidGetPathParameters.StoreorderorderidGetPathParametersMapBuilder()
        .order_id(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("order_id", [Schema0.Schema01.class](../../../paths/storeorderorderid/get/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"order_id"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [StoreorderorderidGetadditionalProperties.class](#storeorderorderidgetadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidGetPathParametersMap](#storeorderorderidgetpathparametersmap) | validate([Map&lt;?, ?&gt;](#storeorderorderidgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [StoreorderorderidGetPathParameters1BoxedMap](#storeorderorderidgetpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#storeorderorderidgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [StoreorderorderidGetPathParameters1Boxed](#storeorderorderidgetpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StoreorderorderidGetPathParametersMap0Builder
public class StoreorderorderidGetPathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## StoreorderorderidGetPathParametersMapBuilder
public class StoreorderorderidGetPathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidGetPathParametersMap0Builder](#storeorderorderidgetpathparametersmap0builder) | order_id(int value) |
| [StoreorderorderidGetPathParametersMap0Builder](#storeorderorderidgetpathparametersmap0builder) | order_id(float value) |
| [StoreorderorderidGetPathParametersMap0Builder](#storeorderorderidgetpathparametersmap0builder) | order_id(long value) |
| [StoreorderorderidGetPathParametersMap0Builder](#storeorderorderidgetpathparametersmap0builder) | order_id(double value) |

## StoreorderorderidGetPathParametersMap
public static class StoreorderorderidGetPathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StoreorderorderidGetPathParametersMap](#storeorderorderidgetpathparametersmap) | of([Map<String, Number>](#storeorderorderidgetpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | order_id()<br> |

## StoreorderorderidGetadditionalPropertiesBoxed
public sealed interface StoreorderorderidGetadditionalPropertiesBoxed<br>
permits<br>
[StoreorderorderidGetadditionalPropertiesBoxedVoid](#storeorderorderidgetadditionalpropertiesboxedvoid),
[StoreorderorderidGetadditionalPropertiesBoxedBoolean](#storeorderorderidgetadditionalpropertiesboxedboolean),
[StoreorderorderidGetadditionalPropertiesBoxedNumber](#storeorderorderidgetadditionalpropertiesboxednumber),
[StoreorderorderidGetadditionalPropertiesBoxedString](#storeorderorderidgetadditionalpropertiesboxedstring),
[StoreorderorderidGetadditionalPropertiesBoxedList](#storeorderorderidgetadditionalpropertiesboxedlist),
[StoreorderorderidGetadditionalPropertiesBoxedMap](#storeorderorderidgetadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidGetadditionalPropertiesBoxedVoid
public record StoreorderorderidGetadditionalPropertiesBoxedVoid<br>
implements [StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetadditionalPropertiesBoxedBoolean
public record StoreorderorderidGetadditionalPropertiesBoxedBoolean<br>
implements [StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetadditionalPropertiesBoxedNumber
public record StoreorderorderidGetadditionalPropertiesBoxedNumber<br>
implements [StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetadditionalPropertiesBoxedString
public record StoreorderorderidGetadditionalPropertiesBoxedString<br>
implements [StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetadditionalPropertiesBoxedList
public record StoreorderorderidGetadditionalPropertiesBoxedList<br>
implements [StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetadditionalPropertiesBoxedMap
public record StoreorderorderidGetadditionalPropertiesBoxedMap<br>
implements [StoreorderorderidGetadditionalPropertiesBoxed](#storeorderorderidgetadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidGetadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidGetadditionalProperties
public static class StoreorderorderidGetadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
