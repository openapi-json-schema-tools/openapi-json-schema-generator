# PaginatedResultMyObjectDto
org.openapijsonschematools.client.components.schemas.PaginatedResultMyObjectDto.java
public class PaginatedResultMyObjectDto

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1Boxed](#paginatedresultmyobjectdto1boxed)<br> sealed validated payload class |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1](#paginatedresultmyobjectdto1)<br> schema class |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMapBuilder](#paginatedresultmyobjectdtomapbuilder)<br> builder for Map payloads |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap)<br> output class for Map payloads |
| static class | [PaginatedResultMyObjectDto.ResultsBoxed](#resultsboxed)<br> sealed validated payload class |
| static class | [PaginatedResultMyObjectDto.Results](#results)<br> schema class |
| static class | [PaginatedResultMyObjectDto.ResultsListBuilder](#resultslistbuilder)<br> builder for List payloads |
| static class | [PaginatedResultMyObjectDto.ResultsList](#resultslist)<br> output class for List payloads |
| static class | [PaginatedResultMyObjectDto.CountBoxed](#countboxed)<br> sealed validated payload class |
| static class | [PaginatedResultMyObjectDto.Count](#count)<br> schema class |
| static class | [PaginatedResultMyObjectDto.AdditionalPropertiesBoxed](#additionalpropertiesboxed)<br> sealed validated payload class |
| static class | [PaginatedResultMyObjectDto.AdditionalProperties](#additionalproperties)<br> schema class |

## PaginatedResultMyObjectDto1Boxed
public static abstract sealed class PaginatedResultMyObjectDto1Boxed<br>
permits<br>
[PaginatedResultMyObjectDto1BoxedMap](#paginatedresultmyobjectdto1boxedmap)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class ResultsBoxed<br>
permits<br>
[ResultsBoxedList](#resultsboxedlist)

A sealed class that stores validated payloads using boxed classes

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
public static abstract sealed class CountBoxed<br>
permits<br>
[CountBoxedNumber](#countboxednumber)

A sealed class that stores validated payloads using boxed classes

## Count
public static class Count<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalPropertiesBoxed
public static abstract sealed class AdditionalPropertiesBoxed<br>
permits<br>
[AdditionalPropertiesBoxedVoid](#additionalpropertiesboxedvoid),
[AdditionalPropertiesBoxedBoolean](#additionalpropertiesboxedboolean),
[AdditionalPropertiesBoxedNumber](#additionalpropertiesboxednumber),
[AdditionalPropertiesBoxedString](#additionalpropertiesboxedstring),
[AdditionalPropertiesBoxedList](#additionalpropertiesboxedlist),
[AdditionalPropertiesBoxedMap](#additionalpropertiesboxedmap)

A sealed class that stores validated payloads using boxed classes

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema.NotAnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
