# PaginatedResultMyObjectDto
org.openapijsonschematools.client.components.schemas.PaginatedResultMyObjectDto.java
public class PaginatedResultMyObjectDto<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1Boxed](#paginatedresultmyobjectdto1boxed)<br> sealed interface for validated payloads |
| record | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1BoxedMap](#paginatedresultmyobjectdto1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1](#paginatedresultmyobjectdto1)<br> schema class |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMapBuilder](#paginatedresultmyobjectdtomapbuilder)<br> builder for Map payloads |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap)<br> output class for Map payloads |
| sealed interface | [PaginatedResultMyObjectDto.ResultsBoxed](#resultsboxed)<br> sealed interface for validated payloads |
| record | [PaginatedResultMyObjectDto.ResultsBoxedList](#resultsboxedlist)<br> boxed class to store validated List payloads |
| static class | [PaginatedResultMyObjectDto.Results](#results)<br> schema class |
| static class | [PaginatedResultMyObjectDto.ResultsListBuilder](#resultslistbuilder)<br> builder for List payloads |
| static class | [PaginatedResultMyObjectDto.ResultsList](#resultslist)<br> output class for List payloads |
| sealed interface | [PaginatedResultMyObjectDto.CountBoxed](#countboxed)<br> sealed interface for validated payloads |
| record | [PaginatedResultMyObjectDto.CountBoxedNumber](#countboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PaginatedResultMyObjectDto.Count](#count)<br> schema class |
| sealed interface | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed interface for validated payloads |
| record | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid)<br> boxed class to store validated null payloads |
| record | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber)<br> boxed class to store validated Number payloads |
| record | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring)<br> boxed class to store validated String payloads |
| record | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist)<br> boxed class to store validated List payloads |
| record | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)<br> boxed class to store validated Map payloads |
| static class | [PaginatedResultMyObjectDto.AdditionalProperties](#additionalproperties)<br> schema class |

## PaginatedResultMyObjectDto1Boxed
public sealed interface PaginatedResultMyObjectDto1Boxed<br>
permits<br>
[PaginatedResultMyObjectDto1BoxedMap](#paginatedresultmyobjectdto1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PaginatedResultMyObjectDto1BoxedMap
public record PaginatedResultMyObjectDto1BoxedMap<br>
implements [PaginatedResultMyObjectDto1Boxed](#paginatedresultmyobjectdto1boxed)

record that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PaginatedResultMyObjectDto1BoxedMap([PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## PaginatedResultMyObjectDto1
public static class PaginatedResultMyObjectDto1<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap validatedPayload =
    PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1.validate(
    new PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMapBuilder()
        .count(1)

        .results(
            Arrays.asList(
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
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("count", [Count.class](#count))),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("results", [Results.class](#results)))<br>)<br> |
| Set<String> | required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;"count",<br>&nbsp;&nbsp;&nbsp;&nbsp;"results"<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [AdditionalProperties.class](#additionalproperties) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | validate([Map&lt;?, ?&gt;](#paginatedresultmyobjectdtomapbuilder) arg, SchemaConfiguration configuration) |
| [PaginatedResultMyObjectDto1BoxedMap](#paginatedresultmyobjectdto1boxedmap) | validateAndBox([Map&lt;?, ?&gt;](#paginatedresultmyobjectdtomapbuilder) arg, SchemaConfiguration configuration) |
| [PaginatedResultMyObjectDto1Boxed](#paginatedresultmyobjectdto1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## PaginatedResultMyObjectDtoMap00Builder
public class PaginatedResultMyObjectDtoMap00Builder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PaginatedResultMyObjectDtoMap00Builder(Map<String, Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, Object> | build()<br>Returns map input that should be used with Schema.validate |

## PaginatedResultMyObjectDtoMap01Builder
public class PaginatedResultMyObjectDtoMap01Builder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PaginatedResultMyObjectDtoMap01Builder(Map<String, Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PaginatedResultMyObjectDtoMap00Builder](#paginatedresultmyobjectdtomap00builder) | results(List<Map<String, String>> value) |

## PaginatedResultMyObjectDtoMap10Builder
public class PaginatedResultMyObjectDtoMap10Builder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PaginatedResultMyObjectDtoMap10Builder(Map<String, Object> instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PaginatedResultMyObjectDtoMap00Builder](#paginatedresultmyobjectdtomap00builder) | count(int value) |
| [PaginatedResultMyObjectDtoMap00Builder](#paginatedresultmyobjectdtomap00builder) | count(float value) |
| [PaginatedResultMyObjectDtoMap00Builder](#paginatedresultmyobjectdtomap00builder) | count(long value) |
| [PaginatedResultMyObjectDtoMap00Builder](#paginatedresultmyobjectdtomap00builder) | count(double value) |

## PaginatedResultMyObjectDtoMapBuilder
public class PaginatedResultMyObjectDtoMapBuilder<br>
builder for `Map<String, Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PaginatedResultMyObjectDtoMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PaginatedResultMyObjectDtoMap01Builder](#paginatedresultmyobjectdtomap01builder) | count(int value) |
| [PaginatedResultMyObjectDtoMap01Builder](#paginatedresultmyobjectdtomap01builder) | count(float value) |
| [PaginatedResultMyObjectDtoMap01Builder](#paginatedresultmyobjectdtomap01builder) | count(long value) |
| [PaginatedResultMyObjectDtoMap01Builder](#paginatedresultmyobjectdtomap01builder) | count(double value) |
| [PaginatedResultMyObjectDtoMap10Builder](#paginatedresultmyobjectdtomap10builder) | results(List<Map<String, String>> value) |

## PaginatedResultMyObjectDtoMap
public static class PaginatedResultMyObjectDtoMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | of([Map<String, Object>](#paginatedresultmyobjectdtomapbuilder) arg, SchemaConfiguration configuration) |
| Number | count()<br> |
| [ResultsList](#resultslist) | results()<br> |

## ResultsBoxed
public sealed interface ResultsBoxed<br>
permits<br>
[ResultsBoxedList](#resultsboxedlist)

sealed interface that stores validated payloads using boxed classes

## ResultsBoxedList
public record ResultsBoxedList<br>
implements [ResultsBoxed](#resultsboxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ResultsBoxedList([ResultsList](#resultslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ResultsList](#resultslist) | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Results
public static class Results<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
PaginatedResultMyObjectDto.ResultsList validatedPayload =
    PaginatedResultMyObjectDto.Results.validate(
    new PaginatedResultMyObjectDto.ResultsListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [MyObjectDto.MyObjectDto1.class](../../components/schemas/MyObjectDto.md#myobjectdto1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ResultsList](#resultslist) | validate([List<?>](#resultslistbuilder) arg, SchemaConfiguration configuration) |
| [ResultsBoxedList](#resultsboxedlist) | validateAndBox([List<?>](#resultslistbuilder) arg, SchemaConfiguration configuration) |
| [ResultsBoxed](#resultsboxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

## ResultsListBuilder
public class ResultsListBuilder<br>
builder for `List<Map<String, String>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ResultsListBuilder()<br>Creates an empty list |
| ResultsListBuilder(List<Map<String, String>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ResultsListBuilder | add(Map<String, String> item) |
| List<Map<String, String>> | build()<br>Returns list input that should be used with Schema.validate |

## ResultsList
public class ResultsList<br>
extends `FrozenList<MyObjectDto.MyObjectDtoMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ResultsList](#resultslist) | of([List<Map<String, String>>](#resultslistbuilder) arg, SchemaConfiguration configuration) |

## CountBoxed
public sealed interface CountBoxed<br>
permits<br>
[CountBoxedNumber](#countboxednumber)

sealed interface that stores validated payloads using boxed classes

## CountBoxedNumber
public record CountBoxedNumber<br>
implements [CountBoxed](#countboxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| CountBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Count
public static class Count<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
