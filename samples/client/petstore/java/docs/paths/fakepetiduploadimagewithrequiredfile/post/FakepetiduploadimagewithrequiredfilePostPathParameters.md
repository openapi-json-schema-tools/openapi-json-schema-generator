# FakepetiduploadimagewithrequiredfilePostPathParameters
public class FakepetiduploadimagewithrequiredfilePostPathParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1](#fakepetiduploadimagewithrequiredfilepostpathparameters1)<br> schema class |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParametersMapBuilder](#fakepetiduploadimagewithrequiredfilepostpathparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParametersMap](#fakepetiduploadimagewithrequiredfilepostpathparametersmap)<br> output class for Map payloads |
| sealed interface | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedVoid](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedBoolean](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedNumber](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedString](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedList](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedMap](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostadditionalProperties](#fakepetiduploadimagewithrequiredfilepostadditionalproperties)<br> schema class |

## FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed
public sealed interface FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed<br>
permits<br>
[FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap
public record FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap<br>
implements [FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap([FakepetiduploadimagewithrequiredfilePostPathParametersMap](#fakepetiduploadimagewithrequiredfilepostpathparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParametersMap](#fakepetiduploadimagewithrequiredfilepostpathparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostPathParameters1
public static class FakepetiduploadimagewithrequiredfilePostPathParameters1<br>
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
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostPathParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParametersMap validatedPayload =
    FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1.validate(
    new FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParametersMapBuilder()
        .petId(1L)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("petId", [Schema0.Schema01.class](../../../paths/fakepetiduploadimagewithrequiredfile/post/parameters/parameter0/Schema0.md#schema01))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"petId"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [FakepetiduploadimagewithrequiredfilePostadditionalProperties.class](#fakepetiduploadimagewithrequiredfilepostadditionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParametersMap](#fakepetiduploadimagewithrequiredfilepostpathparametersmap) | validate([Map&lt;?, ?&gt;](#fakepetiduploadimagewithrequiredfilepostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters1BoxedMap](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#fakepetiduploadimagewithrequiredfilepostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakepetiduploadimagewithrequiredfilePostPathParameters1Boxed](#fakepetiduploadimagewithrequiredfilepostpathparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder
public class FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder(Map<String, Number> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Number> | build()<br>Returns map input that should be used with Schema.validate |

## FakepetiduploadimagewithrequiredfilePostPathParametersMapBuilder
public class FakepetiduploadimagewithrequiredfilePostPathParametersMapBuilder<br>
builder for `Map<String, Number>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostPathParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder](#fakepetiduploadimagewithrequiredfilepostpathparametersmap0builder) | petId(int value) |
| [FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder](#fakepetiduploadimagewithrequiredfilepostpathparametersmap0builder) | petId(float value) |
| [FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder](#fakepetiduploadimagewithrequiredfilepostpathparametersmap0builder) | petId(long value) |
| [FakepetiduploadimagewithrequiredfilePostPathParametersMap0Builder](#fakepetiduploadimagewithrequiredfilepostpathparametersmap0builder) | petId(double value) |

## FakepetiduploadimagewithrequiredfilePostPathParametersMap
public static class FakepetiduploadimagewithrequiredfilePostPathParametersMap<br>
extends FrozenMap<String, Number>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [FakepetiduploadimagewithrequiredfilePostPathParametersMap](#fakepetiduploadimagewithrequiredfilepostpathparametersmap) | of([Map<String, Number>](#fakepetiduploadimagewithrequiredfilepostpathparametersmapbuilder) arg, SchemaConfiguration configuration) |
| Number | petId()<br> |

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed
public sealed interface FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed<br>
permits<br>
[FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedVoid](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedvoid),
[FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedBoolean](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedboolean),
[FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedNumber](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxednumber),
[FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedString](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedstring),
[FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedList](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedlist),
[FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedMap](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxedmap)

sealed interface that stores validated payloads using boxed classes

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedVoid
public record FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedVoid<br>
implements [FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedBoolean
public record FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedBoolean<br>
implements [FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedNumber
public record FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedNumber<br>
implements [FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedString
public record FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedString<br>
implements [FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedList
public record FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedList<br>
implements [FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedMap
public record FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedMap<br>
implements [FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxed](#fakepetiduploadimagewithrequiredfilepostadditionalpropertiesboxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepetiduploadimagewithrequiredfilePostadditionalPropertiesBoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakepetiduploadimagewithrequiredfilePostadditionalProperties
public static class FakepetiduploadimagewithrequiredfilePostadditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
