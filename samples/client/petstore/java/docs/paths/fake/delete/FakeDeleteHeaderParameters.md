# FakeDeleteHeaderParameters
public class FakeDeleteHeaderParameters<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1Boxed](#fakedeleteheaderparameters1boxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1BoxedMap](#fakedeleteheaderparameters1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1](#fakedeleteheaderparameters1)<br> schema class |
| static class | [FakeDeleteHeaderParameters.HeaderParametersMapBuilder](#headerparametersmapbuilder)<br> builder for Map payloads |
| static class | [FakeDeleteHeaderParameters.HeaderParametersMap](#headerparametersmap)<br> output class for Map payloads |
| sealed interface | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [FakeDeleteHeaderParameters.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [FakeDeleteHeaderParameters.AdditionalProperties](#additionalproperties)<br> schema class |

## FakeDeleteHeaderParameters1Boxed
public sealed interface FakeDeleteHeaderParameters1Boxed<br>
permits<br>
[FakeDeleteHeaderParameters1BoxedMap](#fakedeleteheaderparameters1boxedmap)

sealed interface that stores validated payloads using boxed classes

## FakeDeleteHeaderParameters1BoxedMap
public record FakeDeleteHeaderParameters1BoxedMap<br>
implements [FakeDeleteHeaderParameters1Boxed](#fakedeleteheaderparameters1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeDeleteHeaderParameters1BoxedMap([HeaderParametersMap](#headerparametersmap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeaderParametersMap](#headerparametersmap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## FakeDeleteHeaderParameters1
public static class FakeDeleteHeaderParameters1<br>
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
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteHeaderParameters;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// Map validation
FakeDeleteHeaderParameters.HeaderParametersMap validatedPayload =
    FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1.validate(
    new FakeDeleteHeaderParameters.HeaderParametersMapBuilder()
        .required_boolean_group("true")

        .boolean_group("true")

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("required_boolean_group", [Schema1.Schema11.class](../../../paths/fake/delete/parameters/parameter1/Schema1.md#schema11)),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("boolean_group", [Schema4.Schema41.class](../../../paths/fake/delete/parameters/parameter4/Schema4.md#schema41))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"required_boolean_group"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeaderParametersMap](#headerparametersmap) | validate([Map&lt;?, ?&gt;](#headerparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeDeleteHeaderParameters1BoxedMap](#fakedeleteheaderparameters1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#headerparametersmapbuilder) arg, SchemaConfiguration configuration) |
| [FakeDeleteHeaderParameters1Boxed](#fakedeleteheaderparameters1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## HeaderParametersMap0Builder
public class HeaderParametersMap0Builder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeaderParametersMap0Builder(Map<String, @Nullable Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [HeaderParametersMap0Builder](#headerparametersmap0builder) | boolean_group(String value) |
| [HeaderParametersMap0Builder](#headerparametersmap0builder) | boolean_group([Schema4.StringSchemaEnums4](../../../paths/fake/delete/parameters/parameter4/Schema4.md#stringschemaenums4) value) |

## HeaderParametersMapBuilder
public class HeaderParametersMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeaderParametersMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [HeaderParametersMap0Builder](#headerparametersmap0builder) | required_boolean_group(String value) |
| [HeaderParametersMap0Builder](#headerparametersmap0builder) | required_boolean_group([Schema1.StringSchemaEnums1](../../../paths/fake/delete/parameters/parameter1/Schema1.md#stringschemaenums1) value) |

## HeaderParametersMap
public static class HeaderParametersMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [HeaderParametersMap](#headerparametersmap) | of([Map<String, ? extends @Nullable Object>](#headerparametersmapbuilder) arg, SchemaConfiguration configuration) |
| String | required_boolean_group()<br> |
| String | boolean_group()<br>[optional] |

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
