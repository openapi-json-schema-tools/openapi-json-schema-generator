# StoreorderorderidDeletePathParameters
public class StoreorderorderidDeletePathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1Boxed](#storeorderorderiddeletepathparameters1boxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1BoxedMap](#storeorderorderiddeletepathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1](#storeorderorderiddeletepathparameters1)<br> schema class |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParametersMapBuilder](#storeorderorderiddeletepathparametersmapbuilder)<br> builder for Map payloads |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParametersMap](#storeorderorderiddeletepathparametersmap)<br> output class for Map payloads |
| sealed interface | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxedVoid](#storeorderorderiddeleteadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxedBoolean](#storeorderorderiddeleteadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxedNumber](#storeorderorderiddeleteadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxedString](#storeorderorderiddeleteadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxedList](#storeorderorderiddeleteadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalPropertiesBoxedMap](#storeorderorderiddeleteadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [StoreorderorderidDeletePathParameters.StoreorderorderidDeleteadditionalProperties](#storeorderorderiddeleteadditionalproperties)<br> schema class |

## StoreorderorderidDeletePathParameters1Boxed
public sealed interface StoreorderorderidDeletePathParameters1Boxed<br>
permits<br>
[StoreorderorderidDeletePathParameters1BoxedMap](#storeorderorderiddeletepathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidDeletePathParameters1BoxedMap
public record StoreorderorderidDeletePathParameters1BoxedMap<br>
implements [StoreorderorderidDeletePathParameters1Boxed](#storeorderorderiddeletepathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParameters1BoxedMap([StoreorderorderidDeletePathParametersMap](#storeorderorderiddeletepathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidDeletePathParametersMap](#storeorderorderiddeletepathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeletePathParameters1
public static class StoreorderorderidDeletePathParameters1<br>
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
import org.openapijsonschematools.client.paths.storeorderorderid.delete.StoreorderorderidDeletePathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParametersMap validatedPayload =
    StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1.validate(
    new StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParametersMapBuilder()
        .order_id("a")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("order_id", [Schema0.Schema01.class](../../../paths/storeorderorderid/delete/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"order_id"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [StoreorderorderidDeleteadditionalProperties.class](#storeorderorderiddeleteadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidDeletePathParametersMap](#storeorderorderiddeletepathparametersmap) | validate([Map&lt;?, ?&gt;](#storeorderorderiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [StoreorderorderidDeletePathParameters1BoxedMap](#storeorderorderiddeletepathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#storeorderorderiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [StoreorderorderidDeletePathParameters1Boxed](#storeorderorderiddeletepathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## StoreorderorderidDeletePathParametersMap0Builder
public class StoreorderorderidDeletePathParametersMap0Builder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParametersMap0Builder(Map<String, String> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, String> | build()<br>Returns map input that should be used with Schema.validate |

## StoreorderorderidDeletePathParametersMapBuilder
public class StoreorderorderidDeletePathParametersMapBuilder<br>
builder for `Map<String, String>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeletePathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderorderidDeletePathParametersMap0Builder](#storeorderorderiddeletepathparametersmap0builder) | order_id(String value) |

## StoreorderorderidDeletePathParametersMap
public static class StoreorderorderidDeletePathParametersMap<br>
extends FrozenMap<String, String>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [StoreorderorderidDeletePathParametersMap](#storeorderorderiddeletepathparametersmap) | of([Map<String, String>](#storeorderorderiddeletepathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | order_id()<br> |

## StoreorderorderidDeleteadditionalPropertiesBoxed
public sealed interface StoreorderorderidDeleteadditionalPropertiesBoxed<br>
permits<br>
[StoreorderorderidDeleteadditionalPropertiesBoxedVoid](#storeorderorderiddeleteadditionalpropertiesboxedvoid),
[StoreorderorderidDeleteadditionalPropertiesBoxedBoolean](#storeorderorderiddeleteadditionalpropertiesboxedboolean),
[StoreorderorderidDeleteadditionalPropertiesBoxedNumber](#storeorderorderiddeleteadditionalpropertiesboxednumber),
[StoreorderorderidDeleteadditionalPropertiesBoxedString](#storeorderorderiddeleteadditionalpropertiesboxedstring),
[StoreorderorderidDeleteadditionalPropertiesBoxedList](#storeorderorderiddeleteadditionalpropertiesboxedlist),
[StoreorderorderidDeleteadditionalPropertiesBoxedMap](#storeorderorderiddeleteadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## StoreorderorderidDeleteadditionalPropertiesBoxedVoid
public record StoreorderorderidDeleteadditionalPropertiesBoxedVoid<br>
implements [StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeleteadditionalPropertiesBoxedBoolean
public record StoreorderorderidDeleteadditionalPropertiesBoxedBoolean<br>
implements [StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeleteadditionalPropertiesBoxedNumber
public record StoreorderorderidDeleteadditionalPropertiesBoxedNumber<br>
implements [StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeleteadditionalPropertiesBoxedString
public record StoreorderorderidDeleteadditionalPropertiesBoxedString<br>
implements [StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeleteadditionalPropertiesBoxedList
public record StoreorderorderidDeleteadditionalPropertiesBoxedList<br>
implements [StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeleteadditionalPropertiesBoxedMap
public record StoreorderorderidDeleteadditionalPropertiesBoxedMap<br>
implements [StoreorderorderidDeleteadditionalPropertiesBoxed](#storeorderorderiddeleteadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StoreorderorderidDeleteadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StoreorderorderidDeleteadditionalProperties
public static class StoreorderorderidDeleteadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
