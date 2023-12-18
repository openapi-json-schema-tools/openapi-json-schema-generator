# ObjectWithNonIntersectingValues
org.openapijsonschematools.client.components.schemas.ObjectWithNonIntersectingValues.java
public class ObjectWithNonIntersectingValues

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1](#objectwithnonintersectingvalues1)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMapInput](#objectwithnonintersectingvaluesmapinput)<br> builder for Map payloads |
| static class | [ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap)<br> output class for Map payloads |
| static class | [ObjectWithNonIntersectingValues.A](#a)<br> schema class |
| static class | [ObjectWithNonIntersectingValues.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithNonIntersectingValues1
public static class ObjectWithNonIntersectingValues1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// Map validation
ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValuesMap validatedPayload =
    ObjectWithNonIntersectingValues.ObjectWithNonIntersectingValues1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "a",
            1
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | validate([Map<String, Object>](#objectwithnonintersectingvaluesmapinput) arg, SchemaConfiguration configuration) |

## ObjectWithNonIntersectingValuesMapInput
public class ObjectWithNonIntersectingValuesMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **a** | Number |  | [optional] |
| **anyStringName** | String | any string name can be used but the value must be the correct type | [optional] |

## ObjectWithNonIntersectingValuesMap
public static class ObjectWithNonIntersectingValuesMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithNonIntersectingValuesMap](#objectwithnonintersectingvaluesmap) | of([Map<String, Object>](#objectwithnonintersectingvaluesmapinput) arg, SchemaConfiguration configuration) |
| Number | a()<br>[optional] |
| String | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## A
public static class A<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
