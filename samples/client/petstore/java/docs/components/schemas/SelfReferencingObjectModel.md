# SelfReferencingObjectModel
org.openapijsonschematools.client.components.schemas.SelfReferencingObjectModel.java
public class SelfReferencingObjectModel

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModel1Boxed](#selfreferencingobjectmodel1boxed)<br> sealed validated payload class |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModel1](#selfreferencingobjectmodel1)<br> schema class |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModelMapBuilder](#selfreferencingobjectmodelmapbuilder)<br> builder for Map payloads |
| static class | [SelfReferencingObjectModel.SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap)<br> output class for Map payloads |

## SelfReferencingObjectModel1Boxed
public static abstract sealed class SelfReferencingObjectModel1Boxed<br>
permits<br>
[SelfReferencingObjectModel1BoxedMap](#selfreferencingobjectmodel1boxedmap)

A sealed class that stores validated payloads using boxed classes

## SelfReferencingObjectModel1
public static class SelfReferencingObjectModel1<br>
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
SelfReferencingObjectModel.SelfReferencingObjectModelMap validatedPayload =
    SelfReferencingObjectModel.SelfReferencingObjectModel1.validate(
    new SelfReferencingObjectModel.SelfReferencingObjectModelMapBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("selfRef", [SelfReferencingObjectModel1.class](#selfreferencingobjectmodel1)))<br>)<br> |
| Class<? extends JsonSchema> | additionalProperties = [SelfReferencingObjectModel1.class](#selfreferencingobjectmodel1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | validate([Map&lt;?, ?&gt;](#selfreferencingobjectmodelmapbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## SelfReferencingObjectModelMapBuilder
public class SelfReferencingObjectModelMapBuilder<br>
builder for `Map<String, @Nullable Object>`

A class that builds the Map input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SelfReferencingObjectModelMapBuilder()<br>Creates a builder that contains an empty map |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Map<String, @Nullable Object> | build()<br>Returns map input that should be used with Schema.validate |
| [SelfReferencingObjectModelMapBuilder](#selfreferencingobjectmodelmapbuilder) | selfRef(Map<String, @Nullable Object> value) |
| [SelfReferencingObjectModelMapBuilder](#selfreferencingobjectmodelmapbuilder) | additionalProperty(String key, Map<String, @Nullable Object> value) |

## SelfReferencingObjectModelMap
public static class SelfReferencingObjectModelMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | of([Map<String, ? extends @Nullable Object>](#selfreferencingobjectmodelmapbuilder) arg, SchemaConfiguration configuration) |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | selfRef()<br>[optional] |
| [SelfReferencingObjectModelMap](#selfreferencingobjectmodelmap) | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
