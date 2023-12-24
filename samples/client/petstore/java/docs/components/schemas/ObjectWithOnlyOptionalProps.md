# ObjectWithOnlyOptionalProps
org.openapijsonschematools.client.components.schemas.ObjectWithOnlyOptionalProps.java
public class ObjectWithOnlyOptionalProps

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1](#objectwithonlyoptionalprops1)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMapInput](#objectwithonlyoptionalpropsmapinput)<br> builder for Map payloads |
| static class | [ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap)<br> output class for Map payloads |
| static class | [ObjectWithOnlyOptionalProps.B](#b)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.A](#a)<br> schema class |
| static class | [ObjectWithOnlyOptionalProps.AdditionalProperties](#additionalproperties)<br> schema class |

## ObjectWithOnlyOptionalProps1
public static class ObjectWithOnlyOptionalProps1<br>
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
ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalPropsMap validatedPayload =
    ObjectWithOnlyOptionalProps.ObjectWithOnlyOptionalProps1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "a",
            "a"
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "b",
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
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("a", [A.class](#a))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("b", [B.class](#b)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | validate([Map<String, Object>](#objectwithonlyoptionalpropsmapinput) arg, SchemaConfiguration configuration) |

## ObjectWithOnlyOptionalPropsMapInput
public class ObjectWithOnlyOptionalPropsMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **a** | String |  | [optional] |
| **b** | Number |  | [optional] |

## ObjectWithOnlyOptionalPropsMap
public static class ObjectWithOnlyOptionalPropsMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ObjectWithOnlyOptionalPropsMap](#objectwithonlyoptionalpropsmap) | of([Map<String, Object>](#objectwithonlyoptionalpropsmapinput) arg, SchemaConfiguration configuration) |
| String | a()<br>[optional] |
| Number | b()<br>[optional] |

## B
public static class B<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## A
public static class A<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
