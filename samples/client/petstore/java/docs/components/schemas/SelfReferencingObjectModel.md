# SelfReferencingObjectModel
org.openapijsonschematools.client.components.schemas.SelfReferencingObjectModel.java
public class SelfReferencingObjectModel

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModel1](#selfreferencingobjectmodel1)<br> schema class |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModelMapInput](#selfreferencingobjectmodelmapinput)<br> builder for Map payloads |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap)<br> output class for Map payloads |

## SelfReferencingObjectModel1
public static class SelfReferencingObjectModel1<br>
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
SelfReferencingObjectModel.SelfReferencingObjectModelMap validatedPayload =
    SelfReferencingObjectModel.SelfReferencingObjectModel1.validate(
    MapMaker.makeMap(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("selfRef", [SelfReferencingObjectModel1.class](#selfreferencingobjectmodel1)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [SelfReferencingObjectModel1.class](#selfreferencingobjectmodel1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | validate([Map<String, ? extends @Nullable Object>](#selfreferencingobjectmodelmapinput) arg, SchemaConfiguration configuration) |

## SelfReferencingObjectModelMapInput
public class SelfReferencingObjectModelMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **selfRef** | Map<String, ?> |  | [optional] |
| **anyStringName** | Map<String, ?> | any string name can be used but the value must be the correct type | [optional] |

## SelfReferencingObjectModelMap
public static class SelfReferencingObjectModelMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | of([Map<String, ? extends @Nullable Object>](#selfreferencingobjectmodelmapinput) arg, SchemaConfiguration configuration) |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | selfRef()<br>[optional] |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
